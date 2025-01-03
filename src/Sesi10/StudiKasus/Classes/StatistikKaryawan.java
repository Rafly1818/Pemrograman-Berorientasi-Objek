package Sesi13.StudiKasus.Classes;

import Sesi13.StudiKasus.Abstracts.Karyawan;

public class StatistikKaryawan {

    // Static method untuk menghitung rata-rata gaji karyawan
    public static double hitungRataRataGaji(Karyawan[] karyawanList) {
        if (karyawanList.length == 0) return 0;

        double total = 0;
        for (Karyawan karyawan : karyawanList) {
            total += karyawan.hitungGaji();
        }
        return total / karyawanList.length;
    }
}