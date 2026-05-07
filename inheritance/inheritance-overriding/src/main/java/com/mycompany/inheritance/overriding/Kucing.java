/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance.overriding;

/**
 *
 * @author HP VICTUS
 */
public class Kucing extends Hewan {
    // Constructor: panggil constructor induk dulu dengan super()
    public Kucing(String nama) {
        super(nama);
    }
    
    // ─ OVERRIDE: ganti isi method bersuara() milik Hewan ─
    // Tanda @Override → memberitahu Java bahwa ini adalah override
    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara: Meooong");
    }
}
