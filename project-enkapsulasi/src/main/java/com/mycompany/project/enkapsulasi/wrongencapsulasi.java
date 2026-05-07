/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.project.enkapsulasi;

/**
 *
 * @author HP VICTUS
 */

// not recomended karena data bisa diakses dan diubah dari mana aja
class Manusia {
    public String nama;
    public int umur;
}

public class wrongencapsulasi {
    public static void main(String[] args) {
       Manusia m = new Manusia();
       m.umur = -999; //tidak ada validasi, data dapat terubah
    }
}
