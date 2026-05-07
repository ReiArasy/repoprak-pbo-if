package com.mycompany.polymorphism;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP VICTUS
 */
public class Hewan {
    
    private String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public String getNama() { return nama; }

    // Method yang akan di-override oleh setiap anak
    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara...");
    }

    // Method yang hanya ada di parent
    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
    
}
