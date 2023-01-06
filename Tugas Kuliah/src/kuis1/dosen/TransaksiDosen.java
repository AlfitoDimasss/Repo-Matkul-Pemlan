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
public class TransaksiDosen {
    private Dosen Peminjam;
    private Buku JudulDipinjam;

    public TransaksiDosen(Dosen peminjam, Buku judul) {
        Peminjam = peminjam;
        JudulDipinjam = judul;
    }

    public Dosen getPeminjam() {
        return Peminjam;
    }

    public Buku getBukuDipinjam() {
        return JudulDipinjam;
    }
}
