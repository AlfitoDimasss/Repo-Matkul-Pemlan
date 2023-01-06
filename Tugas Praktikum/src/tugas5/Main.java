/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

/**
 *
 * @author Illuminare
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    /*
     * NAMA : ALFITO DIMAS PRASETYO
     * NIM : 205150401111057
     */

    public static void main(String[] args) {
        showHeader();
        Data dt1 = new Data();
        dt1.operasi();
        showFooter();

    }

    public static void showHeader() {
        System.out
                .println("========================================================================================\n");
        System.out.println("\t\t\t\tSISTEM INFORMASI KENDARAAN");
        System.out.println(
                "\n========================================================================================\n");
    }

    public static void showFooter() {
        System.out.println("\t\tCopyright© 2021 AlfitoDimasPrasetyo - All Rights Reserved");
        System.out.println(
                "\n========================================================================================\n");
    }

}
