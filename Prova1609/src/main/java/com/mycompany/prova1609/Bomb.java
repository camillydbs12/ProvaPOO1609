/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1609;

/**
 *
 * @author camilly.bsantos2
 */
public class Bomb extends Item {
    private int dano;

    public Bomb() {
    }
                  
            
    public Bomb(int posX, int posY) {
        super(posX, posY);
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano -= 1;
    }
    
    
}
