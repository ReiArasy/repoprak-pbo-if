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
    // Atribut tambahan milik Manager (Employee tidak punya)
    private String alamat;
    
    // Constructor Manager
    public Manager(String nama, String alamat) {
        
        // SUPER() WAJIB DIPANGGIL PERTAMA 
        // Karena Employee punya constructor berparameter,
        // Manager harus panggil super(nama) untuk inisialisasi bagian Employee-nya
        // Jika tidak dipanggil, ERROR saat compile
        super(nama);    // memanggil constructor Employee(String nama)
        
        this.alamat = alamat;
        System.out.println("Constructor Manager dipanggil untuk: " + nama);
    }
    
    public void tampilInfo() {
        
        // super.departemen akses atribut milik Employee
        super.departemen = "Personalia";
        
        // super.tampilNama() panggil method milik Employee
        super.tampilNama();
        
        // Tampilkan atribut tambahan milik Manager
        System.out.println("Departemen : " + super.departemen);
        System.out.println("Alamat     : " + this.alamat);
    }
}
