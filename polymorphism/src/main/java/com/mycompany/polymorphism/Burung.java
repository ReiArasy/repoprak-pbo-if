/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism;

/**
 *
 * @author HP VICTUS
 */
public class Burung extends Hewan {
    
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " : Cicit cicit!");
    }

    // Method tambahan hanya milik Burung
    public void terbang() {
        System.out.println(getNama() + " sedang terbang!");
    }
}
