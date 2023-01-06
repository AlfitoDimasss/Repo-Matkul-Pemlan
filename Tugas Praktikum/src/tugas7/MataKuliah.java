/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;

/**
 *
 * @author Illuminare
 */
public class MataKuliah {

    private String nama, kode;
    private int sks;

    public MataKuliah(String nama, String kode, int sks) {
        this.nama = nama;
        this.kode = kode;
        this.sks = sks;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public void showInfo() {
        System.out.println("Nama Mata Kuliah\t: " + this.nama);
        System.out.println("Kode Mata Kuliah\t: " + this.kode);
        System.out.println("Beban SKS\t\t: " + this.sks);
    }

}
