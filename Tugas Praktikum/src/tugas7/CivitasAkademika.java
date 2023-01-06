/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;

/**
 *
 * @author Illuminare
 */
public abstract class CivitasAkademika {

    private String nama, asalDaerah;
    private int usia;

    public CivitasAkademika(String nama, String asalDaerah, int usia) {
        this.nama = nama;
        this.asalDaerah = asalDaerah;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsalDaerah() {
        return asalDaerah;
    }

    public void setAsalDaerah(String asalDaerah) {
        this.asalDaerah = asalDaerah;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public abstract void showInfoLengkap();

    public abstract void showInfoSingkat();

}
