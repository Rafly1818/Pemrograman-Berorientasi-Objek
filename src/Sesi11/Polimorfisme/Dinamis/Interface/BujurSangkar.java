package Sesi11.Polimorfisme.Dinamis.Interface;

public class BujurSangkar implements Bidang2D {
    public double sisi;
    
    public double getKeliling() {
        return 4*sisi;
    }
    
    public double getLuas() {
        return sisi*sisi;
    }    
}
