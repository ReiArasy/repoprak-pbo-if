/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance.overloading;

/**
 *
 * @author HP VICTUS
 */
public class Lagu {
    private String judul;
    private String pencipta;
    
    public void isiParam(String judul){
        this.judul = judul;
        this.pencipta = "tidak diketahui";
    }
    
    public void isiParam(String judul, String pencipta){
        this.judul = judul;
        this.pencipta = pencipta;
    }
    
    public void cetakKeLayar(){
        System.out.println("Judul     : " + this.judul);
        System.out.println("Pencipta  : " + this.pencipta);
        System.out.println("============================");
    }
}
