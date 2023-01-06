/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveCoding2;

/**
 *
 * @author Illuminare
 */

/*
 * NAMA : ALFITO DIMAS PRASETYO
 * NIM : 205150401111057
 */

public class KendaraanLaut extends Kendaraan {

    protected String alatPenggerak;
    protected boolean dapatMenyelam;

    public KendaraanLaut(double panjang, double lebar, double tinggi, String merek, int jumlah, String alatGerak,
            boolean menyelam) {
        super(panjang, lebar, tinggi, merek, jumlah);
        this.alatPenggerak = alatGerak;
        this.dapatMenyelam = menyelam;
    }

    public String getAlatPenggerak() {
        return this.alatPenggerak;
    }

    public boolean isDapatMenyelam() {
        return this.dapatMenyelam;
    }

    public void setAlatPenggerak(String alat) {
        this.alatPenggerak = alat;
    }

    public void setDapatMenyelam(boolean menyelam) {
        this.dapatMenyelam = menyelam;
    }

    @Override
    public void showInformasi() {
        super.showInformasi();
        System.out.println("Alat Penggerak\t\t\t: " + this.alatPenggerak);
        if (this.dapatMenyelam == true) {
            System.out.println("Dapat Menyelam\t\t\t: Ya");
        } else {
            System.out.println("Dapat Menyelam\t\t\t: Tidak");
        }
    }

}
