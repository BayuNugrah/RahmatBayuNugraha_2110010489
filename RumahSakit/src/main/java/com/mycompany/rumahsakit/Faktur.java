/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rumahsakit;

/**
 *
 * @author rbayu
 */
class Faktur {
    private String tanggal;
    private double jumlah;
    private boolean statusPembayaran;

    public Faktur(String tanggal, double jumlah) {
        this.tanggal = tanggal;
        this
.jumlah = jumlah;
this.statusPembayaran = false;
}

typescript
Copy code
public String getTanggal() {
    return tanggal;
}

public double getJumlah() {
    return jumlah;
}

public boolean getStatusPembayaran() {
    return statusPembayaran;
}

public void bayarFaktur() {
    statusPembayaran = true;
}
}
