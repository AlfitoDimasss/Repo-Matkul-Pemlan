/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Illuminare
 */

/*
 * Nama: Alfito Dimas Prasetyo
 * NIM: 205150401111057
 * Kelas: Sistem Informasi - E
 */

public class SegiEmpat {

    // Deklarasi Variabel
    private double luas, keliling, volume;
    private double xAwal, yAwal;
    private String arahX, arahY;

    // Default constructor
    public SegiEmpat() {
    }

    // Overload Constructor
    public SegiEmpat(double xAwal, double yAwal, String arahX, String arahY) {
        this.arahX = arahX;
        this.arahY = arahY;
        this.xAwal = xAwal;
        this.yAwal = yAwal;
    }

    // Getter Luas
    public double getLuas() {
        return this.luas;
    }

    // Getter keliling
    public double getKeliling() {
        return this.keliling;
    }

    // Getter volume
    public double getVolume() {
        return this.volume;
    }

    // Setter Luas
    public void setLuas(double luas) {
        this.luas = luas;
    }

    // Setter keliling
    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }

    // Setter volume
    public void setVolume(double volume) {
        this.volume = volume;
    }

    // Getter titik x awal
    public double getXAwal() {
        return this.xAwal;
    }

    // Getter titik y awal
    public double getYAwal() {
        return this.yAwal;
    }

    // Getter arah koordinat titik x
    public String getArahX() {
        return this.arahX;
    }

    // Getter arah koordinat titik y
    public String getArahY() {
        return this.arahY;
    }

}
