package ControlPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

import Pieces.ChessPiece;

public class Panel extends JPanel {

    Graphics2D g2;
    PieceHandler piece = new PieceHandler();
    MouseHandler mouse = new MouseHandler();
    UI ui = new UI(this, piece);
    
    public ChessPiece blackPiece[] = new ChessPiece[16];
    public ChessPiece whitPiece[] = new ChessPiece[16];
    public ArrayList<ChessPiece> pieces = new ArrayList<>();

    private final int screenWidth = 800;
    private final int screenHeight = 800;
    
    public Panel(){

        this.setPreferredSize(new Dimension(screenHeight, screenWidth));
        this.setLayout(null);
        this.setDoubleBuffered(true);
        this.addMouseListener(mouse);
        piece.setUp();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.white);

        ui.draw(g2);

    }

}
