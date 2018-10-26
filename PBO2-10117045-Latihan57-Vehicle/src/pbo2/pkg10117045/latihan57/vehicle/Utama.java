package pbo2.pkg10117045.latihan57.vehicle;

/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk menampilkan spesifikasi
 * dari sebuah sepeda dan sketboard
 */
public class Utama {

    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bi = new Bicycle();
        bi.setMyBrand("Trek Bike");
        bi.setMyModel("7.4FX");
        bi.setMyGearCount(23);
        System.out.println("Brand : "+ bi.getMyBrand());
        System.out.println("Model : "+ bi.getMyModel());
        System.out.println("Jumlah Gear : "+ bi.getMyGearCount()+"\n");

        Skateboard sk = new Skateboard();
        sk.setMyBrand("Ally Skate");
        sk.setMyModel("Rocket");
        sk.setMyBoardLenght(54.5);
        System.out.println("Brand : " + sk.getMyBrand());
        System.out.println("Model : "+ sk.getMyModel());
        System.out.println("Panjangnya Board : "+ sk.getMyBoardLenght());
    }

}
