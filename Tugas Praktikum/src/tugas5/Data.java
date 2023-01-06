/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

import java.util.ArrayList;
import java.util.Scanner;

/*
NAMA : ALFITO DIMAS PRASETYO
NIM  : 205150401111057
*/

/**
 *
 * @author Illuminare
 */
public class Data {

    private final Scanner io = new Scanner(System.in);
    private ArrayList<Motor> motor;
    private ArrayList<Mobil> mobil;
    private ArrayList<Pesawat> pesawat;
    private ArrayList<Helikopter> helikopter;
    private ArrayList<KapalFeri> kapalFeri;
    private ArrayList<KapalSelam> kapalSelam;
    private static int jumlahMotor = 0;
    private static int jumlahMobil = 0;
    private static int jumlahKapalFeri = 0;
    private static int jumlahKapalSelam = 0;
    private static int jumlahPesawat = 0;
    private static int jumlahHelikopter = 0;

    public Data() {
        motor = new ArrayList<>();
        mobil = new ArrayList<>();
        pesawat = new ArrayList<>();
        helikopter = new ArrayList<>();
        kapalFeri = new ArrayList<>();
        kapalSelam = new ArrayList<>();
    }

    public void operasi() {
        OUTER: do {
            System.out.println("Silahkan Input Menu Kendaraan: ");
            System.out.printf("1. Motor %5c 3. Pesawat %8c 5. Kapal Feri\n", ' ', ' ');
            System.out.printf("2. Mobil %5c 4. Helikopter %5c 6. Kapal Selam\n", ' ', ' ');
            System.out.println("0. Exit");
            System.out.print("Input: ");
            int i = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (i) {
                case 1:
                    this.operasiMotor();
                    break;
                case 2:
                    this.operasiMobil();
                    break;
                case 3:
                    this.operasiPesawat();
                    break;
                case 4:
                    this.operasiHelikopter();
                    break;
                case 5:
                    this.operasiKapalFeri();
                    break;
                case 6:
                    this.operasiKapalSelam();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid");
                    System.out.println(
                            "\n========================================================================================\n");
            }
        } while (true);
    }

    private void createMotor() {
        System.out.print("Input Kode Motor\t\t\t: ");
        int kode = io.nextInt();
        System.out.print("Input Merek Motor\t\t\t: ");
        String merek = io.next();
        System.out.print("Input Panjang Motor (m)\t\t: ");
        double panjang = io.nextDouble();
        System.out.print("Input Lebar Motor (m)\t\t\t: ");
        double lebar = io.nextDouble();
        System.out.print("Input Tinggi Motor (m)\t\t\t: ");
        double tinggi = io.nextDouble();
        System.out.print("Input Kapasitas Penumpang Motor\t: ");
        int jumlah = io.nextInt();
        System.out.print("Input Jumlah Roda Motor\t\t: ");
        int roda = io.nextInt();
        System.out.print("Input Lebar Stang Motor(m)\t\t: ");
        double stang = io.nextDouble();
        System.out.print("Input Warna Jok Motor\t\t\t: ");
        String warna = io.next();
        Motor objekMotor = new Motor(kode, panjang, lebar, tinggi, merek, jumlah, roda, stang, warna);
        motor.add(objekMotor);
        jumlahMotor++;
        System.out.println(
                "\n========================================================================================\n");
        System.out.println("Data Motor Berhasil Dibuat dan Diinputkan");
        System.out.println(
                "\n========================================================================================\n");
    }

    private void createMobil() {
        System.out.print("Input Kode Mobil\t\t\t: ");
        int kode = io.nextInt();
        System.out.print("Input Merek Mobil\t\t\t: ");
        String merek = io.next();
        System.out.print("Input Panjang Mobil (m)\t\t: ");
        double panjang = io.nextDouble();
        System.out.print("Input Lebar Mobil (m)\t\t\t: ");
        double lebar = io.nextDouble();
        System.out.print("Input Tinggi Mobil (m)\t\t\t: ");
        double tinggi = io.nextDouble();
        System.out.print("Input Kapasitas Penumpang Mobil\t: ");
        int jumlah = io.nextInt();
        System.out.print("Input Jumlah Roda Mobil\t\t: ");
        int roda = io.nextInt();
        System.out.print("Input Diameter Stir Mobil (m)\t\t: ");
        double stir = io.nextDouble();
        System.out.print("Apakah Bermesin Diesel?\t\t: ");
        String diesel = io.next();
        boolean benar = diesel.equalsIgnoreCase("YA") || diesel.equalsIgnoreCase("YES") || diesel.equalsIgnoreCase("Y");
        Mobil objekMobil = new Mobil(kode, panjang, lebar, tinggi, merek, jumlah, roda, stir, benar);
        mobil.add(objekMobil);
        jumlahMobil++;
        System.out.println(
                "\n========================================================================================\n");
        System.out.println("Data Mobil Berhasil Dibuat dan Diinputkan");
        System.out.println(
                "\n========================================================================================\n");
    }

    private void createPesawat() {
        System.out.print("Input Kode Pesawat (m)\t\t\t\t: ");
        int kode = io.nextInt();
        System.out.print("Input Merek Pesawat\t\t\t\t: ");
        String merek = io.next();
        System.out.print("Input Panjang Pesawat (m)\t\t\t: ");
        double panjang = io.nextDouble();
        System.out.print("Input Lebar Pesawat (m)\t\t\t: ");
        double lebar = io.nextDouble();
        System.out.print("Input Tinggi Pesawat (m)\t\t\t: ");
        double tinggi = io.nextDouble();
        System.out.print("Input Kapasitas Penumpang Pesawat\t\t: ");
        int jumlah = io.nextInt();
        System.out.print("Input Tinggi Maksimal Pesawat (Kaki)\t\t: ");
        double tinggiMaks = io.nextDouble();
        System.out.print("Input Lebar Sayap Pesawat (m)\t\t\t: ");
        double sayap = io.nextDouble();
        System.out.print("Input Maskapai Pesawat\t\t\t\t: ");
        String maskapai = io.next();
        Pesawat objekPesawat = new Pesawat(kode, panjang, lebar, tinggi, merek, jumlah, tinggiMaks, sayap, maskapai);
        pesawat.add(objekPesawat);
        jumlahPesawat++;
        System.out.println(
                "\n========================================================================================\n");
        System.out.println("Data Pesawat Berhasil Dibuat dan Diinputkan");
        System.out.println(
                "\n========================================================================================\n");
    }

