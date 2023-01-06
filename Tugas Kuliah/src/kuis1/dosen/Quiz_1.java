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
public class Quiz_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perpustakaan PerpusUB = new Perpustakaan();

        PerpusUB.addBuku("B001", "Introduction to Programming");
        PerpusUB.addBuku("B002", "Pemrograman Berorientasi Obyek");
        PerpusUB.addBuku("B003", "Pemrograman Lanjut");

        PerpusUB.addAnggotaMahasiwa("M001", "Budi Raharjo");
        PerpusUB.addAnggotaMahasiwa("M002", "Cahyo Darujati");

        PerpusUB.addAnggotaDosen("D001", "Bayu Rahayudi");

        PerpusUB.MahasiswaPinjamBuku(PerpusUB.getMahasiswa(0), PerpusUB.getBuku(0));
        PerpusUB.MahasiswaPinjamBuku(PerpusUB.getMahasiswa(0), PerpusUB.getBuku(1));
        PerpusUB.MahasiswaPinjamBuku(PerpusUB.getMahasiswa(1), PerpusUB.getBuku(0));
        PerpusUB.MahasiswaPinjamBuku(PerpusUB.getMahasiswa(1), PerpusUB.getBuku(2));

        System.out.println("Jumlah Buku di Perpustakaan : " + PerpusUB.getJumlahBuku());
        PerpusUB.TampilkanDaftarBuku();
        System.out.println();
        System.out.println("Jumlah Anggota di Perpustakaan : " + PerpusUB.getJumlahAnggota());
        PerpusUB.TampilkanDaftarPeminjam();
        System.out.println();
        PerpusUB.TampilkanDataPeminjaman();
    }

}
