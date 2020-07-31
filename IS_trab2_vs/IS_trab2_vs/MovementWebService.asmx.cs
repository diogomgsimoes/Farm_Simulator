using System;
using System.Collections.Generic;
using System.Web.Services;
using System.IO;
using System.Xml.Serialization;

namespace IS_trab2_vs
{
    /// <summary>
    /// Summary description for MovementWebService
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]

    public class MovementWebService : System.Web.Services.WebService
    {
        //Deserialização de um objeto tMyPlace
        public tMyPlace DeSerialize(string input) 
        {
            using (TextReader reader = new StringReader(input))
            {
                XmlSerializer serializer_tMyPlace = new XmlSerializer(typeof(tMyPlace), new XmlRootAttribute("Place"));
                tMyPlace placesList = (tMyPlace)serializer_tMyPlace.Deserialize(reader);
                return placesList;
            }
        }

        //Serialização de um objeto tMyPlace
        public string Serialize(tMyPlace placesList)
        {
            String result;

            using (var stringwriter = new StringWriter())
            {
                XmlSerializer serializer = new XmlSerializer(placesList.GetType());
                serializer.Serialize(stringwriter, placesList);
                result = stringwriter.ToString();
            }

            const string searchEncoding = "utf-16";
            const string newEncoding = "UTF-8";

            int encodingPos = result.IndexOf(searchEncoding);

            if (encodingPos == 30)
                result = result.Substring(0, encodingPos) + newEncoding + result.Substring(encodingPos + searchEncoding.Length);

            return result;
        }

        public double Distance(tPosition a, tPosition b)
        {
            // Distância entre quadrados da simulação (Norma euclediana)
            return Math.Sqrt(Math.Pow(Math.Abs(a.xx - b.xx), 2) + Math.Pow(Math.Abs(a.yy - b.yy), 2));
        }

        [WebMethod]
        public string CowMovement(string input)
        {
            /*
             *  A vaca está programada para fugir do lobo (para a posição mais longe possível) em primeiro lugar se algum for detetado.
             *  Se não houver lobo e a relva do local chegar a 0, move-se para outra posição.
             *  Se não houver lobo e houver relva, fica no lugar.
             */

            // Deserializar a string input em objeto TMyPlace
            tMyPlace placesList = DeSerialize(input);

            // Posições disponíves para a deslocação da vaca (com relva e sem outra entidade)
            List<tPosition> ValidPositions = new List<tPosition>();
            // Posições das quais a vaca tem de fugir (com lobo)
            List<tPosition> wolfPositions = new List<tPosition>();

            // Detetar lobos e preencher listas
            for (int i = 1; i < 9; i++)
            {
                tPlace place = (tPlace)placesList.Place[i];
                if (place.Wolf)
                    wolfPositions.Add(place.Position);
                else if (!place.Cow && !place.Dog && (place.Grass > 0) && !place.Obstacle && (place.Position != null))
                    ValidPositions.Add(place.Position);
            }

            // Mover se não houver relva ou se houver lobo
            if (((placesList.Place[0].Grass == 0) || (wolfPositions.Count > 0)) && ValidPositions.Count > 0)
            {
                // Se houver 1 ou mais lobos à sua volta, foge (calculando a distância de cada posição possível a todas as posições com lobo, deslocando-se para aquela que, em média, está mais longe de todos os lobos à volta da vaca)
                if (wolfPositions.Count > 0)
                {
                    double max = 0;
                    double total = 0;
                    tPosition BestDistance = null;
                    foreach (tPosition c in ValidPositions)
                    {
                        total = 0;

                        foreach (tPosition w in wolfPositions)
                        {
                            total += Distance(c, w);
                        }

                        if (total > max)
                        {
                            BestDistance = c;
                            max = total;
                        }
                    }

                    placesList.Place[0].Position = BestDistance;
                }
                // Se não houver lobo mas acabar a relva
                else
                {
                    var random = new Random();
                    int rnd = random.Next(ValidPositions.Count);
                    placesList.Place[0].Position = ValidPositions[rnd];
                }
            }

            // Serializar o objeto de volta para string
            String result = Serialize(placesList);

            return result;
        }

        [WebMethod]
        public string WolfMovement(string input)
        {
            /*
             *  O lobo está programada para, em primeiro lugar, caçar a vaca, deslocando-se para uma posição com essa entidade.
             *  Se não houver vaca na sua visão, mas houver um cão, o lobo foge deste da mesma forma que a vaca foge de si.
             *  Se não houver vaca nem cão nas proximidades, desloca-se nas diagonais (para cobrir mais terreno), procurando chegar mais perto de vacas.
             */

            // Posições disponíves para a deslocação do lobo (sem nenhuma entidade)
            List<tPosition> positions = new List<tPosition>();
            // Posições para as quais o lobo se pretende deslocar (com vaca)
            List<tPosition> positions_wCow = new List<tPosition>();
            // Posições das quais o lobo tem de fugir (com cão)
            List<tPosition> positions_wDog = new List<tPosition>();

            // Deserializar a string input em objeto TMyPlace
            tMyPlace placesList = DeSerialize(input);

            // Detetar posições com cão, vaca, ou livres
            for (int i = 1; i < 9; i++)
            {
                tPlace place = (tPlace)placesList.Place[i];
                if (place.Cow)
                    positions_wCow.Add(place.Position);
                else if (place.Dog)
                    positions_wDog.Add(place.Position);
                else if (!place.Obstacle && !place.Wolf && (place.Position != null) && (place.Position.xx != placesList.Place[0].Position.xx) && (place.Position.yy != placesList.Place[0].Position.yy))
                    positions.Add(place.Position);
            }

            var random = new Random();
            // Mover para caçar
            if (positions_wCow.Count > 0)
            {
                int rnd = random.Next(positions_wCow.Count);
                placesList.Place[0].Position = positions_wCow[rnd];
            }
            // Mover para fugir dos cães (da mesma forma que as vacas fogem dos lobos)
            else if ((positions.Count > 0) && (positions_wDog.Count > 0))
            {
                double max = 0;
                double total = 0;
                tPosition bestDistance = null;
                foreach (tPosition w in positions)
                {
                    total = 0;
                    foreach (tPosition d in positions_wDog)
                    {
                        total += Distance(w, d);
                    }
                    if (total > max)
                    {
                        bestDistance = w;
                        max = total;
                    }
                }
                placesList.Place[0].Position = bestDistance;
            }
            // Mover na diagonal para procurar vacas
            else if (positions.Count > 0)
            {
                int rnd = random.Next(positions.Count);
                placesList.Place[0].Position = positions[rnd];
            }

            if (placesList.Place[0].Position == null)
                Console.WriteLine("ola");

            // Serializar o objeto de volta para string
            String result = Serialize(placesList);

            return result;
        }

        [WebMethod]
        public string DogMovement(string input)
        {
            /*
             *  O cão está programado para caçar lobos.
             *  Se não os vir, move-se na diagonal à sua procura.
             */

            // Posições disponíves para a deslocação do cão (sem nenhuma entidade)
            List<tPosition> positions = new List<tPosition>();
            // Posições para as quais o lobo se pretende deslocar (com lobo)
            List<tPosition> positions_wWolf = new List<tPosition>();

            // Deserializar a string input em objeto TMyPlace
            tMyPlace placesList = DeSerialize(input);

            // Detetar posições válidas e/ou com lobos
            for (int i = 1; i < 9; i++)
            {
                tPlace place = (tPlace)placesList.Place[i];
                if (place.Wolf)
                    positions_wWolf.Add(place.Position);
                else if (!place.Obstacle && !place.Cow && !place.Dog && (place.Position != null) && (place.Position.xx != placesList.Place[0].Position.xx) && (place.Position.yy != placesList.Place[0].Position.yy))
                    positions.Add(place.Position);
            }

            var random = new Random();
            // Mover cão para caçar lobos
            if (positions_wWolf.Count > 0)
            {
                int rnd = random.Next(positions_wWolf.Count);
                placesList.Place[0].Position = positions_wWolf[rnd];
            }
            // Mover cão para procurar lobos
            else if (positions.Count > 0)
            {
                int rnd = random.Next(positions.Count);
                placesList.Place[0].Position = positions[rnd];
            }

            // Serializar o objeto de volta para string
            String result = Serialize(placesList);

            return result;
        }
    }
}