    private void createHelikopter() {
        System.out.print("Input Kode Helikopter\t\t\t\t\t: ");
        int kode = io.nextInt();
        System.out.print("Input Merek Helikopter\t\t\t\t\t: ");
        String merek = io.next();
        System.out.print("Input Panjang Helikopter (m)\t\t\t\t: ");
        double panjang = io.nextDouble();
        System.out.print("Input Lebar Helikopter (m)\t\t\t\t: ");
        double lebar = io.nextDouble();
        System.out.print("Input Tinggi Helikopter (m)\t\t\t\t: ");
        double tinggi = io.nextDouble();
        System.out.print("Input Kapasitas Penumpang Helikopter\t\t\t: ");
        int jumlah = io.nextInt();
        System.out.print("Input Tinggi Maksimal Helikopter (Kaki)\t\t: ");
        double tinggiMaks = io.nextDouble();
        System.out.print("Input Diameter Baling-Baling Helikopter (m)\t\t: ");
        double baling = io.nextDouble();
        Helikopter objekHelikopter = new Helikopter(kode, panjang, lebar, tinggi, merek, jumlah, tinggiMaks, baling);
        helikopter.add(objekHelikopter);
        jumlahHelikopter++;
        System.out.println(
                "\n========================================================================================\n");
        System.out.println("Data Helikopter Berhasil Dibuat dan Diinputkan");
        System.out.println(
                "\n========================================================================================\n");
    }

    private void createKapalFeri() {
        System.out.print("Input Kode Kapal Feri\t\t\t\t: ");
        int kode = io.nextInt();
        System.out.print("Input Merek Kapal Feri\t\t\t\t: ");
        String merek = io.next();
        System.out.print("Input Panjang Kapal Feri (m)\t\t\t: ");
        double panjang = io.nextDouble();
        System.out.print("Input Lebar Kapal Feri (m)\t\t\t: ");
        double lebar = io.nextDouble();
        System.out.print("Input Tinggi Kapal Feri (m)\t\t\t: ");
        double tinggi = io.nextDouble();
        System.out.print("Input Kapasitas Penumpang Kapal Feri\t\t: ");
        int jumlah = io.nextInt();
        System.out.print("Input Alat Penggerak Kapal Feri\t\t: ");
        String alat = io.next();
        System.out.print("Apakah Dapat Menyelam?\t\t\t\t: ");
        String selam = io.next();
        boolean benar = selam.equalsIgnoreCase("YA") || selam.equalsIgnoreCase("YES") || selam.equalsIgnoreCase("Y");
        System.out.print("Apakah Ada Kolam Renang?\t\t\t: ");
        String renang = io.next();
        boolean benar1 = renang.equalsIgnoreCase("YA") || renang.equalsIgnoreCase("YES") || selam.equalsIgnoreCase("Y");
        KapalFeri objekFeri = new KapalFeri(kode, panjang, lebar, tinggi, merek, jumlah, alat, benar, benar1);
        kapalFeri.add(objekFeri);
        jumlahKapalFeri++;
        System.out.println(
                "\n========================================================================================\n");
        System.out.println("Data Kapal Feri Berhasil Dibuat dan Diinputkan");
        System.out.println(
                "\n========================================================================================\n");
    }

    private void createKapalSelam() {
        System.out.print("Input Kode Kapal Selam\t\t\t\t: ");
        int kode = io.nextInt();
        System.out.print("Input Merek Kapal Selam\t\t\t: ");
        String merek = io.next();
        System.out.print("Input Panjang Kapal Selam (m)\t\t\t: ");
        double panjang = io.nextDouble();
        System.out.print("Input Lebar Kapal Selam (m)\t\t\t: ");
        double lebar = io.nextDouble();
        System.out.print("Input Tinggi Kapal Selam (m)\t\t\t: ");
        double tinggi = io.nextDouble();
        System.out.print("Input Kapasitas Penumpang Kapal Selam\t\t: ");
        int jumlah = io.nextInt();
        System.out.print("Input Alat Penggerak Kapal Selam\t\t: ");
        String alat = io.next();
        System.out.print("Apakah Dapat Menyelam?\t\t\t\t: ");
        String selam = io.next();
        boolean benar = selam.equalsIgnoreCase("YA") || selam.equalsIgnoreCase("YES") || selam.equalsIgnoreCase("Y");
        System.out.print("Apakah Milik Militer?\t\t\t\t: ");
        String militer = io.next();
        boolean benar1 = militer.equalsIgnoreCase("YA") || militer.equalsIgnoreCase("YES")
                || selam.equalsIgnoreCase("Y");
        KapalSelam objekSelam = new KapalSelam(kode, panjang, lebar, tinggi, merek, jumlah, alat, benar, benar1);
        kapalSelam.add(objekSelam);
        jumlahKapalSelam++;
        System.out.println(
                "\n========================================================================================\n");
        System.out.println("Data Kapal Selam Berhasil Dibuat dan Diinputkan");
        System.out.println(
                "\n========================================================================================\n");
    }

