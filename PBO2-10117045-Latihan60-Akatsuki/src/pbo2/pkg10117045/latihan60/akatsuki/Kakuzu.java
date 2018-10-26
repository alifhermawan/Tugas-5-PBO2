package pbo2.pkg10117045.latihan60.akatsuki;

public class Kakuzu extends Akatsuki {

    private String jutsu;

    public Kakuzu(String nama, String asal, String posisiCincin) {
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
        System.out.println("Mati karena diserang oleh Naruto  dengan jutsu barunya (Rasenshuriken)");
    }

    
}
