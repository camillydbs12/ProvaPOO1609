/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1609;

/**
 *
 * @author camilly.bsantos2
 */
public class Booster extends Item {
    private int Btime;

    public Booster() {
    }

    public Booster(int posX, int posY) {
        super(posX, posY);
    }

    public int getBtime() {
        return Btime;
    }

    public void setBtime(int Btime) {
        this.Btime = 2;
    }
    
    
    
}
