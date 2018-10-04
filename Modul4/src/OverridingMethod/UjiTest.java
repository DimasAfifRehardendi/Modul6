package OverridingMethod;

public class UjiTest {

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
