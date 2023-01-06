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
public class Sel {
   private IsiSel isi;
   // private int kolom;
   // private int baris;

   public Sel() {// (int row, int col) {
      // this.baris = row;
      // this.kolom = col;
      // initSel();
      isi = IsiSel.KOSONG;
   }

   /*
    * public void initSel() {
    * isi = IsiSel.KOSONG;
    * }
    */

   public void setSel(IsiSel input) {// (int row, int col, IsiSel input){
      // baris = row;
      // kolom = col;
      isi = input;
   }

   public IsiSel getIsiSel() {// (int inputBaris, int inputKolom){
      // if((baris == inputBaris) && (kolom == inputKolom))
      return isi;
   }

   public void cetakSel() {
      switch (isi) {
         case SILANG:
            System.out.print(" X ");
            break;
         case BUNDAR:
            System.out.print(" O ");
            break;
         case KOSONG:
            System.out.print("   ");
            break;
      }
   }
}
