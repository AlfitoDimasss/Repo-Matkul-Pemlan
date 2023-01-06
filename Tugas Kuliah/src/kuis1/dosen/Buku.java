/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1.dosen;

/**
 *
 * @author ubay3
 */
public class Buku {
    private String KodeBuku;
    private String JudulBuku;

    public Buku() {
    }

    public Buku(String kode, String judul) {
        KodeBuku = kode;
        JudulBuku = judul;
    }

    public String getKode() {
        return KodeBuku;
    }

    public String getJudul() {
        return JudulBuku;
    }
}
