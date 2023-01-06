/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author Illuminare
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner io = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int x = io.nextInt();

        Object[] siswa = new Object[x];
        for (int i = 0; i < x; i++) {
            siswa[i] = new Object();
            if (siswa[i].getId().length() < 5) {
                do {
                    System.out.print("ID wajib berisi 5 digit, Masukkan kembali ID <spasi> Nama: ");
                    String a = io.next();
                    String b = io.next();
                    siswa[i].setIdNama(a, b);
                    if (siswa[i].getId().length() >= 5) {
                        break;
                    }
                } while (true);
            }

            if (i != 0 && cekIdSama(siswa[i].getId(), siswa[i - 1].getId()) == true) {
                do {
                    System.out.print("ID tidak boleh sama, Masukkan kembali ID <spasi> Nama: ");
                    String a = io.next();
                    String b = io.next();
                    siswa[i].setIdNama(a, b);
                    if (cekIdSama(siswa[i].getId(), siswa[i - 1].getId()) == false) {
                        break;
                    }
                } while (true);
            }

            if (cekIdMengandungHuruf(siswa[i].getId()) == true) {
                do {
                    System.out.print("ID tidak boleh mengandung huruf, Masukkan kembali ID <spasi> Nama: ");
                    String a = io.next();
                    String b = io.next();
                    siswa[i].setIdNama(a, b);
                    if (cekIdMengandungHuruf(siswa[i].getId()) == false) {
                        break;
                    }
                } while (true);
            }

            if (cekNamaMengandungAngka(siswa[i].getName()) == false) {
                while (true) {
                    System.out.print("Nama harus alfabet, Masukkan kembali ID <spasi> Nama: ");
                    String a = io.next();
                    String b = io.next();
                    siswa[i].setIdNama(a, b);
                    if (cekNamaMengandungAngka(siswa[i].getName()) == true) {
                        break;
                    }
                }
            }
        }

        System.out.print("Masukkan berapa banyak operasi yang ingin dilakukan: ");
        int y = io.nextInt();
        System.out.println(
                "Ketik Tampil <spasi> ID Siswa untuk Menampilkan data siswa, Hapus <spasi> ID Siswa untuk Menghapus data siswa,"
                        + " atau Edit <spasi> ID Siswa untuk Mengedit data siswa");
        for (int i = 0; i < y; i++) {
            String a = io.next();
            if (a.equalsIgnoreCase("Tampilkan")) {
                String b = io.next();
                for (Object siswa1 : siswa) {
                    if (b.equalsIgnoreCase(siswa1.getId())) {
                        siswa1.tampilkan();
                    }
                }
            } else if (a.equalsIgnoreCase("Hapus")) {
                String b = io.next();
                for (Object siswa1 : siswa) {
                    if (b.equalsIgnoreCase(siswa1.getId())) {
                        siswa1.hapus();
                        System.out.println("Data Berhasil Dihapus");
                        Object.kurangiJumlahSiswa();
                    }
                }
            } else if (a.equalsIgnoreCase("Edit")) {
                String b = io.next();
                for (Object siswa1 : siswa) {
                    if (b.equalsIgnoreCase(siswa1.getId())) {
                        System.out.print("Masukkan ID <spasi> Nama baru: ");
                        String c = io.next();
                        String d = io.nextLine();
                        siswa1.setIdNama(c, d);
                        System.out.println("Data siswa berhasil diedit");
                    }
                }
            }
        }
        io.close();
        System.out.println("Jumlah data siswa yang tersisa: " + Object.getJumlahSiswa());
        System.out.println("Data Siswa: ");
        for (Object siswa1 : siswa) {
            if (siswa1.getId() == null) {
            } else {
                siswa1.tampilkan();
            }
        }

    }

    static boolean cekIdSama(String s, String p) {
        return s.equalsIgnoreCase(p);
    }

    static boolean cekIdMengandungHuruf(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] < '0' || ch[i] > '9') {
                return true;
            }
        }
        return false;
    }

    static boolean cekNamaMengandungAngka(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (!(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z')) {
                return false;
            }
        }
        return true;
    }

}
