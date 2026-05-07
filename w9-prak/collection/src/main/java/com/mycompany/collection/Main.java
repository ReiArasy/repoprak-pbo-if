/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.collection;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        // ===========================
        // BAGIAN 1 ARRAYLIST 

        System.out.println("======================");
        System.out.println("   ARRAYLIST DASAR    ");
        System.out.println("======================");

        // Buat ArrayList <String>. artinya hanya boleh isi String
        ArrayList<String> buah = new ArrayList<>();

        // Tambah elemen
        buah.add("Apel");
        buah.add("Mangga");
        buah.add("Jeruk");
        buah.add("Durian");

        System.out.println("Isi  : " + buah);
        System.out.println("Size : " + buah.size());
        System.out.println("Index 0 : " + buah.get(0));
        System.out.println("Ada Mangga? " + buah.contains("Mangga"));

        // Hapus elemen
        buah.remove("Jeruk");
        System.out.println("Setelah hapus Jeruk: " + buah);

        System.out.println();

        // 4 cara loop ArrayList 
        System.out.println("=== 4 CARA LOOP ===");

        // Cara 1: loop biasa dengan index
        System.out.print("Loop biasa  : ");
        for (int i = 0; i < buah.size(); i++) {
            System.out.print(buah.get(i) + " ");
        }
        System.out.println();

        // Cara 2: for-each (paling sering dipakai)
        System.out.print("For-each    : ");
        for (String b : buah) {
            System.out.print(b + " ");
        }
        System.out.println();

        // Cara 3: iterator
        System.out.print("Iterator    : ");
        Iterator<String> itr = buah.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // Cara 4: lambda (modern, singkat)
        System.out.print("Lambda      : ");
        buah.forEach(b -> System.out.print(b + " "));
        System.out.println();

        System.out.println();

        // ========================
        // BAGIAN 2: HASHSET - tidak boleh duplikat
        
        System.out.println("=====================");
        System.out.println("       HASHSET       ");
        System.out.println("=====================");

        HashSet<String> kota = new HashSet<>();
        kota.add("Bandung");
        kota.add("Jakarta");
        kota.add("Surabaya");
        kota.add("Bandung");  // duplikat 
        kota.add("Jakarta");  // duplikat 

        System.out.println("Isi HashSet (duplikat dihapus otomatis): " + kota);
        System.out.println("Size: " + kota.size()); // tetap 3

        System.out.println();

        // ===================
        // BAGIAN 3: HASHMAP - pasangan key-value
 
        System.out.println("====================");
        System.out.println("    HASHMAP         ");
        System.out.println("====================");

        // <String, Integer> → key String, value Integer
        HashMap<String, Integer> nilaiMhs = new HashMap<>();

        // Tambah data (key, value)
        nilaiMhs.put("Budi",  85);
        nilaiMhs.put("Siti",  92);
        nilaiMhs.put("Andi",  78);
        nilaiMhs.put("Rini",  90);

        System.out.println("Semua data: " + nilaiMhs);
        System.out.println("Nilai Siti: " + nilaiMhs.get("Siti")); // akses by key
        System.out.println("Ada Andi?  " + nilaiMhs.containsKey("Andi"));

        // Loop HashMap
        System.out.println("\nDaftar nilai:");
        for (Map.Entry<String, Integer> entry : nilaiMhs.entrySet()) {
            System.out.printf("  %-8s → %d%n", entry.getKey(), entry.getValue());
        }

        System.out.println();

        // ══════════════════════════════════════════════════════════
        // BAGIAN 4: SORTING Collection
        // ══════════════════════════════════════════════════════════
        System.out.println("=========================");
        System.out.println("    SORTING COLLECTION   ");
        System.out.println("=========================");

        List<Pegawai> daftarPegawai = new ArrayList<>();
        daftarPegawai.add(new Pegawai("Bobby",  3000000));
        daftarPegawai.add(new Pegawai("Erick",  1600000));
        daftarPegawai.add(new Pegawai("Rey",    2500000));
        daftarPegawai.add(new Pegawai("Anna",   3500000));

        // Sort by NAMA (pakai compareTo() yang sudah dibuat di Pegawai)
        Collections.sort(daftarPegawai);
        System.out.println("Sort by Nama (A-Z):");
        daftarPegawai.forEach(p -> System.out.println("  " + p));

        System.out.println();

        // Sort by GAJI (pakai SalaryComparator)
        Collections.sort(daftarPegawai, new SalaryComparator());
        System.out.println("Sort by Gaji (kecil ke besar):");
        daftarPegawai.forEach(p -> System.out.println("  " + p));

        System.out.println();

        // ================================
        // BAGIAN 5: FILTERING Collection
 
        System.out.println("=========================");
        System.out.println("  FILTERING COLLECTION   ");
        System.out.println("=========================");

        // Cara 1: konvensional (for + if)
        System.out.println("Pegawai gaji >= 2.500.000 (konvensional):");
        for (Pegawai p : daftarPegawai) {
            if (p.getGaji() >= 2500000) {
                System.out.println("  " + p);
            }
        }

        System.out.println();

        // Cara 2: lambda + stream (modern, lebih singkat)
        System.out.println("Pegawai gaji >= 2.500.000 (lambda):");
        List<Pegawai> hasilFilter = daftarPegawai.stream()
            .filter(p -> p.getGaji() >= 2500000)
            .collect(Collectors.toList());
        hasilFilter.forEach(p -> System.out.println("  " + p));

        System.out.println();

        // Cari 1 pegawai berdasarkan nama
        System.out.println("Cari pegawai bernama 'Erick':");
        Pegawai ditemukan = daftarPegawai.stream()
            .filter(p -> p.getNama().equals("Erick"))
            .findFirst()
            .orElse(null);
        System.out.println("  " + (ditemukan != null ? ditemukan : "Tidak ditemukan"));

    }
}
