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

// Class BujurSangkar yang merupakan turunan class PersegiPanjang
public class BujurSangkar extends PersegiPanjang {

    // Default Constructor
    public BujurSangkar() {
    }

    /*
     * Overload Constructor dengan parameter Sisi, Titik koordinat X awal, Titik
     * koordinat Y awal,
     * Arah koordinat X, dan Arah koordinat Y
     */
    public BujurSangkar(double sisi1, int xAwal, int yAwal, String arahX, String arahY) {
        super(sisi1, sisi1, xAwal, yAwal, arahX, arahY);
    }

    @Override
    public void showInformasi() {
        System.out.println("===== Bujur Sangkar =====\n");
        System.out.println("Sisi\t\t: " + this.getPanjang() + " cm");
        System.out.println("Keliling\t: " + this.getKeliling() + " cm");
        System.out.println("Luas\t\t: " + this.getLuas() + " cm2\n");
    }

}
