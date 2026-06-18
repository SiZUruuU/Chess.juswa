package Pieces;

import ControlPanel.Panel;

public class ChessPiece {

    Panel panel;
    public String name, color;
    public boolean ableMove;

    public ChessPiece(String name, String color){
        this.name = name;
        this.color = color;
    }
}


