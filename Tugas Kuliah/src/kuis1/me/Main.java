/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1.me;

/**
 *
 * @author Illuminare
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Object objek1 = new Object("Budi", 2017110123, "Pemrograman Java Dasar");
        objek1.display();
        Object objek2 = new Object("Toni", "2017110124", "Pemrograman Java OOP");
        objek2.display();
        Object objek3 = new Object();
        objek3.setNamaMahasiswa("Andi");
        objek3.setNimMahasiswa(2017110124);
        objek3.setJudulBuku("Pemrograman C");
        objek3.display();

        Object.showDaftarPeminjam();
        Object.showDaftarBukuDipinjam();

    }

}
