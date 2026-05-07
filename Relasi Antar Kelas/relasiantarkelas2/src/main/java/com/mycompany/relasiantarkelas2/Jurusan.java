/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relasiantarkelas2;

/**
 *
 * @author HP VICTUS
 */
public class Jurusan {
    private String kodeJurusan;
    private String namaJurusan;
    
    // ─ KUNCI AGREGASI ─
    // Jurusan MENYIMPAN array of Mahasiswa sebagai atribut
    // Tapi objek Mahasiswa dibuat di luar (di Main), lalu dimasukkan
    private Mahasiswa[] daftarMahasiswa;
    private int jumlahMhs;              // counter berapa mahasiswa yang sudah masuk
    
    // Constructor
    public Jurusan(String kode, String nama) {
        this.kodeJurusan    = kode;
        this.namaJurusan    = nama;
        this.daftarMahasiswa = new Mahasiswa[10]; // maksimal 10 mahasiswa
        this.jumlahMhs      = 0;
    }
    
    // Method untuk menambah mahasiswa ke jurusan
    public void addMahasiswa(Mahasiswa mhs) {
        if (jumlahMhs < 10) {
            this.daftarMahasiswa[jumlahMhs] = mhs; // simpan objek mahasiswa
            this.jumlahMhs++;
            System.out.println(mhs.getNama() + " berhasil ditambahkan ke " 
                               + this.namaJurusan);
        } else {
            System.out.println("Jurusan sudah penuh!");
        }
    }
    
    // Method untuk menampilkan semua mahasiswa di jurusan 
    public void displayMahasiswa() {
        System.out.println("=======================");
        System.out.println("Kode Jurusan : " + this.kodeJurusan);
        System.out.println("Nama Jurusan : " + this.namaJurusan);
        System.out.println("Daftar Mahasiswa :");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("  " + (i+1) + ". " 
                               + daftarMahasiswa[i].getNim() 
                               + " - " 
                               + daftarMahasiswa[i].getNama());
        }
        System.out.println("Total: " + jumlahMhs + " mahasiswa");
        System.out.println("========================");
    }
}
