/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import java.util.Scanner;

/**
 *
 * @author Illuminare
 */

/*
 * Nama: Alfito Dimas Prasetyo
 * NIM: 205150401111057
 */

public class PengajarDiajar extends CivitasAkademika {

    private final Scanner io = new Scanner(System.in);
    private String keminatan;
    private int jumlahSks = 0;
    private MataKuliah[] matkul;
    private int jumlahMatkul = 0;

    public PengajarDiajar() {
        super();
        System.out.print("Input Keminatan\t: ");
        this.keminatan = io.next();
        this.matkul = new MataKuliah[Byte.MAX_VALUE];
    }

    public void addMatkul(MataKuliah matkuls) {
        this.matkul[jumlahMatkul] = matkuls;
        jumlahMatkul++;
        this.jumlahSks += matkuls.getSks();
    }

    @Override
    public void showInformasi() {
        super.showInformasi();
        System.out.println("Keminatan\t\t: " + this.keminatan);
        System.out.println("Mata Kuliah Yang Dimiliki");
        if (jumlahMatkul != 0) {
            for (int i = 0; i < jumlahMatkul; i++) {
                System.out.print(matkul[i].getName() + " ");
            }
            System.out.println("");
        } else {
            System.out.println("Tidak Ada Mata Kuliah Yang Dimiliki");
        }
        System.out.println("Jumlah SKS Yang Diajar\t: " + this.jumlahSks);
    }

}
