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
public class InterfaceSegitiga {
    private double alas;
    private double tinggi;
    
    public InterfaceSegitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double hitungluas(){
    return ((alas * tinggi)/2);    
    }
    public double hitungkeliling(){
        return 2 * alas * tinggi;
    }
    
}
