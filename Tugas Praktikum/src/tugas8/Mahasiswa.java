/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas8;

/**
 *
 * @author Illuminare
 */

/*
 * Nama : Alfito Dimas Prasetyo
 * NIM : 205150401111057
 */

public class Mahasiswa extends PengajarDiajar {

    private String nim;
    private int angkatan;

    public Mahasiswa(String nama, String asalDaerah, int usia, String keminatan, String nim, int angkatan) {
        super(nama, asalDaerah, usia, keminatan);
        this.nim = nim;
        this.angkatan = angkatan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public void showInfoSingkat() {
        System.out.println("Nama\t\t\t: " + this.getNama());
        System.out.println("NIM\t\t\t: " + this.nim);
        System.out.println("Angkatan\t\t: " + this.angkatan);
    }

    @Override
    public void showInfoLengkap() {
        System.out.println("Nama\t\t\t\t: " + this.getNama());
        System.out.println("NIM\t\t\t\t: " + this.nim);
        System.out.println("Angkatan\t\t\t: " + this.angkatan);
        System.out.println("Asal Daerah\t\t\t: " + this.getAsalDaerah());
        System.out.println("Usia\t\t\t\t: " + this.getUsia() + " Tahun");
        System.out.println("Keminatan\t\t\t: " + this.getKeminatan());
        System.out.println("Mata Kuliah Yang Diambil\t:");
        if (this.getJumlahMatkul() != 0) {
            this.printMatkul();
        } else {
            System.out.println("Tidak Ada Mata Kuliah Yang Diambil");
        }
        System.out.println("Jumlah SKS Yang Diambil\t: " + this.getJumlahSks());
    }

    @Override
    public void kegiatanBelajarMengajar() {
        System.out.print(this.getNama() + " Diajari Mata Kuliah ");
        if (this.getJumlahMatkul() != 0) {
            this.printMatkul();
        } else {
            System.out.println("Tidak Ada Mata Kuliah Yang Diajari");
        }
    }

}
