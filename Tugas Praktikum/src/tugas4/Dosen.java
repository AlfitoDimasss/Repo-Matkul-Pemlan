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

public class Dosen extends PengajarDiajar {

    private final Scanner io = new Scanner(System.in);
    private int noInduk;

    public Dosen() {
        super();
        System.out.print("Input Nomor Induk\t: ");
        this.noInduk = io.nextInt();
    }

    public int getNoInduk() {
        return this.noInduk;
    }

    @Override
    public void showInformasi() {
        super.showInformasi();
        System.out.println("Nomor Induk\t\t: " + this.noInduk);
    }

}
