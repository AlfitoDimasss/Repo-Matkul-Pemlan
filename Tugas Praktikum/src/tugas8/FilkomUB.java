/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas8;

import java.util.*;

/**
 *
 * @author Illuminare
 */

/*
 * Nama : Alfito Dimas Prasetyo
 * NIM : 205150401111057
 */

public class FilkomUB {

    private final Scanner io = new Scanner(System.in);
    private final ArrayList<Dosen> dosen;
    private final ArrayList<Mahasiswa> mahasiswa;
    private final ArrayList<Staff> staff;
    private final ArrayList<MataKuliah> mataKuliah;
    private static int jumlahMahasiswa = 0;
    private static int jumlahDosen = 0;
    private static int jumlahStaff = 0;
    private static int jumlahMataKuliah = 0;

    public FilkomUB() {
        dosen = new ArrayList<>();
        mahasiswa = new ArrayList<>();
        staff = new ArrayList<>();
        mataKuliah = new ArrayList<>();
    }

    public void operasiData() {
        OUTER: do {
            System.out.println("Silahkan Pilih Menu");
            System.out.println("1. Dosen\t 3. Staff");
            System.out.println("2. Mahasiswa\t 4. Mata Kuliah");
            System.out.println("0. Exit");
            System.out.print("Input: ");
            int a = io.nextInt();
            System.out.println(
                    "\n=====================================================================================\n");
            switch (a) {
                case 1:
                    this.operasiDosen();
                    break;
                case 2:
                    this.operasiMahasiswa();
                    break;
                case 3:
                    this.operasiStaff();
                    break;
                case 4:
                    this.operasiMataKuliah();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid");
                    System.out.println(
                            "\n=====================================================================================\n");
            }
        } while (true);
    }

    private void operasiDosen() {
        OUTER: do {
            System.out.println("DOSEN");
            System.out.println("List Command:");
            System.out.println("1. Create Data Dosen\t 4. Delete Data Dosen");
            System.out.println("2. Read Data Dosen\t 5. Tambahkan Mata Kuliah Ke Dosen");
            System.out.println("3. Update Data Dosen\t 0. Exit");
            System.out.print("Input: ");
            int a = io.nextInt();
            System.out.println(
                    "\n=====================================================================================\n");
            switch (a) {
                case 1:
                    this.createDosen();
                    break;
                case 2:
                    this.operasiReadDosen();
                    break;
                case 3:
                    this.editDosen();
                    break;
                case 4:
                    this.deleteDosen();
                    break;
                case 5:
                    if (jumlahDosen != 0) {
                        int b = cariIndexDosen();
                        if (b == -1) {
                            System.out.println(
                                    "\n========================================================================================\n");
                            System.out.println("Data Dosen Tidak Ditemukan");
                            System.out.println(
                                    "\n========================================================================================\n");
                        } else {
                            int c = cariIndexMataKuliah();
                            if (c == -1) {
                                System.out.print("Mata Kuliah Belum Tersedia, Apakah Ingin Dibuat? ");
                                String d = io.next();
                                if (d.equalsIgnoreCase("Ya") || d.equalsIgnoreCase("Y") || d.equalsIgnoreCase("Yes")) {
                                    System.out.println(
                                            "\n=====================================================================================\n");
                                    this.createMataKuliah();
                                    this.dosenTambahMatkul(dosen.get(b), mataKuliah.get(jumlahMataKuliah - 1));
                                } else {
                                    System.out.println(
                                            "\n========================================================================================\n");
                                    System.out.println("Mata Kuliah Gagal Ditambahkan");
                                    System.out.println(
                                            "\n========================================================================================\n");
                                }
                            } else {
                                this.dosenTambahMatkul(dosen.get(b), mataKuliah.get(c));
                            }
                        }

                    } else {
                        System.out.println("Tidak Ada Data Dosen, Silahkan Create Terlebih Dahulu");
                        System.out.println(
                                "\n========================================================================================\n");
                    }
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid");
                    System.out.println(
                            "\n=====================================================================================\n");
            }
        } while (true);
    }

