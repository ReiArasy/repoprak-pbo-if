/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance.overloading;

/**
 *
 * @author HP VICTUS
 */
public class Lagu {
    private String judul;
    private String pencipta;
    
    // ─ OVERLOADING: method IsiParam() ada 2 versi 
    
    // Versi 1: hanya menerima judul (1 parameter)
    // Dipakai kalau penciptanya tidak diketahui
    public void isiParam(String judul) {
        this.judul    = judul;
        this.pencipta = "Tidak Dikenal";
    }
    
    // Versi 2: menerima judul DAN pencipta (2 parameter)
    // Dipakai kalau penciptanya diketahui
    public void isiParam(String judul, String pencipta) {
        this.judul    = judul;
        this.pencipta = pencipta;
    }
    
    // Java otomatis pilih versi yang mana berdasarkan argumen yang dikirim
    public void cetakKeLayar() {
        System.out.println("Judul    : " + this.judul);
        System.out.println("Pencipta : " + this.pencipta);
        System.out.println("===============================");
    }
}
