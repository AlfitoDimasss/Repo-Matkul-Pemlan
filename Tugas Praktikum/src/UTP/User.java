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
public class User {

    private String nama;
    private int id;
    private Buku[] buku;
    private int jumlahPinjamBuku = 0;
    private double jumlahUangDibayar = 0;

    public User(String nama, int id) {
        this.nama = nama;
        this.id = id;
        buku = new Buku[100];
    }

    public void pinjamBuku(Buku bukus) {
        buku[jumlahPinjamBuku] = bukus;
        if (jumlahPinjamBuku > 3) {
            jumlahUangDibayar += (0.10 * buku[jumlahPinjamBuku].getHargaSewa());
        } else {
            jumlahUangDibayar += buku[jumlahPinjamBuku].getHargaSewa();
        }
        jumlahPinjamBuku++;
    }

    public void showInformasi() {
        System.out.println("Nama\t\t\t: " + this.nama);
        System.out.println("Nomor Pelanggan\t: " + this.id);
        System.out.println("Buku yang Dipinjam\t: ");
        for (int i = 0; i < jumlahPinjamBuku; i++) {
            System.out.println(buku[i].getJudul() + ": " + buku[i].getHargaSewa());
        }
        if (this.jumlahPinjamBuku > 3) {
            System.out.println("Harga sewa dikenakan tarif 10% untuk tiap buku yang dipinjam jika sudah lebih dari 3");
        }
        System.out.println("Jumlah Uang Yang Harus Dibayar\t: Rp" + this.jumlahUangDibayar);
        System.out.println("");
    }

}
