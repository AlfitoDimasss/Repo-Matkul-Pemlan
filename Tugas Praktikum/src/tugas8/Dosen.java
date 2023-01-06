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

public class Dosen extends PengajarDiajar {

    private String noInduk;

    public Dosen(String nama, String asalDaerah, int usia, String keminatan, String noInduk) {
        super(nama, asalDaerah, usia, keminatan);
        this.noInduk = noInduk;
    }

    public void setNoInduk(String noInduk) {
        this.noInduk = noInduk;
    }

    public String getNoInduk() {
        return noInduk;
    }

    @Override
    public void showInfoLengkap() {
        System.out.println("Nama\t\t\t\t: " + this.getNama());
        System.out.println("Nomor Induk\t\t\t: " + this.noInduk);
        System.out.println("Asal Daerah\t\t\t: " + this.getAsalDaerah());
        System.out.println("Usia\t\t\t\t: " + this.getUsia() + " Tahun");
        System.out.println("Keminatan\t\t\t: " + this.getKeminatan());
        System.out.println("Mata Kuliah Yang Diajar\t:");
        if (this.getJumlahMatkul() != 0) {
            this.printMatkul();
        } else {
            System.out.println("Tidak Ada Mata Kuliah Yang Diajar");
        }
        System.out.println("Jumlah SKS Yang Diajar\t\t: " + this.getJumlahSks());
    }

    @Override
    public void showInfoSingkat() {
        System.out.println("Nama\t\t\t: " + this.getNama());
        System.out.println("Nomor Induk\t\t: " + this.noInduk);
        System.out.println("Usia\t\t\t: " + this.getUsia());
    }

    @Override
    public void kegiatanBelajarMengajar() {
        System.out.print(this.getNama() + " Mengajar Mata Kuliah ");
        if (this.getJumlahMatkul() != 0) {
            this.printMatkul();
        } else {
            System.out.println("Tidak Ada Mata Kuliah Yang Diajar");
        }
    }

}
