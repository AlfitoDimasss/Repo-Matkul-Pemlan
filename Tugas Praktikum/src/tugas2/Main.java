/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Illuminare
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("===== PROGRAM MENABUNG DAN MENARIK UANG SEDERHANA TANPA BUNGA =====");
        System.out.println("- Referensi dari Latihan Buku Liang");
        System.out.print("\n");

        Account akun1 = new Account();
        akun1.setId(40);
        akun1.setNama("Prasetyo");
        akun1.setJumlahUang(300000.0);
        akun1.diplayAkun();
        akun1.tarikUang(150000.0);

        Account akun2 = new Account(41, "Alfito", 0.00);
        akun2.diplayAkun();
        akun2.setorUang(500000);

        Account akun3 = new Account();
        akun3.setId("42");
        akun3.setNama("Dimas");
        akun3.setJumlahUang("100000");
        akun3.diplayAkun();
        akun3.setorUang(50000.0);
        akun3.tarikUang(150000);

    }

}
