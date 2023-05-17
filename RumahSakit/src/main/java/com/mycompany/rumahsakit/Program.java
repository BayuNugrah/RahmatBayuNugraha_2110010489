/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rumahsakit;

/**
 *
 * @author rbayu
 */
public class Program {
public static void main(String[] args) {
// Membuat objek pasien
Pasien pasien1 = new Pasien("Rahmat", "Banjarmasin", "16/07/2003");
Pasien pasien2 = new Pasien("Bayu", "Banjarmasin", "16/07/2003");
    // Membuat objek dokter
    Dokter dokter1 = new Dokter("Dr. Anderson", "Dokter Umum");
    Dokter dokter2 = new Dokter("Dr. Johnson", "Dokter Spesialis Jantung");

    // Menambahkan pasien ke dokter
    dokter1.tambahkanPasien(pasien1);
    dokter2.tambahkanPasien(pasien2);

    // Membuat objek obat
    Obat obat1 = new Obat("Paracetamol", 500, 10);
    Obat obat2 = new Obat("Amoxicillin", 250, 5);

    // Mengurangi ketersediaan obat
    obat1.kurangiKetersediaan();
    obat2.kurangiKetersediaan();

    // Membuat objek pendaftaran
    Pendaftaran pendaftaran1 = new Pendaftaran("01/05/2023", "08:00");
    Pendaftaran pendaftaran2 = new Pendaftaran("02/05/2023", "09:00");

    // Menambahkan pasien ke pendaftaran
    pendaftaran1.tambahkanPasien(pasien1);
    pendaftaran2.tambahkanPasien(pasien2);

    // Membuat objek faktur
    Faktur faktur1 = new Faktur("01/05/2023", 500000);
    Faktur faktur2 = new Faktur("02/05/2023", 750000);

    // Membayar faktur
    faktur1.bayarFaktur();
    faktur2.bayarFaktur();

    // Menampilkan informasi
    System.out.println("Informasi Pasien:");
    System.out.println("Nama Pasien: " + pasien1.getNama());
    System.out.println("Alamat: " + pasien1.getAlamat());
    System.out.println("Tanggal Lahir: " + pasien1.getTanggalLahir());
    System.out.println("Riwayat Medis: " + pasien1.getRiwayatMedis());
    System.out.println();

    System.out.println("Informasi Dokter:");
    System.out.println("Nama Dokter: " + dokter1.getNama());
    System.out.println("Spesialisasi: " + dokter1.getSpesialisasi());
    System.out.println("Daftar Pasien: " + dokter1.getDaftarPasien());
    System.out.println();

    System.out.println("Informasi Obat:");
    System.out.println("Nama Obat: " + obat1.getNama());
    System.out.println("Dosis: \" + obat1.getDosis());\n" +
"System.out.println(\"Ketersediaan: \" + obat1.getKetersediaan());\n" +
"System.out.println();
    System.out.println("Informasi Pendaftaran:");
    System.out.println("Tanggal: " + pendaftaran1.getTanggal());
    System.out.println("Waktu: " + pendaftaran1.getWaktu());
    System.out.println("Daftar Pasien Terdaftar: " + pendaftaran1.getDaftarPasienTerdaftar());
    System.out.println();

    System.out.println("Informasi Faktur:");
    System.out.println("Tanggal: " + faktur1.getTanggal());
    System.out.println("Jumlah: " + faktur1.getJumlah());
    System.out.println("Status Pembayaran: " + faktur1.getStatusPembayaran());
}
}
