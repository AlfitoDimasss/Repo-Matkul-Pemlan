/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import java.util.Scanner;

/**
 *
 * @author Illuminare
 */

/*
 * Nama: Alfito Dimas Prasetyo
 * NIM: 205150401111057
 */

public class FilkomUB {

    private final Scanner io = new Scanner(System.in);
    private Dosen[] dosen;
    private Mahasiswa[] mahasiswa;
    private Staff[] staff;
    private MataKuliah[] matkul;
    private static int jumlahDosen = 0;
    private static int jumlahMahasiswa = 0;
    private static int jumlahStaff = 0;
    private static int jumlahMatkul = 0;

    public FilkomUB() {
        dosen = new Dosen[Byte.MAX_VALUE];
        mahasiswa = new Mahasiswa[Byte.MAX_VALUE];
        staff = new Staff[Byte.MAX_VALUE];
        matkul = new MataKuliah[Byte.MAX_VALUE];
    }

    public void operasi() {
        OUTER: do {
            System.out.println("List Command: ");
            System.out.printf("1: Input Dosen %10c 8: Edit Mata Kuliah %15c 15: Hapus Dosen\n", ' ', ' ');
            System.out.printf("2: Input Mahasiswa %6c 9: Tambah Mata Kuliah Dosen %7c 16: Hapus Mahasiswa\n", ' ', ' ');
            System.out.printf("3: Input Staff %9c 10: Tambah Mata Kuliah Mahasiswa %3c 17: Hapus Staff\n", ' ', ' ');
            System.out.printf("4: Input Mata Kuliah %3c 11: Tampilkan Dosen %16c 18: Hapus Mata Kuliah\n", ' ', ' ');
            System.out.printf("5: Edit Dosen %10c 12: Tampilkan Mahasiswa %12c 19: Tambah Dosen\n", ' ', ' ');
            System.out.printf("6: Edit Mahasiswa %6c 13: Tampilkan Staff %16c 20: Tambah Mahasiswa\n", ' ', ' ');
            System.out.printf("7: Edit Staff %10c 14: Tampilkan Mata Kuliah %10c 21: Tambah Staff\n", ' ', ' ');
            System.out.printf("22: Tambah Mata Kuliah %2c 0: Exit\n", ' ');
            System.out.print("Input: ");
            int x = io.nextInt();
            System.out.println("\n=========================\n");
            switch (x) {
                case 1:
                    this.addDosen();
                    break;
                case 2:
                    this.addMahasiswa();
                    break;
                case 3:
                    this.addStaff();
                    break;
                case 4:
                    this.addMataKuliah();
                    break;
                case 5:
                    this.editDosen();
                    break;
                case 6:
                    this.editMahasiswa();
                    break;
                case 7:
                    this.editStaff();
                    break;
                case 8:
                    this.editMatkul();
                    break;
                case 9: {
                    int a = cariIndexDosen();
                    int b = cariIndexMatkul();
                    this.dosenTambahMatkul(dosen[a], matkul[b]);
                    break;
                }
                case 10: {
                    int a = cariIndexMahasiswa();
                    int b = cariIndexMatkul();
                    this.mahasiswaTambahMatkul(mahasiswa[a], matkul[b]);
                    break;
                }
                case 11:
                    this.tampilDosen();
                    break;
                case 12:
                    this.tampilMahasiswa();
                    break;
                case 13:
                    this.tampilStaff();
                    break;
                case 14:
                    this.tampilMatkul();
                    break;
                case 15:
                    this.deleteDosen();
                    break;
                case 16:
                    this.deleteMahasiswa();
                    break;
                case 17:
                    this.deleteStaff();
                    break;
                case 18:
                    this.deleteMataKuliah();
                    break;
                case 19:
                    this.tambahDosen();
                    break;
                case 20:
                    this.tambahMahasiswa();
                    break;
                case 21:
                    this.tambahStaff();
                    break;
                case 22:
                    this.tambahMataKuliah();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Perintah tidak valid!");
                    System.out.println("\n=========================\n");
                    break;
            }
        } while (true);
    }

    public int getJumlahDosen() {
        return FilkomUB.jumlahDosen;
    }

    public void addDosen() {
        System.out.print("Masukkan jumlah dosen: ");
        int x = io.nextInt();
        for (int i = 0; i < x; i++) {
            dosen[i] = new Dosen();
            System.out.println("Data Berhasil Diinputkan!");
            System.out.println("\n=========================\n");
        }
        FilkomUB.jumlahDosen += x;
    }

    public void addMahasiswa() {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int x = io.nextInt();
        for (int i = 0; i < x; i++) {
            mahasiswa[i] = new Mahasiswa();
            System.out.println("Data Berhasil Diinputkan!");
            System.out.println("\n=========================\n");
        }
        FilkomUB.jumlahMahasiswa += x;
    }

