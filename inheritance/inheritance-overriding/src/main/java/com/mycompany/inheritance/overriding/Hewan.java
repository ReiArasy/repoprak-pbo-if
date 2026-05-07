/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance.overriding;

/**
 *
 * @author HP VICTUS
 */
public class Hewan {
    private String nama;
    
    // Constructor
    public Hewan(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    // Method yang AKAN di-override oleh subclass
    // Setiap hewan punya suara berbeda
    public void bersuara() {
        System.out.println(this.nama + " mengeluarkan suara...");
    }
    
    // Method yang TIDAK di-override (diwarisi apa adanya)
    public void makan() {
        System.out.println(this.nama + " sedang makan.");
    }
}
