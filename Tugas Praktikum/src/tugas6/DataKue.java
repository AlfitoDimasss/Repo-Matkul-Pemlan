/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6;

import java.util.*;

/**
 *
 * @author Illuminare
 */

/*
 * Nama : Alfito Dimas Prasetyo
 * NIM : 205150401111057
 */

public class DataKue {

    private final Scanner io = new Scanner(System.in);
    private final ArrayList<Kue> kue;
    private static int jumlahKue = 5;
    private static int jumlahKueJadi = 3;
    private static int jumlahKuePesanan = 2;

    public DataKue() {
        this.kue = new ArrayList<>();
        Kue objekKue1 = new KueJadi(1, "Nastar", 10000);
        kue.add(objekKue1);
        Kue objekKue2 = new KueJadi(1, "Putri Salju", 12000);
        kue.add(objekKue2);
        Kue objekKue3 = new KueJadi(1, "Kastengel", 15000);
        kue.add(objekKue3);
        Kue objekKue4 = new KuePesanan(1, "Bolu Pisang", 20000);
        kue.add(objekKue4);
        Kue objekKue5 = new KuePesanan(1, "Brownies", 25000);
        kue.add(objekKue5);
    }

    public void operasi() {
        OUTER: do {
            System.out.println("Silahkan Pilih Menu");
            System.out.println("1. Create Kue\t\t 3. Edit Kue");
            System.out.println("2. Read Kue\t\t 4. Delete Kue");
            System.out.println("0. Exit");
            System.out.print("Input: ");
            int i = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (i) {
                case 1:
                    this.createKue();
                    break;
                case 2:
                    this.readKue();
                    break;
                case 3:
                    System.out.println("EDIT KUE");
                    this.editKue();
                    break;
                case 4:
                    this.deleteKue();
                    break;
                case 0:
                    break OUTER;
            }
        } while (true);
    }

