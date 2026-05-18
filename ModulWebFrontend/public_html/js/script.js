/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

// 
// VARIABEL di JavaScript
// var  → variabel lama (bisa berubah tipe)
// let  → variabel modern (bisa berubah nilai)
// const→ konstanta (tidak bisa berubah)
// 
var nama = "Budi";           // string
let umur = 20;               // number
const JURUSAN = "Informatika"; // konstanta

console.log("Nama:", nama);  // tampil di browser console (F12)
console.log("Umur:", umur);
console.log("Jurusan:", JURUSAN);

// 
// PERCABANGAN IF-ELSE
// 
let nilai = 85;
let grade;

if (nilai >= 90) {
    grade = "A";
} else if (nilai >= 80) {
    grade = "B";
} else if (nilai >= 70) {
    grade = "C";
} else {
    grade = "D";
}

console.log("Grade:", grade); // B

// 
// FUNCTION → blok kode yang bisa dipanggil ulang
// 
function sapa(nama) {
    return "Halo, " + nama + "! Selamat datang!";
}

// Panggil function
let pesan = sapa("Siti");
console.log(pesan); // Halo, Siti! Selamat datang!

// Function dengan expression (cara lain tulis function)
var tambah = function(a, b) {
    return a + b;
};
console.log("3 + 5 =", tambah(3, 5)); // 8

// 
// MANIPULASI ELEMEN HTML dengan JS
// getElementById → ambil elemen berdasarkan id
// 

// Jalankan setelah halaman selesai dimuat
window.onload = function() {

    // Contoh 1: Ubah teks elemen saat tombol diklik
    // (Tambahkan tombol ini di HTML jika ingin dicoba)
    var tombol = document.getElementById("tombol-sapa");
    if (tombol) {
        tombol.onclick = function() {
            var inputNama = document.getElementById("input-nama").value;
            if (inputNama === "") {
                alert("Nama tidak boleh kosong!");
            } else {
                document.getElementById("output-sapa").innerText
                    = sapa(inputNama);
            }
        };
    }

    // Contoh 2: Validasi form sebelum submit
    var form = document.querySelector("form");
    if (form) {
        form.onsubmit = function(event) {
            var namaInput = document.getElementById("nama").value;
            var emailInput = document.getElementById("email").value;

            if (namaInput === "") {
                alert("Nama wajib diisi!");
                event.preventDefault(); // hentikan pengiriman form
                return;
            }
            if (emailInput === "") {
                alert("Email wajib diisi!");
                event.preventDefault();
                return;
            }

            alert("Form berhasil dikirim! Halo, " + namaInput + "!");
        };
    }
};


// OBJECT di JavaScript → mirip HashMap di Java

var mahasiswa = {
    nama: "Andi",
    nim: "12345",
    jurusan: "Informatika",
    nilai: 90
};

// Akses properti object
console.log(mahasiswa.nama);         // Andi
console.log(mahasiswa["jurusan"]);   // Informatika


// ARRAY di JavaScript → mirip ArrayList di Java

var daftarNama = ["Budi", "Siti", "Andi", "Rini"];

console.log(daftarNama[0]);          // Budi
console.log(daftarNama.length);      // 4

daftarNama.push("Doni");             // tambah elemen di akhir
console.log(daftarNama);             // ["Budi","Siti","Andi","Rini","Doni"]

daftarNama.pop();                    // hapus elemen terakhir
console.log(daftarNama);             // ["Budi","Siti","Andi","Rini"]

// Loop array
for (var i = 0; i < daftarNama.length; i++) {
    console.log("Mahasiswa ke-" + i + ": " + daftarNama[i]);
}