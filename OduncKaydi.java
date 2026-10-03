public class OduncKaydi {
  
    private String kayitId;
    private String oduncTarihi;
    private Kullanici kullanici;       // Kullanici sınıfı ile ilişki
    private KitapKopyasi kitapKopyasi; // KitapKopyasi sınıfı ile ilişki

    public OduncKaydi(String kayitId, String oduncTarihi, Kullanici kullanici, KitapKopyasi kitapKopyasi) {
        this.kayitId = kayitId;
        this.oduncTarihi = oduncTarihi;
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyasi;
        this.kitapKopyasi.setDurum("Odunc Verildi");
    }

    public void detayGoster() {
        System.out.println("=== ODUNC KAYDI ===");
        System.out.println("Kayit ID: " + kayitId);
        System.out.println("Kullanici: " + kullanici.getAd());
        System.out.println("Kitap: " + kitapKopyasi.getKitap().getBaslik());
        System.out.println("Barkod: " + kitapKopyasi.getBarkod());
        System.out.println("Durum: " + kitapKopyasi.getDurum());
        System.out.println("Tarih: " + oduncTarihi);
    }
}  

