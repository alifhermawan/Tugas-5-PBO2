package pbo2.pkg10117045.latihan60.akatsuki;

public class Sasori extends Akatsuki {

    private String jutsu;

    public Sasori(String nama, String asal, String posisiCincin) {
        super(nama, asal, posisiCincin);
    }

    public String getJutsu() {
        return jutsu;
    }

    public void setJutsu(String jutsu) {
        this.jutsu = jutsu;
    }

    @Override
    public void kematian() {
        System.out.println("Mati karena dikalahkan oleh Chino dengan menusuk jantung"
                + " Sasori dengan menggunakan replika boneka kedua orang tua Sasori");
    }

}
