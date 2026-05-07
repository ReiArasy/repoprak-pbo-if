/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceimp;

/**
 *
 * @author HP VICTUS
 */
public class Manusia implements BisaBerlari {
    private String nama;

    public Manusia(String nama) {
        this.nama = nama;
    }

    @Override
    public void berlari() {
        System.out.println(nama + " berlari dengan 2 kaki.");
    }
}
