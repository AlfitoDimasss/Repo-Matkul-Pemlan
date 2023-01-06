/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas8;

import java.util.ArrayList;

/**
 *
 * @author Illuminare
 */

/*
 * Nama : Alfito Dimas Prasetyo
 * NIM : 205150401111057
 */

public abstract class PengajarDiajar extends CivitasAkademika implements PelakuKBM {

    private String keminatan;
    protected final ArrayList<MataKuliah> matkul;
    private int jumlahSks = 0;
    private int jumlahMatkul = 0;

    public PengajarDiajar(String nama, String asalDaerah, int usia, String keminatan) {
        super(nama, asalDaerah, usia);
        this.keminatan = keminatan;
        matkul = new ArrayList<>();
    }

    public String getKeminatan() {
        return keminatan;
    }

    public void setKeminatan(String keminatan) {
        this.keminatan = keminatan;
    }

    public int getJumlahSks() {
        return jumlahSks;
    }

    public int getJumlahMatkul() {
        return jumlahMatkul;
    }

    @Override
    public void tambahMataKuliah(MataKuliah matkuls) {
        this.matkul.add(matkuls);
        jumlahMatkul++;
        this.jumlahSks += matkuls.getSks();
    }

    public void printMatkul() {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (i != jumlahMatkul - 1) {
                System.out.print(matkul.get(i).getNama() + ", ");
            } else {
                System.out.print(matkul.get(i).getNama());
            }
        }
        System.out.print("\n");
    }
}