    private void tampilkanMotor() {
        if (jumlahMotor != 0) {
            System.out.println("Jumlah Motor Yang Terdaftar\t: " + Data.getJumlahMotor());
            System.out.println(
                    "\n----------------------------------------------------------------------------------------\n");
            for (int i = 0; i < jumlahMotor; i++) {
                System.out.println("Motor Ke - " + (i + 1));
                motor.get(i).showInformasi();
                System.out.println(
                        "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Motor, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilkanMotorTertentu() {
        if (jumlahMotor != 0) {
            System.out.print("Masukkan Kode Motor Yang Ingin Ditampilkan: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahMotor; i++) {
                if (x == motor.get(i).getKodeKendaraan()) {
                    motor.get(i).showInformasi();
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahMotor - 1) && x != motor.get(i).getKodeKendaraan()) {
                    System.out.println("Kode Motor Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Mobil, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilkanMobil() {
        if (jumlahMobil != 0) {
            System.out.println("Jumlah Mobil Yang Terdaftar\t: " + Data.getJumlahMobil());
            System.out.println(
                    "\n----------------------------------------------------------------------------------------\n");
            for (int i = 0; i < jumlahMobil; i++) {
                System.out.println("Mobil Ke - " + (i + 1));
                mobil.get(i).showInformasi();
                System.out.println(
                        "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Mobil, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilkanMobilTertentu() {
        if (jumlahMobil != 0) {
            System.out.print("Masukkan Kode Mobil Yang Ingin Ditampilkan: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahMobil; i++) {
                if (x == mobil.get(i).getKodeKendaraan()) {
                    mobil.get(i).showInformasi();
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahMobil - 1) && x != mobil.get(i).getKodeKendaraan()) {
                    System.out.println("Kode Mobil Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Mobil, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilkanPesawat() {
        if (jumlahPesawat != 0) {
            System.out.println("Jumlah Pesawat Yang Terdaftar\t: " + Data.getJumlahPesawat());
            System.out.println(
                    "\n----------------------------------------------------------------------------------------\n");
            for (int i = 0; i < jumlahPesawat; i++) {
                System.out.println("Pesawat Ke - " + (i + 1));
                pesawat.get(i).showInformasi();
                System.out.println(
                        "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Pesawat, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilkanPesawatTertentu() {
        if (jumlahPesawat != 0) {
            System.out.print("Masukkan Kode Pesawat Yang Ingin Ditampilkan: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahPesawat; i++) {
                if (x == pesawat.get(i).getKodeKendaraan()) {
                    pesawat.get(i).showInformasi();
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahPesawat - 1) && x != pesawat.get(i).getKodeKendaraan()) {
                    System.out.println("Kode Pesawat Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Pesawat, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilkanHelikopter() {
        if (jumlahHelikopter != 0) {
            System.out.println("Jumlah Helikopter Yang Terdaftar\t: " + Data.getJumlahHelikopter());
            System.out.println(
                    "\n----------------------------------------------------------------------------------------\n");
            for (int i = 0; i < jumlahHelikopter; i++) {
                System.out.println("Helikopter Ke - " + (i + 1));
                helikopter.get(i).showInformasi();
                System.out.println(
                        "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Helikopter, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilkanHelikopterTertentu() {
        if (jumlahHelikopter != 0) {
            System.out.print("Masukkan Kode Helikopter Yang Ingin Ditampilkan: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahHelikopter; i++) {
                if (x == helikopter.get(i).getKodeKendaraan()) {
                    helikopter.get(i).showInformasi();
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahHelikopter - 1) && x != helikopter.get(i).getKodeKendaraan()) {
                    System.out.println("Kode Helikopter Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Helikopter, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilkanKapalFeri() {
        if (jumlahKapalFeri != 0) {
            System.out.println("Jumlah Kapal Feri Yang Terdaftar\t: " + Data.getJumlahKapalFeri());
            System.out.println(
                    "\n----------------------------------------------------------------------------------------\n");
            for (int i = 0; i < jumlahKapalFeri; i++) {
                System.out.println("Kapal Feri Ke - " + (i + 1));
                kapalFeri.get(i).showInformasi();
                System.out.println(
                        "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Kapal Feri, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilkanKapalFeriTertentu() {
        if (jumlahKapalFeri != 0) {
            System.out.print("Masukkan Kode Kapal Feri Yang Ingin Ditampilkan: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahKapalFeri; i++) {
                if (x == kapalFeri.get(i).getKodeKendaraan()) {
                    kapalFeri.get(i).showInformasi();
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahKapalFeri - 1) && x != kapalFeri.get(i).getKodeKendaraan()) {
                    System.out.println("Kode Kapal Feri Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Kapal Feri, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilkanKapalSelam() {
        if (jumlahKapalSelam != 0) {
            System.out.println("Jumlah Kapal Selam Yang Terdaftar\t: " + Data.getJumlahKapalSelam());
            System.out.println(
                    "\n----------------------------------------------------------------------------------------\n");
            for (int i = 0; i < jumlahKapalSelam; i++) {
                System.out.println("Kapal Selam Ke - " + (i + 1));
                kapalSelam.get(i).showInformasi();
                System.out.println(
                        "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Kapal Selam, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilkanKapalSelamTertentu() {
        if (jumlahKapalSelam != 0) {
            System.out.print("Masukkan Kode Kapal Selam Yang Ingin Ditampilkan: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahKapalSelam; i++) {
                if (x == kapalSelam.get(i).getKodeKendaraan()) {
                    kapalSelam.get(i).showInformasi();
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahKapalSelam - 1) && x != kapalSelam.get(i).getKodeKendaraan()) {
                    System.out.println("Kode Kapal Selam Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Kapal Selam, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void editMotor() {
        if (jumlahMotor != 0) {
            System.out.print("Masukkan Kode Motor Yang Akan Diedit: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahMotor; i++) {
                if (x == motor.get(i).getKodeKendaraan()) {
                    System.out.print("Input Kode Motor\t\t\t: ");
                    int kode = io.nextInt();
                    System.out.print("Input Merek Motor\t\t\t: ");
                    String merek = io.next();
                    System.out.print("Input Panjang Motor (m)\t\t: ");
                    double panjang = io.nextDouble();
                    System.out.print("Input Lebar Motor (m)\t\t\t: ");
                    double lebar = io.nextDouble();
                    System.out.print("Input Tinggi Motor (m)\t\t\t: ");
                    double tinggi = io.nextDouble();
                    System.out.print("Input Kapasitas Penumpang Motor\t: ");
                    int jumlah = io.nextInt();
                    System.out.print("Input Jumlah Roda Motor\t\t: ");
                    int roda = io.nextInt();
                    System.out.print("Input Lebar Stang Motor(m)\t\t: ");
                    double stang = io.nextDouble();
                    System.out.print("Input Warna Jok Motor\t\t\t: ");
                    String warna = io.next();
                    Motor objekMotor = new Motor(kode, panjang, lebar, tinggi, merek, jumlah, roda, stang, warna);
                    motor.set(i, objekMotor);
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Motor Berhasil Diedit");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahMotor - 1) && x != motor.get(i).getKodeKendaraan()) {
                    System.out.println("Kode Motor Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Motor, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void editMobil() {
        if (jumlahMobil != 0) {
            System.out.print("Masukkan Kode Mobil Yang Akan Diedit: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahMobil; i++) {
                if (x == mobil.get(i).getKodeKendaraan()) {
                    System.out.print("Input Kode Mobil\t\t\t: ");
                    int kode = io.nextInt();
                    System.out.print("Input Merek Mobil\t\t\t: ");
                    String merek = io.next();
                    System.out.print("Input Panjang Mobil (m)\t\t: ");
                    double panjang = io.nextDouble();
                    System.out.print("Input Lebar Mobil (m)\t\t\t: ");
                    double lebar = io.nextDouble();
                    System.out.print("Input Tinggi Mobil (m)\t\t\t: ");
                    double tinggi = io.nextDouble();
                    System.out.print("Input Kapasitas Penumpang Mobil\t: ");
                    int jumlah = io.nextInt();
                    System.out.print("Input Jumlah Roda Mobil\t\t: ");
                    int roda = io.nextInt();
                    System.out.print("Input Diameter Stir Mobil (m)\t\t: ");
                    double stir = io.nextDouble();
                    System.out.print("Apakah Bermesin Diesel?\t\t: ");
                    String diesel = io.next();
                    boolean benar = diesel.equalsIgnoreCase("YA") || diesel.equalsIgnoreCase("YES")
                            || diesel.equalsIgnoreCase("Y");
                    Mobil objekMobil = new Mobil(kode, panjang, lebar, tinggi, merek, jumlah, roda, stir, benar);
                    mobil.set(i, objekMobil);
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Mobil Berhasil Diedit");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahMobil - 1) && (x != mobil.get(i).getKodeKendaraan())) {
                    System.out.println("Kode Mobil Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Mobil, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void editPesawat() {
        if (jumlahPesawat != 0) {
            System.out.print("Masukkan Kode Pesawat Yang Akan Diedit: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahPesawat; i++) {
                if (x == pesawat.get(i).getKodeKendaraan()) {
                    System.out.print("Input Kode Pesawat (m)\t\t\t\t: ");
                    int kode = io.nextInt();
                    System.out.print("Input Merek Pesawat\t\t\t\t: ");
                    String merek = io.next();
                    System.out.print("Input Panjang Pesawat (m)\t\t\t: ");
                    double panjang = io.nextDouble();
                    System.out.print("Input Lebar Pesawat (m)\t\t\t: ");
                    double lebar = io.nextDouble();
                    System.out.print("Input Tinggi Pesawat (m)\t\t\t: ");
                    double tinggi = io.nextDouble();
                    System.out.print("Input Kapasitas Penumpang Pesawat\t\t: ");
                    int jumlah = io.nextInt();
                    System.out.print("Input Tinggi Maksimal Pesawat (Kaki)\t\t: ");
                    double tinggiMaks = io.nextDouble();
                    System.out.print("Input Lebar Sayap Pesawat (m)\t\t\t: ");
                    double sayap = io.nextDouble();
                    System.out.print("Input Maskapai Pesawat\t\t\t\t: ");
                    String maskapai = io.next();
                    Pesawat objekPesawat = new Pesawat(kode, panjang, lebar, tinggi, merek, jumlah, tinggiMaks, sayap,
                            maskapai);
                    pesawat.set(i, objekPesawat);
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Pesawat Berhasil Diedit");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahPesawat - 1) && (x != pesawat.get(i).getKodeKendaraan())) {
                    System.out.println("Kode Pesawat Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Pesawat, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void editHelikopter() {
        if (jumlahHelikopter != 0) {
            System.out.print("Masukkan Kode Helikopter Yang Akan Diedit: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahHelikopter; i++) {
                if (x == helikopter.get(i).getKodeKendaraan()) {
                    System.out.print("Input Kode Helikopter\t\t\t\t\t: ");
                    int kode = io.nextInt();
                    System.out.print("Input Merek Helikopter\t\t\t\t\t: ");
                    String merek = io.next();
                    System.out.print("Input Panjang Helikopter (m)\t\t\t\t: ");
                    double panjang = io.nextDouble();
                    System.out.print("Input Lebar Helikopter (m)\t\t\t\t: ");
                    double lebar = io.nextDouble();
                    System.out.print("Input Tinggi Helikopter (m)\t\t\t\t: ");
                    double tinggi = io.nextDouble();
                    System.out.print("Input Kapasitas Penumpang Helikopter\t\t\t: ");
                    int jumlah = io.nextInt();
                    System.out.print("Input Tinggi Maksimal Helikopter (Kaki)\t\t: ");
                    double tinggiMaks = io.nextDouble();
                    System.out.print("Input Diameter Baling-Baling Helikopter (m)\t\t: ");
                    double baling = io.nextDouble();
                    Helikopter objekHelikopter = new Helikopter(kode, panjang, lebar, tinggi, merek, jumlah, tinggiMaks,
                            baling);
                    helikopter.set(i, objekHelikopter);
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Helikopter Berhasil Diedit");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahHelikopter - 1) && (x != helikopter.get(i).getKodeKendaraan())) {
                    System.out.println("Kode Helikopter Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Helikopter, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void editKapalFeri() {
        if (jumlahKapalFeri != 0) {
            System.out.print("Masukkan Kode Kapal Feri Yang Akan Diedit: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahKapalFeri; i++) {
                if (x == kapalFeri.get(i).getKodeKendaraan()) {
                    System.out.print("Input Kode Kapal Feri\t\t\t\t: ");
                    int kode = io.nextInt();
                    System.out.print("Input Merek Kapal Feri\t\t\t\t: ");
                    String merek = io.next();
                    System.out.print("Input Panjang Kapal Feri (m)\t\t\t: ");
                    double panjang = io.nextDouble();
                    System.out.print("Input Lebar Kapal Feri (m)\t\t\t: ");
                    double lebar = io.nextDouble();
                    System.out.print("Input Tinggi Kapal Feri (m)\t\t\t: ");
                    double tinggi = io.nextDouble();
                    System.out.print("Input Kapasitas Penumpang Kapal Feri\t\t: ");
                    int jumlah = io.nextInt();
                    System.out.print("Input Alat Penggerak Kapal Feri\t\t: ");
                    String alat = io.next();
                    System.out.print("Apakah Dapat Menyelam?\t\t\t\t: ");
                    String selam = io.next();
                    boolean benar = selam.equalsIgnoreCase("YA") || selam.equalsIgnoreCase("YES")
                            || selam.equalsIgnoreCase("Y");
                    System.out.print("Apakah Ada Kolam Renang?\t\t\t: ");
                    String renang = io.next();
                    boolean benar1 = renang.equalsIgnoreCase("YA") || renang.equalsIgnoreCase("YES")
                            || selam.equalsIgnoreCase("Y");
                    KapalFeri objekFeri = new KapalFeri(kode, panjang, lebar, tinggi, merek, jumlah, alat, benar,
                            benar1);
                    kapalFeri.set(i, objekFeri);
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Kapal Feri Berhasil Diedit");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahKapalFeri - 1) && (x != kapalFeri.get(i).getKodeKendaraan())) {
                    System.out.println("Kode Kapal Feri Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Kapal Feri, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void editKapalSelam() {
        if (jumlahKapalSelam != 0) {
            System.out.print("Masukkan Kode Kapal Selam Yang Akan Diedit: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahKapalSelam; i++) {
                if (x == kapalSelam.get(i).getKodeKendaraan()) {
                    System.out.print("Input Kode Kapal Selam\t\t\t\t: ");
                    int kode = io.nextInt();
                    System.out.print("Input Merek Kapal Selam\t\t\t: ");
                    String merek = io.next();
                    System.out.print("Input Panjang Kapal Selam (m)\t\t\t: ");
                    double panjang = io.nextDouble();
                    System.out.print("Input Lebar Kapal Selam (m)\t\t\t: ");
                    double lebar = io.nextDouble();
                    System.out.print("Input Tinggi Kapal Selam (m)\t\t\t: ");
                    double tinggi = io.nextDouble();
                    System.out.print("Input Kapasitas Penumpang Kapal Selam\t\t: ");
                    int jumlah = io.nextInt();
                    System.out.print("Input Alat Penggerak Kapal Selam\t\t: ");
                    String alat = io.next();
                    System.out.print("Apakah Dapat Menyelam?\t\t\t\t: ");
                    String selam = io.next();
                    boolean benar = selam.equalsIgnoreCase("YA") || selam.equalsIgnoreCase("YES")
                            || selam.equalsIgnoreCase("Y");
                    System.out.print("Apakah Milik Militer?\t\t\t\t: ");
                    String militer = io.next();
                    boolean benar1 = militer.equalsIgnoreCase("YA") || militer.equalsIgnoreCase("YES")
                            || selam.equalsIgnoreCase("Y");
                    KapalSelam objekSelam = new KapalSelam(kode, panjang, lebar, tinggi, merek, jumlah, alat, benar,
                            benar1);
                    kapalSelam.set(i, objekSelam);
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Kapal Selam Berhasil Diedit");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahKapalSelam - 1) && (x != kapalSelam.get(i).getKodeKendaraan())) {
                    System.out.println("Kode Kapal Selam Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Kapal Selam, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deleteMotor() {
        if (jumlahMotor != 0) {
            System.out.print("Masukkan Kode Motor Yang Akan Dihapus: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahMotor; i++) {
                if (x == motor.get(i).getKodeKendaraan()) {
                    motor.remove(i);
                    jumlahMotor--;
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Motor Berhasil Dihapus");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahMotor - 1) && x != motor.get(i).getKodeKendaraan()) {
                    System.out.println("Kode Motor Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Motor, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deleteMobil() {
        if (jumlahMobil != 0) {
            System.out.print("Masukkan Kode Mobil Yang Akan Dihapus: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahMobil; i++) {
                if (x == mobil.get(i).getKodeKendaraan()) {
                    mobil.remove(i);
                    jumlahMobil--;
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Mobil Berhasil Dihapus");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahMobil - 1) && (x != mobil.get(i).getKodeKendaraan())) {
                    System.out.println("Kode Mobil Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Mobil, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deletePesawat() {
        if (jumlahPesawat != 0) {
            System.out.print("Masukkan Kode Pesawat Yang Akan Dihapus: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahPesawat; i++) {
                if (x == pesawat.get(i).getKodeKendaraan()) {
                    pesawat.remove(i);
                    jumlahPesawat--;
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Pesawat Berhasil Dihapus");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahPesawat - 1) && (x != pesawat.get(i).getKodeKendaraan())) {
                    System.out.println("Kode Pesawat Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Pesawat, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deleteHelikopter() {
        if (jumlahHelikopter != 0) {
            System.out.print("Masukkan Kode Helikopter Yang Akan Dihapus: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahHelikopter; i++) {
                if (x == helikopter.get(i).getKodeKendaraan()) {
                    helikopter.remove(i);
                    jumlahHelikopter--;
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Helikopter Berhasil Dihapus");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahHelikopter - 1) && (x != helikopter.get(i).getKodeKendaraan())) {
                    System.out.println("Kode Helikopter Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Helikopter, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deleteKapalFeri() {
        if (jumlahKapalFeri != 0) {
            System.out.print("Masukkan Kode Kapal Feri Yang Akan Dihapus: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahKapalFeri; i++) {
                if (x == kapalFeri.get(i).getKodeKendaraan()) {
                    kapalFeri.remove(i);
                    jumlahKapalFeri--;
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Kapal Feri Berhasil Dihapus");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahKapalFeri - 1) && (x != kapalFeri.get(i).getKodeKendaraan())) {
                    System.out.println("Kode Kapal Feri Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Kapal Feri, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deleteKapalSelam() {
        if (jumlahKapalSelam != 0) {
            System.out.print("Masukkan Kode Kapal Selam Yang Akan Dihapus: ");
            int x = io.nextInt();
            for (int i = 0; i < jumlahKapalSelam; i++) {
                if (x == kapalSelam.get(i).getKodeKendaraan()) {
                    kapalSelam.remove(i);
                    jumlahKapalSelam--;
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Kapal Selam Berhasil Dihapus");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == (jumlahKapalSelam - 1) && (x != kapalSelam.get(i).getKodeKendaraan())) {
                    System.out.println("Kode Kapal Selam Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Kapal Selam, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void operasiMotor() {
        OUTER: do {
            System.out.println("MOTOR");
            System.out.println("List Command: ");
            System.out.printf("1. Create Data Motor %1c 3. Edit Data Motor %16c 5. Tampilkan Data Motor\n", ' ', ' ');
            System.out.printf(
                    "2. Hapus Data Motor %2c 4. Tampilkan Data Motor Tertentu %2c 6. Filter Pencarian Motor\n", ' ',
                    ' ');
            System.out.println("0. Exit");
            System.out.print("Input: ");
            int i = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (i) {
                case 1:
                    this.createMotor();
                    break;
                case 2:
                    this.deleteMotor();
                    break;
                case 3:
                    this.editMotor();
                    break;
                case 4:
                    this.tampilkanMotorTertentu();
                    break;
                case 5:
                    this.tampilkanMotor();
                    break;
                case 6:
                    this.operasiFilterMotor();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid!");
                    System.out.println(
                            "\n========================================================================================\n");
            }
        } while (true);
    }

    private void operasiMobil() {
        OUTER: do {
            System.out.println("MOBIL");
            System.out.println("List Command: ");
            System.out.printf("1. Create Data Mobil %1c 3. Edit Data Mobil %16c 5. Tampilkan Data Mobil\n", ' ', ' ');
            System.out.printf(
                    "2. Hapus Data Mobil %2c 4. Tampilkan Data Mobil Tertentu %2c 6. Filter Pencarian Mobil\n", ' ',
                    ' ');
            System.out.println("0. Exit");
            System.out.print("Input: ");
            int i = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (i) {
                case 1:
                    this.createMobil();
                    break;
                case 2:
                    this.deleteMobil();
                    break;
                case 3:
                    this.editMobil();
                    break;
                case 4:
                    this.tampilkanMobilTertentu();
                    break;
                case 5:
                    this.tampilkanMobil();
                    break;
                case 6:
                    this.operasiFilterMobil();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid!");
                    System.out.println(
                            "\n========================================================================================\n");
            }
        } while (true);
    }

    private void operasiPesawat() {
        OUTER: do {
            System.out.println("PESAWAT");
            System.out.println("List Command: ");
            System.out.printf("1. Create Data Pesawat %1c 3. Edit Data Pesawat %16c 5. Tampilkan Data Pesawat\n", ' ',
                    ' ');
            System.out.printf(
                    "2. Hapus Data Pesawat %2c 4. Tampilkan Data Pesawat Tertentu %2c 6. Filter Pencarian Pesawat\n",
                    ' ', ' ');
            System.out.println("0. Exit");
            System.out.print("Input: ");
            int i = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (i) {
                case 1:
                    this.createPesawat();
                    break;
                case 2:
                    this.deletePesawat();
                    break;
                case 3:
                    this.editPesawat();
                    break;
                case 4:
                    this.tampilkanPesawatTertentu();
                    break;
                case 5:
                    this.tampilkanPesawat();
                    break;
                case 6:
                    this.operasiFilterPesawat();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid!");
                    System.out.println(
                            "\n========================================================================================\n");
            }
        } while (true);
    }

    private void operasiHelikopter() {
        OUTER: do {
            System.out.println("HELIKOPTER");
            System.out.println("List Command: ");
            System.out.printf(
                    "1. Create Data Helikopter %1c 3. Edit Data Helikopter %16c 5. Tampilkan Data Helikopter\n", ' ',
                    ' ');
            System.out.printf(
                    "2. Hapus Data Helikopter %2c 4. Tampilkan Data Helikopter Tertentu %2c 6. Filter Pencarian Helikopter\n",
                    ' ', ' ');
            System.out.println("0. Exit");
            System.out.print("Input: ");
            int i = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (i) {
                case 1:
                    this.createHelikopter();
                    break;
                case 2:
                    this.deleteHelikopter();
                    break;
                case 3:
                    this.editHelikopter();
                    break;
                case 4:
                    this.tampilkanHelikopterTertentu();
                    break;
                case 5:
                    this.tampilkanHelikopter();
                    break;
                case 6:
                    this.operasiFilterHelikopter();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid!");
                    System.out.println(
                            "\n========================================================================================\n");
            }
        } while (true);
    }

    private void operasiKapalFeri() {
        OUTER: do {
            System.out.println("KAPAL FERI");
            System.out.println("List Command: ");
            System.out.printf(
                    "1. Create Data Kapal Feri %1c 3. Edit Data Kapal Feri %16c 5. Tampilkan Data Kapal Feri\n", ' ',
                    ' ');
            System.out.printf(
                    "2. Hapus Data Kapal Feri %2c 4. Tampilkan Data Kapal Feri Tertentu %2c 6. Filter Pencarian Kapal Feri\n",
                    ' ', ' ');
            System.out.println("0. Exit");
            System.out.print("Input: ");
            int i = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (i) {
                case 1:
                    this.createKapalFeri();
                    break;
                case 2:
                    this.deleteKapalFeri();
                    break;
                case 3:
                    this.editKapalFeri();
                    break;
                case 4:
                    this.tampilkanKapalFeriTertentu();
                    break;
                case 5:
                    this.tampilkanKapalFeri();
                    break;
                case 6:
                    this.operasiFilterKapalFeri();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid!");
                    System.out.println(
                            "\n========================================================================================\n");
            }
        } while (true);
    }

    private void operasiKapalSelam() {
        OUTER: do {
            System.out.println("KAPAL SELAM");
            System.out.println("List Command: ");
            System.out.printf(
                    "1. Create Data Kapal Selam %1c 3. Edit Data Kapal Selam %16c 5. Tampilkan Data Kapal Selam\n", ' ',
                    ' ');
            System.out.printf(
                    "2. Hapus Data Kapal Selam %2c 4. Tampilkan Data Kapal Selam Tertentu %2c 6. Filter Pencarian Kapal Selam\n",
                    ' ', ' ');
            System.out.println("0. Exit");
            System.out.print("Input: ");
            int i = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (i) {
                case 1:
                    this.createKapalSelam();
                    break;
                case 2:
                    this.deleteKapalSelam();
                    break;
                case 3:
                    this.editKapalSelam();
                    break;
                case 4:
                    this.tampilkanKapalSelamTertentu();
                    break;
                case 5:
                    this.tampilkanKapalSelam();
                    break;
                case 6:
                    this.operasiFilterKapalSelam();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid!");
                    System.out.println(
                            "\n========================================================================================\n");
            }
        } while (true);
    }

    private void filterMerekMotor() {
        System.out.print("Masukkan Merek motor: ");
        String a = io.next();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahMotor; i++) {
            if (a.equalsIgnoreCase(motor.get(i).getMerek())) {
                motor.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterMerekMobil() {
        System.out.print("Masukkan Merek Mobil: ");
        String a = io.next();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahMobil; i++) {
            if (a.equalsIgnoreCase(mobil.get(i).getMerek())) {
                mobil.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterMerekPesawat() {
        System.out.print("Masukkan Merek Pesawat: ");
        String a = io.next();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahPesawat; i++) {
            if (a.equalsIgnoreCase(pesawat.get(i).getMerek())) {
                pesawat.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterMerekHelikopter() {
        System.out.print("Masukkan Merek Helikopter: ");
        String a = io.next();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahHelikopter; i++) {
            if (a.equalsIgnoreCase(helikopter.get(i).getMerek())) {
                helikopter.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterMerekKapalFeri() {
        System.out.print("Masukkan Merek Kapal Feri: ");
        String a = io.next();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahKapalFeri; i++) {
            if (a.equalsIgnoreCase(kapalFeri.get(i).getMerek())) {
                kapalFeri.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterMerekKapalSelam() {
        System.out.print("Masukkan Merek Kapal Selam: ");
        String a = io.next();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahKapalSelam; i++) {
            if (a.equalsIgnoreCase(kapalSelam.get(i).getMerek())) {
                kapalSelam.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterUkuranMotor() {
        System.out.print("Masukkan panjang <spasi> lebar <spasi> tinggi <spasi> lebar stang motor: ");
        double a = io.nextDouble();
        double b = io.nextDouble();
        double c = io.nextDouble();
        double d = io.nextDouble();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahMotor; i++) {
            if (a == motor.get(i).getPanjang() && b == motor.get(i).getLebar() && c == motor.get(i).getTinggi()
                    && d == motor.get(i).getLebarStang()) {
                motor.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterUkuranMobil() {
        System.out.print("Masukkan panjang <spasi> lebar <spasi> tinggi <spasi> diameter stir mobil: ");
        double a = io.nextDouble();
        double b = io.nextDouble();
        double c = io.nextDouble();
        double d = io.nextDouble();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahMobil; i++) {
            if (a == mobil.get(i).getPanjang() && b == mobil.get(i).getLebar() && c == mobil.get(i).getTinggi()
                    && d == mobil.get(i).getDiameterStir()) {
                mobil.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterUkuranPesawat() {
        System.out.print("Masukkan panjang <spasi> lebar <spasi> tinggi <spasi> lebar sayap pesawat: ");
        double a = io.nextDouble();
        double b = io.nextDouble();
        double c = io.nextDouble();
        double d = io.nextDouble();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahPesawat; i++) {
            if (a == pesawat.get(i).getPanjang() && b == pesawat.get(i).getLebar() && c == pesawat.get(i).getTinggi()
                    && d == pesawat.get(i).getLebarSayap()) {
                pesawat.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterUkuranHelikopter() {
        System.out.print("Masukkan panjang <spasi> lebar <spasi> tinggi <spasi> Diameter Baling-Baling Helikopter: ");
        double a = io.nextDouble();
        double b = io.nextDouble();
        double c = io.nextDouble();
        double d = io.nextDouble();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahHelikopter; i++) {
            if (a == helikopter.get(i).getPanjang() && b == helikopter.get(i).getLebar()
                    && c == helikopter.get(i).getTinggi() && d == helikopter.get(i).getDiameterBalingBaling()) {
                helikopter.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterUkuranKapalFeri() {
        System.out.print("Masukkan panjang <spasi> lebar <spasi> tinggi Kapal Feri: ");
        double a = io.nextDouble();
        double b = io.nextDouble();
        double c = io.nextDouble();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahKapalFeri; i++) {
            if (a == kapalFeri.get(i).getPanjang() && b == kapalFeri.get(i).getLebar()
                    && c == kapalFeri.get(i).getTinggi()) {
                kapalFeri.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterUkuranKapalSelam() {
        System.out.print("Masukkan panjang <spasi> lebar <spasi> tinggi Kapal Selam: ");
        double a = io.nextDouble();
        double b = io.nextDouble();
        double c = io.nextDouble();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahKapalSelam; i++) {
            if (a == kapalSelam.get(i).getPanjang() && b == kapalSelam.get(i).getLebar()
                    && c == kapalSelam.get(i).getTinggi()) {
                kapalSelam.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterKapasitasDanRodaMotor() {
        System.out.print("Masukkan Kapasitas Penumpang <spasi> Jumlah Roda Motor: ");
        int a = io.nextInt();
        int b = io.nextInt();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahMotor; i++) {
            if (a == motor.get(i).getJumlahPenumpang() && b == motor.get(i).getJumlahRoda()) {
                motor.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterKapasitasDanRodaMobil() {
        System.out.print("Masukkan Kapasitas Penumpang <spasi> Jumlah Roda Mobil: ");
        int a = io.nextInt();
        int b = io.nextInt();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahMobil; i++) {
            if (a == mobil.get(i).getJumlahPenumpang() && b == mobil.get(i).getJumlahRoda()) {
                mobil.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterKapasitasDanMaskapaiPesawat() {
        System.out.print("Masukkan Kapasitas Penumpang <spasi> Nama Maskapai Pesawat: ");
        int a = io.nextInt();
        String b = io.next();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahPesawat; i++) {
            if (a == pesawat.get(i).getJumlahPenumpang() && b.equalsIgnoreCase(pesawat.get(i).getMaskapai())) {
                pesawat.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterKapasitasHelikopter() {
        System.out.print("Masukkan Kapasitas Penumpang Helikopter: ");
        int a = io.nextInt();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahHelikopter; i++) {
            if (a == helikopter.get(i).getJumlahPenumpang()) {
                helikopter.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterKapasitasDanAlatGerakFeri() {
        System.out.print("Masukkan Kapasitas Penumpang <spasi> Alat Gerak Kapal Feri: ");
        int a = io.nextInt();
        String b = io.next();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahKapalFeri; i++) {
            if (a == kapalFeri.get(i).getJumlahPenumpang() && b.equalsIgnoreCase(kapalFeri.get(i).getAlatPenggerak())) {
                kapalFeri.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterKapasitasDanAlatGerakSelam() {
        System.out.print("Masukkan Kapasitas Penumpang <spasi> Alat Gerak Kapal Selam: ");
        int a = io.nextInt();
        String b = io.next();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahKapalSelam; i++) {
            if (a == kapalSelam.get(i).getJumlahPenumpang()
                    && b.equalsIgnoreCase(kapalSelam.get(i).getAlatPenggerak())) {
                kapalSelam.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterDieselMobil() {
        System.out.print("Apakah Mobil Bermesin Diesel? : ");
        String a = io.next();
        boolean benar = a.equalsIgnoreCase("YA") || a.equalsIgnoreCase("YES");
        System.out.println(
                "\n========================================================================================\n");
        boolean benar1 = false;
        for (int i = 0; i < jumlahMobil; i++) {
            if (benar == mobil.get(i).isBermesinDiesel()) {
                mobil.get(i).showInformasi();
                benar1 = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar1 == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterKolamRenangDanMenyelamFeri() {
        System.out.print("Apakah Kapal Feri Memiliki Kolam Renang? : ");
        String a = io.next();
        boolean benar = a.equalsIgnoreCase("YA") || a.equalsIgnoreCase("YES");
        System.out.print("Apakah Kapal Feri Dapat Menyelam? : ");
        String b = io.next();
        boolean benar1 = b.equalsIgnoreCase("YA") || b.equalsIgnoreCase("YES");
        System.out.println(
                "\n========================================================================================\n");
        boolean benar2 = false;
        for (int i = 0; i < jumlahKapalFeri; i++) {
            if (benar == kapalFeri.get(i).isAdaKolamRenang() && benar1 == kapalFeri.get(i).isDapatMenyelam()) {
                kapalFeri.get(i).showInformasi();
                benar2 = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar2 == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterMiliterDanMenyelamSelam() {
        System.out.print("Apakah Kapal Selam Milik Militer? : ");
        String a = io.next();
        boolean benar = a.equalsIgnoreCase("YA") || a.equalsIgnoreCase("YES");
        System.out.print("Apakah Kapal Selam Dapat Menyelam? : ");
        String b = io.next();
        boolean benar1 = b.equalsIgnoreCase("YA") || b.equalsIgnoreCase("YES");
        System.out.println(
                "\n========================================================================================\n");
        boolean benar2 = false;
        for (int i = 0; i < jumlahKapalSelam; i++) {
            if (benar == kapalSelam.get(i).isMilikMiliter() && benar1 == kapalSelam.get(i).isDapatMenyelam()) {
                kapalSelam.get(i).showInformasi();
                benar2 = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar2 == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterTinggiPesawat() {
        System.out.print("Masukkan Tinggi Maksimal Pesawat : ");
        double a = io.nextDouble();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahPesawat; i++) {
            if (a == pesawat.get(i).getTinggiMaksimal()) {
                pesawat.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterTinggiHelikopter() {
        System.out.print("Masukkan Tinggi Maksimal Helikopter: ");
        double a = io.nextDouble();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahHelikopter; i++) {
            if (a == helikopter.get(i).getTinggiMaksimal()) {
                helikopter.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void filterWarnaJokMotor() {
        System.out.print("Masukkan warna jok motor: ");
        String a = io.next();
        System.out.println(
                "\n========================================================================================\n");
        boolean benar = false;
        for (int i = 0; i < jumlahMotor; i++) {
            if (a.equalsIgnoreCase(motor.get(i).getWarnaJok())) {
                motor.get(i).showInformasi();
                benar = true;
                System.out.println(
                        "\n========================================================================================\n");
            }
        }
        if (benar == false) {
            System.out.println("Hasil Tidak Ditemukan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void operasiFilterMotor() {
        if (jumlahMotor != 0) {
            System.out.println("Filter Berdasarkan: ");
            System.out.printf("1. Merek Motor %2c 3. Kapasitas Penumpang dan Jumlah Roda Motor\n", ' ');
            System.out.printf("2. Ukuran Motor %1c 4. Warna Jok Motor\n", ' ');
            System.out.print("Input: ");
            int a = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (a) {
                case 1:
                    this.filterMerekMotor();
                    break;
                case 2:
                    this.filterUkuranMotor();
                    break;
                case 3:
                    this.filterKapasitasDanRodaMotor();
                    break;
                case 4:
                    this.filterWarnaJokMotor();
                    break;
                default:
                    System.out.println("Input Tidak Valid");
                    System.out.println(
                            "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Motor, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void operasiFilterMobil() {
        if (jumlahMobil != 0) {
            System.out.println("Filter Berdasarkan: ");
            System.out.printf("1. Merek Mobil %2c 3. Kapasitas Penumpang dan Jumlah Roda Mobil\n", ' ');
            System.out.printf("2. Ukuran Mobil %1c 4. Mobil Bermesin Diesel\n", ' ');
            System.out.print("Input: ");
            int a = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (a) {
                case 1:
                    this.filterMerekMobil();
                    break;
                case 2:
                    this.filterUkuranMobil();
                    break;
                case 3:
                    this.filterKapasitasDanRodaMobil();
                    break;
                case 4:
                    this.filterDieselMobil();
                    break;
                default:
                    System.out.println("Input Tidak Valid");
                    System.out.println(
                            "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Mobil, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void operasiFilterPesawat() {
        if (jumlahPesawat != 0) {
            System.out.println("Filter Berdasarkan: ");
            System.out.printf("1. Merek Pesawat %2c 3. Kapasitas Penumpang dan Maskapai Pesawat\n", ' ');
            System.out.printf("2. Ukuran Pesawat %1c 4. Tinggi Maksimal Pesawat\n", ' ');
            System.out.print("Input: ");
            int a = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (a) {
                case 1:
                    this.filterMerekPesawat();
                    break;
                case 2:
                    this.filterUkuranPesawat();
                    break;
                case 3:
                    this.filterKapasitasDanMaskapaiPesawat();
                    break;
                case 4:
                    this.filterTinggiPesawat();
                    break;
                default:
                    System.out.println("Input Tidak Valid");
                    System.out.println(
                            "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Pesawat, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void operasiFilterHelikopter() {
        if (jumlahHelikopter != 0) {
            System.out.println("Filter Berdasarkan: ");
            System.out.printf("1. Merek Helikopter %2c 3. Kapasitas Penumpang Helikopter\n", ' ');
            System.out.printf("2. Ukuran Helikopter %1c 4. Tinggi Maksimal Helikopter\n", ' ');
            System.out.print("Input: ");
            int a = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (a) {
                case 1:
                    this.filterMerekHelikopter();
                    break;
                case 2:
                    this.filterUkuranHelikopter();
                    break;
                case 3:
                    this.filterKapasitasHelikopter();
                    break;
                case 4:
                    this.filterTinggiHelikopter();
                    break;
                default:
                    System.out.println("Input Tidak Valid");
                    System.out.println(
                            "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Helikopter, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void operasiFilterKapalFeri() {
        if (jumlahKapalFeri != 0) {
            System.out.println("Filter Berdasarkan: ");
            System.out.printf("1. Merek Kapal Feri %2c 3. Kapasitas Penumpang dan Alat Gerak Kapal Feri\n", ' ');
            System.out.printf("2. Ukuran Kapal Feri %1c 4. Fasilitas Kolam Renang dan Menyelam Kapal Feri\n", ' ');
            System.out.print("Input: ");
            int a = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (a) {
                case 1:
                    this.filterMerekKapalFeri();
                    break;
                case 2:
                    this.filterUkuranKapalFeri();
                    break;
                case 3:
                    this.filterKapasitasDanAlatGerakFeri();
                    break;
                case 4:
                    this.filterKolamRenangDanMenyelamFeri();
                    break;
                default:
                    System.out.println("Input Tidak Valid");
                    System.out.println(
                            "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Kapal Feri, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void operasiFilterKapalSelam() {
        if (jumlahKapalSelam != 0) {
            System.out.println("Filter Berdasarkan: ");
            System.out.printf("1. Merek Kapal Selam %2c 3. Kapasitas Penumpang dan Alat Gerak Kapal Selam\n", ' ');
            System.out.printf("2. Ukuran Kapal Selam %1c 4. Fasilitas Menyelam dan Kepemilikan Kapal Selam\n", ' ');
            System.out.print("Input: ");
            int a = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (a) {
                case 1:
                    this.filterMerekKapalSelam();
                    break;
                case 2:
                    this.filterUkuranKapalSelam();
                    break;
                case 3:
                    this.filterKapasitasDanAlatGerakSelam();
                    break;
                case 4:
                    this.filterMiliterDanMenyelamSelam();
                    break;
                default:
                    System.out.println("Input Tidak Valid");
                    System.out.println(
                            "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Kapal Selam, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private static int getJumlahMotor() {
        return Data.jumlahMotor;
    }

    private static int getJumlahMobil() {
        return Data.jumlahMobil;
    }

    private static int getJumlahPesawat() {
        return Data.jumlahPesawat;
    }

    private static int getJumlahHelikopter() {
        return Data.jumlahHelikopter;
    }

    private static int getJumlahKapalFeri() {
        return Data.jumlahKapalFeri;
    }

    private static int getJumlahKapalSelam() {
        return Data.jumlahKapalSelam;
    }
}
