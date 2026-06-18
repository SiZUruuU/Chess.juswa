package PieceHandler;

import ControlPanel.MouseHandler;
import ControlPanel.Panel;

public class PieceMover {

    public PieceHandler piece;
    Panel panel;
    MouseHandler mouse = new MouseHandler(piece, panel);

    public PieceMover(Panel panel, PieceHandler piece){
        this.panel = panel;
        this.piece = piece;
    }


    public void whiteMove(String name, String color, int newCol, int newRow, int selectCol, int selectRow){

        switch(name){
            case "Pawn":
                if(piece.pieceLoc[newCol][newRow] == null){

                    piece.pieceLoc[newCol][newRow] = piece.pieceLoc[selectCol][selectRow];
                    piece.pieceLoc[selectCol][selectRow] = null;

                    System.out.println("Piece: " + name + "\nColor: " + color);
                    System.out.println("X: " + newCol + "\nY: " + newRow + "\n");


                }break;
            }
    }
    
}
