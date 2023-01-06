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

public class KuePesanan extends Kue {

    private double berat;

    public KuePesanan(double berat, String nama, double harga) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return this.getHarga() * this.berat;
    }

    @Override
    public String toString() {
        return String.format(Locale.ITALY, "KuePesanan\t{ Nama = %s, Harga = Rp %,.2f, Berat = %.2f Kg }", nama, harga,
                berat);
    }

}
