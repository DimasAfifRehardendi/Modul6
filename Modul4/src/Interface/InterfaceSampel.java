/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Asus
 */
public class InterfaceSampel {

    public static void main(String[] args) {
        InterfaceBujurSangkar objek1 = new InterfaceBujurSangkar(10);
        System.out.println("Luas Bujur Sangkar Dengan Sisi 10 = " + objek1.hitungLuas());
        System.out.println("Kelilingya = " + objek1.hitungKeliling());
        System.out.println("\n");
        InterfaceSegitiga objek2 = new InterfaceSegitiga(6,8);
        System.out.println("Luas Segitiga Dengan Alas 6, dan Tinggi 8 = " + objek2.hitungluas());
        System.out.println("Kelilingnya = " + objek2.hitungkeliling());
    }

}