    public void addStaff() {
        System.out.print("Masukkan jumlah staff: ");
        int x = io.nextInt();
        for (int i = 0; i < x; i++) {
            staff[i] = new Staff();
            System.out.println("Data Berhasil Diinputkan");
            System.out.println("\n=========================\n");
        }
        FilkomUB.jumlahStaff += x;
    }

    public void addMataKuliah() {
        System.out.print("Masukkan jumlah mata kuliah: ");
        int x = io.nextInt();
        for (int i = 0; i < x; i++) {
            matkul[i] = new MataKuliah();
            System.out.println("Data Berhasil Diinputkan");
            System.out.println("\n=========================\n");
        }
        FilkomUB.jumlahMatkul += x;
    }

    public void mahasiswaTambahMatkul(Mahasiswa mahasiswa, MataKuliah matkul) {
        mahasiswa.addMatkul(matkul);
        System.out.println("Mata Kuliah Berhasil Ditambahkan Ke Mahasiswa");
        System.out.println("\n=========================\n");
    }

    public void dosenTambahMatkul(Dosen dosen, MataKuliah matkul) {
        dosen.addMatkul(matkul);
        System.out.println("Mata Kuliah Berhasil Ditambahkan Ke Dosen");
        System.out.println("\n=========================\n");
    }

