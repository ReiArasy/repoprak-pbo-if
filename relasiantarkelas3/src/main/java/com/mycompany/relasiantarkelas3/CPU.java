/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relasiantarkelas3;

/**
 *
 * @author HP VICTUS
 */
public class CPU {
    
    private String merk;
    private int kecepatan;
    
    public CPU(String merk, int kecepatan){
        this.merk = merk;
        this.kecepatan = kecepatan;
    }
    
    public void displaySpek(){
        System.out.println("CPU : " + this.merk
                           + " (" + this.kecepatan + " GHZ)");
    }
}
