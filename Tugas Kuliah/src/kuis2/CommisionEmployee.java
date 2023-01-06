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
public class CommisionEmployee extends Employee implements PaymentAmount {

    private Scanner io = new Scanner(System.in);
    private int barangTerjual;

    public CommisionEmployee(String firstName, String lastName, String noKTP) {
        super(firstName, lastName, noKTP);
        this.jamKerja();
    }

    public void setBarangTerjual(int barangTerjual) {
        this.barangTerjual = barangTerjual;
    }

    public void jamKerja() {
        System.out.print("Masukkan Jumlah Barang Terjual: ");
        int a = io.nextInt();
        if (a < 0) {
            while (true) {
                System.out.println("Jumlah Barang Terjual Tidak boleh negatif");
                System.out.print("Masukkan Kembali jam Lembur: ");
                a = io.nextInt();
                if (a > 0) {
                    this.barangTerjual = a;
                    break;
                }
            }
        } else {
            this.barangTerjual = a;
        }

    }

    @Override
    public void hitungPenghasilan() {
        double hasil = (this.barangTerjual * 10000) + 4000000;
        this.setPenghasilan(hasil);
    }

    @Override
    public void getPaymentAmount() {
        System.out.println("Penghasilan Bulanan: " + this.penghasilan);
    }

    @Override
    public String toString() {
        return super.toString() + "CommisionEmployee{" + "barangTerjual=" + barangTerjual + '}';
    }

}
