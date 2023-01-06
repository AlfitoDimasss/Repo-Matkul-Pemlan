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

public class Staff extends CivitasAkademika {

    private final Scanner io = new Scanner(System.in);
    private String posisi, jabatan;
    private int noPegawai;

    public Staff() {
        super();
        System.out.print("Input Nomor Pegawai\t: ");
        this.noPegawai = io.nextInt();
        System.out.print("Input Posisi\t\t: ");
        this.posisi = io.next();
        System.out.print("Input jabatan\t\t: ");
        this.jabatan = io.next();
    }

    public int getNoPegawai() {
        return this.noPegawai;
    }

    @Override
    public void showInformasi() {
        super.showInformasi();
        System.out.println("Nomor Pegawai\t\t: " + this.noPegawai);
        System.out.println("Posisi\t\t\t: " + this.posisi);
        System.out.println("Jabatan\t\t\t: " + this.jabatan);
    }

}
