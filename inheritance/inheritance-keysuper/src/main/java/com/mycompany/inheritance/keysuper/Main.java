/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance.keysuper;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Membuat objek Employee ===");
        Employee emp = new Employee("Budi");
        emp.tampilNama();
        System.out.println();
        
        System.out.println("=== Membuat objek Manager ===");
        // Saat new Manager() dipanggil:
        // 1. super(nama) constructor Employee dijalankan dulu
        // 2. Baru lanjut isi bagian Manager-nya
        Manager mgr = new Manager("Adi", "Sukabirus");
        System.out.println();
        
        System.out.println("=== Info Manager ===");
        mgr.tampilInfo();
    }
}
