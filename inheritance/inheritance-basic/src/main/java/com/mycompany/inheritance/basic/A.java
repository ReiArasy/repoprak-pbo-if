/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance.basic;

/**
 *
 * @author HP VICTUS
 */
public class A {
    // Atribut milik superclass A
    // Pakai 'int' biasa (default/package access) agar bisa diakses subclass
    int x;
    int y;
    
    // Method milik superclass A
    // Method ini akan DIWARISI oleh kelas B
    public void tampilXY() {
        System.out.println("Nilai x: " + x + ", Nilai y: " + y);
    }
}
