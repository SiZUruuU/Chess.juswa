package ControlPanel;

import java.awt.Color;
import java.awt.Graphics2D;

public class UI {

    Graphics2D g2;
    Panel panel;

    private int x, y;

    public UI(Panel panel){
        this.panel = panel;

    }

    public void draw(Graphics2D g2){
        drawChessBoard(g2);
    }

    public void drawChessBoard(Graphics2D g2){

    int xBox = 0, yBox = 0, row = 8, wBox = 100, hBox = 100;

        for(int i = 1; i <= row; i++){

            xBox = 0;
            g2.setColor(Color.BLUE);
            
            if(i > 1){yBox = yBox + 100;}
            if(i % 2 == 0){
                for(int j = 1; j <= 4; j++){
                    g2.fillRect(xBox, yBox, wBox, hBox);
                    xBox = xBox + 200;
                }
            }
            else if(i % 2 == 1){
                for(int j = 1; j <= 4; j++){
                    g2.fillRect(xBox + 100, yBox, wBox, hBox);
                    xBox = xBox + 200;
                }
            }
        }
    }    
}
