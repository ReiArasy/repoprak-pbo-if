/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relasiaantarclass2;

/**
 *
 * @author HP VICTUS
 */
public class Jurusan {
    private String kodeJurusan;
    private String namaJurusan;
    private int jumlahMahasiswa;
    
    private Mahasiswa[] daftarMahasiswa;
    
    public Jurusan(String kode, String nama){
        this.kodeJurusan = kode;
        this.namaJurusan = nama;
        this.daftarMahasiswa = new Mahasiswa[10];
        this.jumlahMahasiswa = 0;
    }
    
    public void addMahasiswa(Mahasiswa mhs){
        if(jumlahMahasiswa < 10){
            this.daftarMahasiswa[jumlahMahasiswa] = mhs;
            this.jumlahMahasiswa++;
            System.out.println(mhs.getNama() + " Berhasil ditambahkan ke " + 
                    this.namaJurusan);
        }
        else{
            System.out.println("Jurusan sudah penuh!");
        }
    }
    
    public void displayMahasiswa(){
        System.out.println("===================");
        System.out.println("Kode Jurusan    : " + this.kodeJurusan);
        System.out.println("Nama Jurusan    : " + this.namaJurusan);
        System.out.println("Daftar Mahasiswa :");
        for (int i = 0; i < jumlahMahasiswa; i++){
            System.out.println(" " + (i+1) + ". "
                                +daftarMahasiswa[i].getNim()
                                + "  -  "
                                +daftarMahasiswa[i].getNama());
        }
        System.out.println("Total Mahasiswa : " + jumlahMahasiswa + " orang");
        System.out.println("======================");
    }
}
