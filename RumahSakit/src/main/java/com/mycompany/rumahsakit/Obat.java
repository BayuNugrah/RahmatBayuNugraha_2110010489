/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rumahsakit;

/**
 *
 * @author rbayu
 */
class Obat {
    private String nama;
    private double dosis;
    private int ketersediaan;

    public Obat(String nama, double dosis, int ketersediaan) {
        this.nama = nama;
        this.dosis = dosis;
        this.ketersediaan = ketersediaan;
    }

    public String getNama() {
        return nama;
    }

    public double getDosis() {
        return dosis;
    }

    public int getKetersediaan() {
        return ketersediaan;
    }

    public void kurangiKetersediaan() {
        ketersediaan--;
    }
}
