/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTP;

/**
 *
 * @author Illuminare
 */
public class Penulis {

    private String nama;
    private int umur;
    private String motivasi;
    private Buku[] buku;
    private int jumlahBuku = 0;

    public Penulis(String nama, int umur, String motivasi) {
        this.nama = nama;
        this.umur = umur;
        this.motivasi = motivasi;
        buku = new Buku[100];
    }

    public void addBuku(Buku bukus) {
        buku[jumlahBuku] = bukus;
        jumlahBuku++;
    }

    public void showInformasi() {
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("Umur\t\t: " + this.umur);
        System.out.println("Motivasi\t: " + this.motivasi);
    }

    public void tampilkanBuku() {
        System.out.println("Buku Yang Ditulis Penulis " + this.nama);
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Buku ke " + (i + 1));
            buku[i].showInformasi();
        }
        System.out.println("");
    }

}
