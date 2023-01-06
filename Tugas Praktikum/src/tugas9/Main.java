/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas9;

/**
 *
 * @author Illuminare
 */

/*
 * Nama : Alfito Dimas Prasetyo
 * NIM : 205150401111057
 */

public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        showHeader();
        DataSiswa ds = new DataSiswa();
        ds.operasiData();
        showFooter();

    }

    public static void showHeader() {
        System.out
                .println("========================================================================================\n");
        System.out.println("\t\t\t\tSISTEM INFORMASI DATA SISWA");
        System.out.println(
                "\n========================================================================================\n");
    }

    public static void showFooter() {
        System.out.println("\t\tCopyright© 2021 AlfitoDimasPrasetyo - All Rights Reserved");
        System.out.println(
                "\n========================================================================================\n");
    }

}
