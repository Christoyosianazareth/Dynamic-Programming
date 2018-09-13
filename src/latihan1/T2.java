/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;
import java.util.Scanner;
/**
 *
 * @author GL553VD
 */
public class T2 {
    public static void main(String[]args){
      Scanner scanner = new Scanner (System.in);
      System.out.print("Berat Barang (dalam kg) : ");
      int uang = scanner.nextInt();
      int berat[]={7, 5,4, 3, 2};
      String nama []={"E", "B", "A", "D", "C"};
              int upah[]={10000, 7000, 5000, 3000, 2000};
              int jumlah;
              
              for(int i=0; i<berat.length; i++){
                  if(uang >= berat [i]);
                  jumlah = uang / berat[i];
                  int banyak = jumlah * berat[i];
                  uang = uang % berat [i];
                  int harga = jumlah * upah[i];
                  System.out.println( " Barang " + nama[i] + " sejumlah " + jumlah + " buah dengan total berat " + banyak + " kg.\nBayaran " + harga );
              }
    }
}
