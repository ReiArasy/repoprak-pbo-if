/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collection;

import java.util.Comparator;

/**
 *
 * @author HP VICTUS
 */
public class SalaryComparator implements Comparator<Pegawai> {
    
    @Override
    public int compare(Pegawai p1, Pegawai p2) {
        // Positif, p1 setelah p2 (ascending/kecil ke besar)
        return p1.getGaji() - p2.getGaji();
    }
    
}
