package pbo2.pkg10117045.latihan52.siapakamu;

public class Dosen extends Manusia {

    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajarApa() {
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }

}
