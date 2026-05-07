/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.modul3;

/**
 *
 * @author HP VICTUS
 */
class Mahasiswa {
    private String nama;
    private String nim;
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
}
public class Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mahasiswa m1 = new Mahasiswa();
        
        m1.setNama("Andi");
        m1.setNim("123456");
        
        System.out.println("Nama Mahasiswa : " + m1.getNama());
        System.out.println("NIM            : " + m1.getNim());
        
        Mahasiswa m2 = new Mahasiswa();
        
        m2.setNama("Budi");
        m2.setNim("987654");
        System.out.println("Nama Mahasiswa : " + m2.getNama());
        System.out.println("NIM            : " + m2.getNim());
    }
    
}
