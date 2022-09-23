/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1609;

/**
 *
 * @author camilly.bsantos2
 */
public class GameObject {
    
    private int X;
    private int Y;
    private int ScreenSize;

    public GameObject() {
    }

    public GameObject(int posX, int posY) {
        this.X = posX;
        this.Y = posY;
    }

    public int getX() {
        return X;
    }

    public void setX(int posX) {
       if( posX < 0){
         System.out.println("Posição inválida");
       } else {
               this.X = posX;
       }
    }

    public int getY() {
        return Y;
    }

    public void setY(int posY) {
     if( posY < 0){
         System.out.println("Posição inválida");
       } else {
               this.Y = posY;
       }
    
    }

    public int getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(int tela) {
      if( tela < 0){
         System.out.println("Posição inválida");
       } else {
               this.ScreenSize = tela;
       }
    }
    
}
