/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveCoding2;

import java.util.Scanner;

/**
 *
 * @author Illuminare
 */

/*
 * NAMA : ALFITO DIMAS PRASETYO
 * NIM : 205150401111057
 */

public class DataKendaraan {

    private final Scanner io = new Scanner(System.in);
    private Motor[] motor;
    private Mobil[] mobil;
    private KapalFeri[] kapalFeri;
    private KapalSelam[] kapalSelam;
    private Pesawat[] pesawat;
    private Helikopter[] helikopter;
    private static int jumlahMotor = 0;
    private static int jumlahMobil = 0;
    private static int jumlahKapalFeri = 0;
    private static int jumlahKapalSelam = 0;
    private static int jumlahPesawat = 0;
    private static int jumlahHelikopter = 0;
    private boolean benar, benar1;

    public DataKendaraan() {
        motor = new Motor[Byte.MAX_VALUE];
        mobil = new Mobil[Byte.MAX_VALUE];
        kapalFeri = new KapalFeri[Byte.MAX_VALUE];
        kapalSelam = new KapalSelam[Byte.MAX_VALUE];
        pesawat = new Pesawat[Byte.MAX_VALUE];
        helikopter = new Helikopter[Byte.MAX_VALUE];
    }

    public void operasi() {
        OUTER: do {
            System.out.println("List Command: ");
            System.out.printf("1. Create Data Motor %8c 7. Jalankan Motor %7c 13. Tampilkan Data Motor\n", ' ', ' ');
            System.out.printf("2. Create Data Mobil %8c 8. Jalankan Mobil %7c 14. Tampilkan Data Mobil\n", ' ', ' ');
            System.out.printf("3. Create Data Pesawat %6c 9. Jalankan Pesawat %5c 15. Tampilkan Data Pesawat\n", ' ',
                    ' ');
            System.out.printf(
                    "4. Create Data Helikopter %2c 10. Jalankan Helikopter %2c 16. Tampilkan Data Helikopter\n", ' ',
                    ' ');
            System.out.printf(
                    "5. Create Data Kapal Feri %2c 11. Jalankan Kapal Feri %2c 17. Tampilkan Data Kapal Feri\n", ' ',
                    ' ');
            System.out.printf(
                    "6. Create Data Kapal Selam %c 12. Jalankan Kapal Selam %c 18. Tampilkan Data Kapal Selam\n", ' ',
                    ' ');
            System.out.print("Input: ");
            int i = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (i) {
                case 1:
                    this.createMotor();
                    break;
                case 2:
                    this.createMobil();
                    break;
                case 3:
                    this.createPesawat();
                    break;
                case 4:
                    this.createHelikopter();
                    break;
                case 5:
                    this.createKapalFeri();
                    break;
                case 6:
                    this.createKapalSelam();
                    break;
                case 7:
                    this.jalankanMotor();
                    break;
                case 8:
                    this.jalankanMobil();
                    break;
                case 9:
                    this.jalankanPesawat();
                    break;
                case 10:
                    this.jalankanHelikopter();
                    break;
                case 11:
                    this.jalankanKapalFeri();
                    break;
                case 12:
                    this.jalankanKapalSelam();
                    break;
                case 13:
                    this.tampilkanMotor();
                    break;
                case 14:
                    this.tampilkanMobil();
                    break;
                case 15:
                    this.tampilkanPesawat();
                    break;
                case 16:
                    this.tampilkanHelikopter();
                    break;
                case 17:
                    this.tampilkanKapalFeri();
                    break;
                case 18:
                    this.tampilkanKapalSelam();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid");
                    break;
            }
        } while (true);

    }

