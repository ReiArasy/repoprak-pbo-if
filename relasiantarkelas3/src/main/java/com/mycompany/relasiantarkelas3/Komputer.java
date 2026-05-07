/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relasiantarkelas3;

/**
 *
 * @author HP VICTUS
 */
public class Komputer {
    
    private String namaKomputer;
    
    //atribut untuk create komponen komputer
    private CPU cpu;
    private Monitor monitor;
    
    //disini CPU dan Monitor diciptakan bersama komputer
    public Komputer(String namaKomputer,
                    String merkCPU, int kecepatanCPU,
                    String merkMonitor, int ukuranMonitor){
        this.namaKomputer = namaKomputer;
        
        this.cpu = new CPU(merkCPU, kecepatanCPU);
        this.monitor = new Monitor(merkMonitor, ukuranMonitor);
        
        System.out.println("Komputer '" + namaKomputer + "' berhasil dirakit!");
    }
    
    //method untuk menampilkan semua spesifikasi komputer
    public void displaySpek(){
        System.out.println("===================");
        System.out.println("Komputer  : " + this.namaKomputer);
        System.out.println("Spesifikasi:");
        this.cpu.displaySpek();
        this.monitor.displaySpek();
        System.out.println("===================");
    }
}
