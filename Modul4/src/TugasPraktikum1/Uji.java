 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Uji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner m = new Scanner(System.in);
      double tb;
      int pilihan, ulangi = 0;
      do{
          System.out.println("-----------------------");
          System.out.println("Masukan Tinggi Badan Anda :");
          tb = m.nextInt();
          System.out.println("Pilihlah Jenis KElamin Anda:");
          System.out.println("1. Laki - Laki");
          System.out.println("2. Perempuan");
          System.out.println("Jawab : ");
          pilihan = m.nextInt();
          
          if(pilihan == 1){
              System.out.println("-----------------------");
              Manusia L = new LakiLaki(tb);
               System.out.println("Tinggi Badan : " + L.TB() + "Cm");
            System.out.println("Berat Badan Ideal : " + L.HtgBBI()+ "Kg");
            System.out.println("-----------------------");
          }else {
                System.out.println("-----------------------");
              Manusia P = new Perempuan(tb);
               System.out.println("Tinggi Badan : " + P.TB() + "Cm");
            System.out.println("Berat Badan Ideal : " + P.HtgBBI()+ "Kg");
            System.out.println("-----------------------");
          }
            System.out.println("Ulangi Program ?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            ulangi = m.nextInt();
            System.out.println("Jawab : ");
            System.out.println("");
      }while(ulangi == 1);
        System.out.println("Trimakasih");
    }
}

