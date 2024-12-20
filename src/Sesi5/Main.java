package Sesi5;

public class Main {
    public static void main(String[] args) {
        
        //====================Mahasiswa====================
        System.out.println("\n====================Mahasiswa====================");

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("ANDI", 21, "TEKNIK INFORMATIKA");

        // Mengakses atribut public
        System.out.println("NAMA MAHASISWA : " + mahasiswa1.nama); // Output: Andi

        // Mengakses atribut protected (dapat diakses dalam package yang sama)
        System.out.println("USIA MAHASISWA : " + mahasiswa1.usia); // Output: 21

        // Mengakses atribut private menggunakan getter
        System.out.println("JURUSAN MAHASISWA : " + mahasiswa1.getJurusan()); // Output: Teknik Informatika

        // Mengubah nilai atribut private menggunakan setter
        mahasiswa1.setJurusan("SISTEM INFORMASI");
        System.out.println("JURUSAN MAHASISWA SETELAH DIUBAH : " + mahasiswa1.getJurusan()); // Output: Sistem Informasi

        // Menampilkan informasi lengkap mahasiswa
        mahasiswa1.tampilkanInfo();


        //====================Siswa====================
         // Membuat objek Siswa
         System.out.println("\n====================Siswa====================");
         Siswa siswa1 = new Siswa("Andi", 85);
         siswa1.tampilkanInfo();
 
         // Menggunakan setter untuk mengubah nama dan nilai ujian
         siswa1.setNama("Budi");
         siswa1.setNilaiUjian(95);
 
         // Menampilkan informasi yang telah diperbarui
         System.out.println("\nSetelah Diubah:");
         siswa1.tampilkanInfo();
 
         // Menguji validasi dengan memasukkan nilai yang tidak valid
         siswa1.setNilaiUjian(105); // Output: Nilai harus antara 0 dan 100.


        //====================Mobil====================
        System.out.println("\n====================Mobil====================");
        Mobil mobil = new Mobil("Toyota", 2022, 300000000);
        System.out.println("Merk Mobil: " + mobil.merk);
        System.out.println("Tahun Produksi Mobil: " + mobil.tahunProduksi);
        System.out.println("Harga Mobil: " + mobil.getHarga());
        mobil.setHarga(350000000);
        System.out.println("Harga Mobil Setelah diubah: " + mobil.getHarga());
        mobil.tampilkanInfoMobil();


        //====================Nilai====================
        System.out.println("\n====================Nilai====================");
        Nilai nilai = new Nilai();
        
        // Mengisi nilai
        nilai.setQuis(85);  // Mengisi nilai Quis
        nilai.setUTS(70);   // Mengisi nilai UTS
        nilai.setUAS(90);   // Mengisi nilai UAS
        
        // Menampilkan hasil
        System.out.println("Nilai Akhir: " + nilai.getNA());
        System.out.println("Index: " + nilai.getIndex());
        System.out.println("Keterangan: " + nilai.getKeterangan());


        //====================Nilai====================
        System.out.println("\n====================Waktu====================");
        Waktu waktu = new Waktu();
        
        waktu.tambahJam(2);      // Menambah 2 jam
        waktu.tambahMenit(30);   // Menambah 30 menit
        waktu.tampilWaktu();     // Output: 2 jam 30 menit
        
        waktu.tambahWaktu(1, 15); // Menambah 1 jam 15 menit
        waktu.tampilWaktu();      // Output: 3 jam 45 menit
    }
}
    

