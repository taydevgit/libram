package com.taydev.libram.model;

public class MacroButton {
    private int id;
    private String label;
    private String actionType;
    private String actionValue;
    // removed these to dynamically position buttons on the app
    // private int gridCol;
    // private int gridRow;

    // adding icon image here
    private String iconPath;
    private javafx.scene.image.Image iconImage;


    // constructor for the object (no ID)
    public MacroButton(String label, String actionType, String actionValue, String iconPath){
        this.label = label;
        this.actionType = actionType;
        this.actionValue = actionValue;
        // this.gridCol = gridCol;
        // this.gridRow = gridRow;
        this.iconPath = iconPath;
        if(iconPath != null && !iconPath.isEmpty()){
            this.iconImage = new javafx.scene.image.Image("file:" + iconPath);
        }
        
    }

    // Constructor for loading an existing button from DB (ID already exists)
    public MacroButton(int id, String label, String actionType, String actionValue, String iconPath) {
        this.id = id;
        this.label = label;
        this.actionType = actionType;
        this.actionValue = actionValue;
        // removed
        // this.gridCol = gridCol;
        // this.gridRow = gridRow;
        this.iconPath = iconPath;
        if(iconPath != null && !iconPath.isEmpty()){
            this.iconImage = new javafx.scene.image.Image("file:" + iconPath);
        }
    }

    // Getters
    public int getId() { return id; }
    public String getLabel() { return label; }
    public String getActionType() { return actionType; }
    public String getActionValue() { return actionValue; }
    // removed
    // public int getGridCol() { return gridCol; }
    // public int getGridRow() { return gridRow; }
    public String getIconPath() {return iconPath; }
    public javafx.scene.image.Image getIconImage() {return iconImage; }

    // Setters
    public void setId(int id) {this.id =id; }
    public void setLabel(String label) {this.label =label; }
    public void setActionType(String actionType) {this.actionType = actionType; }
    public void setActionValue(String actionValue) {this.actionValue = actionValue; }
    // public void setGridCol(int gridCol) {this.gridCol = gridCol; }
    // public void setGridRow(int gridRow) {this.gridRow = gridRow; }
    public void setIconPath(String iconPath) {this.iconPath = iconPath; }
    public void setIconImage(javafx.scene.image.Image iconImage){this.iconImage = iconImage; }

    @Override
    public String toString() {
        return "MacroButton{id=" + id + ", label='" + label + ", icon path=" + iconPath + ", " + iconImage + "}";
    }

}
