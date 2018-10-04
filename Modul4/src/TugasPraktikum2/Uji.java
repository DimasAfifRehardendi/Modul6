/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

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
        Operasi m = new Kalkulator(10, 5);
        System.out.println("Masukkan bilangan pertama = 10");
        System.out.println("Masukkan bilangan pertama = 5");
        System.out.println("Hasil Penjumlahan = " + m.penjumlahan());
        System.out.println("Hasil Pengurangan = " + m.pengurangan());
        System.out.println("Hasil Perkalian = " + m.perkalian());
        System.out.println("Hasil Pembagian = " + m.pembagian());
    }
    
}
