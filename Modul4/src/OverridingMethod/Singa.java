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
public class Singa extends Hewan{
    
    void setNama(){
        String nama = "Diablo";
        System.out.println("Nama Singa   : " + nama);
    }
    void setSuara(){
        String suara = "Roaarrr";
        System.out.println("Suara Singa  : " + suara);
    }
    void setBerat(){
        double berat = 10.0;
        System.out.println("Berat Singa  : " + berat);
    }
}
