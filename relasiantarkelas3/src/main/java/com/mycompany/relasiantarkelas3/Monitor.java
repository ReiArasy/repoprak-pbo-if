/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relasiantarkelas3;

/**
 *
 * @author HP VICTUS
 */
public class Monitor {
    
    private String merk;
    private int ukuran;
    
    public Monitor(String merk, int ukuran){
        this.merk = merk;
        this.ukuran = ukuran;
    }
    
    public void displaySpek(){
        System.out.println("Monitor : " + this.merk
                           + " (" + this.ukuran + " inch)");
    }
}
