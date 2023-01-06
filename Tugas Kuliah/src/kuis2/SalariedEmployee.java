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
public class SalariedEmployee extends Employee implements PaymentAmount {

    private Scanner io = new Scanner(System.in);
    private int lembur;

    public SalariedEmployee(String firstName, String lastName, String noKTP) {
        super(firstName, lastName, noKTP);
        this.jamLembur();
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public void jamLembur() {
        System.out.print("Masukkan Lama Jam Lembur: ");
        int a = io.nextInt();
        if (a < 0 || a > 10) {
            while (true) {
                System.out.println("Jam Lembur Tidak Boleh Negatif dan Tidak boleh lebih dari 10");
                System.out.print("Masukkan Kembali jam Lembur: ");
                a = io.nextInt();
                if (a > 0 && a < 180) {
                    this.lembur = a;
                    break;
                }
            }
        } else {
            this.lembur = a;
        }
    }

    @Override
    public void hitungPenghasilan() {
        double hasil = (this.lembur * 30000 * 4) + 4000000;
        this.setPenghasilan(hasil);
    }

    @Override
    public void getPaymentAmount() {
        System.out.println("Penghasilan Bulanan: " + this.penghasilan);
    }

    @Override
    public String toString() {
        return super.toString() + "SalariedEmployee{" + "lembur=" + lembur + '}';
    }

}