    public void createMotor() {
        System.out.print("Input Merek Motor\t\t\t: ");
        String merek = io.next();
        System.out.print("Input Panjang Motor\t\t\t: ");
        double panjang = io.nextDouble();
        System.out.print("Input Lebar Motor\t\t\t: ");
        double lebar = io.nextDouble();
        System.out.print("Input Tinggi Motor\t\t\t: ");
        double tinggi = io.nextDouble();
        System.out.print("Input Kapasitas Penumpang Motor\t: ");
        int jumlah = io.nextInt();
        System.out.print("Input Jumlah Roda Motor\t\t: ");
        int roda = io.nextInt();
        System.out.print("Input Lebar Stang Motor\t\t: ");
        double stang = io.nextDouble();
        System.out.print("Input Warna Jok Motor\t\t\t: ");
        String warna = io.next();
        motor[jumlahMotor] = new Motor(panjang, lebar, tinggi, merek, jumlah, roda, stang, warna);
        jumlahMotor++;
        System.out.println("Data Motor Berhasil Dibuat dan Diinputkan");
        System.out.println(
                "\n========================================================================================\n");
    }

    public void createMobil() {
        System.out.print("Input Merek Mobil\t\t\t: ");
        String merek = io.next();
        System.out.print("Input Panjang Mobil\t\t\t: ");
        double panjang = io.nextDouble();
        System.out.print("Input Lebar Mobil\t\t\t: ");
        double lebar = io.nextDouble();
        System.out.print("Input Tinggi Mobil\t\t\t: ");
        double tinggi = io.nextDouble();
        System.out.print("Input Kapasitas Penumpang Mobil\t: ");
        int jumlah = io.nextInt();
        System.out.print("Input Jumlah Roda Mobil\t\t: ");
        int roda = io.nextInt();
        System.out.print("Input Diameter Stir Mobil\t\t: ");
        double stir = io.nextDouble();
        System.out.print("Apakah Bermesin Diesel?\t\t: ");
        String diesel = io.next();
        this.benar = diesel.equalsIgnoreCase("YA") || diesel.equalsIgnoreCase("YES");
        mobil[jumlahMobil] = new Mobil(panjang, lebar, tinggi, merek, jumlah, roda, stir, benar);
        jumlahMobil++;
        System.out.println("Data Mobil Berhasil Dibuat dan Diinputkan");
        System.out.println(
                "\n========================================================================================\n");
    }

    public void createPesawat() {
        System.out.print("Input Merek Pesawat\t\t\t: ");
        String merek = io.next();
        System.out.print("Input Panjang Pesawat\t\t\t: ");
        double panjang = io.nextDouble();
        System.out.print("Input Lebar Pesawat\t\t\t: ");
        double lebar = io.nextDouble();
        System.out.print("Input Tinggi Pesawat\t\t\t: ");
        double tinggi = io.nextDouble();
        System.out.print("Input Kapasitas Penumpang Pesawat\t: ");
        int jumlah = io.nextInt();
        System.out.print("Input Tinggi Maksimal Pesawat\t\t: ");
        double tinggiMaks = io.nextDouble();
        System.out.print("Input Lebar Sayap Pesawat\t\t: ");
        double sayap = io.nextDouble();
        System.out.print("Input Maskapai Pesawat\t\t\t: ");
        String maskapai = io.next();
        pesawat[jumlahPesawat] = new Pesawat(panjang, lebar, tinggi, merek, jumlah, tinggiMaks, sayap, maskapai);
        jumlahPesawat++;
        System.out.println("Data Pesawat Berhasil Dibuat dan Diinputkan");
        System.out.println(
                "\n========================================================================================\n");
    }

