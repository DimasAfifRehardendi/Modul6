/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverridingMethod;

/**
 *
 * @author Asus
 */
public class UjiTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan h = new Hewan();
        Kucing k = new Kucing();
        Singa s = new Singa();
        
        System.out.println("***** HEWAN DEFAULT *****");
        h.setNama();
        h.setSuara();
        h.setBerat();
        System.out.println();
        
        System.out.println("##### HEWAN KUCING #####");
        k.setNama();
        k.setSuara();
        k.setBerat();
        System.out.println();
        
        System.out.println("@@@@@ HEWAN SINGAN @@@@@");
        s.setNama();
        s.setSuara();
        s.setBerat();
        
    }
    
}
