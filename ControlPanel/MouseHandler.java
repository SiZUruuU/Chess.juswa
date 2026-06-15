package ControlPanel;

import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;
import java.awt.Graphics2D;

import Pieces.Pawn;

public class MouseHandler implements MouseInputListener {

    PieceHandler piece;
    Panel panel;
    UI ui;
    int selectCol, selectRow, newCol, newRow;
    boolean piecePressed = false;
    String name = "", color = "";
    char colChr, rowChr;

    public MouseHandler(PieceHandler piece, Panel panel, UI ui){
        this.piece = piece;
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        colChr = String.valueOf(x).charAt(0);
        rowChr = String.valueOf(y).charAt(0);
        
        if(piece.mouseXPos(x) < 3){colChr = '0';}
        if(piece.mouseYPos(y) < 3){rowChr = '0';}

        // System.out.println("Pressed: x = " + col + "\nPressed: y = " + row);

        if(!piecePressed){
        selectCol = Integer.parseInt(String.valueOf(colChr));
        selectRow = Integer.parseInt(String.valueOf(rowChr));

            if(piece.isWhiteMove){
                System.out.println("selectCol: " + selectCol + "\nselectRow: " + selectRow);
                if(piece.pieceLoc[selectCol][selectRow] != null){
                    if(piece.pieceLoc[selectCol][selectRow].color == "White"){
                    name = piece.pieceLoc[selectCol][selectRow].name;
                    
                    if(name == "Pawn" || name == "Knight" || name == "Bishop" || name == "Queen" || name == "King" || name == "Rook"){
                        piece.pieceLoc[selectCol][selectRow].ableMove = true;
                        piecePressed = true;
                        System.out.println("Piece: " + name + "\nColor: " + color);
                        System.out.println("X: " + selectCol + "\nY: " + selectRow + "\n");
                    }
                    }
                }
            }
        }
        
        else if(piecePressed){
            newCol = Integer.parseInt(String.valueOf(colChr));
            newRow = Integer.parseInt(String.valueOf(rowChr));

            System.out.println("newCol: " + newCol + "\newRow: " + newRow);
            System.out.println("selectCol: " + selectCol + "\nselectRow: " + selectRow + "\n");

            switch(name){
                case "Pawn":
                    if(piece.pieceLoc[newCol][newRow] == null){


                        piece.pieceLoc[newCol][newRow] = piece.pieceLoc[selectCol][selectRow];
                        piece.pieceLoc[selectCol][selectRow] = null;
                        piecePressed = false;

                        System.out.println("Piece: " + name + "\nColor: " + color);
                        System.out.println("X: " + newCol + "\nY: " + newRow + "\n");


                    }panel.repaint();break;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
