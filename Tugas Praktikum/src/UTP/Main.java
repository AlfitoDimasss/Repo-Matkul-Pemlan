/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTP;

/**
 *
 * @author Illuminare
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Instansiasi Buku
        Buku bukuA1 = new Buku("Matematika", "Belajar Matematika", 1200);
        Buku bukuA2 = new Buku("Matematika", "Belajar Matematika", 1200);
        Buku bukuA3 = new Buku("Matematika", "Belajar Matematika", 1200);
        Buku bukuD1 = new Buku("IPA", "Belajar IPA", 1500);
        Buku bukuD2 = new Buku("IPA", "Belajar IPA", 1500);
        Buku bukuD3 = new Buku("IPA", "Belajar IPA", 1500);
        Buku bukuE1 = new Buku("IPS", "Belajar IPS", 1500);
        Buku bukuE2 = new Buku("IPS", "Belajar IPS", 1500);
        Buku bukuE3 = new Buku("IPS", "Belajar IPS", 1500);
        Buku bukuF1 = new Buku("Bahasa Arab", "Belajar Bahasa Arab", 1000);
        Buku bukuF2 = new Buku("Bahasa Arab", "Belajar Bahasa Arab", 1000);
        Buku bukuF3 = new Buku("Bahasa Arab", "Belajar Bahasa Arab", 1000);
        Buku bukuI1 = new Buku("Bahasa Jepang", "Belajar Bahasa Jepang", 1100);
        Buku bukuI2 = new Buku("Bahasa Jepang", "Belajar Bahasa Jepang", 1100);
        Buku bukuJ1 = new Buku("Bahasa Indonesia", "Belajar Bahasa Indonesia", 1400);
        Buku bukuJ2 = new Buku("Bahasa Indonesia", "Belajar Bahasa Indonesia", 1400);
        Buku bukuK1 = new Buku("Fisika", "Belajar Fisika", 1800);
        Buku bukuK2 = new Buku("Fisika", "Belajar Fisika", 1800);
        Buku bukuL1 = new Buku("Kimia", "Belajar Kimia", 1500);
        Buku bukuL2 = new Buku("Kimia", "Belajar Kimia", 1500);
        Buku bukuM1 = new Buku("Biologi", "Belajar Biologi", 1600);
        Buku bukuM2 = new Buku("Biologi", "Belajar Biologi", 1600);
        Buku bukuO = new Buku("Geografi", "Belajar Geografi", 1200);

        // Instansiasi Penulis
        Penulis penulisA = new Penulis("Dono", 20, "Matematika Seru");
        Penulis penulisB = new Penulis("Indro", 30, "Matematika Mantap");
        Penulis penulisC = new Penulis("Kasino", 25, "IPA Seru");
        Penulis penulisD = new Penulis("Yanto", 27, "Bahsa Jepang Seru");
        Penulis penulisE = new Penulis("Tio", 28, "Bahsa Indonesia Seru");

        // Penulis Add Buku
        penulisA.addBuku(bukuA1);
        penulisA.addBuku(bukuK1);
        penulisB.addBuku(bukuA1);
        penulisB.addBuku(bukuL1);
        penulisB.addBuku(bukuM1);
        penulisC.addBuku(bukuD1);
        penulisC.addBuku(bukuE1);
        penulisC.addBuku(bukuF1);
        penulisC.addBuku(bukuO);
        penulisD.addBuku(bukuI1);
        penulisD.addBuku(bukuO);
        penulisE.addBuku(bukuJ1);

        // Buku Add Penulis
        bukuA1.addPenulis(penulisA);
        bukuA1.addPenulis(penulisB);
        bukuA2.addPenulis(penulisA);
        bukuA2.addPenulis(penulisB);
        bukuA3.addPenulis(penulisA);
        bukuA3.addPenulis(penulisB);
        bukuD1.addPenulis(penulisC);
        bukuD2.addPenulis(penulisC);
        bukuD3.addPenulis(penulisC);
        bukuE1.addPenulis(penulisC);
        bukuE2.addPenulis(penulisC);
        bukuE3.addPenulis(penulisC);
        bukuF1.addPenulis(penulisC);
        bukuF2.addPenulis(penulisC);
        bukuF3.addPenulis(penulisC);
        bukuI1.addPenulis(penulisD);
        bukuI2.addPenulis(penulisD);
        bukuJ1.addPenulis(penulisE);
        bukuJ2.addPenulis(penulisE);
        bukuK1.addPenulis(penulisA);
        bukuK2.addPenulis(penulisA);
        bukuL1.addPenulis(penulisB);
        bukuL2.addPenulis(penulisB);
        bukuM1.addPenulis(penulisB);
        bukuM2.addPenulis(penulisB);
        bukuO.addPenulis(penulisC);
        bukuO.addPenulis(penulisD);

        // Instansiasi User
        User user1 = new User("Fito", 012);
        User user2 = new User("Fariz", 013);
        User user3 = new User("Winda", 014);

        // User Pinjam Buku
        user1.pinjamBuku(bukuA1);
        user1.pinjamBuku(bukuF1);
        user1.pinjamBuku(bukuK1);

        user2.pinjamBuku(bukuD1);
        user2.pinjamBuku(bukuI1);
        user2.pinjamBuku(bukuK2);
        user2.pinjamBuku(bukuL1);
        user2.pinjamBuku(bukuO);
        user2.pinjamBuku(bukuM1);

        user3.pinjamBuku(bukuD2);
        user3.pinjamBuku(bukuE1);
        user3.pinjamBuku(bukuF2);

        penulisA.tampilkanBuku();
        penulisB.tampilkanBuku();
        penulisD.tampilkanBuku();

        bukuA1.tampilkanPenulis();
        bukuD1.tampilkanPenulis();
        bukuK1.tampilkanPenulis();

        user1.showInformasi();
        user2.showInformasi();
        user3.showInformasi();
    }

}
