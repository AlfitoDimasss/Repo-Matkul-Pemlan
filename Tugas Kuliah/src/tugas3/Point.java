/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Illuminare
 */

/*
 * Nama: Alfito Dimas Prasetyo
 * NIM: 205150401111057
 * Kelas: Sistem Informasi - E
 */

public class Point {

    // Deklarasi variabel
    private double x1, y1, x2, y2, x3, y3, x4, y4, xPusat, yPusat;
    private double x5, y5, x6, y6, x7, y7, x8, y8, zPusat;

    // Constructor
    public Point(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double xPusat,
            double yPusat) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        this.xPusat = xPusat;
        this.yPusat = yPusat;
    }

    public Point(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x5,
            double y5, double x6, double y6, double x7, double y7, double x8, double y8, double xP, double yP,
            double zP) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        this.x5 = x5;
        this.y5 = y5;
        this.x6 = x6;
        this.y6 = y6;
        this.x7 = x7;
        this.y7 = y7;
        this.x8 = x8;
        this.y8 = y8;
        this.xPusat = xP;
        this.yPusat = yP;
        this.zPusat = zP;
    }

    // Method menampilkan titik koordinat
    public void showTitik() {
        System.out.println("Titik - Titik Koordinat");
        System.out.println("x1, y1 \t\t= (" + this.x1 + ", " + this.y1 + ")");
        System.out.println("x2, y2 \t\t= (" + this.x2 + ", " + this.y2 + ")");
        System.out.println("x3, y3 \t\t= (" + this.x3 + ", " + this.y3 + ")");
        System.out.println("x4, y4 \t\t= (" + this.x4 + ", " + this.y4 + ")");
        System.out.println("xPusat, yPusat = (" + this.xPusat + ", " + this.yPusat + ")");
        System.out.println("\n=========================\n");
    }

    public void showTitikRuang() {
        System.out.println("Titik - Titik Koordinat");
        System.out.println("x1, y1 \t\t= (" + this.x1 + ", " + this.y1 + ")");
        System.out.println("x2, y2 \t\t= (" + this.x2 + ", " + this.y2 + ")");
        System.out.println("x3, y3 \t\t= (" + this.x3 + ", " + this.y3 + ")");
        System.out.println("x4, y4 \t\t= (" + this.x4 + ", " + this.y4 + ")");
        System.out.println("x5, y5 \t\t= (" + this.x5 + ", " + this.y5 + ")");
        System.out.println("x6, y6 \t\t= (" + this.x6 + ", " + this.y6 + ")");
        System.out.println("x7, y7 \t\t= (" + this.x7 + ", " + this.y7 + ")");
        System.out.println("x8, y8 \t\t= (" + this.x8 + ", " + this.y8 + ")");
        System.out.println("xPusat, yPusat, zPusat = (" + this.xPusat + ", " + this.yPusat + ", " + this.zPusat + ")");
        System.out.println("\n=========================\n");
    }

}
