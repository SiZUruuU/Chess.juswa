package ControlPanel;

import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;

public class MouseHandler implements MouseInputListener {

    PieceHandler piece;
    int col, row;

    public MouseHandler(PieceHandler piece){
        this.piece = piece;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        char colChr, rowChr;
        String name = "", color = "";

        colChr = String.valueOf(x).charAt(0);
        rowChr = String.valueOf(y).charAt(0);
        
        if(piece.mouseXPos(x) < 3){colChr = '0';}
        if(piece.mouseYPos(y) < 3){rowChr = '0';}

        int col = Integer.parseInt(String.valueOf(colChr));
        int row = Integer.parseInt(String.valueOf(rowChr));
        
        System.out.println("Pressed: x = " + col + "\nPressed: y = " + row);

        if(piece.pieceLoc[col][row] != null){
            name = piece.pieceLoc[col][row].name;
            color = piece.pieceLoc[col][row].color;
        }

        System.out.print("Piece: " + name + "\nColor: " + color);
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
