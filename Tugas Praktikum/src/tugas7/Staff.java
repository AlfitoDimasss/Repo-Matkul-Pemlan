/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;

/**
 *
 * @author Illuminare
 */
public class Staff extends CivitasAkademika {

    private String posisi, jabatan, noPegawai;

    public Staff(String nama, String asalDaerah, int usia, String posisi, String jabatan, String noPegawai) {
        super(nama, asalDaerah, usia);
        this.posisi = posisi;
        this.jabatan = jabatan;
        this.noPegawai = noPegawai;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getNoPegawai() {
        return noPegawai;
    }

    public void setNoPegawai(String noPegawai) {
        this.noPegawai = noPegawai;
    }

    @Override
    public void showInfoSingkat() {
        System.out.println("Nama\t\t\t: " + this.getNama());
        System.out.println("Nomor Pegawai\t\t: " + this.noPegawai);
        System.out.println("Posisi\t\t\t: " + this.posisi);
        System.out.println("Jabatan\t\t\t: " + this.jabatan);
    }

    @Override
    public void showInfoLengkap() {
        System.out.println("Nama\t\t\t: " + this.getNama());
        System.out.println("Nomor Pegawai\t\t: " + this.noPegawai);
        System.out.println("Asal Daerah\t\t: " + this.getAsalDaerah());
        System.out.println("Usia\t\t\t: " + this.getUsia());
        System.out.println("Posisi\t\t\t: " + this.posisi);
        System.out.println("Jabatan\t\t\t: " + this.jabatan);
    }

}
