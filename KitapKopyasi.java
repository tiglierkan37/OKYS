public class KitapKopyasi {
 
    private String barkod;
    private String durum; 
    private Kitap kitap; // Kitap sınıfı ile ilişki

    public KitapKopyasi(String barkod, String durum, Kitap kitap) {
        this.barkod = barkod;
        this.durum = durum;
        this.kitap = kitap;
    }

    public String getBarkod() { return barkod; }
    public String getDurum() { return durum; }
    public void setDurum(String durum) { this.durum = durum; }
    public Kitap getKitap() { return kitap; }
}  

