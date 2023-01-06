/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1.dosen;

/**
 *
 * @author ubay3
 */
public class Mahasiswa {
    private String NamaMahasiswa;
    private String NIM;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama) {
        NIM = nim;
        NamaMahasiswa = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return NamaMahasiswa;
    }
}
