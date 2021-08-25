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
public class Window  {
    //constructor method
    public void CreateWindow(){
        JFrame marco = new JFrame("texto");
        marco.add(new panel());
        marco.setSize(800,600);
        marco.setVisible(true);
    }
}
