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
public class TransaksiMahasiswa {
    private Mahasiswa Peminjam;
    private Buku JudulDipinjam;

    public TransaksiMahasiswa(Mahasiswa peminjam, Buku judul) {
        Peminjam = peminjam;
        JudulDipinjam = judul;
    }

    public Mahasiswa getPeminjam() {
        return Peminjam;
    }

    public Buku getBukuDipinjam() {
        return JudulDipinjam;
    }
}
