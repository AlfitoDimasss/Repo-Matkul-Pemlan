/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas9;

import java.util.*;

/**
 *
 * @author Illuminare
 */

/*
 * Nama : Alfito Dimas Prasetyo
 * NIM : 205150401111057
 */

/* Bagian Ini Merupakan Pembuatan Class Turunan Exception */
class InvalidIdException extends Exception {
    public InvalidIdException(String message) {
        super(message);
    }
}

class SameIdException extends Exception {
    public SameIdException(String message) {
        super(message);
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

/* Bagian Class DataSiswa */
public class DataSiswa {

    /* Deklarasi Variabel */
    private static ArrayList<Siswa> siswa;
    private static int jumlahSiswa;
    private final Scanner io = new Scanner(System.in);

    /* Constructor */
    public DataSiswa() {
        siswa = new ArrayList<>();
        jumlahSiswa = 0;
    }

    /* Bagian Untuk Melakukan CRUD Data Siswa */
    public void operasiData() {
        int a;
        OUTER: do {
            a = 0;
            System.out.println("Silahkan Pilih Menu");
            System.out.println("1. Create Data Siswa\t 3. Update Data Siswa");
            System.out.println("2. Read Data Siswa\t 4. Delete Data Siswa");
            System.out.println("5. Exit");
            try {
                System.out.print("Input: ");
                a = io.nextInt();
                System.out.println(
                        "\n=====================================================================================\n");
            } catch (Exception e) {
                System.out.println(
                        "\n=====================================================================================\n");
                io.next();
            }
            switch (a) {
                case 1:
                    this.createSiswa();
                    break;
                case 2:
                    this.operasiRead();
                    break;
                case 3:
                    this.updateSiswa();
                    break;
                case 4:
                    this.operasiDelete();
                    break;
                case 5:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid!");
                    System.out.println(
                            "\n=====================================================================================\n");
            }
        } while (true);
    }

    /* Ini Merupakan SubMenu Dari Menu Read */
    private void operasiRead() {
        int a = 0;
        OUTER: do {
            System.out.println("READ DATA SISWA");
            System.out.println("1. Read Semua Data Siswa\t 2. Read Data Siswa Tertentu");
            System.out.println("3. Exit");
            try {
                System.out.print("Input: ");
                a = io.nextInt();
                System.out.println(
                        "\n=====================================================================================\n");
            } catch (Exception e) {
                System.out.println(
                        "\n=====================================================================================\n");
                io.next();
            }
            switch (a) {
                case 1:
                    this.readSemuaSiswa();
                    break;
                case 2:
                    this.readSiswaTertentu();
                    break;
                case 3:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid!");
                    System.out.println(
                            "\n=====================================================================================\n");
            }
        } while (true);
    }

    /* Ini Merupakan SubMenu Dari Menu Delete */
    private void operasiDelete() {
        int a = 0;
        OUTER: do {
            System.out.println("DELETE DATA SISWA");
            System.out.println("1. Delete Semua Data Siswa\t 2. Delete Data Siswa Tertentu");
            System.out.println("3. Exit");
            try {
                System.out.print("Input: ");
                a = io.nextInt();
                System.out.println(
                        "\n=====================================================================================\n");
            } catch (Exception e) {
                System.out.println(
                        "\n=====================================================================================\n");
                io.next();
            }
            switch (a) {
                case 1:
                    this.deleteSemuaSiswa();
                    break;
                case 2:
                    this.deleteSiswaTertentu();
                    break;
                case 3:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid!");
                    System.out.println(
                            "\n=====================================================================================\n");
            }
        } while (true);
    }

    /* Ini Merupakan Menu Create Data Siswa */
    private void createSiswa() {
        System.out.println("CREATE DATA SISWA");
        int a = inputNomorIdSiswa();
        io.nextLine();
        String s = inputNamaSiswa();
        Siswa siswas = new Siswa(a, s);
        siswa.add(siswas);
        jumlahSiswa++;
        System.out.println("\n=====================================================================================\n");
        System.out.println("Data Siswa Berhasil Dibuat dan Disimpan");
        System.out.println("\n=====================================================================================\n");
    }

    /* Ini Merupakan Menu Update Data Siswa */
    private void updateSiswa() {
        if (jumlahSiswa != 0) {
            System.out.println("UPDATE DATA SISWA");
            System.out.print("Masukkan Nomor ID Siswa Yang Akan Diupdate: ");
            int a = this.cariId();
            if (a == 0) {
                System.out.println(
                        "\n=====================================================================================\n");
                System.out.println("Nomor ID Siswa Tidak Ditemukan");
                System.out.println(
                        "\n=====================================================================================\n");
            } else {
                for (int i = 0; i < jumlahSiswa; i++) {
                    if (a == siswa.get(i).getId()) {
                        siswa.get(i).setId(0);
                        System.out.println(
                                "\n=====================================================================================\n");
                        System.out.println("Silahkan Mengisi Kembali Data Siswa Untuk Melakukan Update");
                        int b = inputNomorIdSiswa();
                        io.nextLine();
                        String s = inputNamaSiswa();
                        Siswa siswas = new Siswa(b, s);
                        siswa.set(i, siswas);
                        System.out.println(
                                "\n=====================================================================================\n");
                        System.out.println("Data Siswa Berhasil Diupdate");
                        System.out.println(
                                "\n=====================================================================================\n");
                        break;
                    }
                    if ((i == jumlahSiswa - 1) && (i != siswa.get(i).getId())) {
                        System.out.println(
                                "\n=====================================================================================\n");
                        System.out.println("Nomor ID Siswa Tidak Ditemukan");
                        System.out.println(
                                "\n=====================================================================================\n");
                    }
                }
            }
        } else {
            System.out.println("Tidak Ada Data Siswa, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n=====================================================================================\n");
        }
    }

    /* Ini Merupakan Menu Read Data Siswa Tertentu */
    private void readSiswaTertentu() {
        if (jumlahSiswa != 0) {
            System.out.println("READ DATA SISWA");
            System.out.print("Masukkan Nomor ID Siswa: ");
            int a = this.cariId();
            if (a == 0) {
                System.out.println(
                        "\n=====================================================================================\n");
                System.out.println("Nomor ID Siswa Tidak Ditemukan");
                System.out.println(
                        "\n=====================================================================================\n");
            } else {
                for (int i = 0; i < jumlahSiswa; i++) {
                    if (a == siswa.get(i).getId()) {
                        System.out.println(
                                "\n=====================================================================================\n");
                        siswa.get(i).showInfo();
                        System.out.println(
                                "\n=====================================================================================\n");
                        break;
                    }
                    if ((i == jumlahSiswa - 1) && (i != siswa.get(i).getId())) {
                        System.out.println(
                                "\n=====================================================================================\n");
                        System.out.println("Nomor ID Siswa Tidak Ditemukan");
                        System.out.println(
                                "\n=====================================================================================\n");
                    }
                }
            }
        } else {
            System.out.println("Tidak Ada Data Siswa, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n=====================================================================================\n");
        }
    }

    /* Ini Merupakan Menu Read Seluruh Data Siswa */
    private void readSemuaSiswa() {
        if (jumlahSiswa != 0) {
            for (int i = 0; i < jumlahSiswa; i++) {
                // System.out.println("\n=====================================================================================\n");
                System.out.println("Siswa Ke-" + (i + 1));
                siswa.get(i).showInfo();
                System.out.println(
                        "\n=====================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Siswa, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n=====================================================================================\n");
        }
    }

    /* Ini Merupakan Menu Delete Data Siswa Tertentu */
    private void deleteSiswaTertentu() {
        System.out.println("DELETE DATA SISWA");
        if (jumlahSiswa != 0) {
            System.out.print("Masukkan Nomor ID Siswa: ");
            int a = this.cariId();
            if (a == 0) {
                System.out.println(
                        "\n=====================================================================================\n");
                System.out.println("Nomor ID Siswa Tidak Ditemukan");
                System.out.println(
                        "\n=====================================================================================\n");
            } else {
                for (int i = 0; i < jumlahSiswa; i++) {
                    if (a == siswa.get(i).getId()) {
                        siswa.remove(i);
                        jumlahSiswa--;
                        System.out.println(
                                "\n=====================================================================================\n");
                        System.out.println("Data Siswa Berhasil Dihapus");
                        System.out.println(
                                "\n=====================================================================================\n");
                        break;
                    }
                    if ((i == jumlahSiswa - 1) && (i != siswa.get(i).getId())) {
                        System.out.println(
                                "\n=====================================================================================\n");
                        System.out.println("Nomor ID Siswa Tidak Ditemukan");
                        System.out.println(
                                "\n=====================================================================================\n");
                    }
                }
            }
        } else {
            System.out.println("Tidak Ada Data Siswa, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n=====================================================================================\n");
        }
    }

    /* Ini Merupakan Menu Delete Semua Data Siswa */
    private void deleteSemuaSiswa() {
        if (jumlahSiswa != 0) {
            siswa.clear();
            jumlahSiswa -= jumlahSiswa;
            System.out.println(
                    "\n=====================================================================================\n");
            System.out.println("Semua Data Siswa Berhasil Dihapus");
            System.out.println(
                    "\n=====================================================================================\n");
        } else {
            System.out.println("Tidak Ada Data Siswa, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n=====================================================================================\n");
        }
    }

    /* Method Ini Digunakan Saat Melakukan Input Nama Siswa */
    private String inputNamaSiswa() {
        String s;
        while (true) {
            try {
                System.out.print("Masukkan Nama Siswa\t\t: ");
                s = io.nextLine();
                this.invalidName(s);
                break;
            } catch (InvalidNameException e) {
                System.err.println(e);
            }
        }
        return s;
    }

    /* Method Ini Digunakan Saat Melakukan Input ID Siswa */
    private int inputNomorIdSiswa() {
        int x;
        while (true) {
            try {
                System.out.print("Masukkan Nomor ID Siswa\t: ");
                x = io.nextInt();
                if (jumlahSiswa == 0) {
                    this.invalidId(x);
                } else {
                    for (int i = 0; i < jumlahSiswa; i++) {
                        this.sameId(x, siswa.get(i));
                    }
                }
                break;
            } catch (InputMismatchException e) {
                System.err.println(e + ": Nomor ID Hanya Boleh Terdiri Dari Angka");
                io.next();
            } catch (InvalidIdException | SameIdException e) {
                System.err.println(e);
            }
        }
        return x;
    }

    /*
     * Method Ini Digunakan Mengecek Apakah Terdapat Karakter Tidak Valid Pada Nama
     */
    private boolean isNamaTidakAlfabet(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (!(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z') && ch != ' ') {
                return true;
            }
        }
        return false;
    }

    /* Method Ini Digunakan Mengecek Apakah Nama Diawali Oleh Spasi */
    private boolean isNamaDiawaliSpasi(String s) {
        return Character.isWhitespace(s.charAt(0));
    }

    /*
     * Method Ini Digunakan Mengecek Apakah Terdapat Dua Spasi Yang Bersebelahan
     * Pada Nama
     */
    private boolean isDuaSpasiBersebelahan(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i - 1) == ' ') {
                return true;
            }
        }
        return false;
    }

