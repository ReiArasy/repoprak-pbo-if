/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance.keysuper;

/**
 *
 * @author HP VICTUS
 */
public class Manager extends Employee {
    private String alamat;
    
    public Manager (String nama, String alamat){
        super(nama);
        
        this.alamat = alamat;
        System.out.println("Constructor Manager dipanggil untuk: " + nama);
    }
    
    public void tampilInfo(){
        super.departement = "Ngawi";
        super.tampilNama();
        
        System.out.println("Departement : " + super.departement);
        System.out.println("Alamat      : " + this.alamat);
    }
}
