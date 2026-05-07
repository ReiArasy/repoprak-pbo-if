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
    
    // - KUNCI KOMPOSISI -
    // CPU, Monitor, Mouse adalah ATRIBUT dari Komputer
    private CPU     cpu;
    private Monitor monitor;
    private Mouse   mouse;
    
    // Constructor Komputer
    // Di sini CPU, Monitor, Mouse DICIPTAKAN (lahir bersama Komputer)
    public Komputer(String namaKomputer,
                    String merkCPU,     int kecepatanCPU,
                    String merkMonitor, int ukuranMonitor,
                    String merkMouse,   String tipeMouse) {
        
        this.namaKomputer = namaKomputer;
        
        // Objek komponen dibuat Di dalam constructor Komputer
        // Mereka tidak pernah ada sebelum Komputer ini ada
        this.cpu     = new CPU(merkCPU, kecepatanCPU);
        this.monitor = new Monitor(merkMonitor, ukuranMonitor);
        this.mouse   = new Mouse(merkMouse, tipeMouse);
        
        System.out.println("Komputer '" + namaKomputer + "' berhasil dirakit!");
    }
    
    // Method untuk tampilkan semua spesifikasi komputer
    public void displaySpek() {
        System.out.println("========================");
        System.out.println("Komputer : " + this.namaKomputer);
        System.out.println("Spesifikasi:");
        this.cpu.displaySpek();       // panggil method milik CPU
        this.monitor.displaySpek();   // panggil method milik Monitor
        this.mouse.displaySpek();     // panggil method milik Mouse
        System.out.println("========================");
    }
}
