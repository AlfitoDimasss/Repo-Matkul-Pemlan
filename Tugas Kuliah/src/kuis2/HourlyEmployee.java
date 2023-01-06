/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

import java.util.Scanner;

/**
 *
 * @author Illuminare
 */
public class HourlyEmployee extends Employee implements PaymentAmount {

    private static Scanner io = new Scanner(System.in);
    private int jamKerja;

    public HourlyEmployee(String firstName, String lastName, String noKTP) {
        super(firstName, lastName, noKTP);
        this.jamKerja();
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void jamKerja() {
        System.out.print("Masukkan Jam Kerja: ");
        int a = io.nextInt();
        if (a < 0 || a > 180) {
            while (true) {
                System.out.println("Jam Kerja Tidak Boleh Negatif dan Tidak boleh lebih dari 180");
                System.out.print("Masukkan Kembali jam Kerja: ");
                a = io.nextInt();
                if (a > 0 && a < 180) {
                    this.jamKerja = a;
                    break;
                }
            }
        } else {
            this.jamKerja = a;
        }
    }

    @Override
    public void hitungPenghasilan() {
        double hasil = this.jamKerja * 25000 * 4;
        this.setPenghasilan(hasil);
    }

    @Override
    public void getPaymentAmount() {
        System.out.println("Penghasilan Bulanan: " + this.penghasilan);
    }

    @Override
    public String toString() {
        return super.toString() + "HourlyEmployee { " + "jamKerja = " + jamKerja + '}';
    }

}
