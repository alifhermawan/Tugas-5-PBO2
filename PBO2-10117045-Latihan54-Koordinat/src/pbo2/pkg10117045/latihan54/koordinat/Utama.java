package pbo2.pkg10117045.latihan54.koordinat;

/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk menampilkan warna
 * koordinat dan koordinat sumbu x dan y
 */
public class Utama {

    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10, 4, "Jingga");
        System.out.println("Warna Koordinat : " + warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + warnaKoordinat.getX() + ", y : " + warnaKoordinat.getY());
    }
}
