/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6;

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
        DataKue dk1 = new DataKue();
        dk1.operasi();
        showFooter();

    }

    public static void showHeader() {
        System.out
                .println("========================================================================================\n");
        System.out.println("\t\t\t\tSISTEM INFORMASI KUE");
        System.out.println(
                "\n========================================================================================\n");
    }

    public static void showFooter() {
        System.out.println("\t\tCopyright© 2021 AlfitoDimasPrasetyo - All Rights Reserved");
        System.out.println(
                "\n========================================================================================\n");
    }

}
