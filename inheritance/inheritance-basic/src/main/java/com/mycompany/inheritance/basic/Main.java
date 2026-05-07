/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance.basic;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        // Buat objek dari superclass A
        A superclass = new A();
        superclass.x = 3;
        superclass.y = 4;
        
        System.out.println("=== Objek dari Superclass A ===");
        superclass.tampilXY();
        // superclass.z = 5;       // ERROR! A tidak punya z
        // superclass.jumlahXYZ(); // ERROR! A tidak punya jumlahXYZ()
        
        System.out.println();
        
        // Buat objek dari subclass B
        B subclass = new B();
        
        // B mewarisi x dan y dari A → bisa langsung dipakai!
        subclass.x = 1;
        subclass.y = 2;
        
        // B juga punya z miliknya sendiri
        subclass.z = 5;
        
        System.out.println("=== Objek dari Subclass B ===");
        subclass.tampilXY();   // method warisan dari A, bisa dipanggil!
        subclass.jumlahXYZ();  // method tambahan milik B sendiri
    }
}
