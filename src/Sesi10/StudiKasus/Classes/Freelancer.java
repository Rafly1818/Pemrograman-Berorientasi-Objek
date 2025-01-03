package Sesi13.StudiKasus.Classes;

import Sesi13.StudiKasus.Abstracts.Karyawan;

public class Freelancer extends Karyawan {
    private double tarifPerJam;
    private int jumlahJam;

    public Freelancer(String nama, double tarifPerJam, int jumlahJam) {
        super(nama, 0); // Gaji pokok tidak digunakan
        this.tarifPerJam = tarifPerJam;
        this.jumlahJam = jumlahJam;
    }

    @Override
    public double hitungGaji() {
        return tarifPerJam * jumlahJam;
    }
}
