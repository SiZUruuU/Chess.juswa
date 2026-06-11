package ControlPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Panel extends JPanel {

    Graphics2D g2;
    UI ui = new UI(this);

    private final int screenWidth = 800;
    private final int screenHeight = 800;
    
    public Panel(){

        this.setPreferredSize(new Dimension(screenHeight, screenWidth));
        this.setLayout(null);
        this.setDoubleBuffered(true);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.white);

        ui.draw(g2);

    }

}
