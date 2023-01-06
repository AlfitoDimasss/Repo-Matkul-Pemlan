/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.dosen;

/**
 *
 * @author ubay3
 */
public class Papan {
   public static final int JMLBARIS = 3;
   public static final int JMLKOLOM = 3;

   Sel[][] isiPapan;
   int barisSaatIni;
   int kolomSaatIni;

   public Papan() {
      isiPapan = new Sel[JMLBARIS][JMLKOLOM];
      for (int row = 0; row < JMLBARIS; ++row) {
         for (int col = 0; col < JMLKOLOM; ++col) {
            isiPapan[row][col] = new Sel();// (row, col);
         }
      }
   }

   /*
    * public void initPapan() {
    * for (int row = 0; row < JMLBARIS; ++row) {
    * for (int col = 0; col < JMLKOLOM; ++col) {
    * isiPapan[row][col].initSel();
    * }
    * }
    * }
    */

   public boolean isSeri() {
      for (int row = 0; row < JMLBARIS; ++row) {
         for (int col = 0; col < JMLKOLOM; ++col) {
            if (isiPapan[row][col].getIsiSel() == IsiSel.KOSONG) {
               return false;
            }
         }
      }
      return true;
   }

   public boolean cekPemenang(IsiSel tanda) {
      return (isiPapan[barisSaatIni][0].getIsiSel() == tanda // mendatar
            && isiPapan[barisSaatIni][1].getIsiSel() == tanda
            && isiPapan[barisSaatIni][2].getIsiSel() == tanda
            || isiPapan[0][kolomSaatIni].getIsiSel() == tanda // vertikal
                  && isiPapan[1][kolomSaatIni].getIsiSel() == tanda
                  && isiPapan[2][kolomSaatIni].getIsiSel() == tanda
            || barisSaatIni == kolomSaatIni // diagonal
                  && isiPapan[0][0].getIsiSel() == tanda
                  && isiPapan[1][1].getIsiSel() == tanda
                  && isiPapan[2][2].getIsiSel() == tanda
            || barisSaatIni + kolomSaatIni == 2 // diagonal
                  && isiPapan[0][2].getIsiSel() == tanda
                  && isiPapan[1][1].getIsiSel() == tanda
                  && isiPapan[2][0].getIsiSel() == tanda);
   }

   public void cetakPapan() {
      for (int row = 0; row < JMLBARIS; ++row) {
         for (int col = 0; col < JMLKOLOM; ++col) {
            isiPapan[row][col].cetakSel();
            if (col < JMLKOLOM - 1)
               System.out.print("|");
         }
         System.out.println();
         if (row < JMLBARIS - 1) {
            System.out.println("-----------");
         }
      }
   }
}
