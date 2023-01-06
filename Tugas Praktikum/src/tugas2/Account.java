/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Illuminare
 */
public class Account {

    private int id;
    private String nama;
    private double jumlahUang;

    // Default Constructor dengan Value Default 0
    Account() {
    }

    // Constructor dengan Parameter sebagai Valuenya
    Account(int id, String nama, double jumlahUang) {
        this.id = id;
        this.nama = nama;
        this.jumlahUang = jumlahUang;
    }

    // Method untuk Menampilkan Informasi Akun
    public void diplayAkun() {
        System.out.println("ID Akun\t\t: " + this.getId());
        System.out.println("Nama Akun\t: " + this.getNama());
        System.out.println("Jumlah Uang\t: Rp" + this.getJumlahUang());
        System.out.println("-------------------------------------------");
    }

    // Getter ID
    public int getId() {
        return id;
    }

    // Getter Jumlah Uang yang Tersedia
    public double getJumlahUang() {
        return this.jumlahUang;
    }

    public String getNama() {
        return this.nama;
    }

    // Setter ID dengan Parameter Bertipe Integer
    public void setId(int idBaru) {
        this.id = idBaru;
    }

    // Setter ID dengan Parameter Bertipe Double
    public void setId(double idBaru) {
        this.id = (int) idBaru;
    }

    // Setter ID dengan Parameter Bertipe String
    public void setId(String idBaru) {
        this.id = Integer.valueOf(idBaru);
    }

    // Setter Jumlah Uang dengan Parameter Bertipe Double
    public void setJumlahUang(double jumlahUangBaru) {
        this.jumlahUang = jumlahUangBaru;
    }

    // Setter Jumlah Uang dengan Parameter Bertipe Integer
    public void setJumlahUang(int jumlahUangBaru) {
        this.jumlahUang = (double) jumlahUangBaru;
    }

    // Setter Jumlah Uang dengan Parameter Bertipe String
    public void setJumlahUang(String jumlahUangBaru) {
        this.jumlahUang = Double.valueOf(jumlahUangBaru);
    }

    // Setter Nama
    public void setNama(String namaBaru) {
        this.nama = namaBaru;
    }

    // Method Penarikan Uang dengan Parameter Bertipe Double
    public void tarikUang(double jumlah) {
        this.jumlahUang -= jumlah;
        System.out.println(this.nama + " menarik uang sebanyak " + jumlah);
        System.out.println("Informasi saldo akun terbaru");
        this.diplayAkun();
    }

    // Method Penarikan Uang dengan Parameter Bertipe Integer
    public void tarikUang(int jumlah) {
        this.jumlahUang -= (int) jumlah;
        System.out.println(this.nama + " menarik uang sebanyak " + jumlah);
        System.out.println("Informasi saldo akun terbaru");
        this.diplayAkun();
    }

    // Method Penyetoran Uang dengan Parameter Bertipe Double
    public void setorUang(double jumlah) {
        this.jumlahUang += jumlah;
        System.out.println(this.nama + " menyetor uang sebanyak " + jumlah);
        System.out.println("Informasi saldo akun terbaru");
        this.diplayAkun();
    }

    // Method Penyetoran Uang dengan Parameter Bertipe Integer
    public void setorUang(int jumlah) {
        this.jumlahUang += (int) jumlah;
        System.out.println(this.nama + " menyetor uang sebanyak " + jumlah);
        System.out.println("Informasi saldo akun terbaru");
        this.diplayAkun();
    }

}