    private void operasiMahasiswa() {
        OUTER: do {
            System.out.println("MAHASISWA");
            System.out.println("List Command:");
            System.out.println("1. Create Data Mahasiswa\t 4. Delete Data Mahasiswa");
            System.out.println("2. Read Data Mahasiswa\t\t 5. Tambahkan Mata Kuliah Ke Mahasiswa");
            System.out.println("3. Update Data Mahasiswa\t 0. Exit");
            System.out.print("Input: ");
            int a = io.nextInt();
            System.out.println(
                    "\n=====================================================================================\n");
            switch (a) {
                case 1:
                    this.createMahasiswa();
                    break;
                case 2:
                    this.operasiReadMahasiswa();
                    break;
                case 3:
                    this.editMahasiswa();
                    break;
                case 4:
                    this.deleteMahasiswa();
                    break;
                case 5:
                    if (jumlahMahasiswa != 0) {
                        int b = cariIndexMahasiswa();
                        if (b == -1) {
                            System.out.println(
                                    "\n========================================================================================\n");
                            System.out.println("Data Mahasiswa Tidak Ditemukan");
                            System.out.println(
                                    "\n========================================================================================\n");
                        } else {
                            int c = cariIndexMataKuliah();
                            if (c == -1) {
                                System.out.println(
                                        "\n========================================================================================\n");
                                System.out.println("Mata Kuliah Gagal Ditambahkan Karena Belum Tersedia");
                                System.out.println(
                                        "\n========================================================================================\n");
                            } else {
                                this.mahasiswaTambahMatkul(mahasiswa.get(b), mataKuliah.get(c));
                            }
                        }
                    } else {
                        System.out.println("Tidak Ada Data Mahasiswa, Silahkan Create Terlebih Dahulu");
                        System.out.println(
                                "\n========================================================================================\n");
                    }
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid");
                    System.out.println(
                            "\n=====================================================================================\n");
            }
        } while (true);
    }

    private void operasiStaff() {
        OUTER: do {
            System.out.println("STAFF");
            System.out.println("List Command:");
            System.out.println("1. Create Data Staff\t 3. Update Data Staff");
            System.out.println("2. Read Data Staff\t 4. Delete Data Staff");
            System.out.println("0. Exit");
            System.out.print("Input: ");
            int a = io.nextInt();
            System.out.println(
                    "\n=====================================================================================\n");
            switch (a) {
                case 1:
                    this.createStaff();
                    break;
                case 2:
                    this.operasiReadStaff();
                    break;
                case 3:
                    this.editStaff();
                    break;
                case 4:
                    this.deleteStaff();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid");
                    System.out.println(
                            "\n=====================================================================================\n");
            }
        } while (true);
    }

    private void operasiMataKuliah() {
        OUTER: do {
            System.out.println("MATA KULIAH");
            System.out.println("List Command:");
            System.out.println("1. Create Data Mata Kuliah\t 3. Update Data Mata Kuliah");
            System.out.println("2. Read Data Mata Kuliah\t 4. Delete Data Mata Kuliah");
            System.out.println("0. Exit");
            System.out.print("Input: ");
            int a = io.nextInt();
            System.out.println(
                    "\n=====================================================================================\n");
            switch (a) {
                case 1:
                    this.createMataKuliah();
                    break;
                case 2:
                    this.operasiReadMataKuliah();
                    break;
                case 3:
                    this.editMataKuliah();
                    break;
                case 4:
                    this.deleteMataKuliah();
                    break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Input Tidak Valid");
                    System.out.println(
                            "\n=====================================================================================\n");
            }
        } while (true);
    }

    private void operasiReadDosen() {
        System.out.println("READ DATA DOSEN");
        System.out.println("1. Tampilkan Data Lengkap Semua Dosen\t\t 3. Tampilkan Data Dosen Tertentu");
        System.out.println("2. Tampilkan Data Singkat Semua Dosen\t\t 4. Tampilkan Keterangan KBM Dosen");
        System.out.println("0. Exit");
        System.out.print("Input: ");
        int a = io.nextInt();
        System.out.println("\n=====================================================================================\n");
        switch (a) {
            case 1:
                this.tampilLengkapSemuaDosen();
                break;
            case 2:
                this.tampilSingkatSemuaDosen();
                break;
            case 3:
                this.tampilDosenTertentu();
                break;
            case 4:
                this.tampilKBMDosen();
                break;
            case 0:
                break;
            default:
                System.out.println("Input Tidak Valid");
                System.out.println(
                        "\n=====================================================================================\n");
        }
    }

