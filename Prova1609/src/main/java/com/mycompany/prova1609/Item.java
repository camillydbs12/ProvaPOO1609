/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1609;

/**
 *
 * @author camilly.bsantos2
 */
public class Item extends GameObject{
    private boolean isVisivel;

    
    public Item(){
        
    }
    public Item(int posX, int posY) {
        super(posX, posY);
    }

    public boolean isIsVisivel() {
        return isVisivel;
    }

    public void setIsVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }
    
   
}
