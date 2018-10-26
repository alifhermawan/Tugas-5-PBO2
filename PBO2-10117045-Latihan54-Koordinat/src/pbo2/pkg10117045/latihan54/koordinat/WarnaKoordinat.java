package pbo2.pkg10117045.latihan54.koordinat;

public class WarnaKoordinat extends Koordinat {

    public String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        setNamaWarna(namaWarna);
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }

}
