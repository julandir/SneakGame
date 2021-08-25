/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author olste
 */
public class Window extends JFrame{
    //constructor method
    public Window(){
        this.Components();
        setTitle("GameSnake");
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(800,400);
        setLayout(null);
    }
    
    public void Components(){
        //
    panel p = new panel();
    add (p);
                                                



    }
}
