package pbo2.pkg10117045.latihan52.siapakamu;

/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk menampilkan data dari
 * mahasiswa dan dosen
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dos = new Dosen();
        dos.setNama("Rizki Adam Kurniawan");
        dos.setUmur(27);
        dos.setNip("41227829930");
        dos.setMataKuliah("PBO");

        Mahasiswa mah = new Mahasiswa();
        mah.setNama("Alif Hermawan");
        mah.setUmur(19);
        mah.setNim("10117045");
        mah.setKelas("PBO2");

        System.out.println("NIP DOSEN : "+ dos.getNip());
        dos.siapaKamu();
        System.out.println("Saya "+ dos.getNama()+" umur "+dos.getUmur()+" tahun sedang mengajar matakulah "+dos.getMataKuliah());
        System.out.println("\nNIM MAHASISWA : " + mah.getNim());
        mah.siapaKamu();
        System.out.println("Saya "+mah.getNama()+" umur "+mah.getUmur()+" tahun sedang belajar dikelas "+mah.getKelas());
    }

}
