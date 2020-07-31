[System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.8.3928.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://xml.netbeans.org/schema/updateSchema")]
[System.Xml.Serialization.XmlRootAttribute("MyPlace", Namespace="http://xml.netbeans.org/schema/updateSchema", IsNullable=false)]
public partial class tMyPlace {
    
    private tPlace[] placeField;
    
    /// <observações/>
    [System.Xml.Serialization.XmlElementAttribute("Place")]
    public tPlace[] Place {
        get {
            return this.placeField;
        }
        set {
            this.placeField = value;
        }
    }
}

[System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.8.3928.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://xml.netbeans.org/schema/updateSchema")]
public partial class tPlace {
    
    private int grassField;
    
    private bool wolfField;
    
    private bool cowField;
    
    private bool dogField;
    
    private bool obstacleField;
    
    private string entityField;
    
    private tPosition positionField;
    
    private int staminaField;
    
    private int sexField;
    
    /// <observações/>
    public int Grass {
        get {
            return this.grassField;
        }
        set {
            this.grassField = value;
        }
    }
    
    /// <observações/>
    public bool Wolf {
        get {
            return this.wolfField;
        }
        set {
            this.wolfField = value;
        }
    }
    
    /// <observações/>
    public bool Cow {
        get {
            return this.cowField;
        }
        set {
            this.cowField = value;
        }
    }
    
    /// <observações/>
    public bool Dog {
        get {
            return this.dogField;
        }
        set {
            this.dogField = value;
        }
    }
    
    /// <observações/>
    public bool Obstacle {
        get {
            return this.obstacleField;
        }
        set {
            this.obstacleField = value;
        }
    }
    
    /// <observações/>
    public string Entity {
        get {
            return this.entityField;
        }
        set {
            this.entityField = value;
        }
    }
    
    /// <observações/>
    public tPosition Position {
        get {
            return this.positionField;
        }
        set {
            this.positionField = value;
        }
    }
    
    /// <observações/>
    public int Stamina {
        get {
            return this.staminaField;
        }
        set {
            this.staminaField = value;
        }
    }
    
    /// <observações/>
    public int Sex {
        get {
            return this.sexField;
        }
        set {
            this.sexField = value;
        }
    }
}

[System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.8.3928.0")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(Namespace="http://xml.netbeans.org/schema/updateSchema")]
public partial class tPosition {
    
    private int xxField;
    
    private int yyField;
    
    /// <observações/>
    public int xx {
        get {
            return this.xxField;
        }
        set {
            this.xxField = value;
        }
    }
    
    /// <observações/>
    public int yy {
        get {
            return this.yyField;
        }
        set {
            this.yyField = value;
        }
    }
}