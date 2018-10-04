/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadingMethod;

/**
 *
 * @author Asus
 */
public class TesTugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RatarataNilai r = new RatarataNilai();
        System.out.println("Rata - Rata Nilai 21 dan 13 Adalah : " + r.average(21,13));
         System.out.println("Rata - Rata Nilai 19.5 dan 39.5 Adalah : " + r.average(19.5, 29.5));
          System.out.println("Rata - Rata Nilai 123, 567 dan 744 Adalah : " + r.average(123, 567, 744));
    }
    
}
