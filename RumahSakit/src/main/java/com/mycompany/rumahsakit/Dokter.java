/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rumahsakit;

/**
 *
 * @author rbayu
 */
class Dokter {
    private String nama;
    private String spesialisasi;
    private List<Pasien>Pasien;

    public Dokter(String nama, String spesialisasi) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.Pasien = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void tambahkanPasien(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public List<Pasien> getDaftarPasien() {
        return daftarPasien;
    }
}