    /*
     * Method Ini Digunakan Mengecek Apakah Setiap Kata Pertama Pada Nama
     * Menggunakan Huruf Kapital
     */
    private boolean isKataPertamaTidakKapital(String s) {
        if (!(Character.isUpperCase(s.charAt(0)))) {
            return true;
        }
        for (int i = 1; i < s.length(); i++) {
            if (!(Character.isUpperCase(s.charAt(i))) && s.charAt(i - 1) == ' ') {
                return true;
            }
        }
        return false;
    }

    /* Method Ini Digunakan Mengecek Apakah Nomor Tidak Kurang Dari 5 Digit */
    private boolean isIdSamaDenganLima(int a) {
        int length = (int) (Math.log10(a) + 1);
        return length < 5 || length > 5;
    }

    /*
     * Method Ini Digunakan Mengecek Apakah Nomor ID Tidak Sama dan Tidak Kurang
     * Dari 5 Digit
     */
    private boolean isIdSamaDanTidakLima(int s, Siswa siswa) {
        int length = (int) (Math.log10(s) + 1);
        return s == siswa.getId() || length < 5 || length > 5;
    }

    /*
     * Method Ini Digunakan Mengatasi Error Apabila Menginputkan Nama Yang Bersifat
     * Tidak Valid
     */
    private void invalidName(String s) throws InvalidNameException {
        boolean lanjut = this.isNamaTidakAlfabet(s);
        boolean lanjut1 = this.isNamaDiawaliSpasi(s);
        boolean lanjut2 = this.isDuaSpasiBersebelahan(s);
        boolean lanjut3 = this.isKataPertamaTidakKapital(s);
        if (lanjut) {
            throw new InvalidNameException("Nama Hanya Boleh Terdiri Dari Huruf Alfabet");
        }
        if (lanjut1 || lanjut2) {
            throw new InvalidNameException("Nama Tidak Boleh Diawali Spasi dan Tidak Ada Dua Spasi Bersebelahan");
        }
        if (lanjut3) {
            throw new InvalidNameException("Setiap Huruf Pertama Pada Kata Harus Diawali Huruf Alfabet");
        }
    }

