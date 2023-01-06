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

/*
 * Class TrapesiumgGenjang yang merupakan turunan class SegiEmpat
 * Class ini merupakan gabungan untuk bangun trapesium dan jajar genjang karena
 * keduanya
 * memiliki beberapa variabel yang sama
 */
public class TrapesiumGenjang extends SegiEmpat {

    // Deklarasi variabel
    private double tinggi;
    private double sisiAB, sisiBC, sisiCD, sisiAD;
    private double deltaAbCd;

    // Constructor Default
    public TrapesiumGenjang() {
    };

    /*
     * Overload Constructor dengan parameter Tinggi, Sisi AB, Sisi BC, Sisi CD, Sisi
     * AD,
     * Titik koordinat X awal, Titik koordinat Y awal, Arah koordinat X, Arah
     * koordinat Y, dan Delta Sisi AB & CD
     * Note: Delta merupakan selisih jarak antara sisi AB dan sisi CD
     */
    public TrapesiumGenjang(double tinggi, double sisi1, double sisi2, double sisi3, double sisi4, double xAwal,
            double yAwal, String arahX, String arahY, double delta) {
        super(xAwal, yAwal, arahX, arahY);
        this.sisiAB = sisi1;
        this.sisiBC = sisi2;
        this.sisiCD = sisi3;
        this.sisiAD = sisi4;
        this.tinggi = tinggi;
        this.deltaAbCd = delta;
    }

    // Getter Sisi AB
    public double getAB() {
        return this.sisiAB;
    }

    // Getter Sisi BC
    public double getBC() {
        return this.sisiBC;
    }

    // Getter Sisi CD
    public double getCD() {
        return this.sisiCD;
    }

    // Getter Sisi AD
    public double getAD() {
        return this.sisiAD;
    }

    // Getter Tinggi
    public double getTinggi() {
        return this.tinggi;
    }

    // Getter Delta
    public double getDelta() {
        return this.deltaAbCd;
    }

    // Method Hitung Keliling
    public void hitungkKeliling() {
        double keliling = this.getAB() + this.getBC() + this.getCD() + this.getAD();
        this.setKeliling(keliling);
    }

    public void showInformasi() {
        System.out.println("Sisi AB\t\t: " + this.sisiAB + " cm");
        System.out.println("Sisi BC\t\t: " + this.sisiBC + " cm");
        System.out.println("Sisi CD\t\t: " + this.sisiCD + " cm");
        System.out.println("Sisi AD\t\t: " + this.sisiAD + " cm");
        System.out.println("Tinggi\t\t: " + this.tinggi + " cm");
        System.out.println("Keliling\t: " + this.getKeliling() + " cm");
        System.out.println("Luas\t\t: " + this.getLuas() + " cm2\n");
    }

}
