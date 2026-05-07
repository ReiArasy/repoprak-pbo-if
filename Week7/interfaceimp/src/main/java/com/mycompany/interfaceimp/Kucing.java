/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceimp;

/**
 *
 * @author HP VICTUS
 */
public class Kucing implements BisaBersuara, BisaBerlari {
     private String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " : Meong!");
    }

    @Override
    public void berlari() {
        System.out.println(nama + " berlari dengan 4 kaki.");
    }

}
