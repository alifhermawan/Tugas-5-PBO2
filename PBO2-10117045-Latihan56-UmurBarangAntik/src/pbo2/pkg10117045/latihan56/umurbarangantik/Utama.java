package pbo2.pkg10117045.latihan56.umurbarangantik;

/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk menampilkan nama barang
 * antik dan umurnya
 */
public class Utama {

    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik : "+radio.getName());
        System.out.println("Umur barang antik ini adalah "+ radio.umur + " tahun.");
    }
}