    /*
     * Method Ini Digunakan Untuk Mengatasi Error Apabila Nomor ID Yang Diinputkan
     * Kurang Dari 5 Digit Angka
     */
    private void invalidId(int s) throws InvalidIdException {
        boolean lanjut = this.isIdSamaDenganLima(s);
        if (lanjut) {
            throw new InvalidIdException("Nomor ID Harus Terdiri Dari 5 Digit Angka");
        }
    }

    /*
     * Method Ini Digunakan Untuk Mengatasi Error Apabila Nomor ID Yang Diinputkan
     * Sudah Terdaftar
     * atau Nomor ID Yang Diinputkan Kurang Dari 5 Digit Angka
     */
    private void sameId(int s, Siswa siswa) throws SameIdException {
        boolean lanjut = this.isIdSamaDanTidakLima(s, siswa);
        if (lanjut) {
            throw new SameIdException("Nomor ID Sudah Terdaftar atau Nomor ID Kurang Dari 5 Digit");
        }
    }

    /* Method Ini Digunakan Untuk Input Nomor ID Yang Ingin Dicari */
    private int cariId() {
        int a = 0;
        try {
            a = io.nextInt();
        } catch (Exception e) {
            System.err.println(e + ": Nomor ID Hanya Boleh Terdiri Dari Angka");
        }
        return a;
    }

}
