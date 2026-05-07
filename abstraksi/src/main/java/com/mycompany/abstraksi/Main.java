/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstraksi;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        Kucing k = new Kucing("Mimi");
        Anjing a = new Anjing("Doggy");
        
        k.bersuara(); //versi kucing
        k.makan(); //warisan dari hewan
        
        a.bersuara(); //versi anjing
        a.makan(); //warisan dari hewan
    }
}
