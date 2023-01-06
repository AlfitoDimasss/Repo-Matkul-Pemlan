/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.dosen;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author ubay3
 */
public class TicTacToe {
   private Papan board;
   private KondisiGame KondisiSaatIni;
   private IsiSel PemainSaatIni;

   private static Scanner in = new Scanner(System.in);

   public TicTacToe() {
      board = new Papan();
      PemainSaatIni = IsiSel.SILANG;
      KondisiSaatIni = KondisiGame.SEDANG_MAIN;

      // initGame();

      do {
         playerMove(PemainSaatIni);
         board.cetakPapan();
         updateGame(PemainSaatIni);

         if (KondisiSaatIni == KondisiGame.SILANG_MENANG) {
            System.out.println("'X' Menang! Bye!");
         } else if (KondisiSaatIni == KondisiGame.BUNDAR_MENANG) {
            System.out.println("'O' Menang! Bye!");
         } else if (KondisiSaatIni == KondisiGame.SERI) {
            System.out.println("Tidak Ada Pemenang. Bye!");
         }
         // Ganti Pemain
         PemainSaatIni = (PemainSaatIni == IsiSel.SILANG) ? IsiSel.BUNDAR : IsiSel.SILANG;
      } while (KondisiSaatIni == KondisiGame.SEDANG_MAIN);
   }

   /*
    * public void initGame() {
    * board.initPapan();
    * PemainSaatIni = IsiSel.SILANG;
    * KondisiSaatIni = KondisiGame.SEDANG_MAIN;
    * }
    */

   public void playerMove(IsiSel tanda) {
      boolean validInput = false;
      do {
         try {
            if (tanda == IsiSel.SILANG) {
               // System.out.print("Pemain 'X', Isi Lokasi Tanda (baris[1-3] kolom[1-3]): ");
               System.out.print("Pemain 'X', Isi pada Sel [1-9]: ");
            } else {
               // System.out.print("Pemain 'O', Isi Lokasi Tanda (baris[1-3] kolom[1-3]): ");
               System.out.print("Pemain 'O', Isi pada Sel [1-9]: ");
            }
            int inputPemain = in.nextInt();
            if (inputPemain >= 1 && inputPemain <= 9) {
               int row = 0, col = 0;
               if (inputPemain == 1) {
                  row = 0;
                  col = 0;
               } else if (inputPemain == 2) {
                  row = 0;
                  col = 1;
               } else if (inputPemain == 3) {
                  row = 0;
                  col = 2;
               } else if (inputPemain == 4) {
                  row = 1;
                  col = 0;
               } else if (inputPemain == 5) {
                  row = 1;
                  col = 1;
               } else if (inputPemain == 6) {
                  row = 1;
                  col = 2;
               } else if (inputPemain == 7) {
                  row = 2;
                  col = 0;
               } else if (inputPemain == 8) {
                  row = 2;
                  col = 1;
               } else if (inputPemain == 9) {
                  row = 2;
                  col = 2;
               }
               if (board.isiPapan[row][col].getIsiSel() == IsiSel.KOSONG) {
                  board.isiPapan[row][col].setSel(tanda);// (row, col, tanda);
                  board.barisSaatIni = row;
                  board.kolomSaatIni = col;
                  validInput = true;
               } else {
                  System.out.println("Tidak boleh mengisi pada Sel " + inputPemain + ". Coba lagi...");
               }
            } else {
               System.out.println("Tidak boleh mengisi nilai selain 1 sampai 9!. Coba lagi...");
            }
         } catch (InputMismatchException ex) {
            System.out.println("Data input harus berupa bilangan!..");
         }

         /*
          * int row = in.nextInt() - 1;
          * int col = in.nextInt() - 1;
          * if (row >= 0 && row < Papan.JMLBARIS && col >= 0 && col < Papan.JMLKOLOM
          * && board.isiPapan[row][col].getIsiSel() == IsiSel.KOSONG) {
          * board.isiPapan[row][col].setSel(row, col, tanda);
          * board.barisSaatIni = row;
          * board.kolomSaatIni = col;
          * validInput = true;
          * } else {
          * System.out.println("Tidak boleh mengisi (" + (row + 1) + "," + (col + 1)
          * + "). Coba lagi...");
          * }
          */
      } while (!validInput);
   }

   public void updateGame(IsiSel tanda) {
      if (board.cekPemenang(tanda)) {
         KondisiSaatIni = (tanda == IsiSel.SILANG) ? KondisiGame.SILANG_MENANG : KondisiGame.BUNDAR_MENANG;
      } else if (board.isSeri()) {
         KondisiSaatIni = KondisiGame.SERI;
      }
   }

   /**
    * @param args the command line arguments
    */

   public static void main(String[] args) {
      // TODO code application logic here
      new TicTacToe();
   }

}
