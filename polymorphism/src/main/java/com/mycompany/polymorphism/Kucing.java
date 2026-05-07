/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism;

/**
 *
 * @author HP VICTUS
 */
public class Kucing extends Hewan {
    
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " : Meong!");
    }

    // Method tambahan hanya milik Kucing
    public void manjaManja() {
        System.out.println(getNama() + " lagi manja-manja ke owner!");
    }
    
}
