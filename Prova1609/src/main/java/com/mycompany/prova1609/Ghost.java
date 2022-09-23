/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1609;

import java.util.Random;

/**
 *
 * @author camilly.bsantos2
 */
public class Ghost extends GameObject{
    private int direction;
    private boolean mover;
    private int dano;


    public Ghost() {
    }

    public Ghost(int posX, int posY, int direction) {
        super(posX, posY);
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
       direction = (int) Math.random() * 600;
    }

    public boolean podeMover(){
        if( direction < 0){
         return false;
       } else {
           return true;
        }
    }
    
    public boolean mover(int direction){
        return mover;
    }
}
