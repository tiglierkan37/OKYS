public class Kullanici {
     
    private String kullaniciId;
    private String ad;
    private String eposta;

    public Kullanici(String kullaniciId, String ad, String eposta) {
        this.kullaniciId = kullaniciId;
        this.ad = ad;
        this.eposta = eposta;
    }

    public String getKullaniciId() { return kullaniciId; }
    public String getAd() { return ad; }
    public String getEposta() { return eposta; }
}

