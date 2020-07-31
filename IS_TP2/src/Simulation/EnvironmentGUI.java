/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Simulation;

import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.netbeans.xml.schema.updateschema.TPlace;

/**
 *
 * @author
 * André & Ricardo
 */
public class EnvironmentGUI extends javax.swing.JFrame {

    private HashMap<GUIPosition, JLabel> myPositions;
    private boolean running = false;

    public EnvironmentGUI() {
        initComponents();
        /*
         * InitMapOfPositions
         */
        initializePositions();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_0_14 = new javax.swing.JLabel();
        jLabel_1_14 = new javax.swing.JLabel();
        jLabel_2_14 = new javax.swing.JLabel();
        jLabel_3_14 = new javax.swing.JLabel();
        jLabel_4_14 = new javax.swing.JLabel();
        jLabel_5_14 = new javax.swing.JLabel();
        jLabel_6_14 = new javax.swing.JLabel();
        jLabel_7_14 = new javax.swing.JLabel();
        jLabel_8_14 = new javax.swing.JLabel();
        jLabel_9_14 = new javax.swing.JLabel();
        jLabel_0_13 = new javax.swing.JLabel();
        jLabel_1_13 = new javax.swing.JLabel();
        jLabel_2_13 = new javax.swing.JLabel();
        jLabel_3_13 = new javax.swing.JLabel();
        jLabel_4_13 = new javax.swing.JLabel();
        jLabel_5_13 = new javax.swing.JLabel();
        jLabel_6_13 = new javax.swing.JLabel();
        jLabel_7_13 = new javax.swing.JLabel();
        jLabel_8_13 = new javax.swing.JLabel();
        jLabel_9_13 = new javax.swing.JLabel();
        jLabel_7_12 = new javax.swing.JLabel();
        jLabel_8_12 = new javax.swing.JLabel();
        jLabel_6_12 = new javax.swing.JLabel();
        jLabel_4_12 = new javax.swing.JLabel();
        jLabel_3_12 = new javax.swing.JLabel();
        jLabel_0_12 = new javax.swing.JLabel();
        jLabel_1_12 = new javax.swing.JLabel();
        jLabel_9_12 = new javax.swing.JLabel();
        jLabel_5_12 = new javax.swing.JLabel();
        jLabel_2_12 = new javax.swing.JLabel();
        jLabel_2_11 = new javax.swing.JLabel();
        jLabel_3_11 = new javax.swing.JLabel();
        jLabel_0_11 = new javax.swing.JLabel();
        jLabel_6_11 = new javax.swing.JLabel();
        jLabel_8_11 = new javax.swing.JLabel();
        jLabel_9_11 = new javax.swing.JLabel();
        jLabel_1_11 = new javax.swing.JLabel();
        jLabel_5_11 = new javax.swing.JLabel();
        jLabel_4_11 = new javax.swing.JLabel();
        jLabel_7_11 = new javax.swing.JLabel();
        jLabel_8_10 = new javax.swing.JLabel();
        jLabel_0_10 = new javax.swing.JLabel();
        jLabel_6_10 = new javax.swing.JLabel();
        jLabel_5_10 = new javax.swing.JLabel();
        jLabel_1_10 = new javax.swing.JLabel();
        jLabel_7_10 = new javax.swing.JLabel();
        jLabel_4_10 = new javax.swing.JLabel();
        jLabel_2_10 = new javax.swing.JLabel();
        jLabel_9_10 = new javax.swing.JLabel();
        jLabel_3_10 = new javax.swing.JLabel();
        jLabel_3_9 = new javax.swing.JLabel();
        jLabel_6_9 = new javax.swing.JLabel();
        jLabel_9_9 = new javax.swing.JLabel();
        jLabel_5_9 = new javax.swing.JLabel();
        jLabel_2_9 = new javax.swing.JLabel();
        jLabel_0_9 = new javax.swing.JLabel();
        jLabel_8_9 = new javax.swing.JLabel();
        jLabel_4_9 = new javax.swing.JLabel();
        jLabel_1_9 = new javax.swing.JLabel();
        jLabel_7_9 = new javax.swing.JLabel();
        jLabel_5_8 = new javax.swing.JLabel();
        jLabel_4_8 = new javax.swing.JLabel();
        jLabel_8_8 = new javax.swing.JLabel();
        jLabel_2_8 = new javax.swing.JLabel();
        jLabel_9_8 = new javax.swing.JLabel();
        jLabel_1_8 = new javax.swing.JLabel();
        jLabel_6_8 = new javax.swing.JLabel();
        jLabel_7_8 = new javax.swing.JLabel();
        jLabel_0_8 = new javax.swing.JLabel();
        jLabel_3_8 = new javax.swing.JLabel();
        jLabel_5_7 = new javax.swing.JLabel();
        jLabel_1_7 = new javax.swing.JLabel();
        jLabel_4_7 = new javax.swing.JLabel();
        jLabel_3_7 = new javax.swing.JLabel();
        jLabel_0_7 = new javax.swing.JLabel();
        jLabel_6_7 = new javax.swing.JLabel();
        jLabel_9_7 = new javax.swing.JLabel();
        jLabel_7_7 = new javax.swing.JLabel();
        jLabel_2_7 = new javax.swing.JLabel();
        jLabel_8_7 = new javax.swing.JLabel();
        jLabel_6_6 = new javax.swing.JLabel();
        jLabel_9_6 = new javax.swing.JLabel();
        jLabel_8_6 = new javax.swing.JLabel();
        jLabel_4_6 = new javax.swing.JLabel();
        jLabel_0_6 = new javax.swing.JLabel();
        jLabel_7_6 = new javax.swing.JLabel();
        jLabel_2_6 = new javax.swing.JLabel();
        jLabel_3_6 = new javax.swing.JLabel();
        jLabel_5_6 = new javax.swing.JLabel();
        jLabel_1_6 = new javax.swing.JLabel();
        jLabel_8_5 = new javax.swing.JLabel();
        jLabel_1_5 = new javax.swing.JLabel();
        jLabel_7_5 = new javax.swing.JLabel();
        jLabel_5_5 = new javax.swing.JLabel();
        jLabel_2_5 = new javax.swing.JLabel();
        jLabel_0_5 = new javax.swing.JLabel();
        jLabel_4_5 = new javax.swing.JLabel();
        jLabel_3_5 = new javax.swing.JLabel();
        jLabel_6_5 = new javax.swing.JLabel();
        jLabel_9_5 = new javax.swing.JLabel();
        jLabel_12_11 = new javax.swing.JLabel();
        jLabel_14_11 = new javax.swing.JLabel();
        jLabel_14_10 = new javax.swing.JLabel();
        jLabel_13_11 = new javax.swing.JLabel();
        jLabel_10_11 = new javax.swing.JLabel();
        jLabel_11_11 = new javax.swing.JLabel();
        jLabel_13_12 = new javax.swing.JLabel();
        jLabel_14_12 = new javax.swing.JLabel();
        jLabel_12_12 = new javax.swing.JLabel();
        jLabel_10_12 = new javax.swing.JLabel();
        jLabel_10_14 = new javax.swing.JLabel();
        jLabel_11_12 = new javax.swing.JLabel();
        jLabel_12_14 = new javax.swing.JLabel();
        jLabel_11_14 = new javax.swing.JLabel();
        jLabel_12_13 = new javax.swing.JLabel();
        jLabel_10_13 = new javax.swing.JLabel();
        jLabel_11_13 = new javax.swing.JLabel();
        jLabel_14_14 = new javax.swing.JLabel();
        jLabel_14_13 = new javax.swing.JLabel();
        jLabel_13_13 = new javax.swing.JLabel();
        jLabel_10_5 = new javax.swing.JLabel();
        jLabel_12_5 = new javax.swing.JLabel();
        jLabel_11_5 = new javax.swing.JLabel();
        jLabel_13_5 = new javax.swing.JLabel();
        jLabel_14_5 = new javax.swing.JLabel();
        jLabel_11_6 = new javax.swing.JLabel();
        jLabel_13_14 = new javax.swing.JLabel();
        jLabel_13_6 = new javax.swing.JLabel();
        jLabel_12_7 = new javax.swing.JLabel();
        jLabel_14_7 = new javax.swing.JLabel();
        jLabel_12_6 = new javax.swing.JLabel();
        jLabel_13_7 = new javax.swing.JLabel();
        jLabel_10_6 = new javax.swing.JLabel();
        jLabel_14_6 = new javax.swing.JLabel();
        jLabel_12_8 = new javax.swing.JLabel();
        jLabel_13_8 = new javax.swing.JLabel();
        jLabel_11_7 = new javax.swing.JLabel();
        jLabel_10_7 = new javax.swing.JLabel();
        jLabel_14_9 = new javax.swing.JLabel();
        jLabel_11_9 = new javax.swing.JLabel();
        jLabel_10_8 = new javax.swing.JLabel();
        jLabel_14_8 = new javax.swing.JLabel();
        jLabel_13_9 = new javax.swing.JLabel();
        jLabel_11_8 = new javax.swing.JLabel();
        jLabel_10_9 = new javax.swing.JLabel();
        jLabel_10_10 = new javax.swing.JLabel();
        jLabel_13_10 = new javax.swing.JLabel();
        jLabel_12_10 = new javax.swing.JLabel();
        jLabel_11_10 = new javax.swing.JLabel();
        jLabel_12_9 = new javax.swing.JLabel();
        jLabel_9_2 = new javax.swing.JLabel();
        jLabel_6_2 = new javax.swing.JLabel();
        jLabel_0_2 = new javax.swing.JLabel();
        jLabel_8_2 = new javax.swing.JLabel();
        jLabel_6_1 = new javax.swing.JLabel();
        jLabel_7_2 = new javax.swing.JLabel();
        jLabel_2_2 = new javax.swing.JLabel();
        jLabel_4_1 = new javax.swing.JLabel();
        jLabel_0_1 = new javax.swing.JLabel();
        jLabel_9_1 = new javax.swing.JLabel();
        jLabel_8_1 = new javax.swing.JLabel();
        jLabel_9_3 = new javax.swing.JLabel();
        jLabel_2_3 = new javax.swing.JLabel();
        jLabel_6_3 = new javax.swing.JLabel();
        jLabel_1_3 = new javax.swing.JLabel();
        jLabel_7_3 = new javax.swing.JLabel();
        jLabel_0_3 = new javax.swing.JLabel();
        jLabel_3_3 = new javax.swing.JLabel();
        jLabel_5_2 = new javax.swing.JLabel();
        jLabel_1_2 = new javax.swing.JLabel();
        jLabel_4_2 = new javax.swing.JLabel();
        jLabel_3_2 = new javax.swing.JLabel();
        jLabel_8_4 = new javax.swing.JLabel();
        jLabel_0_4 = new javax.swing.JLabel();
        jLabel_2_4 = new javax.swing.JLabel();
        jLabel_5_4 = new javax.swing.JLabel();
        jLabel_9_4 = new javax.swing.JLabel();
        jLabel_4_3 = new javax.swing.JLabel();
        jLabel_8_3 = new javax.swing.JLabel();
        jLabel_7_4 = new javax.swing.JLabel();
        jLabel_5_3 = new javax.swing.JLabel();
        jLabel_4_4 = new javax.swing.JLabel();
        jLabel_1_4 = new javax.swing.JLabel();
        jLabel_3_4 = new javax.swing.JLabel();
        jLabel_6_4 = new javax.swing.JLabel();
        jLabel_12_4 = new javax.swing.JLabel();
        jLabel_10_2 = new javax.swing.JLabel();
        jLabel_11_4 = new javax.swing.JLabel();
        jLabel_14_4 = new javax.swing.JLabel();
        jLabel_10_3 = new javax.swing.JLabel();
        jLabel_14_3 = new javax.swing.JLabel();
        jLabel_13_4 = new javax.swing.JLabel();
        jLabel_11_3 = new javax.swing.JLabel();
        jLabel_10_4 = new javax.swing.JLabel();
        jLabel_9_0 = new javax.swing.JLabel();
        jLabel_4_0 = new javax.swing.JLabel();
        jLabel_6_0 = new javax.swing.JLabel();
        jLabel_3_0 = new javax.swing.JLabel();
        jLabel_0_0 = new javax.swing.JLabel();
        jLabel_2_0 = new javax.swing.JLabel();
        jLabel_5_0 = new javax.swing.JLabel();
        jLabel_7_0 = new javax.swing.JLabel();
        jLabel_1_0 = new javax.swing.JLabel();
        jLabel_8_0 = new javax.swing.JLabel();
        jLabel_1_1 = new javax.swing.JLabel();
        jLabel_5_1 = new javax.swing.JLabel();
        jLabel_3_1 = new javax.swing.JLabel();
        jLabel_7_1 = new javax.swing.JLabel();
        jLabel_2_1 = new javax.swing.JLabel();
        jLabel_13_2 = new javax.swing.JLabel();
        jLabel_10_1 = new javax.swing.JLabel();
        jLabel_14_2 = new javax.swing.JLabel();
        jLabel_12_1 = new javax.swing.JLabel();
        jLabel_11_2 = new javax.swing.JLabel();
        jLabel_13_3 = new javax.swing.JLabel();
        jLabel_12_3 = new javax.swing.JLabel();
        jLabel_14_1 = new javax.swing.JLabel();
        jLabel_10_0 = new javax.swing.JLabel();
        jLabel_12_0 = new javax.swing.JLabel();
        jLabel_11_0 = new javax.swing.JLabel();
        jLabel_13_1 = new javax.swing.JLabel();
        jLabel_12_2 = new javax.swing.JLabel();
        jLabel_14_0 = new javax.swing.JLabel();
        jLabel_13_0 = new javax.swing.JLabel();
        jLabel_11_1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deaths_log = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IS's FARM");
        setResizable(false);

        jLabel_0_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_9_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_4_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_6_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_0_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_8_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_1_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_3_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_7_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_2_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_10_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_12_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_14_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_13_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        jLabel_11_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ground1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel_0_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_2_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_3_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_4_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_5_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_6_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_7_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_8_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_9_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_0_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_1_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_2_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_3_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_4_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_5_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_6_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_7_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_8_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_9_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_0_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_1_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_2_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_3_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_4_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_5_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_6_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_7_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_8_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_9_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_0_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_1_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_2_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_3_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_4_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_5_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_6_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_7_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_8_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_9_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_0_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_1_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_2_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_3_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_4_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_5_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_6_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_7_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_8_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_9_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_0_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_0_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_0_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_0_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_0_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel_10_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_11_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_12_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_13_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_14_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_10_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_11_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_12_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_13_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_14_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_10_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_11_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_12_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_13_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_14_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_10_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_11_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_12_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_13_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_14_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_10_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_11_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_12_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_13_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_14_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_10_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_11_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_12_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_13_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_14_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_10_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_11_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_12_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_13_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_14_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_10_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_11_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_12_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_13_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_14_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_10_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_11_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_12_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_13_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_14_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_10_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_11_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_12_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_13_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_14_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_0_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_0_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_4_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_5_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_6_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_7_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_8_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_9_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_10_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_11_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_12_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_13_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_14_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_10_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_11_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_12_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_13_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_14_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_10_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_11_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_12_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_13_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_14_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_10_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_11_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_12_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_13_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_14_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_10_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_11_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_12_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_13_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_14_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_4_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_5_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_6_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_7_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_8_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_9_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_10_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_11_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_12_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_13_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_14_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        deaths_log.setColumns(20);
        deaths_log.setRows(5);
        jScrollPane1.setViewportView(deaths_log);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnvironmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnvironmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnvironmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnvironmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnvironmentGUI().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea deaths_log;
    private javax.swing.JLabel jLabel_0_0;
    private javax.swing.JLabel jLabel_0_1;
    private javax.swing.JLabel jLabel_0_10;
    private javax.swing.JLabel jLabel_0_11;
    private javax.swing.JLabel jLabel_0_12;
    private javax.swing.JLabel jLabel_0_13;
    private javax.swing.JLabel jLabel_0_14;
    private javax.swing.JLabel jLabel_0_2;
    private javax.swing.JLabel jLabel_0_3;
    private javax.swing.JLabel jLabel_0_4;
    private javax.swing.JLabel jLabel_0_5;
    private javax.swing.JLabel jLabel_0_6;
    private javax.swing.JLabel jLabel_0_7;
    private javax.swing.JLabel jLabel_0_8;
    private javax.swing.JLabel jLabel_0_9;
    private javax.swing.JLabel jLabel_10_0;
    private javax.swing.JLabel jLabel_10_1;
    private javax.swing.JLabel jLabel_10_10;
    private javax.swing.JLabel jLabel_10_11;
    private javax.swing.JLabel jLabel_10_12;
    private javax.swing.JLabel jLabel_10_13;
    private javax.swing.JLabel jLabel_10_14;
    private javax.swing.JLabel jLabel_10_2;
    private javax.swing.JLabel jLabel_10_3;
    private javax.swing.JLabel jLabel_10_4;
    private javax.swing.JLabel jLabel_10_5;
    private javax.swing.JLabel jLabel_10_6;
    private javax.swing.JLabel jLabel_10_7;
    private javax.swing.JLabel jLabel_10_8;
    private javax.swing.JLabel jLabel_10_9;
    private javax.swing.JLabel jLabel_11_0;
    private javax.swing.JLabel jLabel_11_1;
    private javax.swing.JLabel jLabel_11_10;
    private javax.swing.JLabel jLabel_11_11;
    private javax.swing.JLabel jLabel_11_12;
    private javax.swing.JLabel jLabel_11_13;
    private javax.swing.JLabel jLabel_11_14;
    private javax.swing.JLabel jLabel_11_2;
    private javax.swing.JLabel jLabel_11_3;
    private javax.swing.JLabel jLabel_11_4;
    private javax.swing.JLabel jLabel_11_5;
    private javax.swing.JLabel jLabel_11_6;
    private javax.swing.JLabel jLabel_11_7;
    private javax.swing.JLabel jLabel_11_8;
    private javax.swing.JLabel jLabel_11_9;
    private javax.swing.JLabel jLabel_12_0;
    private javax.swing.JLabel jLabel_12_1;
    private javax.swing.JLabel jLabel_12_10;
    private javax.swing.JLabel jLabel_12_11;
    private javax.swing.JLabel jLabel_12_12;
    private javax.swing.JLabel jLabel_12_13;
    private javax.swing.JLabel jLabel_12_14;
    private javax.swing.JLabel jLabel_12_2;
    private javax.swing.JLabel jLabel_12_3;
    private javax.swing.JLabel jLabel_12_4;
    private javax.swing.JLabel jLabel_12_5;
    private javax.swing.JLabel jLabel_12_6;
    private javax.swing.JLabel jLabel_12_7;
    private javax.swing.JLabel jLabel_12_8;
    private javax.swing.JLabel jLabel_12_9;
    private javax.swing.JLabel jLabel_13_0;
    private javax.swing.JLabel jLabel_13_1;
    private javax.swing.JLabel jLabel_13_10;
    private javax.swing.JLabel jLabel_13_11;
    private javax.swing.JLabel jLabel_13_12;
    private javax.swing.JLabel jLabel_13_13;
    private javax.swing.JLabel jLabel_13_14;
    private javax.swing.JLabel jLabel_13_2;
    private javax.swing.JLabel jLabel_13_3;
    private javax.swing.JLabel jLabel_13_4;
    private javax.swing.JLabel jLabel_13_5;
    private javax.swing.JLabel jLabel_13_6;
    private javax.swing.JLabel jLabel_13_7;
    private javax.swing.JLabel jLabel_13_8;
    private javax.swing.JLabel jLabel_13_9;
    private javax.swing.JLabel jLabel_14_0;
    private javax.swing.JLabel jLabel_14_1;
    private javax.swing.JLabel jLabel_14_10;
    private javax.swing.JLabel jLabel_14_11;
    private javax.swing.JLabel jLabel_14_12;
    private javax.swing.JLabel jLabel_14_13;
    private javax.swing.JLabel jLabel_14_14;
    private javax.swing.JLabel jLabel_14_2;
    private javax.swing.JLabel jLabel_14_3;
    private javax.swing.JLabel jLabel_14_4;
    private javax.swing.JLabel jLabel_14_5;
    private javax.swing.JLabel jLabel_14_6;
    private javax.swing.JLabel jLabel_14_7;
    private javax.swing.JLabel jLabel_14_8;
    private javax.swing.JLabel jLabel_14_9;
    private javax.swing.JLabel jLabel_1_0;
    private javax.swing.JLabel jLabel_1_1;
    private javax.swing.JLabel jLabel_1_10;
    private javax.swing.JLabel jLabel_1_11;
    private javax.swing.JLabel jLabel_1_12;
    private javax.swing.JLabel jLabel_1_13;
    private javax.swing.JLabel jLabel_1_14;
    private javax.swing.JLabel jLabel_1_2;
    private javax.swing.JLabel jLabel_1_3;
    private javax.swing.JLabel jLabel_1_4;
    private javax.swing.JLabel jLabel_1_5;
    private javax.swing.JLabel jLabel_1_6;
    private javax.swing.JLabel jLabel_1_7;
    private javax.swing.JLabel jLabel_1_8;
    private javax.swing.JLabel jLabel_1_9;
    private javax.swing.JLabel jLabel_2_0;
    private javax.swing.JLabel jLabel_2_1;
    private javax.swing.JLabel jLabel_2_10;
    private javax.swing.JLabel jLabel_2_11;
    private javax.swing.JLabel jLabel_2_12;
    private javax.swing.JLabel jLabel_2_13;
    private javax.swing.JLabel jLabel_2_14;
    private javax.swing.JLabel jLabel_2_2;
    private javax.swing.JLabel jLabel_2_3;
    private javax.swing.JLabel jLabel_2_4;
    private javax.swing.JLabel jLabel_2_5;
    private javax.swing.JLabel jLabel_2_6;
    private javax.swing.JLabel jLabel_2_7;
    private javax.swing.JLabel jLabel_2_8;
    private javax.swing.JLabel jLabel_2_9;
    private javax.swing.JLabel jLabel_3_0;
    private javax.swing.JLabel jLabel_3_1;
    private javax.swing.JLabel jLabel_3_10;
    private javax.swing.JLabel jLabel_3_11;
    private javax.swing.JLabel jLabel_3_12;
    private javax.swing.JLabel jLabel_3_13;
    private javax.swing.JLabel jLabel_3_14;
    private javax.swing.JLabel jLabel_3_2;
    private javax.swing.JLabel jLabel_3_3;
    private javax.swing.JLabel jLabel_3_4;
    private javax.swing.JLabel jLabel_3_5;
    private javax.swing.JLabel jLabel_3_6;
    private javax.swing.JLabel jLabel_3_7;
    private javax.swing.JLabel jLabel_3_8;
    private javax.swing.JLabel jLabel_3_9;
    private javax.swing.JLabel jLabel_4_0;
    private javax.swing.JLabel jLabel_4_1;
    private javax.swing.JLabel jLabel_4_10;
    private javax.swing.JLabel jLabel_4_11;
    private javax.swing.JLabel jLabel_4_12;
    private javax.swing.JLabel jLabel_4_13;
    private javax.swing.JLabel jLabel_4_14;
    private javax.swing.JLabel jLabel_4_2;
    private javax.swing.JLabel jLabel_4_3;
    private javax.swing.JLabel jLabel_4_4;
    private javax.swing.JLabel jLabel_4_5;
    private javax.swing.JLabel jLabel_4_6;
    private javax.swing.JLabel jLabel_4_7;
    private javax.swing.JLabel jLabel_4_8;
    private javax.swing.JLabel jLabel_4_9;
    private javax.swing.JLabel jLabel_5_0;
    private javax.swing.JLabel jLabel_5_1;
    private javax.swing.JLabel jLabel_5_10;
    private javax.swing.JLabel jLabel_5_11;
    private javax.swing.JLabel jLabel_5_12;
    private javax.swing.JLabel jLabel_5_13;
    private javax.swing.JLabel jLabel_5_14;
    private javax.swing.JLabel jLabel_5_2;
    private javax.swing.JLabel jLabel_5_3;
    private javax.swing.JLabel jLabel_5_4;
    private javax.swing.JLabel jLabel_5_5;
    private javax.swing.JLabel jLabel_5_6;
    private javax.swing.JLabel jLabel_5_7;
    private javax.swing.JLabel jLabel_5_8;
    private javax.swing.JLabel jLabel_5_9;
    private javax.swing.JLabel jLabel_6_0;
    private javax.swing.JLabel jLabel_6_1;
    private javax.swing.JLabel jLabel_6_10;
    private javax.swing.JLabel jLabel_6_11;
    private javax.swing.JLabel jLabel_6_12;
    private javax.swing.JLabel jLabel_6_13;
    private javax.swing.JLabel jLabel_6_14;
    private javax.swing.JLabel jLabel_6_2;
    private javax.swing.JLabel jLabel_6_3;
    private javax.swing.JLabel jLabel_6_4;
    private javax.swing.JLabel jLabel_6_5;
    private javax.swing.JLabel jLabel_6_6;
    private javax.swing.JLabel jLabel_6_7;
    private javax.swing.JLabel jLabel_6_8;
    private javax.swing.JLabel jLabel_6_9;
    private javax.swing.JLabel jLabel_7_0;
    private javax.swing.JLabel jLabel_7_1;
    private javax.swing.JLabel jLabel_7_10;
    private javax.swing.JLabel jLabel_7_11;
    private javax.swing.JLabel jLabel_7_12;
    private javax.swing.JLabel jLabel_7_13;
    private javax.swing.JLabel jLabel_7_14;
    private javax.swing.JLabel jLabel_7_2;
    private javax.swing.JLabel jLabel_7_3;
    private javax.swing.JLabel jLabel_7_4;
    private javax.swing.JLabel jLabel_7_5;
    private javax.swing.JLabel jLabel_7_6;
    private javax.swing.JLabel jLabel_7_7;
    private javax.swing.JLabel jLabel_7_8;
    private javax.swing.JLabel jLabel_7_9;
    private javax.swing.JLabel jLabel_8_0;
    private javax.swing.JLabel jLabel_8_1;
    private javax.swing.JLabel jLabel_8_10;
    private javax.swing.JLabel jLabel_8_11;
    private javax.swing.JLabel jLabel_8_12;
    private javax.swing.JLabel jLabel_8_13;
    private javax.swing.JLabel jLabel_8_14;
    private javax.swing.JLabel jLabel_8_2;
    private javax.swing.JLabel jLabel_8_3;
    private javax.swing.JLabel jLabel_8_4;
    private javax.swing.JLabel jLabel_8_5;
    private javax.swing.JLabel jLabel_8_6;
    private javax.swing.JLabel jLabel_8_7;
    private javax.swing.JLabel jLabel_8_8;
    private javax.swing.JLabel jLabel_8_9;
    private javax.swing.JLabel jLabel_9_0;
    private javax.swing.JLabel jLabel_9_1;
    private javax.swing.JLabel jLabel_9_10;
    private javax.swing.JLabel jLabel_9_11;
    private javax.swing.JLabel jLabel_9_12;
    private javax.swing.JLabel jLabel_9_13;
    private javax.swing.JLabel jLabel_9_14;
    private javax.swing.JLabel jLabel_9_2;
    private javax.swing.JLabel jLabel_9_3;
    private javax.swing.JLabel jLabel_9_4;
    private javax.swing.JLabel jLabel_9_5;
    private javax.swing.JLabel jLabel_9_6;
    private javax.swing.JLabel jLabel_9_7;
    private javax.swing.JLabel jLabel_9_8;
    private javax.swing.JLabel jLabel_9_9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   
    public void updateGUI(TPlace[][] myEnvironment, String log) {
        for (int x = 0; x < 15; x++) {
            for (int y = 0; y < 15; y++) {
                if (!myEnvironment[x][y].isCow() && !myEnvironment[x][y].isWolf() && !myEnvironment[x][y].isObstacle() && !myEnvironment[x][y].isDog()) {
                    myPositions.get(new GUIPosition(x, y)).setIcon(new ImageIcon("C:\\Images\\Ground" + myEnvironment[x][y].getGrass() + ".png"));
                }else if(myEnvironment[x][y].isObstacle()){
                    myPositions.get(new GUIPosition(x, y)).setIcon(new ImageIcon("C:\\Images\\Obstacle.png"));
                }else if(myEnvironment[x][y].isWolf()){
                    myPositions.get(new GUIPosition(x, y)).setIcon(new ImageIcon("C:\\Images\\Wolf.png"));
                }else if(myEnvironment[x][y].isCow()){
                    myPositions.get(new GUIPosition(x, y)).setIcon(new ImageIcon("C:\\Images\\Cow.png"));
                }else if(myEnvironment[x][y].isDog()){
                    myPositions.get(new GUIPosition(x, y)).setIcon(new ImageIcon("C:\\Images\\Dog.png"));
                }
            }
        }
        if (!"".equals(log)){
            deaths_log.setText(log + '\n'+ deaths_log.getText() + '\n');
        }
    }

    private void initializePositions() {
        myPositions = new HashMap<>();
        //Line0
        myPositions.put(new GUIPosition(0, 0), jLabel_0_0);
        myPositions.put(new GUIPosition(0, 1), jLabel_0_1);
        myPositions.put(new GUIPosition(0, 2), jLabel_0_2);
        myPositions.put(new GUIPosition(0, 3), jLabel_0_3);
        myPositions.put(new GUIPosition(0, 4), jLabel_0_4);
        myPositions.put(new GUIPosition(0, 5), jLabel_0_5);
        myPositions.put(new GUIPosition(0, 6), jLabel_0_6);
        myPositions.put(new GUIPosition(0, 7), jLabel_0_7);
        myPositions.put(new GUIPosition(0, 8), jLabel_0_8);
        myPositions.put(new GUIPosition(0, 9), jLabel_0_9);
        myPositions.put(new GUIPosition(0, 10), jLabel_0_10);
        myPositions.put(new GUIPosition(0, 11), jLabel_0_11);
        myPositions.put(new GUIPosition(0, 12), jLabel_0_12);
        myPositions.put(new GUIPosition(0, 13), jLabel_0_13);
        myPositions.put(new GUIPosition(0, 14), jLabel_0_14);
        //Line1
        myPositions.put(new GUIPosition(1, 0), jLabel_1_0);
        myPositions.put(new GUIPosition(1, 1), jLabel_1_1);
        myPositions.put(new GUIPosition(1, 2), jLabel_1_2);
        myPositions.put(new GUIPosition(1, 3), jLabel_1_3);
        myPositions.put(new GUIPosition(1, 4), jLabel_1_4);
        myPositions.put(new GUIPosition(1, 5), jLabel_1_5);
        myPositions.put(new GUIPosition(1, 6), jLabel_1_6);
        myPositions.put(new GUIPosition(1, 7), jLabel_1_7);
        myPositions.put(new GUIPosition(1, 8), jLabel_1_8);
        myPositions.put(new GUIPosition(1, 9), jLabel_1_9);
        myPositions.put(new GUIPosition(1, 10), jLabel_1_10);
        myPositions.put(new GUIPosition(1, 11), jLabel_1_11);
        myPositions.put(new GUIPosition(1, 12), jLabel_1_12);
        myPositions.put(new GUIPosition(1, 13), jLabel_1_13);
        myPositions.put(new GUIPosition(1, 14), jLabel_1_14);
        //Line2
        myPositions.put(new GUIPosition(2, 0), jLabel_2_0);
        myPositions.put(new GUIPosition(2, 1), jLabel_2_1);
        myPositions.put(new GUIPosition(2, 2), jLabel_2_2);
        myPositions.put(new GUIPosition(2, 3), jLabel_2_3);
        myPositions.put(new GUIPosition(2, 4), jLabel_2_4);
        myPositions.put(new GUIPosition(2, 5), jLabel_2_5);
        myPositions.put(new GUIPosition(2, 6), jLabel_2_6);
        myPositions.put(new GUIPosition(2, 7), jLabel_2_7);
        myPositions.put(new GUIPosition(2, 8), jLabel_2_8);
        myPositions.put(new GUIPosition(2, 9), jLabel_2_9);
        myPositions.put(new GUIPosition(2, 10), jLabel_2_10);
        myPositions.put(new GUIPosition(2, 11), jLabel_2_11);
        myPositions.put(new GUIPosition(2, 12), jLabel_2_12);
        myPositions.put(new GUIPosition(2, 13), jLabel_2_13);
        myPositions.put(new GUIPosition(2, 14), jLabel_2_14);
        //Line3
        myPositions.put(new GUIPosition(3, 0), jLabel_3_0);
        myPositions.put(new GUIPosition(3, 1), jLabel_3_1);
        myPositions.put(new GUIPosition(3, 2), jLabel_3_2);
        myPositions.put(new GUIPosition(3, 3), jLabel_3_3);
        myPositions.put(new GUIPosition(3, 4), jLabel_3_4);
        myPositions.put(new GUIPosition(3, 5), jLabel_3_5);
        myPositions.put(new GUIPosition(3, 6), jLabel_3_6);
        myPositions.put(new GUIPosition(3, 7), jLabel_3_7);
        myPositions.put(new GUIPosition(3, 8), jLabel_3_8);
        myPositions.put(new GUIPosition(3, 9), jLabel_3_9);
        myPositions.put(new GUIPosition(3, 10), jLabel_3_10);
        myPositions.put(new GUIPosition(3, 11), jLabel_3_11);
        myPositions.put(new GUIPosition(3, 12), jLabel_3_12);
        myPositions.put(new GUIPosition(3, 13), jLabel_3_13);
        myPositions.put(new GUIPosition(3, 14), jLabel_3_14);
        //Line4
        myPositions.put(new GUIPosition(4, 0), jLabel_4_0);
        myPositions.put(new GUIPosition(4, 1), jLabel_4_1);
        myPositions.put(new GUIPosition(4, 2), jLabel_4_2);
        myPositions.put(new GUIPosition(4, 3), jLabel_4_3);
        myPositions.put(new GUIPosition(4, 4), jLabel_4_4);
        myPositions.put(new GUIPosition(4, 5), jLabel_4_5);
        myPositions.put(new GUIPosition(4, 6), jLabel_4_6);
        myPositions.put(new GUIPosition(4, 7), jLabel_4_7);
        myPositions.put(new GUIPosition(4, 8), jLabel_4_8);
        myPositions.put(new GUIPosition(4, 9), jLabel_4_9);
        myPositions.put(new GUIPosition(4, 10), jLabel_4_10);
        myPositions.put(new GUIPosition(4, 11), jLabel_4_11);
        myPositions.put(new GUIPosition(4, 12), jLabel_4_12);
        myPositions.put(new GUIPosition(4, 13), jLabel_4_13);
        myPositions.put(new GUIPosition(4, 14), jLabel_4_14);
        //Line5
        myPositions.put(new GUIPosition(5, 0), jLabel_5_0);
        myPositions.put(new GUIPosition(5, 1), jLabel_5_1);
        myPositions.put(new GUIPosition(5, 2), jLabel_5_2);
        myPositions.put(new GUIPosition(5, 3), jLabel_5_3);
        myPositions.put(new GUIPosition(5, 4), jLabel_5_4);
        myPositions.put(new GUIPosition(5, 5), jLabel_5_5);
        myPositions.put(new GUIPosition(5, 6), jLabel_5_6);
        myPositions.put(new GUIPosition(5, 7), jLabel_5_7);
        myPositions.put(new GUIPosition(5, 8), jLabel_5_8);
        myPositions.put(new GUIPosition(5, 9), jLabel_5_9);
        myPositions.put(new GUIPosition(5, 10), jLabel_5_10);
        myPositions.put(new GUIPosition(5, 11), jLabel_5_11);
        myPositions.put(new GUIPosition(5, 12), jLabel_5_12);
        myPositions.put(new GUIPosition(5, 13), jLabel_5_13);
        myPositions.put(new GUIPosition(5, 14), jLabel_5_14);
        //Line6
        myPositions.put(new GUIPosition(6, 0), jLabel_6_0);
        myPositions.put(new GUIPosition(6, 1), jLabel_6_1);
        myPositions.put(new GUIPosition(6, 2), jLabel_6_2);
        myPositions.put(new GUIPosition(6, 3), jLabel_6_3);
        myPositions.put(new GUIPosition(6, 4), jLabel_6_4);
        myPositions.put(new GUIPosition(6, 5), jLabel_6_5);
        myPositions.put(new GUIPosition(6, 6), jLabel_6_6);
        myPositions.put(new GUIPosition(6, 7), jLabel_6_7);
        myPositions.put(new GUIPosition(6, 8), jLabel_6_8);
        myPositions.put(new GUIPosition(6, 9), jLabel_6_9);
        myPositions.put(new GUIPosition(6, 10), jLabel_6_10);
        myPositions.put(new GUIPosition(6, 11), jLabel_6_11);
        myPositions.put(new GUIPosition(6, 12), jLabel_6_12);
        myPositions.put(new GUIPosition(6, 13), jLabel_6_13);
        myPositions.put(new GUIPosition(6, 14), jLabel_6_14);
        //Line7
        myPositions.put(new GUIPosition(7, 0), jLabel_7_0);
        myPositions.put(new GUIPosition(7, 1), jLabel_7_1);
        myPositions.put(new GUIPosition(7, 2), jLabel_7_2);
        myPositions.put(new GUIPosition(7, 3), jLabel_7_3);
        myPositions.put(new GUIPosition(7, 4), jLabel_7_4);
        myPositions.put(new GUIPosition(7, 5), jLabel_7_5);
        myPositions.put(new GUIPosition(7, 6), jLabel_7_6);
        myPositions.put(new GUIPosition(7, 7), jLabel_7_7);
        myPositions.put(new GUIPosition(7, 8), jLabel_7_8);
        myPositions.put(new GUIPosition(7, 9), jLabel_7_9);
        myPositions.put(new GUIPosition(7, 10), jLabel_7_10);
        myPositions.put(new GUIPosition(7, 11), jLabel_7_11);
        myPositions.put(new GUIPosition(7, 12), jLabel_7_12);
        myPositions.put(new GUIPosition(7, 13), jLabel_7_13);
        myPositions.put(new GUIPosition(7, 14), jLabel_7_14);
        //Line8
        myPositions.put(new GUIPosition(8, 0), jLabel_8_0);
        myPositions.put(new GUIPosition(8, 1), jLabel_8_1);
        myPositions.put(new GUIPosition(8, 2), jLabel_8_2);
        myPositions.put(new GUIPosition(8, 3), jLabel_8_3);
        myPositions.put(new GUIPosition(8, 4), jLabel_8_4);
        myPositions.put(new GUIPosition(8, 5), jLabel_8_5);
        myPositions.put(new GUIPosition(8, 6), jLabel_8_6);
        myPositions.put(new GUIPosition(8, 7), jLabel_8_7);
        myPositions.put(new GUIPosition(8, 8), jLabel_8_8);
        myPositions.put(new GUIPosition(8, 9), jLabel_8_9);
        myPositions.put(new GUIPosition(8, 10), jLabel_8_10);
        myPositions.put(new GUIPosition(8, 11), jLabel_8_11);
        myPositions.put(new GUIPosition(8, 12), jLabel_8_12);
        myPositions.put(new GUIPosition(8, 13), jLabel_8_13);
        myPositions.put(new GUIPosition(8, 14), jLabel_8_14);
        //Line9
        myPositions.put(new GUIPosition(9, 0), jLabel_9_0);
        myPositions.put(new GUIPosition(9, 1), jLabel_9_1);
        myPositions.put(new GUIPosition(9, 2), jLabel_9_2);
        myPositions.put(new GUIPosition(9, 3), jLabel_9_3);
        myPositions.put(new GUIPosition(9, 4), jLabel_9_4);
        myPositions.put(new GUIPosition(9, 5), jLabel_9_5);
        myPositions.put(new GUIPosition(9, 6), jLabel_9_6);
        myPositions.put(new GUIPosition(9, 7), jLabel_9_7);
        myPositions.put(new GUIPosition(9, 8), jLabel_9_8);
        myPositions.put(new GUIPosition(9, 9), jLabel_9_9);
        myPositions.put(new GUIPosition(9, 10), jLabel_9_10);
        myPositions.put(new GUIPosition(9, 11), jLabel_9_11);
        myPositions.put(new GUIPosition(9, 12), jLabel_9_12);
        myPositions.put(new GUIPosition(9, 13), jLabel_9_13);
        myPositions.put(new GUIPosition(9, 14), jLabel_9_14);
        //Line10
        myPositions.put(new GUIPosition(10, 0), jLabel_10_0);
        myPositions.put(new GUIPosition(10, 1), jLabel_10_1);
        myPositions.put(new GUIPosition(10, 2), jLabel_10_2);
        myPositions.put(new GUIPosition(10, 3), jLabel_10_3);
        myPositions.put(new GUIPosition(10, 4), jLabel_10_4);
        myPositions.put(new GUIPosition(10, 5), jLabel_10_5);
        myPositions.put(new GUIPosition(10, 6), jLabel_10_6);
        myPositions.put(new GUIPosition(10, 7), jLabel_10_7);
        myPositions.put(new GUIPosition(10, 8), jLabel_10_8);
        myPositions.put(new GUIPosition(10, 9), jLabel_10_9);
        myPositions.put(new GUIPosition(10, 10), jLabel_10_10);
        myPositions.put(new GUIPosition(10, 11), jLabel_10_11);
        myPositions.put(new GUIPosition(10, 12), jLabel_10_12);
        myPositions.put(new GUIPosition(10, 13), jLabel_10_13);
        myPositions.put(new GUIPosition(10, 14), jLabel_10_14);
        //Line11
        myPositions.put(new GUIPosition(11, 0), jLabel_11_0);
        myPositions.put(new GUIPosition(11, 1), jLabel_11_1);
        myPositions.put(new GUIPosition(11, 2), jLabel_11_2);
        myPositions.put(new GUIPosition(11, 3), jLabel_11_3);
        myPositions.put(new GUIPosition(11, 4), jLabel_11_4);
        myPositions.put(new GUIPosition(11, 5), jLabel_11_5);
        myPositions.put(new GUIPosition(11, 6), jLabel_11_6);
        myPositions.put(new GUIPosition(11, 7), jLabel_11_7);
        myPositions.put(new GUIPosition(11, 8), jLabel_11_8);
        myPositions.put(new GUIPosition(11, 9), jLabel_11_9);
        myPositions.put(new GUIPosition(11, 10), jLabel_11_10);
        myPositions.put(new GUIPosition(11, 11), jLabel_11_11);
        myPositions.put(new GUIPosition(11, 12), jLabel_11_12);
        myPositions.put(new GUIPosition(11, 13), jLabel_11_13);
        myPositions.put(new GUIPosition(11, 14), jLabel_11_14);
        //Line12
        myPositions.put(new GUIPosition(12, 0), jLabel_12_0);
        myPositions.put(new GUIPosition(12, 1), jLabel_12_1);
        myPositions.put(new GUIPosition(12, 2), jLabel_12_2);
        myPositions.put(new GUIPosition(12, 3), jLabel_12_3);
        myPositions.put(new GUIPosition(12, 4), jLabel_12_4);
        myPositions.put(new GUIPosition(12, 5), jLabel_12_5);
        myPositions.put(new GUIPosition(12, 6), jLabel_12_6);
        myPositions.put(new GUIPosition(12, 7), jLabel_12_7);
        myPositions.put(new GUIPosition(12, 8), jLabel_12_8);
        myPositions.put(new GUIPosition(12, 9), jLabel_12_9);
        myPositions.put(new GUIPosition(12, 10), jLabel_12_10);
        myPositions.put(new GUIPosition(12, 11), jLabel_12_11);
        myPositions.put(new GUIPosition(12, 12), jLabel_12_12);
        myPositions.put(new GUIPosition(12, 13), jLabel_12_13);
        myPositions.put(new GUIPosition(12, 14), jLabel_12_14);
        //Line13
        myPositions.put(new GUIPosition(13, 0), jLabel_13_0);
        myPositions.put(new GUIPosition(13, 1), jLabel_13_1);
        myPositions.put(new GUIPosition(13, 2), jLabel_13_2);
        myPositions.put(new GUIPosition(13, 3), jLabel_13_3);
        myPositions.put(new GUIPosition(13, 4), jLabel_13_4);
        myPositions.put(new GUIPosition(13, 5), jLabel_13_5);
        myPositions.put(new GUIPosition(13, 6), jLabel_13_6);
        myPositions.put(new GUIPosition(13, 7), jLabel_13_7);
        myPositions.put(new GUIPosition(13, 8), jLabel_13_8);
        myPositions.put(new GUIPosition(13, 9), jLabel_13_9);
        myPositions.put(new GUIPosition(13, 10), jLabel_13_10);
        myPositions.put(new GUIPosition(13, 11), jLabel_13_11);
        myPositions.put(new GUIPosition(13, 12), jLabel_13_12);
        myPositions.put(new GUIPosition(13, 13), jLabel_13_13);
        myPositions.put(new GUIPosition(13, 14), jLabel_13_14);
        //Line14
        myPositions.put(new GUIPosition(14, 0), jLabel_14_0);
        myPositions.put(new GUIPosition(14, 1), jLabel_14_1);
        myPositions.put(new GUIPosition(14, 2), jLabel_14_2);
        myPositions.put(new GUIPosition(14, 3), jLabel_14_3);
        myPositions.put(new GUIPosition(14, 4), jLabel_14_4);
        myPositions.put(new GUIPosition(14, 5), jLabel_14_5);
        myPositions.put(new GUIPosition(14, 6), jLabel_14_6);
        myPositions.put(new GUIPosition(14, 7), jLabel_14_7);
        myPositions.put(new GUIPosition(14, 8), jLabel_14_8);
        myPositions.put(new GUIPosition(14, 9), jLabel_14_9);
        myPositions.put(new GUIPosition(14, 10), jLabel_14_10);
        myPositions.put(new GUIPosition(14, 11), jLabel_14_11);
        myPositions.put(new GUIPosition(14, 12), jLabel_14_12);
        myPositions.put(new GUIPosition(14, 13), jLabel_14_13);
        myPositions.put(new GUIPosition(14, 14), jLabel_14_14);
    }

    public boolean isToStart() {
        return running;
    }

    private class GUIPosition {

        int x;
        int y;

        public GUIPosition(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof GUIPosition)) {
                return false;
            }
            GUIPosition key = (GUIPosition) o;
            return x == key.x && y == key.y;
        }
    }
}