    public void createHelikopter() {
        System.out.print("Input Merek Helikopter\t\t\t\t: ");
        String merek = io.next();
        System.out.print("Input Panjang Helikopter\t\t\t: ");
        double panjang = io.nextDouble();
        System.out.print("Input Lebar Helikopter\t\t\t\t: ");
        double lebar = io.nextDouble();
        System.out.print("Input Tinggi Helikopter\t\t\t: ");
        double tinggi = io.nextDouble();
        System.out.print("Input Kapasitas Penumpang Helikopter\t\t: ");
        int jumlah = io.nextInt();
        System.out.print("Input Tinggi Maksimal Helikopter\t\t: ");
        double tinggiMaks = io.nextDouble();
        System.out.print("Input Diameter Baling-Baling Helikopter\t: ");
        double baling = io.nextDouble();
        helikopter[jumlahHelikopter] = new Helikopter(panjang, lebar, tinggi, merek, jumlah, tinggiMaks, baling);
        jumlahHelikopter++;
        System.out.println("Data Helikopter Berhasil Dibuat dan Diinputkan");
        System.out.println(
                "\n========================================================================================\n");
    }

    public void createKapalFeri() {
        System.out.print("Input Merek Kapal Feri\t\t\t: ");
        String merek = io.next();
        System.out.print("Input Panjang Kapal Feri\t\t: ");
        double panjang = io.nextDouble();
        System.out.print("Input Lebar Kapal Feri\t\t\t: ");
        double lebar = io.nextDouble();
        System.out.print("Input Tinggi Kapal Feri\t\t: ");
        double tinggi = io.nextDouble();
        System.out.print("Input Kapasitas Penumpang Kapal Feri\t: ");
        int jumlah = io.nextInt();
        System.out.print("Input Alat Penggerak Kapal Feri\t: ");
        String alat = io.next();
        System.out.print("Apakah Dapat Menyelam?\t\t\t: ");
        String selam = io.next();
        this.benar = selam.equalsIgnoreCase("YA") || selam.equalsIgnoreCase("YES");
        System.out.print("Apakah Ada Kolam Renang?\t\t: ");
        String renang = io.next();
        this.benar1 = renang.equalsIgnoreCase("YA") || renang.equalsIgnoreCase("YES");
        kapalFeri[jumlahKapalFeri] = new KapalFeri(panjang, lebar, tinggi, merek, jumlah, alat, benar, benar1);
        jumlahKapalFeri++;
        System.out.println("Data Kapal Feri Berhasil Dibuat dan Diinputkan");
        System.out.println(
                "\n========================================================================================\n");
    }

    public void createKapalSelam() {
        System.out.print("Input Merek Kapal Selam\t\t\t: ");
        String merek = io.next();
        System.out.print("Input Panjang Kapal Selam\t\t\t: ");
        double panjang = io.nextDouble();
        System.out.print("Input Lebar Kapal Selam\t\t\t: ");
        double lebar = io.nextDouble();
        System.out.print("Input Tinggi Kapal Selam\t\t\t: ");
        double tinggi = io.nextDouble();
        System.out.print("Input Kapasitas Penumpang Kapal Selam\t\t: ");
        int jumlah = io.nextInt();
        System.out.print("Input Alat Penggerak Kapal Selam\t\t: ");
        String alat = io.next();
        System.out.print("Apakah Dapat Menyelam?\t\t\t\t: ");
        String selam = io.next();
        this.benar = selam.equalsIgnoreCase("YA") || selam.equalsIgnoreCase("YES");
        System.out.print("Apakah Milik Militer?\t\t\t\t: ");
        String militer = io.next();
        this.benar1 = militer.equalsIgnoreCase("YA") || militer.equalsIgnoreCase("YES");
        kapalSelam[jumlahKapalSelam] = new KapalSelam(panjang, lebar, tinggi, merek, jumlah, alat, benar, benar1);
        jumlahKapalSelam++;
        System.out.println("Data Kapal Selam Berhasil Dibuat dan Diinputkan");
        System.out.println(
                "\n========================================================================================\n");
    }

