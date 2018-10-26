package pbo2.pkg10117045.latihan60.akatsuki;

/**
 *
 * NAMA                 : Alif Hermawan
 * KELAS                : PBO2
 * NIM                  : 10117045
 * Deskripsi Program    : Program ini berisi perintah untuk Menampilkan
 *                        Data Anggota Akatsuki yang sudah mati
 */
public class Utama {

    public static void main(String[] args) {
        Kakuzu ka = new Kakuzu("Kakuzu", "Takigakure", "Jari tengah kiri");
        ka.setJutsu("Domu, Zokkoku, Gian, Atsugai, Kimen no Buken");

        Sasori sa = new Sasori("Sasori", "Sunagakure", "Jempol kri");
        sa.setJutsu("Shinshin Happa,Senju Sobu, Hyakki no Soen, Satetsu Kesshu, Satetsu Kaiho");

        System.out.println("=== Daftar Anggota Akatsuki Yang Telah Mati ===");
        System.out.println("\n"+ka.nama);
        System.out.println("Asal : " + ka.asal);
        System.out.println("Posisi Cincin : " + ka.posisiCincin);
        System.out.println("Jutsu : " + ka.getJutsu());
        ka.kematian();

        System.out.println("\n"+sa.nama);
        System.out.println("Asal : " + sa.asal);
        System.out.println("Posisi Cincin : " + sa.posisiCincin);
        System.out.println("Jutsu : " + sa.getJutsu());
        sa.kematian();

    }

}
