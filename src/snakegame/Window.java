/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;
import com.sun.glass.events.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author olste
 */
public class Window  {
    //constructor method
    public void CreateWindow(){
        JFrame marco = new JFrame("texto");
        
        
        
        marco.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyReleased(java.awt.event.KeyEvent evt){
                if(evt.getKeyCode() == KeyEvent.VK_UP){
                    System.out.println("up key");
                }
                else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
                    System.out.println("down key");
                }
                else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
                    System.out.println("left key");
                }
                else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
                    System.out.println("right key");
                }
                else
                {
                    System.out.println("other key");
                }
            }
        });
        
        
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.add(new panel());
        marco.setSize(800,600);
        marco.setVisible(true);
    }
}