    public void tampilkanMotor() {
        if (jumlahMotor != 0) {
            for (int i = 0; i < jumlahMotor; i++) {
                System.out.println("Motor Ke - " + (i + 1));
                motor[i].showInformasi();
                System.out.println(
                        "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Motor, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    public void tampilkanMobil() {
        if (jumlahMobil != 0) {
            for (int i = 0; i < jumlahMobil; i++) {
                System.out.println("Mobil Ke - " + (i + 1));
                mobil[i].showInformasi();
                System.out.println(
                        "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Mobil, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    public void tampilkanPesawat() {
        if (jumlahPesawat != 0) {
            for (int i = 0; i < jumlahPesawat; i++) {
                System.out.println("Pesawat Ke - " + (i + 1));
                pesawat[i].showInformasi();
                System.out.println(
                        "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Pesawat, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    public void tampilkanHelikopter() {
        if (jumlahHelikopter != 0) {
            for (int i = 0; i < jumlahHelikopter; i++) {
                System.out.println("Helikopter Ke - " + (i + 1));
                helikopter[i].showInformasi();
                System.out.println(
                        "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Helikopter, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    public void tampilkanKapalFeri() {
        if (jumlahKapalFeri != 0) {
            for (int i = 0; i < jumlahKapalFeri; i++) {
                System.out.println("Kapal Feri Ke - " + (i + 1));
                kapalFeri[i].showInformasi();
                System.out.println(
                        "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Kapal Feri, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    public void tampilkanKapalSelam() {
        if (jumlahKapalSelam != 0) {
            for (int i = 0; i < jumlahKapalSelam; i++) {
                System.out.println("Kapal Selam Ke - " + (i + 1));
                kapalSelam[i].showInformasi();
                System.out.println(
                        "\n========================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Kapal Selam, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    public void jalankanMotor() {
        System.out.print("Input index motor yang ingin dijalankan: ");
        int x = io.nextInt();
        if (x != 0) {
            motor[x - 1].Berjalan();
            System.out.println("Motor Berhasil Dijalankan");
            System.out.println(
                    "\n========================================================================================\n");
        } else {
            System.out.println("Index dimulai dari 1");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    public void jalankanMobil() {
        System.out.print("Input index mobil yang ingin dijalankan: ");
        int x = io.nextInt();
        if (x != 0) {
            mobil[x - 1].Berjalan();
            System.out.println("Mobil Berhasil Dijalankan");
            System.out.println(
                    "\n========================================================================================\n");
        } else {
            System.out.println("Index dimulai dari 1");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    public void jalankanPesawat() {
        System.out.print("Input index pesawat yang ingin dijalankan: ");
        int x = io.nextInt();
        if (x != 0) {
            pesawat[x - 1].Berjalan();
            System.out.println("Pesawat Berhasil Dijalankan");
            System.out.println(
                    "\n========================================================================================\n");
        } else {
            System.out.println("Index dimulai dari 1");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    public void jalankanHelikopter() {
        System.out.print("Input index helikopter yang ingin dijalankan: ");
        int x = io.nextInt();
        if (x != 0) {
            helikopter[x - 1].Berjalan();
            System.out.println("Helikopter Berhasil Dijalankan");
            System.out.println(
                    "\n========================================================================================\n");
        } else {
            System.out.println("Index dimulai dari 1");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    public void jalankanKapalFeri() {
        System.out.print("Input index kapal feri yang ingin dijalankan: ");
        int x = io.nextInt();
        if (x != 0) {
            kapalFeri[x - 1].Berjalan();
            System.out.println("Kapal Feri Berhasil Dijalankan");
            System.out.println(
                    "\n========================================================================================\n");
        } else {
            System.out.println("Index dimulai dari 1");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    public void jalankanKapalSelam() {
        System.out.print("Input index kapal selam yang ingin dijalankan: ");
        int x = io.nextInt();
        if (x != 0) {
            kapalSelam[x - 1].Berjalan();
            System.out.println("Kapal Selam Berhasil Dijalankan");
            System.out.println(
                    "\n========================================================================================\n");
        } else {
            System.out.println("Index dimulai dari 1");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

}
