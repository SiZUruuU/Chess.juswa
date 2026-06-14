import javax.swing.JFrame;

import ControlPanel.Panel;

public class Chess{
    public static void main(String args []){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setUndecorated(false);
        frame.setTitle("chess");

        Panel panel = new Panel();
        frame.add(panel);

        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    
    }
}