/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author Illuminare
 */
public class Object {

    private static final Scanner io = new Scanner(System.in);

    // Deklarasi variabel
    private String id;
    private String name;
    private static int jumlahSiswa = 0;

    // Constructor
    public Object() {
        System.out.print("Masukkan Nomor ID <spasi> Nama Siswa ke-" + (Object.jumlahSiswa + 1) + ": ");
        String nomorId = io.next();
        String nama = io.next();
        this.id = nomorId;
        this.name = nama;
        Object.jumlahSiswa++;
    }

    // Method menampilkan data objek
    public void tampilkan() {
        System.out.println("ID\t: " + this.id);
        System.out.println("Nama\t: " + this.name);
    }

    // method menghapus data objek
    public void hapus() {
        this.id = null;
        this.name = null;
    }

    // Getter ID
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    // Setter ID dan Nama
    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.name = nama;
    }

    public void setIdNama(String id, String nama) {
        this.id = id;
        this.name = nama;
    }

    public static void kurangiJumlahSiswa() {
        Object.jumlahSiswa -= 1;
    }

    public static int getJumlahSiswa() {
        return Object.jumlahSiswa;
    }

}
