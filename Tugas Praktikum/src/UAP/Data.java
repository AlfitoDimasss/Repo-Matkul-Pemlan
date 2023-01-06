/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAP;

import java.util.*;

/**
 *
 * @author Illuminare
 */

/*
 * Nama : Alfito Dimas Prasetyo
 * NIM : 205150401111057
 */

public class Data {

    public static ArrayList<Tanaman> tanaman = new ArrayList<>();;
    public static ArrayList<Integer> lokasi = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);
    private static int masaTanam = 0;
    private static int jumlahTanamanMati = 0;

    public static void mulai() {
        System.out.print("Masa Tanam (Bulan): ");
        int i = in.nextInt();
        masaTanam = i * 30;
        for (int j = 0; j < 3; j++) {
            System.out.println("Mau tanam apa? ");
            System.out.println("1. Tomat");
            System.out.println("2. Stroberi");
            System.out.println("3. Persik");
            System.out.print("Input: ");
            int a = in.nextInt();
            switch (a) {
                case 1:
                    Data.createTomat();
                    break;
                case 2:
                    Data.createStroberi();
                    break;
                case 3:
                    Data.createPersik();
                    break;
            }
        }

        System.out.println("PROSES PERKEMBANGAN");
        System.out.println("====================");
        Data.proses();
    }

    public static void menanam(int i) {
        for (int j = 0; j < jumlahTanamanMati; j++) {
            System.out.println("Mau tanam apa: ");
            System.out.println("1. Tomat\t2. Stroberi\t3. Persik");
            System.out.print("Input: ");
            int a = in.nextInt();
            switch (a) {
                case 1:
                    Data.createTomatLanjut(i);
                    break;
                case 2:
                    Data.createStroberiLanjut(i);
                    break;
                case 3:
                    Data.createPersikLanjut(i);
                    break;
            }
        }
    }

    public static void info() {
        System.out.println("\n------- HASIL MENANAM -------");
        for (int i = 0; i < tanaman.size(); i++) {
            System.out.println("Tanaman Ke " + (i + 1));
            tanaman.get(i).showInfo();
            System.out.println("======================");
        }
    }

    public static void proses() {
        for (int j = 0; j < tanaman.size(); j++) {
            tanaman.get(j).berkembang();
        }
    }

    public static void createTomat() {
        Tomat tomat = new Tomat(masaTanam, 100, 100, 25);
        tanaman.add(tomat);
        System.out.println("======================");
        System.out.println("Tomat Berhasil Ditanam");
        System.out.println("======================");
    }

    public static void createStroberi() {
        Stroberi stroberi = new Stroberi(masaTanam, 60, 150, 52.5);
        tanaman.add(stroberi);
        System.out.println("======================");
        System.out.println("Stroberi Berhasil Ditanam");
        System.out.println("======================");
    }

    public static void createPersik() {
        Persik persik = new Persik(masaTanam, 180, 250, 37.5);
        tanaman.add(persik);
        System.out.println("======================");
        System.out.println("Persik Berhasil Ditanam");
        System.out.println("======================");
    }

    public static void createTomatLanjut(int i) {
        Tomat tomat = new Tomat((masaTanam + i), 100, 100, 25);
        tanaman.add(tomat);
        System.out.println("======================");
        System.out.println("Tomat Berhasil Ditanam");
        System.out.println("======================");
    }

    public static void createStroberiLanjut(int i) {
        Stroberi stroberi = new Stroberi((masaTanam + i), 60, 150, 52.5);
        tanaman.add(stroberi);
        System.out.println("======================");
        System.out.println("Stroberi Berhasil Ditanam");
        System.out.println("======================");
    }

    public static void createPersikLanjut(int i) {
        Persik persik = new Persik((masaTanam + i), 180, 250, 37.5);
        tanaman.add(persik);
        System.out.println("======================");
        System.out.println("Persik Berhasil Ditanam");
        System.out.println("======================");
    }

}
