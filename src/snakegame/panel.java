
package snakegame;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class panel extends JPanel{
 
    
    public panel(){
        //color de fondo que tiene el panel
        setBackground(Color.gray);
    }
    
    //
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(20, 20, 50, 50);
    }
}

