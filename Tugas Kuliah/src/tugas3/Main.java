
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Illuminare
 */

/*
 * Nama: Alfito Dimas Prasetyo
 * NIM: 205150401111057
 * Kelas: Sistem Informasi - E
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersegiPanjang pp1 = new PersegiPanjang(10, 5, 1, 1, "Kiri", "Atas");
        pp1.hitungKeliling();
        pp1.hitungLuas();
        pp1.setKordinat();
        pp1.showInformasi();
        pp1.showKordinat();

        BujurSangkar bj1 = new BujurSangkar(5, -1, 2, "Kiri", "Atas");
        bj1.hitungKeliling();
        bj1.hitungLuas();
        bj1.setKordinat();
        bj1.showInformasi();
        bj1.showKordinat();

        Trapesium tp1 = new Trapesium(4, 10, 5, 6, 5, 1, 2, "Kanan", "Atas", 2);
        tp1.hitungkKeliling();
        tp1.hitungLuas();
        tp1.setKordinat();
        tp1.showInformasi();
        tp1.showKordinat();

        JajarGenjang jg1 = new JajarGenjang(4, 8, 4, 8, 4, -1, -3, "Kanan", "Bawah", 3);
        jg1.hitungkKeliling();
        jg1.hitungLuas();
        jg1.setKordinat();
        jg1.showInformasi();
        jg1.showKordinat();

        Kubus kb1 = new Kubus(3, 3, 3, "Kanan", "Atas", 2);
        kb1.hitungVolume();
        kb1.setKordinat();
        kb1.showInformasi();
        kb1.showKordinat();

        Balok bl1 = new Balok(5, 4, 3, -1, 0, "Kanan", "Atas", 2);
        bl1.hitungVolume();
        bl1.setKordinat();
        bl1.showInformasi();
        bl1.showKordinat();
    }

}
