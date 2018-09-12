/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author GL553VD
 */
public class L1 {
    private static void tampilJudul(String identitas){
        System.out.println("Identitas:"+identitas);
        System.out.println("\nHitung Fibonnaci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    public static void main(String []aargs){
        String identitas="Christo Yosia Nazareth/09/XRPL5";
        tampilJudul(identitas);
        int n=tampilInput();
        BigInteger hasil=fibo(n);
    }
    private static int tampilInput(){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Bilangan ke-1");
        int n = scanner.nextInt();
        return n;
    }


private static BigInteger fibo(int n){
    BigInteger[]hasil=new BigInteger[n];
hasil[0]= BigInteger.ONE;
hasil[1]= BigInteger.ONE;
for(int i = 2; i < n; i++){
    hasil[i]=hasil[i-1].add(hasil[i-2]);
}
return hasil[n-1];
}

}