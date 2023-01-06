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

public class KapalFeri extends KendaraanLaut {

    private boolean adaKolamRenang;

    public KapalFeri(double panjang, double lebar, double tinggi, String merek, int jumlah, String alatGerak,
            boolean menyelam, boolean renang) {
        super(panjang, lebar, tinggi, merek, jumlah, alatGerak, menyelam);
        this.adaKolamRenang = renang;
    }

    public boolean isAdaKolamRenang() {
        return this.adaKolamRenang;
    }

    public void setAdaKolamRenang(boolean renang) {
        this.adaKolamRenang = renang;
    }

    @Override
    public void Berjalan() {
        System.out.println("Doowwwuuungg not noooooootttttt");
    }

    @Override
    public void showInformasi() {
        super.showInformasi();
        if (this.adaKolamRenang == true) {
            System.out.println("Ada Kolam Renang\t\t: Ya");
        } else {
            System.out.println("Ada Kolam Renang\t\t: Tidak");
        }
    }

}
