/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

/**
 *
 * @author Illuminare
 */

/*
 * NAMA : ALFITO DIMAS PRASETYO
 * NIM : 205150401111057
 */

public class KendaraanUdara extends Kendaraan {

    protected double tinggiMaksimal;

    public KendaraanUdara(int kode, double panjang, double lebar, double tinggi, String merek, int jumlah,
            double tinggiMaks) {
        super(kode, panjang, lebar, tinggi, merek, jumlah);
        this.tinggiMaksimal = tinggiMaks;
    }

    public double getTinggiMaksimal() {
        return this.tinggiMaksimal;
    }

    public void setTinggiMaksimal(double tinggi) {
        this.tinggiMaksimal = tinggi;
    }

    @Override
    public void showInformasi() {
        super.showInformasi();
        System.out.println("Tinggi Maksimal\t\t: " + this.tinggiMaksimal + " Kaki");
    }

}
