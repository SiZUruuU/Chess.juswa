package ControlPanel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Panel extends JPanel {

    private final int screenWidth = 800;
    private final int screenHeight = 800;
    
    public Panel(){

        this.setPreferredSize(new Dimension(screenHeight, screenWidth));
        this.setLayout(null);
        this.setDoubleBuffered(true);
    }

}
