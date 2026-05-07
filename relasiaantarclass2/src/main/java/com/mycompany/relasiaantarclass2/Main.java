/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relasiaantarclass2;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        
        //objek mahasiswa
        Mahasiswa m1 = new Mahasiswa("1001", "Andi");
        Mahasiswa m2 = new Mahasiswa("1002", "Budi");
        Mahasiswa m3 = new Mahasiswa("1003", "Cia");
        
        Jurusan j1 = new Jurusan("IF", "Informatika");
        Jurusan j2 = new Jurusan("RPL", "Rekayasa Perangkat Lunak");
        
        j1.addMahasiswa(m1);
        j1.addMahasiswa(m2);
        
        j2.addMahasiswa(m3);
        
        j1.displayMahasiswa();
        j2.displayMahasiswa();
    }
}
