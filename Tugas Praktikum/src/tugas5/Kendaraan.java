/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

import java.util.Scanner;

/**
 *
 * @author Illuminare
 */

/*
 * NAMA : ALFITO DIMAS PRASETYO
 * NIM : 205150401111057
 */

public class Kendaraan {

    protected final Scanner io = new Scanner(System.in);
    protected double panjang, lebar, tinggi;
    protected String merek;
    protected int jumlahPenumpang;
    protected int kodeKendaraan;

    public Kendaraan(int kode, double panjang, double lebar, double tinggi, String merek, int jumlah) {
        this.kodeKendaraan = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.merek = merek;
        this.jumlahPenumpang = jumlah;
    }

    public double getPanjang() {
        return this.panjang;
    }

    public double getLebar() {
        return this.lebar;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public String getMerek() {
        return this.merek;
    }

    public int getJumlahPenumpang() {
        return this.jumlahPenumpang;
    }

    public int getKodeKendaraan() {
        return this.kodeKendaraan;
    }

    public void setKodeKendaraan(int kode) {
        this.kodeKendaraan = kode;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setJumlahPenumpang(int jumlah) {
        this.jumlahPenumpang = jumlah;
    }

    protected void Berjalan() {
    }

    public void showInformasi() {
        System.out.println("Kode Kendaraan\t\t\t: " + this.kodeKendaraan);
        System.out.println("Merek\t\t\t\t: " + this.merek);
        System.out.println("Panjang\t\t\t\t: " + this.panjang + " m");
        System.out.println("Lebar\t\t\t\t: " + this.lebar + " m");
        System.out.println("Tinggi\t\t\t\t: " + this.tinggi + " m");
        System.out.println("Kapasitas Penumpang\t\t: " + this.jumlahPenumpang + " Penumpang");
    }

}
