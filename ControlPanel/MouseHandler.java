package ControlPanel;

import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;

import PieceHandler.PieceHandler;
import PieceHandler.PieceMover;

public class MouseHandler implements MouseInputListener {

    PieceHandler piece;
    private mousePositionCalc posCalc = new mousePositionCalc();
    Panel panel;
    int selectCol, selectRow, newCol, newRow;
    private boolean piecePressed = false;
    private boolean isWhiteMove = true;
    String name = "", color = "";
    char colChr, rowChr;

    public MouseHandler(PieceHandler piece, Panel panel){
        this.piece = piece;
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        colChr = String.valueOf(x).charAt(0);
        rowChr = String.valueOf(y).charAt(0);
        
        if(posCalc.mouseXPos(x) < 3){colChr = '0';}
        if(posCalc.mouseYPos(y) < 3){rowChr = '0';}

        // System.out.println("Pressed: x = " + col + "\nPressed: y = " + row);

        if(!piecePressed){
        selectCol = Integer.parseInt(String.valueOf(colChr));
        selectRow = Integer.parseInt(String.valueOf(rowChr));

            if(isWhiteMove){
                if(piece.pieceLoc[selectCol][selectRow] != null){
                    if(piece.pieceLoc[selectCol][selectRow].color == "White"){
                        System.out.print("Not null");
                        name = piece.pieceLoc[selectCol][selectRow].name;
                        color =  "White";
                        piecePressed = true;
                        
                        if(piecePressed){System.out.println("Pressed" + " \nColor: " + color);}
                    }
                }
            }
            else if(!isWhiteMove){
                if(piece.pieceLoc[selectCol][selectRow] != null){
                    if(piece.pieceLoc[selectCol][selectRow].color == "Black"){
                        name = piece.pieceLoc[selectCol][selectRow].name;
                        color =  "Black";
                        piecePressed = true;

                        if(piecePressed){System.out.println("Pressed" + " \nColor: " + color);}
                    }
                }
            }
        }
        
        else if(piecePressed){
            newCol = Integer.parseInt(String.valueOf(colChr));
            newRow = Integer.parseInt(String.valueOf(rowChr));

            System.out.println("newCol: " + newCol + "\nnewRow: " + newRow);
            System.out.println("selectCol: " + selectCol + "\nselectRow: " + selectRow + "\n");

            panel.pieceMover.whiteMove(name, color, newCol, newRow, selectCol, selectRow);
            piecePressed = false;
            
            if(isWhiteMove){isWhiteMove = false;}
            else{isWhiteMove = true;}
            
            if(!piecePressed){System.out.println("Pressed False");}

            panel.repaint();
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
