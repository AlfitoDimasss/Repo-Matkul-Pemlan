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

public class Mahasiswa extends PengajarDiajar {

    private final Scanner io = new Scanner(System.in);
    private int nim, angkatan;

    public Mahasiswa() {
        super();
        System.out.print("Input NIM\t\t: ");
        this.nim = io.nextInt();
        System.out.print("Input Angkatan\t\t: ");
        this.angkatan = io.nextInt();
    }

    public int getNim() {
        return this.nim;
    }

    @Override
    public void showInformasi() {
        super.showInformasi();
        System.out.println("NIM\t\t\t: " + this.nim);
        System.out.println("Angkatan\t\t: " + this.angkatan);
    }

}
