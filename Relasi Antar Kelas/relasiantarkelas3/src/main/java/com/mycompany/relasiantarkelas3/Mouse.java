/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relasiantarkelas3;

/**
 *
 * @author HP VICTUS
 */
public class Mouse {
    private String merk;
    private String tipe; // contoh: Wireless, Wired
    
    // Constructor
    public Mouse(String merk, String tipe) {
        this.merk = merk;
        this.tipe = tipe;
    }
    
    // Method untuk tampilkan spesifikasi Mouse
    public void displaySpek() {
        System.out.println("  Mouse   : " + this.merk 
                           + " (" + this.tipe + ")");
    }
}
