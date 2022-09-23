/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1609;

/**
 *
 * @author camilly.bsantos2
 */
public class Player extends GameObject{
    private int direction;
    private int life;
    private boolean invencivel;
    private boolean mover;
    

    public Player() {
    }

    public Player(int posX, int posY, int direcao) {
        super(posX, posY);
        this.direction = direcao;
    }
    
    public int getDirection() {
        return direction;
    }

    public void setDirection(int direcao) {
        this.direction = direcao;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
    
    public boolean podeMover(int direcao){
       if( direction < 0){
         return false;
       } else {
           return true;
        }
    }
    
    public void mover(int posX, int posY, int direction){
        int direcaoX = posX;
        int direcaoY = posY;
        int novaDirecao = 0;
        if(novaDirecao == posX){
            novaDirecao = posX + 10;
        }
        else{
         novaDirecao = posY + 10;
        }
        
    }
    
    public void perdeVida(){
        life -= 1;
    }
    
    public boolean isInvencivel(){
        return invencivel;
    }
    
    
}
