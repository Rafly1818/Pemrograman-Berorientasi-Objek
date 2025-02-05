package Sesi12.Polimorfisme.Tugas.OperasiBilangan2;

import Sesi12.Polimorfisme.Tugas.OperasiBilangan2.Abstracts.OperasiBilanganAbs;
import Sesi12.Polimorfisme.Tugas.OperasiBilangan2.FinalClass.OperasiBilanganAbsCetak;
import Sesi12.Polimorfisme.Tugas.OperasiBilangan2.Polimorfisme.OperasiPembagian;
import Sesi12.Polimorfisme.Tugas.OperasiBilangan2.Polimorfisme.OperasiPengurangan;
import Sesi12.Polimorfisme.Tugas.OperasiBilangan2.Polimorfisme.OperasiPenjumlahan;
import Sesi12.Polimorfisme.Tugas.OperasiBilangan2.Polimorfisme.OperasiPerkalian;

public class Main {
    public static void main(String[] args) {
        double A = 6.5, B = 0.5;

        // Array untuk polimorfisme
        OperasiBilanganAbs[] operasiBilangan = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        // Final class untuk mencetak
        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        cetak.cetakSemua(operasiBilangan, A, B);
    }
}