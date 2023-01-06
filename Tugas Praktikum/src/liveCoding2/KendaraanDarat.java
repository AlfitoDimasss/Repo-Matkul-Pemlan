/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveCoding2;

/**
 *
 * @author Illuminare
 */

/*
 * NAMA : ALFITO DIMAS PRASETYO
 * NIM : 205150401111057
 */

public class KendaraanDarat extends Kendaraan {

    protected int jumlahRoda;

    public KendaraanDarat(double panjang, double lebar, double tinggi, String merek, int jumlah, int roda) {
        super(panjang, lebar, tinggi, merek, jumlah);
        this.jumlahRoda = roda;
    }

    public int getJumlahRoda() {
        return this.jumlahRoda;
    }

    public void setJumlahRoda(int roda) {
        this.jumlahRoda = roda;
    }

    @Override
    public void showInformasi() {
        super.showInformasi();
        System.out.println("Jumlah Roda\t\t\t: " + this.jumlahRoda + " Roda");
    }

}
