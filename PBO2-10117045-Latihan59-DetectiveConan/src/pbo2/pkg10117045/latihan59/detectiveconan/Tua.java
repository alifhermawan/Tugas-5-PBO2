package pbo2.pkg10117045.latihan59.detectiveconan;

public class Tua extends KarakterConan{
    private String ukuranBadan;
    
    
    public Tua(String nama, String pekerjaan, boolean berkacamata) {
        super(nama, pekerjaan, berkacamata);
    }

    public String getUkuranBadan() {
        return ukuranBadan;
    }
    
    public void umur (){
        System.out.println("TUA");
    }

    public void setUkuranBadan(String ukuranBadan) {
        this.ukuranBadan = ukuranBadan;
    }
    
    
}
