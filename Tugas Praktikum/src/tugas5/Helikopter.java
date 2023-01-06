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

public class Helikopter extends KendaraanUdara {

    private double diameterBalingBaling;

    public Helikopter(int kode, double panjang, double lebar, double tinggi, String merek, int jumlah,
            double tinggiMaks, double baling) {
        super(kode, panjang, lebar, tinggi, merek, jumlah, tinggiMaks);
        this.diameterBalingBaling = baling;
    }

    public double getDiameterBalingBaling() {
        return this.diameterBalingBaling;
    }

    public void setDiameterBalingBaling(double baling) {
        this.diameterBalingBaling = baling;
    }

    @Override
    public void Berjalan() {
        System.out.println("Degdegdegdeg");
    }

    @Override
    public void showInformasi() {
        super.showInformasi();
        System.out.println("Diameter Baling-Baling\t\t: " + this.diameterBalingBaling + " m");
    }

}
