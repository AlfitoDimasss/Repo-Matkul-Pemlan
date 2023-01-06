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

public class CivitasAkademika {

    private final Scanner io = new Scanner(System.in);
    private String nama, asalDaerah;
    private int usia;

    public CivitasAkademika() {
        System.out.print("Input Nama\t\t: ");
        this.nama = io.next();
        System.out.print("Input Daerah\t\t: ");
        this.asalDaerah = io.next();
        System.out.print("Input Usia\t\t: ");
        this.usia = io.nextInt();
    }

    public String getName() {
        return this.nama;
    }

    public String getAsalDaerah() {
        return this.asalDaerah;
    }

    public int getUsia() {
        return this.usia;
    }

    public void showInformasi() {
        System.out.println("Nama\t\t\t: " + this.nama);
        System.out.println("Asal Daerah\t\t: " + this.asalDaerah);
        System.out.println("Usia\t\t\t: " + this.usia);
    }

}
