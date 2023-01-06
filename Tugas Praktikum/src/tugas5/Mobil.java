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

public class Mobil extends KendaraanDarat {

    private double diameterStir;
    private boolean bermesinDiesel;

    public Mobil(int kode, double panjang, double lebar, double tinggi, String merek, int jumlah, int roda, double stir,
            boolean diesel) {
        super(kode, panjang, lebar, tinggi, merek, jumlah, roda);
        this.bermesinDiesel = diesel;
        this.diameterStir = stir;
    }

    public double getDiameterStir() {
        return this.diameterStir;
    }

    public boolean isBermesinDiesel() {
        return this.bermesinDiesel;
    }

    public void setDiameterStir(double stir) {
        this.diameterStir = stir;
    }

    public void setBermesinDiesel(boolean diesel) {
        this.bermesinDiesel = diesel;
    }

    @Override
    public void Berjalan() {
        System.out.println("Bremm bremmmm");
    }

    @Override
    public void showInformasi() {
        super.showInformasi();
        System.out.println("Diameter Stir\t\t\t: " + this.diameterStir + " m");
        if (this.bermesinDiesel == true) {
            System.out.println("Bermesin Diesel\t\t: Ya");
        } else {
            System.out.println("Bermesin Diesel\t\t: Tidak");
        }
    }

}
