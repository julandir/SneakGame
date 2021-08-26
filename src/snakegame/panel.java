
package snakegame;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class panel extends JPanel{
 
    private final int size_grid = 15;
    public Snake snake;
    public panel(){
        this.snake = new Snake();
        //color de fondo que tiene el panel
        setBackground(Color.gray);
    }
    
    public void DrawGrid(Graphics g, int w, int h){
        g.setColor(Color.white);
       for(int i = 0; i < w; i+=this.size_grid){
           g.drawLine(i, 0, i, h);
       }
       for(int i = 0; i < h; i+=this.size_grid){g.drawLine(0, i, w, i);}
    }
    
    public void setCoords(char op){
        this.snake.Move(op);
    }
    
    //
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.DrawGrid(g, getWidth(), getHeight());
    }
}

