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

public class Balok extends PersegiPanjang {

    // Deklarasi Variabel
    private double tinggi;
    private double delta;
    private double X5, Y5, X6, Y6, X7, Y7, X8, Y8;
    private Point poin;

    // Default Constructor
    public Balok() {
    }

    /*
     * Overload Constructor dengan parameter Panjang, Lebar, Tinggi,
     * Titik koordinat X awal, Titik koordinat Y awal,Arah koordinat X, dan Arah
     * koordinat Y
     */
    public Balok(double panjang, double lebar, double tinggi, int xAwal, int yAwal, String arahX, String arahY,
            double delta) {
        super(panjang, lebar, xAwal, yAwal, arahX, arahY);
        this.tinggi = tinggi;
        this.delta = delta;
    }

    // Method Hitung Volume
    public void hitungVolume() {
        double volume = this.getPanjang() * this.getLebar() * this.tinggi;
        this.setVolume(volume);
    }

    @Override
    public void setKordinat() {
        if (this.getArahX().equalsIgnoreCase("Kanan") && this.getArahY().equalsIgnoreCase("Atas")) {
            double a = this.getXAwal();
            double b = this.getYAwal();
            double c = a + this.getPanjang();
            double d = b;
            double e = c;
            double f = b + this.tinggi;
            double g = a;
            double h = b + this.tinggi;
            this.X5 = this.getXAwal() + delta;
            this.Y5 = this.getYAwal() + (this.tinggi / 2);
            this.X6 = c + delta;
            this.Y6 = this.Y5;
            this.X7 = this.X6;
            this.Y7 = this.Y6 + this.tinggi;
            this.X8 = this.X5;
            this.Y8 = this.Y5 + this.tinggi;
            double xP = (c + delta + this.getXAwal()) / 2;
            double yP = (h + delta + this.getYAwal()) / 2;
            double zP = (this.getYAwal() + delta) / 2;
            poin = new Point(a, b, c, d, e, f, g, h, X5, Y5, X6, Y6, X7, Y7, X8, Y8, xP, yP, zP);
        } else if (this.getArahX().equalsIgnoreCase("Kiri") && this.getArahY().equalsIgnoreCase("Atas")) {
            double a = this.getXAwal();
            double b = this.getYAwal();
            double c = a - this.getPanjang();
            double d = b;
            double e = c;
            double f = b + this.tinggi;
            double g = a;
            double h = b + this.tinggi;
            this.X5 = this.getXAwal() - delta;
            this.Y5 = this.getYAwal() + (this.tinggi / 2);
            this.X6 = c - delta;
            this.Y6 = this.Y5;
            this.X7 = this.X6;
            this.Y7 = this.Y6 + this.tinggi;
            this.X8 = this.X5;
            this.Y8 = this.Y5 + this.tinggi;
            double xP = (c + delta + this.getXAwal()) / 2;
            double yP = (h + delta + this.getYAwal()) / 2;
            double zP = delta / 2;
            poin = new Point(a, b, c, d, e, f, g, h, X5, Y5, X6, Y6, X7, Y7, X8, Y8, xP, yP, zP);
        } else if (this.getArahX().equalsIgnoreCase("Kanan") && this.getArahY().equalsIgnoreCase("Bawah")) {
            double a = this.getXAwal();
            double b = this.getYAwal();
            double c = a + this.getPanjang();
            double d = b;
            double e = c;
            double f = b - this.tinggi;
            double g = a;
            double h = b - this.tinggi;
            this.X5 = this.getXAwal() + delta;
            this.Y5 = this.getYAwal() - (this.tinggi / 2);
            this.X6 = c + delta;
            this.Y6 = this.Y5;
            this.X7 = this.X6;
            this.Y7 = this.Y6 - this.tinggi;
            this.X8 = this.X5;
            this.Y8 = this.Y5 - this.tinggi;
            double xP = (c + delta + this.getXAwal()) / 2;
            double yP = (h + delta + this.getYAwal()) / 2;
            double zP = delta / 2;
            poin = new Point(a, b, c, d, e, f, g, h, X5, Y5, X6, Y6, X7, Y7, X8, Y8, xP, yP, zP);
        } else {
            double a = this.getXAwal();
            double b = this.getYAwal();
            double c = a - this.getPanjang();
            double d = b;
            double e = c;
            double f = b - this.tinggi;
            double g = a;
            double h = b - this.tinggi;
            this.X5 = this.getXAwal() - delta;
            this.Y5 = this.getYAwal() - (this.tinggi / 2);
            this.X6 = c + delta;
            this.Y6 = this.Y5;
            this.X7 = this.X6;
            this.Y7 = this.Y6 - this.tinggi;
            this.X8 = this.X5;
            this.Y8 = this.Y5 - this.tinggi;
            double xP = (c + delta + this.getXAwal()) / 2;
            double yP = (h + delta + this.getYAwal()) / 2;
            double zP = delta / 2;
            poin = new Point(a, b, c, d, e, f, g, h, X5, Y5, X6, Y6, X7, Y7, X8, Y8, xP, yP, zP);
        }

    }

    @Override
    public void showKordinat() {
        poin.showTitikRuang();
    }

    @Override
    public void showInformasi() {
        System.out.println("========= Balok =========\n");
        System.out.println("Panjang\t\t: " + this.getPanjang() + " cm");
        System.out.println("Lebar\t\t: " + this.getLebar() + " cm");
        System.out.println("Tinggi\t\t: " + this.tinggi + " cm");
        System.out.println("Volume\t: " + this.getVolume() + " cm3\n");
    }

    public double getTinggi() {
        return this.tinggi;
    }

}