    public int cariIndexMahasiswa() {
        int index = 0;
        System.out.print("Masukkan NIM Mahasiswa: ");
        int a = io.nextInt();
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (mahasiswa[i] == null) {
                continue;
            }
            if (mahasiswa[i] != null && a == (mahasiswa[i].getNim())) {
                index = i;
            }
        }
        return index;
    }

    public int cariIndexDosen() {
        int index = 0;
        System.out.print("Masukkan Nomor Induk Dosen: ");
        int a = io.nextInt();
        for (int i = 0; i < jumlahDosen; i++) {
            if (dosen[i] == null) {
                continue;
            }
            if (dosen[i] != null && a == (dosen[i].getNoInduk())) {
                index = i;
            }
        }
        return index;
    }

    public int cariIndexMatkul() {
        int index = 0;
        System.out.print("Masukkan Kode Mata Kuliah: ");
        int a = io.nextInt();
        for (int i = 0; i < jumlahMatkul; i++) {
            if (matkul[i] == null) {
                continue;
            }
            if (matkul[i] != null && a == (matkul[i].getKode())) {
                index = i;
            }
        }
        return index;
    }

    public void editDosen() {
        System.out.print("Masukkan Nomor Induk Dosen: ");
        int a = io.nextInt();
        for (int i = 0; i < jumlahDosen; i++) {
            if (a == dosen[i].getNoInduk()) {
                dosen[i] = new Dosen();
                System.out.println("Data Berhasil Diedit");
                System.out.println("\n=========================\n");
                break;
            } else if (i == (jumlahDosen - 1) && a != dosen[i].getNoInduk()) {
                System.out.println("Nomor Induk Dosen Tidak Ditemukan");
                System.out.println("\n=========================\n");
            }
        }
    }

    public void editMahasiswa() {
        System.out.print("Masukkan NIM Mahasiswa: ");
        int a = io.nextInt();
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (a == mahasiswa[i].getNim()) {
                mahasiswa[i] = new Mahasiswa();
                System.out.println("Data Berhasil Diedit");
                System.out.println("\n=========================\n");
                break;
            } else if (i == (jumlahMahasiswa - 1) && a != mahasiswa[i].getNim()) {
                System.out.println("NIM Mahasiswa Tidak Ditemukan");
                System.out.println("\n=========================\n");
            }
        }
    }

    public void editStaff() {
        System.out.print("Masukkan No Pegawai Staff: ");
        int a = io.nextInt();
        for (int i = 0; i < jumlahStaff; i++) {
            if (a == staff[i].getNoPegawai()) {
                staff[i] = new Staff();
                System.out.println("Data Berhasil Diedit");
                System.out.println("\n=========================\n");
                break;
            } else if (i == (jumlahStaff - 1) && a != staff[i].getNoPegawai()) {
                System.out.println("Nomor Pegawai Staff Tidak Ditemukan");
                System.out.println("\n=========================\n");
            }
        }
    }

    public void editMatkul() {
        System.out.print("Masukkan Kode Mata Kuliah: ");
        int a = io.nextInt();
        for (int i = 0; i < jumlahMatkul; i++) {
            if (a == matkul[i].getKode()) {
                matkul[i] = new MataKuliah();
                System.out.println("Data Berhasil Diedit");
                System.out.println("\n=========================\n");
                break;
            } else if (i == (jumlahMatkul - 1) && a != matkul[i].getKode()) {
                System.out.println("Kode Mata Kuliah Tidak Ditemukan");
                System.out.println("\n=========================\n");
            }
        }
    }

    public void tampilDosen() {
        for (int i = 0; i < jumlahDosen; i++) {
            if (dosen[i] == null) {
            } else {
                dosen[i].showInformasi();
                System.out.println("\n=========================\n");
            }
        }
    }

    public void tampilMahasiswa() {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (mahasiswa[i] == null) {
            } else {
                mahasiswa[i].showInformasi();
                System.out.println("\n=========================\n");
            }
        }
    }

    public void tampilStaff() {
        for (int i = 0; i < jumlahStaff; i++) {
            if (staff[i] == null) {
            } else {
                staff[i].showInformasi();
                System.out.println("\n=========================\n");
            }
        }
    }

    public void tampilMatkul() {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (matkul[i] == null) {
            } else {
                matkul[i].showInformasi();
                System.out.println("\n=========================\n");
            }
        }
    }

    public void deleteDosen() {
        System.out.print("Masukkan Nomor Induk Dosen: ");
        int a = io.nextInt();
        for (int i = 0; i < jumlahDosen; i++) {
            if (a == dosen[i].getNoInduk()) {
                dosen[i] = null;
                System.out.println("Data Berhasil Dihapus");
                System.out.println("\n=========================\n");
                break;
            } else if (i == (jumlahDosen - 1) && a != dosen[i].getNoInduk()) {
                System.out.println("Nomor Induk Dosen Tidak Ditemukan");
                System.out.println("\n=========================\n");
            }
        }
    }

    public void deleteMahasiswa() {
        System.out.print("Masukkan NIM Mahasiswa: ");
        int a = io.nextInt();
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (a == mahasiswa[i].getNim()) {
                mahasiswa[i] = null;
                System.out.println("Data Berhasil Dihapus");
                System.out.println("\n=========================\n");
                break;
            } else if (i == (jumlahMahasiswa - 1) && a != mahasiswa[i].getNim()) {
                System.out.println("NIM Mahasiswa Tidak Ditemukan");
                System.out.println("\n=========================\n");
            }
        }
    }

    public void deleteStaff() {
        System.out.print("Masukkan Nomor Pegawai Staff: ");
        int a = io.nextInt();
        for (int i = 0; i < jumlahStaff; i++) {
            if (a == staff[i].getNoPegawai()) {
                staff[i] = null;
                System.out.println("Data Berhasil Dihapus");
                System.out.println("\n=========================\n");
                break;
            } else if (i == (jumlahStaff - 1) && a != staff[i].getNoPegawai()) {
                System.out.println("Nomor Pegawai Staff Tidak Ditemukan");
                System.out.println("\n=========================\n");
            }
        }
    }

    public void deleteMataKuliah() {
        System.out.print("Masukkan Kode Mata Kuliah: ");
        int a = io.nextInt();
        for (int i = 0; i < jumlahMatkul; i++) {
            if (a == matkul[i].getKode()) {
                matkul[i] = null;
                System.out.println("Data Berhasil Dihapus");
                System.out.println("\n=========================\n");
                break;
            } else if (i == (jumlahMatkul - 1) && a != matkul[i].getKode()) {
                System.out.println("Kode Mata Kuliah Tidak Ditemukan");
                System.out.println("\n=========================\n");
            }
        }
    }

    public void tambahDosen() {
        if (jumlahDosen != 0) {
            dosen[jumlahDosen] = new Dosen();
            FilkomUB.jumlahDosen++;
            System.out.println("Data Berhasil Ditambahkan");
            System.out.println("\n=========================\n");
        } else {
            System.out.println("Gunakan Fitur Input Dosen Terlebih Dahulu");
            System.out.println("\n=========================\n");
        }
    }

    public void tambahMahasiswa() {
        if (jumlahMahasiswa != 0) {
            mahasiswa[jumlahMahasiswa] = new Mahasiswa();
            jumlahMahasiswa++;
            System.out.println("Data Berhasil Ditambahkan");
            System.out.println("\n=========================\n");
        } else {
            System.out.println("Gunakan Fitur Input Mahasiswa Terlebih Dahulu");
            System.out.println("\n=========================\n");
        }
    }

    public void tambahStaff() {
        if (jumlahStaff != 0) {
            staff[jumlahStaff] = new Staff();
            jumlahStaff++;
            System.out.println("Data Berhasil Ditambahkan");
            System.out.println("\n=========================\n");
        } else {
            System.out.println("Gunakan Fitur Input Staff Terlebih Dahulu");
            System.out.println("\n=========================\n");
        }
    }

    public void tambahMataKuliah() {
        if (jumlahMatkul != 0) {
            matkul[jumlahMatkul] = new MataKuliah();
            jumlahMatkul++;
            System.out.println("Data Berhasil Ditambahkan");
            System.out.println("\n=========================\n");
        } else {
            System.out.println("Gunakan Fitur Input Mata Kuliah Terlebih Dahulu");
            System.out.println("\n=========================\n");
        }
    }

}
