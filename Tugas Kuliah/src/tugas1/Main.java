/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Random;
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

        // Nomor 9.2

        System.out.println("===== STOCK =====");

        Scanner io = new Scanner(System.in);

        System.out.print("Masukkan nama Simbol: ");
        String a = io.nextLine();

        System.out.print("Masukkan nama Stock: ");
        String b = io.nextLine();

        Stock stok1 = new Stock(a, b);

        System.out.print("Masukkan harga penutupan sebelumnya: ");
        double c = io.nextDouble();

        stok1.setPrevClosingPrice(c);

        System.out.print("Masukkan harga sekarang: ");
        double d = io.nextDouble();

        stok1.setCurrentPrice(d);

        System.out.printf("%s's price difference: %.2f%c \n", a, stok1.getChangedPercent(), '%');

        // Nomor 9.6

        System.out.println("\n===== Menghitung Waktu Sorting Nilai Acak =====");

        StopWatch sw1 = new StopWatch();

        System.out.print("Masukkan banyaknya nilai: ");
        int x = io.nextInt();

        int[] arrayA = new int[x];

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = i + 1;
        }

        Random rd = new Random();

        for (int i = 0; i < arrayA.length; i++) {
            int j = rd.nextInt(arrayA.length);
            int tmp = arrayA[i];
            arrayA[i] = arrayA[j];
            arrayA[j] = tmp;
        }

        System.out.println("Mulai menghitung, tunggu sebentar...");

        sw1.start();

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA.length - 1; j++) {
                if (arrayA[j] > arrayA[j + 1]) {
                    int tmp = arrayA[j];
                    arrayA[j] = arrayA[j + 1];
                    arrayA[j + 1] = tmp;
                }
            }
        }

        sw1.stop();

        System.out.println("Waktu yang dibutuhkan untuk mensorting: " + sw1.getElapsedTime() + " milidetik");

        // Nomor 9.10

        System.out.println("\n===== Quadratic Equation =====");

        System.out.print("Masukkan Nilai a b c: ");
        int e = io.nextInt();
        int f = io.nextInt();
        int g = io.nextInt();

        QuadraticEquation qe1 = new QuadraticEquation(e, f, g);

        if (qe1.getDiscriminant() > 0) {
            System.out.printf("Root1 = %.2f, Root2 = %.2f \n", qe1.getRoot1(), qe1.getRoot2());
        } else if (qe1.getDiscriminant() == 0) {
            System.out.printf("Root1 = %.2f\n", qe1.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
        io.close();

    }

}
