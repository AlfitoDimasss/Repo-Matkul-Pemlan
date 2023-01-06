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

// Class PersegiPanjang yang merupakan turunan class SegiEMpat
public class PersegiPanjang extends SegiEmpat {

    // Deklarasi Variabel
    private double panjang, lebar;
    private Point poin;
    private double X1, Y1, X2, Y2, X3, Y3, X4, Y4, XPusat, YPusat;

    // Default Constructor
    public PersegiPanjang() {
    };

    /*
     * Overload Constructor dengan parameter Panjang, Lebar, Titik koordinat X awal,
     * Titik koordinat Y awal,Arah koordinat X, dan Arah koordinat Y
     */
    public PersegiPanjang(double panjang, double lebar, double xAwal, double yAwal, String arahX, String arahY) {
        super(xAwal, yAwal, arahX, arahY);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method Hitung Luas
    public void hitungLuas() {
        double luas = this.panjang * this.lebar;
        this.setLuas(luas);
    }

    // Method hitung keliling
    public void hitungKeliling() {
        double keliling = 2 * (this.panjang + this.lebar);
        this.setKeliling(keliling);
    }

    // Getter Panjang
    public double getPanjang() {
        return this.panjang;
    }

    // Getter lebar
    public double getLebar() {
        return this.lebar;
    }

    // Method set koordinat berdasarkan arah koordinat dan titik awal koordinat
    public void setKordinat() {
        if (this.getArahX().equalsIgnoreCase("Kanan") && this.getArahY().equalsIgnoreCase("Atas")) {
            this.X1 = this.getXAwal();
            this.Y1 = this.getYAwal();
            this.X2 = this.getXAwal() + this.panjang;
            this.Y2 = this.getYAwal();
            this.X3 = this.getXAwal() + this.panjang;
            this.Y3 = this.getYAwal() + this.lebar;
            this.X4 = this.getXAwal();
            this.Y4 = this.getYAwal() + this.lebar;
            this.XPusat = (this.X2 + this.getXAwal()) / 2;
            this.YPusat = (this.Y3 + this.getYAwal()) / 2;
            poin = new Point(X1, Y1, X2, Y2, X3, Y3, X4, Y4, XPusat, YPusat);
        } else if (this.getArahX().equalsIgnoreCase("Kiri") && this.getArahY().equalsIgnoreCase("Atas")) {
            this.X1 = this.getXAwal();
            this.Y1 = this.getYAwal();
            this.X2 = this.getXAwal() - this.panjang;
            this.Y2 = this.getYAwal();
            this.X3 = this.getXAwal() - this.panjang;
            this.Y3 = this.getYAwal() + this.lebar;
            this.X4 = this.getXAwal();
            this.Y4 = this.getYAwal() + this.lebar;
            this.XPusat = (this.X2 + this.getXAwal()) / 2;
            this.YPusat = (this.Y3 + this.getYAwal()) / 2;
            poin = new Point(X1, Y1, X2, Y2, X3, Y3, X4, Y4, XPusat, YPusat);
        } else if (this.getArahX().equalsIgnoreCase("Kanan") && this.getArahY().equalsIgnoreCase("Bawah")) {
            this.X1 = this.getXAwal();
            this.Y1 = this.getYAwal();
            this.X2 = this.getXAwal() + this.panjang;
            this.Y2 = this.getYAwal();
            this.X3 = this.getXAwal() + this.panjang;
            this.Y3 = this.getYAwal() - this.lebar;
            this.X4 = this.getXAwal();
            this.Y4 = this.getYAwal() - this.lebar;
            this.XPusat = (this.X2 + this.getXAwal()) / 2;
            this.YPusat = (this.Y3 + this.getYAwal()) / 2;
            poin = new Point(X1, Y1, X2, Y2, X3, Y3, X4, Y4, XPusat, YPusat);
        } else {
            this.X1 = this.getXAwal();
            this.Y1 = this.getYAwal();
            this.X2 = this.getXAwal() - this.panjang;
            this.Y2 = this.getYAwal();
            this.X3 = this.getXAwal() - this.panjang;
            this.Y3 = this.getYAwal() - this.lebar;
            this.X4 = this.getXAwal();
            this.Y4 = this.getYAwal() - this.lebar;
            this.XPusat = (this.X2 + this.getXAwal()) / 2;
            this.YPusat = (this.Y3 + this.getYAwal()) / 2;
            poin = new Point(X1, Y1, X2, Y2, X3, Y3, X4, Y4, XPusat, YPusat);
        }
    }

    // Method menampilkan titik koordinat
    public void showKordinat() {
        poin.showTitik();
    }

    public void showInformasi() {
        System.out.println("==== Persegi Panjang ====\n");
        System.out.println("Panjang\t\t: " + this.panjang + " cm");
        System.out.println("Lebar\t\t: " + this.lebar + " cm");
        System.out.println("Keliling\t: " + this.getKeliling() + " cm");
        System.out.println("Luas\t\t: " + this.getLuas() + " cm2\n");
    }

    public double getX1() {
        return this.X1;
    }

    public double getY1() {
        return this.Y1;
    }

    public double getX2() {
        return this.X2;
    }

    public double getY2() {
        return this.Y2;
    }

    public double getX3() {
        return this.X3;
    }

    public double getY3() {
        return this.Y3;
    }

    public double getX4() {
        return this.X4;
    }

    public double getY4() {
        return this.Y4;
    }

    public void setTitik(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.X1 = x1;
        this.Y1 = y1;
        this.X2 = x2;
        this.Y2 = y2;
        this.X3 = x3;
        this.Y3 = y3;
        this.X4 = x4;
        this.Y4 = y4;
    }

}
