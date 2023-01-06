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

public class KapalSelam extends KendaraanLaut {

    private boolean milikMiliter;

    public KapalSelam(double panjang, double lebar, double tinggi, String merek, int jumlah, String alatGerak,
            boolean menyelam, boolean militer) {
        super(panjang, lebar, tinggi, merek, jumlah, alatGerak, menyelam);
        this.milikMiliter = militer;
    }

    public boolean isMilikMiliter() {
        return this.milikMiliter;
    }

    public void setMilikMiliter(boolean militer) {
        this.milikMiliter = militer;
    }

    @Override
    public void Berjalan() {
        System.out.println("Doowwwuuungg blubuk blubukkk");
    }

    @Override
    public void showInformasi() {
        super.showInformasi();
        if (this.milikMiliter == true) {
            System.out.println("Milik Militer\t\t\t: Ya");
        } else {
            System.out.println("Milik Militer\t\t\t: Bukan");
        }
    }

}
