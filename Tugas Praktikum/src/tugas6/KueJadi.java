/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6;

import java.util.*;

/**
 *
 * @author Illuminare
 */

/*
 * Nama : Alfito Dimas Prasetyo
 * NIM : 205150401111057
 */

public class KueJadi extends Kue {

    private double jumlah;

    public KueJadi(double jumlah, String nama, double harga) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return this.getHarga() * this.jumlah * 2;
    }

    @Override
    public String toString() {
        return String.format(Locale.ITALY, "KueJadi\t\t{ Nama = %s, Harga = Rp %,.2f, Jumlah = %.1f Kotak }", nama,
                harga, jumlah);
    }

}