    private void createKueJadi() {
        boolean lanjut = true;
        io.nextLine();
        System.out.print("Input Nama Kue\t\t\t: ");
        String nama = io.nextLine();
        for (int i = 0; i < kue.size(); i++) {
            if (nama.equalsIgnoreCase(kue.get(i).getNama())) {
                System.out.println(
                        "\n========================================================================================\n");
                System.out.println("Kue Sudah Ada, Silahkan Gunakan Fitur Edit Jika Ingin Mengubah Kue Tersebut");
                System.out.println(
                        "\n========================================================================================\n");
                lanjut = false;
                break;
            }
        }
        if (lanjut == true) {
            System.out.print("Input Harga Kue\t\t: ");
            double harga = io.nextDouble();
            System.out.print("Input Jumlah Kue (Kotak)\t: ");
            double jumlah = io.nextDouble();
            Kue objekKue = new KueJadi(jumlah, nama, harga);
            kue.add(objekKue);
            jumlahKue++;
            jumlahKueJadi++;
            System.out.println(
                    "\n========================================================================================\n");
            System.out.println("Data Kue Berhasil Dibuat dan Diinputkan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void createKuePesanan() {
        boolean lanjut = true;
        io.nextLine();
        System.out.print("Input Nama Kue\t\t: ");
        String nama = io.nextLine();
        for (int i = 0; i < kue.size(); i++) {
            if (nama.equalsIgnoreCase(kue.get(i).getNama())) {
                System.out.println(
                        "\n========================================================================================\n");
                System.out.println("Kue Sudah Ada, Silahkan Gunakan Fitur Edit Jika Ingin Mengubah Kue Tersebut");
                System.out.println(
                        "\n========================================================================================\n");
                lanjut = false;
                break;
            }
        }
        if (lanjut == true) {
            System.out.print("Input Harga Kue\t: ");
            double harga = io.nextDouble();
            System.out.print("Input Berat Kue (Kg)\t: ");
            double berat = io.nextDouble();
            Kue objekKue = new KuePesanan(berat, nama, harga);
            kue.add(objekKue);
            jumlahKue++;
            jumlahKuePesanan++;
            System.out.println(
                    "\n========================================================================================\n");
            System.out.println("Data Kue Berhasil Dibuat dan Diinputkan");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void readNamadanHargaKue() {
        if (jumlahKue != 0) {
            for (int i = 0; i < kue.size(); i++) {
                if (i != kue.size() - 1) {
                    System.out.println(kue.get(i).toString());
                    System.out.println("---------------------------------------------------------------------------");
                } else {
                    System.out.println(kue.get(i).toString());
                }
            }
            System.out.println(
                    "\n========================================================================================\n");
        } else {
            System.out.println("Tidak Ada Data Kue, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void readTotalHargaKue() {
        if (jumlahKue != 0) {
            double total = 0;
            for (int i = 0; i < kue.size(); i++) {
                System.out.println(kue.get(i).toString());
                System.out.println("---------------------------------------------------------------------------");
            }
            for (int i = 0; i < kue.size(); i++) {
                double b = kue.get(i).hitungHarga();
                total += b;
            }
            System.out.print("\n");
            System.out.printf(Locale.ITALY, "Total Harga Semua Kue Rp %,.2f\n", total);
            System.out.println(
                    "\n========================================================================================\n");
        } else {
            System.out.println("Tidak Ada Data Kue, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void readTotalHargaBeratPesanan() {
        if (jumlahKuePesanan != 0) {
            double total = 0;
            double berat = 0;
            for (int i = 0; i < kue.size(); i++) {
                if (kue.get(i) instanceof KuePesanan) {
                    System.out.println(kue.get(i).toString());
                    System.out.println("---------------------------------------------------------------------------");
                    double b = kue.get(i).hitungHarga();
                    double c = ((KuePesanan) kue.get(i)).getBerat();
                    total += b;
                    berat += c;
                }
            }
            System.out.print("\n");
            System.out.printf(Locale.ITALY, "Total Harga Semua Kue Pesanan Rp %,.2f\n", total);
            System.out.printf("Total Berat Semua Kue Pesanan %.2f Kg\n", berat);
            System.out.println(
                    "\n========================================================================================\n");
        } else {
            System.out.println("Tidak Ada Data Kue Pesanan, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void readTotalHargaJumlahJadi() {
        if (jumlahKueJadi != 0) {
            double total = 0;
            double jumlah = 0;
            for (int i = 0; i < kue.size(); i++) {
                if (kue.get(i) instanceof KueJadi) {
                    System.out.println(kue.get(i).toString());
                    System.out.println("---------------------------------------------------------------------------");
                    double b = kue.get(i).hitungHarga();
                    double c = ((KueJadi) kue.get(i)).getJumlah();
                    total += b;
                    jumlah += c;
                }
            }
            System.out.print("\n");
            System.out.printf(Locale.ITALY, "Total Harga Semua Kue Jadi Adalah Rp %,.2f\n", total);
            System.out.printf("Total Jumlah Semua Kue Pesanan Adalah %.1f Kotak\n", jumlah);
            System.out.println(
                    "\n========================================================================================\n");
        } else {
            System.out.println("Tidak Ada Data Kue Jadi, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void readHargaTerbesarTerkecil() {
        if (jumlahKue != 0) {
            double max = Integer.MIN_VALUE;
            String kueMax = "";
            double min = Integer.MAX_VALUE;
            String kueMin = "";
            for (int i = 0; i < kue.size(); i++) {
                System.out.println(kue.get(i).toString());
                System.out.println("---------------------------------------------------------------------------");
            }
            for (int i = 0; i < kue.size(); i++) {
                if (kue.get(i).hitungHarga() > max) {
                    max = kue.get(i).hitungHarga();
                    kueMax = kue.get(i).getNama();
                }
                if (kue.get(i).hitungHarga() < min) {
                    min = kue.get(i).hitungHarga();
                    kueMin = kue.get(i).getNama();
                }
            }
            System.out.print("\n");
            System.out.printf(Locale.ITALY, "Kue %s Memiliki Harga Terbesar Dengan Total Harga Rp%,.2f\n", kueMax, max);
            System.out.printf(Locale.ITALY, "Kue %s Memiliki Harga Terkecil Dengan Total Harga Rp%,.2f\n", kueMin, min);
            System.out.println(
                    "\n========================================================================================\n");
        } else {
            System.out.println("Tidak Ada Data Kue, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void editKue() {
        if (jumlahKue != 0) {
            io.nextLine();
            System.out.print("Input Kue Yang Akan Diedit\t: ");
            String a = io.nextLine();
            for (int i = 0; i < kue.size(); i++) {
                if (a.equalsIgnoreCase(kue.get(i).getNama()) && kue.get(i) instanceof KueJadi) {
                    System.out.print("Input Nama Kue Baru\t\t: ");
                    String nama = io.nextLine();
                    System.out.print("Input Harga Kue\t\t: ");
                    double harga = io.nextDouble();
                    System.out.print("Input Jumlah Kue (Kotak)\t: ");
                    double jumlah = io.nextDouble();
                    Kue objekKue = new KueJadi(jumlah, nama, harga);
                    kue.set(i, objekKue);
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Kue Berhasil Diedit");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                } else if (a.equalsIgnoreCase(kue.get(i).getNama()) && kue.get(i) instanceof KuePesanan) {
                    System.out.print("Input Nama Kue Baru\t\t: ");
                    String nama = io.nextLine();
                    System.out.print("Input Harga Kue\t\t: ");
                    double harga = io.nextDouble();
                    System.out.print("Input Berat Kue (Kg)\t\t: ");
                    double berat = io.nextDouble();
                    Kue objekKue = new KuePesanan(berat, nama, harga);
                    kue.set(i, objekKue);
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Kue Berhasil Diedit");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == kue.size() - 1 && !(a.equalsIgnoreCase(kue.get(i).getNama()))) {
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Nama Kue Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Kue, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deleteKueTertentu() {
        if (jumlahKue != 0) {
            io.nextLine();
            System.out.print("Input Nama Kue Yang Akan Dihapus: ");
            String a = io.nextLine();
            for (int i = 0; i < kue.size(); i++) {
                if (a.equalsIgnoreCase(kue.get(i).getNama()) && kue.get(i) instanceof KueJadi) {
                    kue.remove(i);
                    jumlahKue--;
                    jumlahKueJadi--;
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Kue Berhasil Dihapus");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                } else if (a.equalsIgnoreCase(kue.get(i).getNama()) && kue.get(i) instanceof KuePesanan) {
                    kue.remove(i);
                    jumlahKue--;
                    jumlahKuePesanan--;
                    System.out.println(
                            "\n========================================================================================\n");
                    System.out.println("Data Kue Berhasil Dihapus");
                    System.out.println(
                            "\n========================================================================================\n");
                    break;
                }
                if (i == kue.size() - 1 && !(a.equalsIgnoreCase(kue.get(i).getNama()))) {
                    System.out.println("Nama Kue Tidak Ditemukan");
                    System.out.println(
                            "\n========================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Kue, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deleteSemuaKue() {
        if (jumlahKue != 0) {
            jumlahKue -= jumlahKue;
            jumlahKueJadi -= jumlahKueJadi;
            jumlahKuePesanan -= jumlahKuePesanan;
            kue.clear();
            System.out.println(
                    "\n========================================================================================\n");
            System.out.println("Semua Data Kue Berhasil Dihapus");
            System.out.println(
                    "\n========================================================================================\n");
        } else {
            System.out.println("Tidak Ada Data Kue, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deleteSemuaKueJadi() {
        if (jumlahKue != 0 && jumlahKueJadi != 0) {
            do {
                for (int i = 0; i < kue.size(); i++) {
                    if (kue.get(i) instanceof KueJadi) {
                        kue.remove(i);
                        jumlahKue--;
                        jumlahKueJadi--;
                        break;
                    }
                }
            } while (jumlahKueJadi != 0);
            System.out.println("Semua Data Kue Jadi Berhasil Dihapus");
            System.out.println(
                    "\n========================================================================================\n");
        } else {
            System.out.println("Tidak Ada Data Kue Jadi, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deleteSemuaKuePesanan() {
        if (jumlahKue != 0 && jumlahKuePesanan != 0) {
            do {
                for (int i = 0; i < kue.size(); i++) {
                    if (kue.get(i) instanceof KuePesanan) {
                        kue.remove(i);
                        jumlahKue--;
                        jumlahKuePesanan--;
                        break;
                    }
                }
            } while (jumlahKuePesanan != 0);
            System.out.println("Semua Data Kue Pesanan Berhasil Dihapus");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void createKue() {
        OUTER: do {
            System.out.println("CREATE KUE");
            System.out.println("1. Create Kue Jadi\t 2. Create Kue Pesanan\t\t 0.Exit");
            System.out.print("Input: ");
            int i = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (i) {
                case 1:
                    this.createKueJadi();
                    break;
                case 2:
                    this.createKuePesanan();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid");
            }
        } while (true);
    }

    private void readKue() {
        OUTER: do {
            System.out.println("READ KUE");
            System.out.println("1. Read Nama dan Harga Semua Kue\t\t\t 4. Read Total Harga dan Total Jumlah Kue Jadi");
            System.out.println("2. Read Total Harga Semua Kue\t\t\t\t 5. Read Harga Terbesar dan Terkecil Semua Kue");
            System.out.println("3. Read Total Harga dan Total Berat Kue Pesanan\t 0. Exit");
            System.out.print("Input: ");
            int i = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (i) {
                case 1:
                    this.readNamadanHargaKue();
                    break;
                case 2:
                    this.readTotalHargaKue();
                    break;
                case 3:
                    this.readTotalHargaBeratPesanan();
                    break;
                case 4:
                    this.readTotalHargaJumlahJadi();
                    break;
                case 5:
                    this.readHargaTerbesarTerkecil();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid");
            }
        } while (true);
    }

    private void deleteKue() {
        OUTER: do {
            System.out.println("DELETE KUE");
            System.out.println("1. Delete Semua Kue\t\t 3. Delete Semua Kue Pesanan");
            System.out.println("2. Delete Semua Kue Jadi\t 4. Delete Kue Tertentu");
            System.out.println("0. Exit");
            System.out.print("Input: ");
            int i = io.nextInt();
            System.out.println(
                    "\n========================================================================================\n");
            switch (i) {
                case 1:
                    this.deleteSemuaKue();
                    break;
                case 2:
                    this.deleteSemuaKueJadi();
                    break;
                case 3:
                    this.deleteSemuaKuePesanan();
                    break;
                case 4:
                    this.deleteKueTertentu();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid");
            }
        } while (true);
    }

}
