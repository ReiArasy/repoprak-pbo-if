/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance.basic;

/**
 *
 * @author HP VICTUS
 */

// Kata kunci "extends A" artinya: B adalah turunan dari A
// B mewarisi semua yang ada di A (x, y, tampilXY())
public class B extends A {
     // Atribut TAMBAHAN milik B sendiri (A tidak punya ini)
    int z;
    
    // Method TAMBAHAN milik B sendiri (A tidak punya ini)
    // Tapi B bisa akses x dan y milik A karena sudah diwarisi
    public void jumlahXYZ() {
        System.out.println("Jumlah x+y+z: " + (x + y + z));
    }
}