    private void operasiReadMahasiswa() {
        System.out.println("READ DATA MAHASISWA");
        System.out.println("1. Tampilkan Data Lengkap Semua Mahasiswa\t\t 3. Tampilkan Data Mahasiswa Tertentu");
        System.out.println("2. Tampilkan Data Singkat Semua Mahasiswa\t\t 4. Tampilkan Keterangan KBM Mahasiswa");
        System.out.println("0. Exit");
        System.out.print("Input: ");
        int a = io.nextInt();
        System.out.println("\n=====================================================================================\n");
        switch (a) {
            case 1:
                this.tampilLengkapSemuaMahasiswa();
                break;
            case 2:
                this.tampilSingkatSemuaMahasiswa();
                break;
            case 3:
                this.tampilMahasiswaTertentu();
                break;
            case 4:
                this.tampilKBMMahasiswa();
                break;
            case 0:
                break;
            default:
                System.out.println("Input Tidak Valid");
                System.out.println(
                        "\n=====================================================================================\n");
        }
    }

    private void operasiReadStaff() {
        System.out.println("READ DATA STAFF");
        System.out.println("1. Tampilkan Data Lengkap Semua Staff\t\t 3. Tampilkan Data Staff Tertentu");
        System.out.println("2. Tampilkan Data Singkat Semua Staff\t\t 0. Exit");
        System.out.print("Input: ");
        int a = io.nextInt();
        System.out.println("\n=====================================================================================\n");
        switch (a) {
            case 1:
                this.tampilLengkapSemuaStaff();
                break;
            case 2:
                this.tampilSingkatSemuaStaff();
                break;
            case 3:
                this.tampilStaffTertentu();
                break;
            case 0:
                break;
            default:
                System.out.println("Input Tidak Valid");
                System.out.println(
                        "\n=====================================================================================\n");
        }
    }

    private void operasiReadMataKuliah() {
        System.out.println("READ DATA MATA KULIAH");
        System.out.println("1. Tampilkan Data Semua Mata Kuliah\t\t 2. Tampilkan Data Mata Kuliah Tertentu");
        System.out.println("0. Exit");
        System.out.print("Input: ");
        int a = io.nextInt();
        System.out.println("\n=====================================================================================\n");
        switch (a) {
            case 1:
                this.tampilSemuaMataKuliah();
                break;
            case 2:
                this.tampilMataKuliahTertentu();
                break;
            case 0:
                break;
            default:
                System.out.println("Input Tidak Valid");
                System.out.println(
                        "\n=====================================================================================\n");
        }
    }

    private void createDosen() {
        boolean lanjut = true;
        System.out.println("CREATE DATA DOSEN");
        System.out.print("Input Nomor Induk\t: ");
        String nomor = io.next();
        for (int i = 0; i < jumlahDosen; i++) {
            if (nomor.equalsIgnoreCase(dosen.get(i).getNoInduk())) {
                System.out.println(
                        "\n========================================================================================\n");
                System.out.println("Nomor Induk Dosen Sudah Terdaftar");
                System.out.println(
                        "\n========================================================================================\n");
                lanjut = false;
                break;
            }
        }
        if (lanjut == true) {
            io.nextLine();
            System.out.print("Input Nama\t\t: ");
            String nama = io.nextLine();
            System.out.print("Input Asal Daerah\t: ");
            String daerah = io.nextLine();
            System.out.print("Input Usia\t\t: ");
            int usia = io.nextInt();
            io.nextLine();
            System.out.print("Input Keminatan\t: ");
            String minat = io.nextLine();
            Dosen obyekDosen = new Dosen(nama, daerah, usia, minat, nomor);
            dosen.add(obyekDosen);
            jumlahDosen++;
            System.out.println(
                    "\n=====================================================================================\n");
            System.out.println("Data Berhasil Dibuat dan Diinputkan");
            System.out.println(
                    "\n=====================================================================================\n");
        }
    }

