/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Asus
 */
public class Abstractsampel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bangunDatar objek1 = new bujurSangkar(10);
        System.out.println("Luas Bujur Sangkar Dengan Sisi 10 = " + objek1.hitungluas());
        System.out.println("Kelilingnya  = " + objek1.hitungkeliling());
        System.out.println("\n");
        bangunDatar objek2 = new Lingkaran(7);
        System.out.println("Luas Lingkarang Dengan Jari - Jari 7 = " + objek2.hitungluas());
        System.out.println("Kelilingnya = " + objek2.hitungkeliling());
        System.out.println("\n");
    }
    
}
