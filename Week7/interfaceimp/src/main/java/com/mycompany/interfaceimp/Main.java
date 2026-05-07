/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaceimp;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        Kucing k = new Kucing("Mimi");
        Manusia m = new Manusia("Budi");

        k.bersuara();
        k.berlari();

        m.berlari();
        // m.bersuara(); ERROR! Manusia tidak implements BisaBersuara
    }
}
