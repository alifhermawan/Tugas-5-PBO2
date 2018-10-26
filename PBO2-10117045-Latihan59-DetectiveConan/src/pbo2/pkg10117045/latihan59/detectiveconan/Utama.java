package pbo2.pkg10117045.latihan59.detectiveconan;

/**
 *
 * NAMA                 : Alif Hermawan
 * KELAS                : PBO2
 * NIM                  : 10117045
 * Deskripsi Program    : Program ini berisi perintah untuk Menampilkan
 *                        Data Tokoh Detective Conan
 */
public class Utama {

    public static void main(String[] args) {
        Tua tu = new Tua("Koguro Mouri", "Detektif", false);
        tu.setUkuranBadan("Besar");
        Tua tu1 = new Tua("Eri Kisaki", "Pengacara", true);
        tu1.setUkuranBadan("Besar");
        Muda mu = new Muda("Conan Edogawa", "Siswa di SMU Teitan", true);
        mu.setUkuranBadan("Kecil");
        Muda mu1 = new Muda("Ran Mouri", "Siswi di SMU Teitan", false);
        mu1.setUkuranBadan("Besar");

        System.out.println("=== Menampilkan Tokoh Dalam Animasi Detective Conan ===");
        tu.umur();
        System.out.println("Nama : " + tu.nama);
        System.out.println("Pekerjaan : " + tu.pekerjaan);
        System.out.println("Berkacamata : " + tu.berkacamata);
        System.out.println("Ukuran/Bentuk Badan : " + tu.getUkuranBadan() + "\n");

        System.out.println("Nama : " + tu1.nama);
        System.out.println("Pekerjaan : " + tu1.pekerjaan);
        System.out.println("Berkacamata : " + tu1.berkacamata);
        System.out.println("Ukuran/Bentuk Badan : " + tu1.getUkuranBadan() + "\n");

        mu.umur();
        System.out.println("Nama : " + mu.nama);
        System.out.println("Pekerjaan : " + mu.pekerjaan);
        System.out.println("Berkacamata : " + mu.berkacamata);
        System.out.println("Ukuran/Bentuk Badan : " + mu.getUkuranBadan() + "\n");

        System.out.println("Nama : " + mu1.nama);
        System.out.println("Pekerjaan : " + mu1.pekerjaan);
        System.out.println("Berkacamata : " + mu1.berkacamata);
        System.out.println("Ukuran/Bentuk Badan : " + mu1.getUkuranBadan() + "\n");
    }

}
