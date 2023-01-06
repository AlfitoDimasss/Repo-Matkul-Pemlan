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
public class Perpustakaan {
    private Buku Bukus[];
    private Mahasiswa AnggotaMahasiswa[];
    private Dosen AnggotaDosen[];
    private TransaksiMahasiswa TransaksiPeminjamanMahasiswa[];
    private TransaksiDosen TransaksiPeminjamanDosen[];
    private int jumlahAnggotaMahasiswa;
    private int jumlahAnggotaDosen;
    private int jumlahBuku;
    private int jumlahTransaksiMahasiswa;
    private int jumlahTransaksiDosen;

    public Perpustakaan() {
        Bukus = new Buku[100];
        AnggotaMahasiswa = new Mahasiswa[100];
        AnggotaDosen = new Dosen[100];
        TransaksiPeminjamanMahasiswa = new TransaksiMahasiswa[100];
        TransaksiPeminjamanDosen = new TransaksiDosen[100];
    }

    public void addBuku(String kode, String judul) {
        Bukus[jumlahBuku] = new Buku(kode, judul);
        jumlahBuku++;
    }

    public void addAnggotaMahasiwa(String nim, String nama) {
        AnggotaMahasiswa[jumlahAnggotaMahasiswa] = new Mahasiswa(nim, nama);
        jumlahAnggotaMahasiswa++;
    }

    public void addAnggotaDosen(String nip, String nama) {
        AnggotaDosen[jumlahAnggotaDosen] = new Dosen(nip, nama);
        jumlahAnggotaDosen++;
    }

    public void MahasiswaPinjamBuku(Mahasiswa mahasiswa, Buku buku) {
        TransaksiPeminjamanMahasiswa[jumlahTransaksiMahasiswa] = new TransaksiMahasiswa(mahasiswa, buku);
        jumlahTransaksiMahasiswa++;
    }

    public void DosenPinjamBuku(Dosen dosen, Buku buku) {
        TransaksiPeminjamanDosen[jumlahTransaksiDosen] = new TransaksiDosen(dosen, buku);
        jumlahTransaksiDosen++;
    }

    public void TampilkanDaftarPeminjam() {
        System.out.println("Data Mahasiswa Anggota Perpustakaan : ");
        for (int i = 0; i < jumlahAnggotaMahasiswa; i++) {
            System.out.println("NIM : " + AnggotaMahasiswa[i].getNIM());
            System.out.println("Nama Mahasiswa : " + AnggotaMahasiswa[i].getNama());
        }
        System.out.println();
        System.out.println("Data Dosen Anggota Perpustakaan : ");
        for (int i = 0; i < jumlahAnggotaDosen; i++) {
            System.out.println("NIM : " + AnggotaDosen[i].getNIP());
            System.out.println("Nama Mahasiswa : " + AnggotaDosen[i].getNama());
        }
    }

    public void TampilkanDaftarBuku() {
        System.out.println("Daftar Buku di Perpustakaan : ");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Kode Buku : " + Bukus[i].getKode());
            System.out.println("JudulBuku : " + Bukus[i].getJudul());
        }
    }

    public void TampilkanDataPeminjaman() {
        System.out.println("Data Peminjaman Perpustakaan : ");
        System.out.println("yang dipinjam Mahasiswa : ");
        for (int i = 0; i < jumlahTransaksiMahasiswa; i++) {
            // System.out.println("NIM : " +
            // TransaksiPeminjamanMahasiswa[i].getPeminjam().getNIM());
            System.out.println("Nama Mahasiswa : " + TransaksiPeminjamanMahasiswa[i].getPeminjam().getNama());
            // System.out.println("Kode Buku " +
            // TransaksiPeminjamanMahasiswa[i].getBukuDipinjam().getKode());
            System.out.println("Judul Buku : " + TransaksiPeminjamanMahasiswa[i].getBukuDipinjam().getJudul());
        }
        System.out.println();
        // System.out.println("yang dipinjam Dosen : ");
        // for(int i=0; i<jumlahTransaksiDosen;i++){
        // System.out.println("NIM : " + AnggotaDosen[i].getNIP());
        // System.out.println("Nama Mahasiswa : " + AnggotaDosen[i].getNama());
        // }
    }

    public int getJumlahBuku() {
        return jumlahBuku;
    }

    public int getJumlahAnggota() {
        return jumlahAnggotaMahasiswa + jumlahAnggotaDosen;
    }

    public Mahasiswa getMahasiswa(int Nomor) {
        return AnggotaMahasiswa[Nomor];
    }

    public Buku getBuku(int Nomor) {
        return Bukus[Nomor];
    }
}
