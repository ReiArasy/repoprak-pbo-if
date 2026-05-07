/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance.overriding;

/**
 *
 * @author HP VICTUS
 */
public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }
    
    // Override method bersuara() dengan suara anjing
    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara: Guk guk");
    }
}
