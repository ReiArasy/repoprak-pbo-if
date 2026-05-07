/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance.overloading;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        Lagu lagu1 = new Lagu();
        Lagu lagu2 = new Lagu();
        
        // versi 1: 1 parameter, pencipta otomatis "Tidak Dikenal"
        lagu1.isiParam("Lagu Tanpa Nama");
        
        // versi 2: 2 parameter, judul dan pencipta diisi semua
        lagu2.isiParam("XXL", "Lany");
        
        lagu1.cetakKeLayar();
        lagu2.cetakKeLayar();
    }
}
