/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoh;

/**
 *
 * @author Asus
 */
public class mainCLass extends overloadingMethod{

    public static void main(String[] args) {
        // TODO code application logic here
        overloadingMethod ovr = new overloadingMethod();
        System.out.println(ovr.hitung(1.5, 2.5));
        System.out.println(ovr.hitung(1, 5));
    }
    double hitung(double nilai1 , double nilai2){
        return nilai1 * nilai2;
    }
    
}
