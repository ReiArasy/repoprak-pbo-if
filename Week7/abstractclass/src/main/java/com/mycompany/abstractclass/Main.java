/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractclass;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        // Hewan h = new Hewan("X"); ERROR! tidak bisa di-new

        Kucing k = new Kucing("Mimi");
        Anjing a = new Anjing("Doggy");

        k.bersuara(); // versi Kucing
        k.makan();    // warisan dari Hewan

        a.bersuara(); // versi Anjing
        a.makan();    // warisan dari Hewan
    }
}
