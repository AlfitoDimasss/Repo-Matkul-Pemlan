/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.me;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Illuminare
 */
public class Object {

    // Deklarasi Variabel
    private enum karakterPermainan {
        O, X, N
    };

    private final karakterPermainan[][] papanPermainan;
    private karakterPermainan charPemain;
    private final karakterPermainan pemainX;
    private final karakterPermainan pemainO;
    private final static Scanner io = new Scanner(System.in);
    private final static Random rd = new Random();
    private final int upperbound = 2;
    private final int jumlahBaris = 3;
    private final int jumlahKolom = 3;

    // Constructor Untuk Menginisiasi Papan Permainan
    public Object() {
        papanPermainan = new karakterPermainan[jumlahBaris][jumlahKolom];
        System.out.println("===== Program Permainan TicTacToe =====");
        this.pemainX = karakterPermainan.X;
        this.pemainO = karakterPermainan.O;
        int giliranPemain = rd.nextInt(upperbound);
        if (giliranPemain == 0) {
            this.charPemain = this.pemainX;
        } else {
            this.charPemain = this.pemainO;
        }
        System.out.println("Pemain Karakter " + this.charPemain + " Jalan Giliran Pertama");
        inisialisasiPapanPermainan();
        showPapanPermainan();
    }

    // Method Inisialisasi Papan Permainan
    private void inisialisasiPapanPermainan() {
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                papanPermainan[i][j] = karakterPermainan.N;
            }
        }
    }

    // Method Menampilkan Papan Permainan
    private void showPapanPermainan() {
        System.out.println("-------------");
        for (int i = 0; i < jumlahBaris; i++) {
            System.out.print("| ");
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print(papanPermainan[i][j] + " | ");
            }
            System.out.print("\n");
            System.out.println("-------------");
        }
    }

    // Method Untuk Ganti Giliran Bermain
    private void gantiGiliran() {
        if (this.charPemain == this.pemainX) {
            this.charPemain = this.pemainO;
        } else {
            this.charPemain = this.pemainX;
        }
    }

    // Method Untuk Menginputkan Karakter Pemain
    private void inputKarakter() {
        // cekProsesPermainan();
        System.out.println("Giliran Pemain " + this.charPemain + " Bermain");
        System.out.print("Masukkan Baris <spasi> Kolom yang Ingin Diisi: ");
        int baris = io.nextInt();
        int kolom = io.nextInt();
        if (baris < 0 || baris > 2) {
            System.out.println("Baris Tidak Valid!");
        } else if (kolom < 0 && baris > 2) {
            System.out.println("Kolom Tidak Valid!");
        } else if (papanPermainan[baris][kolom] != karakterPermainan.N) {
            System.out.println("Baris dan Kolom Ini Sudah Diisi");
        } else {
            papanPermainan[baris][kolom] = this.charPemain;
            showPapanPermainan();
            if (cekProsesPermainan() == true) {
                gantiGiliran();
            }
        }
        cekAdaPemenang();
        cekDraw();
    }

    // Method Cek Karakter Dalam Baris Dan Kolom
    private boolean cekKarakterBarisKolom(karakterPermainan a, karakterPermainan b, karakterPermainan c) {
        if (a != karakterPermainan.N && a == b && b == c) {
            return true;
        } else {
            return false;
        }
    }

    // Method Cek Karakter Secara Horizontal
    private boolean cekKarakterBaris() {
        for (int i = 0; i < jumlahBaris; i++) {
            if (cekKarakterBarisKolom(papanPermainan[i][0], papanPermainan[i][1], papanPermainan[i][2]) == true) {
                return true;
            }
        }
        return false;
    }

    // Method Cek Karakter Secara Vertikal
    private boolean cekKarakterKolom() {
        for (int i = 0; i < jumlahKolom; i++) {
            if (cekKarakterBarisKolom(papanPermainan[0][i], papanPermainan[1][i], papanPermainan[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    // Method Cek Karakter Secara Diagonal
    private boolean cekKarakterDiagonal() {
        if (cekKarakterBarisKolom(papanPermainan[0][0], papanPermainan[1][1], papanPermainan[2][2]) == true) {
            return true;
        } else if (cekKarakterBarisKolom(papanPermainan[0][2], papanPermainan[1][1], papanPermainan[2][0]) == true) {
            return true;
        } else {
            return false;
        }
    }

    // Method Untuk Mengecek Apakah Sudah Ada Pemenang
    private boolean cekAdaPemenang() {
        if (cekKarakterBaris() == true) {
            return true;
        } else if (cekKarakterKolom() == true) {
            return true;
        } else if (cekKarakterDiagonal() == true) {
            return true;
        } else {
            return false;
        }
    }

    // Method Untuk Mengecek Apakah Permainan Berakhir Draw
    private boolean cekDraw() {
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                if (papanPermainan[i][j] == karakterPermainan.N) {
                    return false;
                }
            }
        }
        return true;
    }

    // Method Untuk Mengecek Apakah Permainan Masih Berlangsung
    private boolean cekProsesPermainan() {
        if (cekAdaPemenang() == true && cekDraw() == false) {
            return false;
        } else if (cekAdaPemenang() == false && cekDraw() == true) {
            return false;
        } else {
            return true;
        }
    }

    // Method Untuk Menampilkan Informasi Permainan
    private void showStatusPermainan() {
        if (cekAdaPemenang() == true) {
            System.out.println("Permainan Berakhir dan Dimenangkan Oleh Pemain " + this.charPemain);
        } else if (cekDraw() == true) {
            System.out.println("Permainan Berakhir dengan Draw");
        }
    }

    // Method Untuk Memulai Permainan
    public void mulaiPermainan() {
        do {
            inputKarakter();
        } while (cekProsesPermainan() == true);
        showStatusPermainan();
    }

}
