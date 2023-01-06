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
public class Dosen {
    private String NIP;
    private String NamaDosen;

    public Dosen() {
    }

    public Dosen(String nip, String nama) {
        NIP = nip;
        NamaDosen = nama;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return NamaDosen;
    }
}
