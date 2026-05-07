/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance.keysuper;

/**
 *
 * @author HP VICTUS
 */
public class Employee {
    // private hanya bisa diakses dalam kelas ini
    private String nama;
    
    // default (tanpa modifier) bisa diakses subclass dalam 1 package
    String departemen;
    
    // Constructor Employee
    public Employee(String nama) {
        this.nama = nama;
        System.out.println("Constructor Employee dipanggil untuk: " + nama);
    }
    
    // Method milik Employee
    public void tampilNama() {
        System.out.println("Nama       : " + this.nama);
    }
}
