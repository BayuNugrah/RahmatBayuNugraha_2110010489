/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rumahsakit;

/**
 *
 * @author rbayu
 */
import java.util.ArrayList;
import java.util.List;

class Pasien {
    private String nama;
    private String alamat;
    private String tanggalLahir;
    private List<String> riwayatMedis;

    public Pasien(String nama, String alamat, String tanggalLahir) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.riwayatMedis = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void tambahkanRiwayatMedis(String riwayat) {
        riwayatMedis.add(riwayat);
    }

    public List<String> getRiwayatMedis() {
        return riwayatMedis;
    }
}
