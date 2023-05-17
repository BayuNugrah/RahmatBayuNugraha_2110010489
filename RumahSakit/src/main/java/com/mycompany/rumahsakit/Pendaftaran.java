/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rumahsakit;

/**
 *
 * @author rbayu
 */
class Pendaftaran {
    private String tanggal;
    private String waktu;
    private List<Pasien> daftarPasienTerdaftar;

    public Pendaftaran(String tanggal, String waktu) {
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.daftarPasienTerdaftar = new ArrayList<>();
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public void tambahkanPasien(Pasien pasien) {
        daftarPasienTerdaftar.add(pasien);
    }

    public List<Pasien> getDaftarPasienTerdaftar() {
        return daftarPasienTerdaftar;
    }
}

