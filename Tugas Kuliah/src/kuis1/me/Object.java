/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1.me;

import java.util.ArrayList;

/**
 *
 * @author Illuminare
 */
public class Object {

    private String namaMahasiswa;
    private int nim;
    private String judulBuku;
    private static ArrayList<String> daftarPeminjam = new ArrayList<String>();
    private static ArrayList<String> daftarBukuDipinjam = new ArrayList<String>();

    Object() {
    };

    Object(String nama, String nim, String judulBuku) {
        this.namaMahasiswa = nama;
        this.nim = Integer.valueOf(nim);
        this.judulBuku = judulBuku;
        Object.daftarPeminjam.add(this.namaMahasiswa);
        Object.daftarBukuDipinjam.add(this.judulBuku);
    }

    Object(String nama, int nim, String judulBuku) {
        this.namaMahasiswa = nama;
        this.nim = nim;
        this.judulBuku = judulBuku;
        Object.daftarPeminjam.add(this.namaMahasiswa);
        Object.daftarBukuDipinjam.add(this.judulBuku);
    }

    public void display() {
        System.out.println("Nama\t\t\t: " + this.getNamaMahasiswa());
        System.out.println("NIM\t\t\t: " + this.getNimMahasiswa());
        System.out.println("Judul Buku Dipinjam\t: " + this.getJudulBuku() + "\n");
    }

    public String getNamaMahasiswa() {
        return this.namaMahasiswa;
    }

    public int getNimMahasiswa() {
        return this.nim;
    }

    public String getJudulBuku() {
        return this.judulBuku;
    }

    public void setNamaMahasiswa(String nama) {
        this.namaMahasiswa = nama;
        Object.daftarPeminjam.add(this.namaMahasiswa);
    }

    public void setNimMahasiswa(String nim) {
        this.nim = Integer.valueOf(nim);
    }

    public void setNimMahasiswa(int nim) {
        this.nim = nim;
    }

    public void setJudulBuku(String buku) {
        this.judulBuku = buku;
        Object.daftarBukuDipinjam.add(this.judulBuku);
    }

    public static void showDaftarPeminjam() {
        System.out.println("Daftar Peminjam: " + Object.daftarPeminjam);
    }

    public static void showDaftarBukuDipinjam() {
        System.out.println("Daftar Buku yang Dipinjam: " + Object.daftarBukuDipinjam);
    }

}