    private void createMahasiswa() {
        boolean lanjut = true;
        System.out.println("CREATE DATA MAHASISWA");
        System.out.print("Input NIM\t\t: ");
        String nomor = io.next();
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nomor.equalsIgnoreCase(mahasiswa.get(i).getNim())) {
                System.out.println(
                        "\n========================================================================================\n");
                System.out.println("NIM Mahasiswa Sudah Terdaftar");
                System.out.println(
                        "\n========================================================================================\n");
                lanjut = false;
                break;
            }
        }
        if (lanjut == true) {
            io.nextLine();
            System.out.print("Input Nama\t\t: ");
            String nama = io.nextLine();
            System.out.print("Input Asal Daerah\t: ");
            String daerah = io.nextLine();
            System.out.print("Input Usia\t\t: ");
            int usia = io.nextInt();
            io.nextLine();
            System.out.print("Input Keminatan\t: ");
            String minat = io.nextLine();
            System.out.print("Input Angkatan\t\t: ");
            int angkatan = io.nextInt();
            Mahasiswa obyekMahasiswa = new Mahasiswa(nama, daerah, usia, minat, nomor, angkatan);
            mahasiswa.add(obyekMahasiswa);
            jumlahMahasiswa++;
            System.out.println(
                    "\n=====================================================================================\n");
            System.out.println("Data Berhasil Dibuat dan Diinputkan");
            System.out.println(
                    "\n=====================================================================================\n");
        }
    }

    private void createStaff() {
        boolean lanjut = true;
        System.out.println("CREATE DATA STAFF");
        System.out.print("Input Nomor Pegawai\t: ");
        String nomor = io.next();
        for (int i = 0; i < jumlahStaff; i++) {
            if (nomor.equalsIgnoreCase(staff.get(i).getNoPegawai())) {
                System.out.println(
                        "\n========================================================================================\n");
                System.out.println("Nomor Pegawai Staff Sudah Terdaftar");
                System.out.println(
                        "\n========================================================================================\n");
                lanjut = false;
                break;
            }
        }
        if (lanjut == true) {
            io.nextLine();
            System.out.print("Input Nama\t\t: ");
            String nama = io.nextLine();
            System.out.print("Input Asal Daerah\t: ");
            String daerah = io.nextLine();
            System.out.print("Input Usia\t\t: ");
            int usia = io.nextInt();
            io.nextLine();
            System.out.print("Input Posisi\t\t: ");
            String posisi = io.nextLine();
            System.out.print("Input Jabatan\t\t: ");
            String jabatan = io.nextLine();
            Staff obyekStaff = new Staff(nama, daerah, usia, posisi, jabatan, nomor);
            staff.add(obyekStaff);
            jumlahStaff++;
            System.out.println(
                    "\n=====================================================================================\n");
            System.out.println("Data Berhasil Dibuat dan Diinputkan");
            System.out.println(
                    "\n=====================================================================================\n");
        }
    }

    private void createMataKuliah() {
        boolean lanjut = true;
        System.out.println("CREATE DATA MATA KULIAH");
        System.out.print("Input Kode Mata Kuliah\t\t: ");
        String nomor = io.next();
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (nomor.equalsIgnoreCase(mataKuliah.get(i).getKode())) {
                System.out.println(
                        "\n========================================================================================\n");
                System.out.println("Kode Mata Kuliah Sudah Terdaftar");
                System.out.println(
                        "\n========================================================================================\n");
                lanjut = false;
                break;
            }
        }
        if (lanjut == true) {
            io.nextLine();
            System.out.print("Input Nama Mata Kuliah\t\t: ");
            String nama = io.nextLine();
            System.out.print("Input Beban SKS\t\t: ");
            int sks = io.nextInt();
            MataKuliah obyekMataKuliah = new MataKuliah(nama, nomor, sks);
            mataKuliah.add(obyekMataKuliah);
            jumlahMataKuliah++;
            System.out.println(
                    "\n=====================================================================================\n");
            System.out.println("Data Berhasil Dibuat dan Diinputkan");
            System.out.println(
                    "\n=====================================================================================\n");
        }
    }

    private int cariIndexMahasiswa() {
        int index = -1;
        System.out.print("Masukkan NIM Mahasiswa\t\t: ");
        String a = io.next();
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (mahasiswa.get(i).getNim().equalsIgnoreCase(a)) {
                index = i;
                break;
            }
        }
        return index;
    }

    private int cariIndexDosen() {
        int index = -1;
        System.out.print("Masukkan Nomor Induk Dosen\t: ");
        String a = io.next();
        for (int i = 0; i < jumlahDosen; i++) {
            if (dosen.get(i).getNoInduk().equalsIgnoreCase(a)) {
                index = i;
                break;
            }
        }
        return index;
    }

    private int cariIndexMataKuliah() {
        int index = -1;
        System.out.print("Masukkan Kode Mata Kuliah\t: ");
        String a = io.next();
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (mataKuliah.get(i).getKode().equalsIgnoreCase(a)) {
                index = i;
                break;
            }
        }
        return index;
    }

    private void mahasiswaTambahMatkul(Mahasiswa mahasiswa, MataKuliah matkul) {
        boolean lanjut = true;
        for (int i = 0; i < mahasiswa.getJumlahMatkul(); i++) {
            if (matkul.getKode().equalsIgnoreCase(mahasiswa.matkul.get(i).getKode())) {
                System.out.println(
                        "\n=====================================================================================\n");
                System.out.println("Mata Kuliah Sudah Ditambahkan Ke Mahasiswa");
                System.out.println(
                        "\n=====================================================================================\n");
                lanjut = false;
                break;
            }
        }
        if (lanjut == true) {
            mahasiswa.tambahMataKuliah(matkul);
            System.out.println(
                    "\n=====================================================================================\n");
            System.out.println("Mata Kuliah Berhasil Ditambahkan Ke Mahasiswa");
            System.out.println(
                    "\n=====================================================================================\n");
        }
    }

    private void dosenTambahMatkul(Dosen dosen, MataKuliah matkul) {
        boolean stop = false;
        for (int i = 0; i < dosen.getJumlahMatkul(); i++) {
            if (matkul.getKode().equalsIgnoreCase(dosen.matkul.get(i).getKode())) {
                System.out.println(
                        "\n=====================================================================================\n");
                System.out.println("Mata Kuliah Sudah Ditambahkan Ke Dosen");
                System.out.println(
                        "\n=====================================================================================\n");
                stop = true;
                break;
            }
        }
        if (stop == false) {
            dosen.tambahMataKuliah(matkul);
            System.out.println(
                    "\n=====================================================================================\n");
            System.out.println("Mata Kuliah Berhasil Ditambahkan Ke Dosen");
            System.out.println(
                    "\n=====================================================================================\n");
        }
    }

    private void editDosen() {
        if (jumlahDosen != 0) {
            System.out.println("EDIT DATA DOSEN");
            System.out.print("Masukkan Nomor Induk Dosen Yang Akan Diedit: ");
            String a = io.next();
            for (int i = 0; i < jumlahDosen; i++) {
                if (a.equalsIgnoreCase(dosen.get(i).getNoInduk())) {
                    io.nextLine();
                    System.out.print("Input Nama\t\t: ");
                    String nama = io.nextLine();
                    System.out.print("Input Nomor Induk\t: ");
                    String nomor = io.next();
                    io.nextLine();
                    System.out.print("Input Asal Daerah\t: ");
                    String daerah = io.nextLine();
                    System.out.print("Input Usia\t\t: ");
                    int usia = io.nextInt();
                    io.nextLine();
                    System.out.print("Input Keminatan\t: ");
                    String minat = io.nextLine();
                    Dosen obyekDosen = new Dosen(nama, daerah, usia, minat, nomor);
                    dosen.set(i, obyekDosen);
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Data Dosen Berhasil Diedit");
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahDosen - 1) && !(a.equalsIgnoreCase(dosen.get(i).getNoInduk()))) {
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Nomor Induk Dosen Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Dosen, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void editMahasiswa() {
        if (jumlahMahasiswa != 0) {
            System.out.println("EDIT DATA MAHASISWA");
            System.out.print("Masukkan NIM Mahasiswa Yang Akan Diedit: ");
            String a = io.next();
            for (int i = 0; i < jumlahMahasiswa; i++) {
                if (a.equalsIgnoreCase(mahasiswa.get(i).getNim())) {
                    io.nextLine();
                    System.out.print("Input Nama\t\t: ");
                    String nama = io.nextLine();
                    System.out.print("Input NIM\t\t: ");
                    String nomor = io.next();
                    io.nextLine();
                    System.out.print("Input Asal Daerah\t: ");
                    String daerah = io.nextLine();
                    System.out.print("Input Usia\t\t: ");
                    int usia = io.nextInt();
                    io.nextLine();
                    System.out.print("Input Keminatan\t: ");
                    String minat = io.nextLine();
                    System.out.print("Input Angkatan\t\t: ");
                    int angkatan = io.nextInt();
                    Mahasiswa obyekMahasiswa = new Mahasiswa(nama, daerah, usia, minat, nomor, angkatan);
                    mahasiswa.set(i, obyekMahasiswa);
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Data Mahasiswa Berhasil Diedit");
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahMahasiswa - 1) && !(a.equalsIgnoreCase(mahasiswa.get(i).getNim()))) {
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("NIM Mahasiswa Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Mahasiswa, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void editStaff() {
        if (jumlahStaff != 0) {
            System.out.println("EDIT DATA STAFF");
            System.out.print("Masukkan Nomor Pegawai Staff Yang Akan Diedit: ");
            String a = io.next();
            for (int i = 0; i < jumlahStaff; i++) {
                if (a.equalsIgnoreCase(staff.get(i).getNoPegawai())) {
                    io.nextLine();
                    System.out.print("Input Nama\t\t: ");
                    String nama = io.nextLine();
                    System.out.print("Input Nomor Pegawai\t: ");
                    String nomor = io.next();
                    io.nextLine();
                    System.out.print("Input Asal Daerah\t: ");
                    String daerah = io.nextLine();
                    System.out.print("Input Usia\t\t: ");
                    int usia = io.nextInt();
                    io.nextLine();
                    System.out.print("Input Posisi\t\t: ");
                    String posisi = io.nextLine();
                    System.out.print("Input Jabatan\t\t: ");
                    String jabatan = io.nextLine();
                    Staff obyekStaff = new Staff(nama, daerah, usia, posisi, jabatan, nomor);
                    staff.set(i, obyekStaff);
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Data Staff Berhasil Diedit");
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahStaff - 1) && !(a.equalsIgnoreCase(staff.get(i).getNoPegawai()))) {
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Nomor Pegawai Staff Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Staff, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void editMataKuliah() {
        if (jumlahMataKuliah != 0) {
            System.out.println("EDIT DATA MATA KULIAH");
            System.out.print("Masukkan Kode Mata Kuliah Yang Akan Diedit: ");
            String a = io.next();
            for (int i = 0; i < jumlahMataKuliah; i++) {
                if (a.equalsIgnoreCase(mataKuliah.get(i).getKode())) {
                    io.nextLine();
                    System.out.print("Input Nama Mata Kuliah\t\t: ");
                    String nama = io.nextLine();
                    System.out.print("Input Kode Mata Kuliah\t\t: ");
                    String nomor = io.next();
                    io.nextLine();
                    System.out.print("Input Beban SKS\t\t: ");
                    int sks = io.nextInt();
                    MataKuliah obyekMataKuliah = new MataKuliah(nama, nomor, sks);
                    mataKuliah.set(i, obyekMataKuliah);
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Data Mata Kuliah Berhasil Diedit");
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahMataKuliah - 1) && !(a.equalsIgnoreCase(mataKuliah.get(i).getKode()))) {
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Kode Mata Kuliah Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Mata Kuliah, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilKBMDosen() {
        if (jumlahDosen != 0) {
            System.out.print("Masukkan Nomor Induk Dosen: ");
            String a = io.next();
            for (int i = 0; i < jumlahDosen; i++) {
                if (a.equalsIgnoreCase(dosen.get(i).getNoInduk())) {
                    dosen.get(i).kegiatanBelajarMengajar();
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahDosen - 1) && !(a.equalsIgnoreCase(dosen.get(i).getNoInduk()))) {
                    System.out.println("Nomor Induk Dosen Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Dosen, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilSingkatSemuaDosen() {
        if (jumlahDosen != 0) {
            for (int i = 0; i < jumlahDosen; i++) {
                System.out.println("Data Dosen Ke-" + (i + 1));
                dosen.get(i).showInfoSingkat();
                System.out.println(
                        "\n=====================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Dosen, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilLengkapSemuaDosen() {
        if (jumlahDosen != 0) {
            for (int i = 0; i < jumlahDosen; i++) {
                System.out.println("Data Dosen Ke-" + (i + 1));
                dosen.get(i).showInfoLengkap();
                System.out.println(
                        "\n=====================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Dosen, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilDosenTertentu() {
        if (jumlahDosen != 0) {
            System.out.print("Masukkan Nomor Induk Dosen: ");
            String a = io.next();
            for (int i = 0; i < jumlahDosen; i++) {
                if (a.equalsIgnoreCase(dosen.get(i).getNoInduk())) {
                    dosen.get(i).showInfoLengkap();
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahDosen - 1) && !(a.equalsIgnoreCase(dosen.get(i).getNoInduk()))) {
                    System.out.println("Nomor Induk Dosen Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Dosen, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilKBMMahasiswa() {
        if (jumlahMahasiswa != 0) {
            System.out.print("Masukkan NIM Mahasiswa: ");
            String a = io.next();
            for (int i = 0; i < jumlahMahasiswa; i++) {
                if (a.equalsIgnoreCase(mahasiswa.get(i).getNim())) {
                    mahasiswa.get(i).kegiatanBelajarMengajar();
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahMahasiswa - 1) && !(a.equalsIgnoreCase(mahasiswa.get(i).getNim()))) {
                    System.out.println("NIM Mahasiswa Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Mahasiswa, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilSingkatSemuaMahasiswa() {
        if (jumlahMahasiswa != 0) {
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.println("Data Mahasiswa Ke-" + (i + 1));
                mahasiswa.get(i).showInfoSingkat();
                System.out.println(
                        "\n=====================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Mahasiswa, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilLengkapSemuaMahasiswa() {
        if (jumlahMahasiswa != 0) {
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.println("Data Mahasiswa Ke-" + (i + 1));
                mahasiswa.get(i).showInfoLengkap();
                System.out.println(
                        "\n=====================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Mahasiswa, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilMahasiswaTertentu() {
        if (jumlahMahasiswa != 0) {
            System.out.print("Masukkan NIM Mahasiswa: ");
            String a = io.next();
            for (int i = 0; i < jumlahMahasiswa; i++) {
                if (a.equalsIgnoreCase(mahasiswa.get(i).getNim())) {
                    mahasiswa.get(i).showInfoLengkap();
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahMahasiswa - 1) && !(a.equalsIgnoreCase(mahasiswa.get(i).getNim()))) {
                    System.out.println("NIM Mahasiswa Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Mahasiswa, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilSingkatSemuaStaff() {
        if (jumlahStaff != 0) {
            for (int i = 0; i < jumlahStaff; i++) {
                System.out.println("Data Staff Ke-" + (i + 1));
                staff.get(i).showInfoSingkat();
                System.out.println(
                        "\n=====================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Staff, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilLengkapSemuaStaff() {
        if (jumlahStaff != 0) {
            for (int i = 0; i < jumlahStaff; i++) {
                System.out.println("Data Staff Ke-" + (i + 1));
                staff.get(i).showInfoLengkap();
                System.out.println(
                        "\n=====================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Staff, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilStaffTertentu() {
        if (jumlahStaff != 0) {
            System.out.print("Masukkan Nomor Pegawai Staff: ");
            String a = io.next();
            for (int i = 0; i < jumlahStaff; i++) {
                if (a.equalsIgnoreCase(staff.get(i).getNoPegawai())) {
                    staff.get(i).showInfoLengkap();
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahStaff - 1) && !(a.equalsIgnoreCase(staff.get(i).getNoPegawai()))) {
                    System.out.println("Nomor Pegawai Staff Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Staff, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilSemuaMataKuliah() {
        if (jumlahMataKuliah != 0) {
            for (int i = 0; i < jumlahMataKuliah; i++) {
                System.out.println("Data Mata Kuliah Ke-" + (i + 1));
                mataKuliah.get(i).showInfo();
                System.out.println(
                        "\n=====================================================================================\n");
            }
        } else {
            System.out.println("Tidak Ada Data Mata Kuliah, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void tampilMataKuliahTertentu() {
        if (jumlahMataKuliah != 0) {
            System.out.print("Masukkan Kode Mata Kuliah: ");
            String a = io.next();
            for (int i = 0; i < jumlahMataKuliah; i++) {
                if (a.equalsIgnoreCase(mataKuliah.get(i).getKode())) {
                    mataKuliah.get(i).showInfo();
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahMataKuliah - 1) && !(a.equalsIgnoreCase(mataKuliah.get(i).getKode()))) {
                    System.out.println("Kode Mata Kuliah Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Mata Kuliah, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deleteDosen() {
        if (jumlahDosen != 0) {
            System.out.println("DELETE DATA DOSEN");
            System.out.print("Masukkan Nomor Induk Dosen: ");
            String a = io.next();
            for (int i = 0; i < jumlahDosen; i++) {
                if (a.equalsIgnoreCase(dosen.get(i).getNoInduk())) {
                    dosen.remove(i);
                    jumlahDosen--;
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Data Dosen Berhasil Dihapus");
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahDosen - 1) && !(a.equalsIgnoreCase(dosen.get(i).getNoInduk()))) {
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Nomor Induk Dosen Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Dosen, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deleteMahasiswa() {
        if (jumlahMahasiswa != 0) {
            System.out.println("DELETE DATA MAHASISWA");
            System.out.print("Masukkan NIM Mahasiswa: ");
            String a = io.next();
            for (int i = 0; i < jumlahMahasiswa; i++) {
                if (a.equalsIgnoreCase(mahasiswa.get(i).getNim())) {
                    mahasiswa.remove(i);
                    jumlahMahasiswa--;
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Data Mahasiswa Berhasil Dihapus");
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahMahasiswa - 1) && !(a.equalsIgnoreCase(mahasiswa.get(i).getNim()))) {
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("NIM Mahasiswa Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Mahasiswa, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deleteStaff() {
        if (jumlahStaff != 0) {
            System.out.println("DELETE DATA STAFF");
            System.out.print("Masukkan Nomor Pegawai Staff: ");
            String a = io.next();
            for (int i = 0; i < jumlahStaff; i++) {
                if (a.equalsIgnoreCase(staff.get(i).getNoPegawai())) {
                    staff.remove(i);
                    jumlahStaff--;
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Data Staff Berhasil Dihapus");
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahStaff - 1) && !(a.equalsIgnoreCase(staff.get(i).getNoPegawai()))) {
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Nomor Pegawai Staff Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Staff, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

    private void deleteMataKuliah() {
        if (jumlahMataKuliah != 0) {
            System.out.println("DELETE DATA MATA KULIAH");
            System.out.print("Masukkan Kode Mata Kuliah: ");
            String a = io.next();
            for (int i = 0; i < jumlahStaff; i++) {
                if (a.equalsIgnoreCase(mataKuliah.get(i).getKode())) {
                    mataKuliah.remove(i);
                    jumlahMataKuliah--;
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Data Mata Kuliah Berhasil Dihapus");
                    System.out.println(
                            "\n=====================================================================================\n");
                    break;
                } else if (i == (jumlahMataKuliah - 1) && !(a.equalsIgnoreCase(mataKuliah.get(i).getKode()))) {
                    System.out.println(
                            "\n=====================================================================================\n");
                    System.out.println("Kode Mata Kuliah Tidak Ditemukan");
                    System.out.println(
                            "\n=====================================================================================\n");
                }
            }
        } else {
            System.out.println("Tidak Ada Data Mata Kuliah, Silahkan Create Terlebih Dahulu");
            System.out.println(
                    "\n========================================================================================\n");
        }
    }

}
