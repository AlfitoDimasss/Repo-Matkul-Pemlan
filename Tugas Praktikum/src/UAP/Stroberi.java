/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAP;

/**
 *
 * @author Illuminare
 */

/*
 * Nama : Alfito Dimas Prasetyo
 * NIM : 205150401111057
 */

public class Stroberi extends Tanaman implements Perawatan {

    public Stroberi(int lamaHidup, int masaHidup, int berbuah, double perkembangan) {
        super(lamaHidup, masaHidup, berbuah, perkembangan);
    }

    @Override
    public void treatment() {
        this.setPerkembangan(this.getPerkembangan() * 0.05);
    }

    @Override
    public void berkembang() {
        for (int i = 0; i < this.getLamaHidup(); i++) {
            jumlahProsesBerbuah += this.getPerkembangan();
            if (jumlahProsesBerbuah == this.getBerbuah()) {
                this.jumlahBuah += 1;
                this.setBuah(jumlahBuah);
                jumlahProsesBerbuah = 0;
            } else if (jumlahProsesBerbuah > this.getBerbuah()) {
                this.jumlahBuah += 1;
                this.setBuah(jumlahBuah);
                jumlahProsesBerbuah -= this.getBerbuah();
            }
        }
    }

}
