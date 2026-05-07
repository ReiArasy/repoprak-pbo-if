/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collection;

/**
 *
 * @author HP VICTUS
 */
public class Pegawai implements Comparable<Pegawai> {
    
    private String nama;
    private int    gaji;

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() { return nama; }
    public int    getGaji() { return gaji; }

    // Untuk tampilkan objek langsung dengan println
    @Override
    public String toString() {
        return String.format("%-10s | Rp %,d", nama, gaji);
    }

    // compareTo: aturan sort default (berdasarkan nama A-Z) 
    @Override
    public int compareTo(Pegawai lain) {
        return this.nama.compareTo(lain.nama); // sort by nama A-Z
    }
}
