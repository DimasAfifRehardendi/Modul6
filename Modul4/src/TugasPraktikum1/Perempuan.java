/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author Asus
 */
public class Perempuan extends Manusia{
        private double TB;
    
    public Perempuan(double TB){
        this.TB = TB;
    }
    @Override
    public double TB() {
        return TB;
    }

    @Override
    public double HtgBBI() {
      return (TB - 100) - ((TB - 100)*0.15);
    }
}
