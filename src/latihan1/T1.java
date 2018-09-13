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
public class T1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uang:");
        int uang=scanner.nextInt();
        int pecahan[]=new int[]{5000, 2000, 1000, 500, 200};
        int jumlah;
        
        for(int i=0; i<pecahan.length; i++){
            if(uang>=pecahan[i]);
            jumlah = uang/pecahan[i];
            uang = uang%pecahan[i];
            if (pecahan[i]<1000){
            System.out.println( " Pecahan " + pecahan[i] + " sebanyak " + jumlah + " keping ");
        }
            else{
                System.out.println( " Pecahan " + pecahan[i] + " sebanyak " + jumlah + " lembar ");
            }
        }
        
              
        
}
}

    

