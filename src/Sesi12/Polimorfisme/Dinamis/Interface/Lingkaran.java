package Sesi12.Polimorfisme.Dinamis.Interface;

public class Lingkaran implements Bidang2D {
    public double radius;
    
    public double getKeliling() {
        return 2*Math.PI*radius;
    }

    public double getLuas() {
        return Math.PI*radius*radius;
    }
}
