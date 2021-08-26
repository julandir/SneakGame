/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

/**
 *
 * @author olste
 */
public class Snake {
    public int x;
    public int y;
    public Snake(){
        this.x = 0;
        this.y = 0;
    }
    
    public void Move(char op){
        if(op == 'u'){
            this.y--;
        }
        else if(op == 'd'){
            this.y++;
        }
        else if(op == 'l'){
            this.x--;
        }
        else
        {
            this.x++;
        }
    }
}
