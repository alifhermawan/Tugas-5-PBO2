package pbo2.pkg10117045.latihan55.handphone;

/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk menampilkan spesifikasi
 * hp dari berbagai sistem operasi
 */
public class Utama {

    public static void main(String[] args) {
        // TODO code application logic here
        Android an = new Android("Samsung", "Android", "Grand", 30000000);
        an.setKeyStore("234ibfd3840fo");
        BlackBerry bl = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        bl.setPinBB("BHS249");
        WindowsPhone wi = new WindowsPhone("Nokia", "Win8", "Lumia", 10000000);
        wi.setWpKeyStore("UUUQIJWORJ");

        an.displayProduct();
        System.out.println("Android Key Store : " + an.getKeyStore() + "\n");
        bl.displayProduct();
        System.out.println("PIN : " + bl.getPinBB() + "\n");
        wi.displayProduct();
        System.out.println("Wp Key Store : " + wi.getWpKeyStore() + "\n");

    }

}
