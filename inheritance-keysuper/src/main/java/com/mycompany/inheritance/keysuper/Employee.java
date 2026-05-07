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
    
    private String nama;
    String departement;
    
    public Employee(String nama){
        this.nama = nama;
        System.out.println("Constructor Employee dipanggil untuk: " + nama);
    }
    
    public void tampilNama(){
        System.out.println("Nama   : " + this.nama);
    }
}
