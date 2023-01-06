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

public class MataKuliah {

    private final Scanner io = new Scanner(System.in);
    private String nama;
    private int kode, sks;

    public MataKuliah() {
        System.out.print("Input Nama Mata Kuliah\t\t: ");
        this.nama = io.next();
        System.out.print("Input Kode Mata Kuliah\t\t: ");
        this.kode = io.nextInt();
        System.out.print("Input Beban SKS\t\t: ");
        this.sks = io.nextInt();
    }

    public int getSks() {
        return this.sks;
    }

    public String getName() {
        return this.nama;
    }

    public int getKode() {
        return this.kode;
    }

    public void showInformasi() {
        System.out.println("Nama Mata Kuliah\t: " + this.nama);
        System.out.println("Kode Mata Kuliah\t: " + this.kode);
        System.out.println("Beban SKS\t\t: " + this.sks);
    }
}
