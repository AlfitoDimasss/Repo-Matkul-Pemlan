/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAP;

/**
 *
 * @author Illuminare
 */

/*
 * Nama : Alfito Dimas Prasetyo
 * NIM : 205150401111057
 */

public abstract class Tanaman {

    private int lamaHidup, masaHidup, berbuah, buah;
    private double perkembangan, prosesBerbuah;
    protected int jumlahBuah = 0;
    protected double jumlahProsesBerbuah = 0;

    public Tanaman(int lamaHidup, int masaHidup, int berbuah, double perkembangan) {
        this.lamaHidup = lamaHidup;
        this.masaHidup = masaHidup;
        this.berbuah = berbuah;
        this.perkembangan = perkembangan;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    public abstract void berkembang();

    public String status() {
        if (lamaHidup >= masaHidup) {
            return "Mati";
        } else {
            return "Hidup";
        }
    }

    @Override
    public String toString() {
        return "Tanaman{" + "lamaHidup=" + lamaHidup + ", masaHidup=" + masaHidup + ", berbuah=" + berbuah + ", buah="
                + buah + ", perkembangan=" + perkembangan + ", prosesBerbuah=" + prosesBerbuah + '}';
    }

    public void showInfo() {
        System.out.println("Masa Hidup: " + this.masaHidup + " Hari");
        System.out.println("Umur Tanaman: " + this.lamaHidup + " Hari");
        System.out.println("Menghasilkan: " + this.buah + " Buah");
        System.out.println("Status: " + this.status());
    }

}
