package pbo2.pkg10117045.latihan52.siapakamu;

public class Mahasiswa extends Manusia {

    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }

}
