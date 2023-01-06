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

public class Pesawat extends KendaraanUdara {

    private double lebarSayap;
    private String maskapai;

    public Pesawat(int kode, double panjang, double lebar, double tinggi, String merek, int jumlah, double tinggiMaks,
            double sayap, String maskapai) {
        super(kode, panjang, lebar, tinggi, merek, jumlah, tinggiMaks);
        this.lebarSayap = sayap;
        this.maskapai = maskapai;
    }

    public double getLebarSayap() {
        return this.lebarSayap;
    }

    public String getMaskapai() {
        return this.maskapai;
    }

    public void setLebarSayap(double sayap) {
        this.lebarSayap = sayap;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    @Override
    public void Berjalan() {
        System.out.println("Nguinggggg");
    }

    @Override
    public void showInformasi() {
        super.showInformasi();
        System.out.println("Lebar Sayap\t\t\t: " + this.lebarSayap + " m");
        System.out.println("Maskapai\t\t\t: " + this.maskapai);
    }

}
