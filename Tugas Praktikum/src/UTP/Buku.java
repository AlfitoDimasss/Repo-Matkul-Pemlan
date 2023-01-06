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
public class Buku {

    private String judul;
    private String sinopsis;
    private Penulis[] penulis;
    private int jumlahPenulis = 0;
    private int sewaBuku;

    public Buku(String judul, String sinopsis, int sewaBuku) {
        this.judul = judul;
        this.sinopsis = sinopsis;
        penulis = new Penulis[5];
        this.sewaBuku = sewaBuku;
    }

    public void addPenulis(Penulis penuliss) {
        penulis[jumlahPenulis] = penuliss;
        jumlahPenulis++;
    }

    public void showInformasi() {
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Sinopsis\t: " + sinopsis);
    }

    public void tampilkanPenulis() {
        System.out.println("Penulis Buku " + this.judul);
        for (int i = 0; i < jumlahPenulis; i++) {
            System.out.println("Penulis ke " + (i + 1) + ": ");
            penulis[i].showInformasi();
        }
        System.out.println("");
    }

    public String getJudul() {
        return this.judul;
    }

    public int getHargaSewa() {
        return this.sewaBuku;
    }

}
