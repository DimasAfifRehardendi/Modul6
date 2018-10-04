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
public class Kalkulator implements Operasi{
    double bil1 ;
    double bil2 ; 
    
    public Kalkulator(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    @Override
    public double penjumlahan() {
        return bil1 + bil2;
    }

    @Override
    public double pengurangan() {
        return bil1 - bil2;
    }

    @Override
    public double perkalian() {
        return bil1 * bil2;
    }

    @Override
    public double pembagian() {
       return bil1 / bil2;
    }
    
    
}
