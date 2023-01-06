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

public class Motor extends KendaraanDarat {

    private double lebarStang;
    private String warnaJok;

    public Motor(double panjang, double lebar, double tinggi, String merek, int jumlah, int roda, double stang,
            String warna) {
        super(panjang, lebar, tinggi, merek, jumlah, roda);
        this.lebarStang = stang;
        this.warnaJok = warna;
    }

    public double getLebarStang() {
        return this.lebarStang;
    }

    public String getWarnaJok() {
        return this.warnaJok;
    }

    public void setLebarStang(double stang) {
        this.lebarStang = stang;
    }

    public void setWarnaJok(String warna) {
        this.warnaJok = warna;
    }

    @Override
    public void Berjalan() {
        System.out.println("Mmmbeeerrrrr");
    }

    @Override
    public void showInformasi() {
        super.showInformasi();
        System.out.println("Lebar Stang\t\t\t: " + this.lebarStang + " m");
        System.out.println("Warna Jok\t\t\t: " + this.warnaJok);
    }

}
