/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance.overriding;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
         // Buat objek masing-masing hewan
        Kucing kucing = new Kucing("Mimi");
        Anjing anjing = new Anjing("Doggy");
        
        System.out.println("=== Override: Setiap hewan bersuara beda ===");
        // Meski nama methodnya sama (bersuara()),
        // tiap objek menjalankan VERSI MILIKNYA SENDIRI 
        kucing.bersuara();  // panggil versi Kucing
        System.out.println();
        anjing.bersuara();  // panggil versi Anjing
        System.out.println();
 
        System.out.println("=== Method makan() tidak di-override, semua sama ===");
        kucing.makan();     // warisan dari Hewan, tidak diubah
        anjing.makan();
    }
}
