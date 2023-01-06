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

// Class Kubus yang merupakan turunan class Balok
public class Kubus extends Balok {

    // Deafult Constructor
    public Kubus() {
    }

    /*
     * Overload Constructor dengan parameter Sisi, Titik koordinat X awal, Titik
     * koordinat Y awal,
     * Arah koordinat X, dan Arah koordinat Y
     */
    public Kubus(double sisi1, int xAwal, int yAwal, String arahX, String arahY, double delta) {
        super(sisi1, sisi1, sisi1, xAwal, yAwal, arahX, arahY, delta);
    }

    @Override
    public void showInformasi() {
        System.out.println("========= Kubus =========\n");
        System.out.println("Panjang\t\t: " + this.getPanjang() + " cm");
        System.out.println("Lebar\t\t: " + this.getLebar() + " cm");
        System.out.println("Tinggi\t\t: " + this.getTinggi() + " cm");
        System.out.println("Volume\t\t: " + this.getVolume() + " cm3\n");
    }
}
