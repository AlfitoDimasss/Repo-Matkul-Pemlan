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

// Class JajarGenjang yang merupakan turunan class TrapesiumGenjang
public class JajarGenjang extends TrapesiumGenjang {

    // Deklarasi variabel
    private Point poin;
    private double X1, Y1, X2, Y2, X3, Y3, X4, Y4, XPusat, YPusat;

    // Constructor Default
    public JajarGenjang() {
    }

    /*
     * Overload Constructor dengan parameter Tinggi, Sisi AB, Sisi BC, Sisi CD, Sisi
     * AD,
     * Titik koordinat X awal, Titik koordinat Y awal, Arah koordinat X, Arah
     * koordinat Y, dan Delta Sisi AB & CD
     * Note: Delta merupakan selisih jarak antara sisi AB dan sisi CD
     */
    public JajarGenjang(double tinggi, double sisi1, double sisi2, double sisi3, double sisi4, double xAwal,
            double yAwal, String arahX, String arahY, double deltaAbCd) {
        super(tinggi, sisi1, sisi2, sisi3, sisi4, xAwal, yAwal, arahX, arahY, deltaAbCd);
    }

    // Method Hitung luas
    public void hitungLuas() {
        double luas = this.getAB() * this.getTinggi();
        this.setLuas(luas);
    }

    // Method set koordinat berdasarkan arah koordinat dan titik awal koordinat
    public void setKordinat() {
        if (this.getArahX().equalsIgnoreCase("Kanan") && this.getArahY().equalsIgnoreCase("Atas")) {
            this.X1 = this.getXAwal();
            this.Y1 = this.getYAwal();
            this.X2 = this.getXAwal() + this.getAB();
            this.Y2 = this.getYAwal();
            this.X3 = this.getXAwal() + this.getAB() + this.getDelta();
            this.Y3 = this.getYAwal() + this.getTinggi();
            this.X4 = this.getXAwal() + this.getDelta();
            this.Y4 = this.getYAwal() + this.getTinggi();
            this.XPusat = (this.X3 + this.getXAwal()) / 2;
            this.YPusat = (this.Y3 + this.getYAwal()) / 2;
            poin = new Point(X1, Y1, X2, Y2, X3, Y3, X4, Y4, XPusat, YPusat);
        } else if (this.getArahX().equalsIgnoreCase("Kiri") && this.getArahY().equalsIgnoreCase("Atas")) {
            this.X1 = this.getXAwal();
            this.Y1 = this.getYAwal();
            this.X2 = this.getXAwal() - this.getAB();
            this.Y2 = this.getYAwal();
            this.X3 = this.getXAwal() - this.getAB() - this.getDelta();
            this.Y3 = this.getYAwal() - this.getTinggi();
            this.X4 = this.getXAwal() - this.getDelta();
            this.Y4 = this.getYAwal() - this.getTinggi();
            this.XPusat = (this.X3 + this.getXAwal()) / 2;
            this.YPusat = (this.Y3 + this.getYAwal()) / 2;
            poin = new Point(X1, Y1, X2, Y2, X3, Y3, X4, Y4, XPusat, YPusat);
        } else if (this.getArahX().equalsIgnoreCase("Kanan") && this.getArahY().equalsIgnoreCase("Bawah")) {
            this.X1 = this.getXAwal();
            this.Y1 = this.getYAwal();
            this.X2 = this.getXAwal() + this.getAB();
            this.Y2 = this.getYAwal();
            this.X3 = this.getXAwal() + this.getAB() + this.getDelta();
            this.Y3 = this.getYAwal() - this.getTinggi();
            this.X4 = this.getXAwal() + this.getDelta();
            this.Y4 = this.getYAwal() - this.getTinggi();
            this.XPusat = (this.X3 + this.getXAwal()) / 2;
            this.YPusat = (this.Y3 + this.getYAwal()) / 2;
            poin = new Point(X1, Y1, X2, Y2, X3, Y3, X4, Y4, XPusat, YPusat);
        } else {
            this.X1 = this.getXAwal();
            this.Y1 = this.getYAwal();
            this.X2 = this.getXAwal() - this.getAB();
            this.Y2 = this.getYAwal();
            this.X3 = this.getXAwal() - this.getAB() - this.getDelta();
            this.Y3 = this.getYAwal() - this.getTinggi();
            this.X4 = this.getXAwal() - this.getDelta();
            this.Y4 = this.getYAwal() - this.getTinggi();
            this.XPusat = (this.X3 + this.getXAwal()) / 2;
            this.YPusat = (this.Y3 + this.getYAwal()) / 2;
            poin = new Point(X1, Y1, X2, Y2, X3, Y3, X4, Y4, XPusat, YPusat);
        }
    }

    // Method menampilkan titik - titik koordinat Trapesium
    public void showKordinat() {
        poin.showTitik();
    }

    @Override
    public void showInformasi() {
        System.out.println("===== Jajar Genjang =====\n");
        super.showInformasi();
    }

}
