public class Main {
    
    public static void main(String[] args) {
        // 1. Kitap nesnesi üretimi
        Kitap kitap1 = new Kitap("978-975050", "Saatleri Ayarlama Enstitusu", "Ahmet Hamdi Tanpinar");

        // 2. Kitap Kopyası üretimi (Kitap ile ilişkilendirme)
        KitapKopyasi kopya1 = new KitapKopyasi("B001", "Mevcut", kitap1);

        // 3. Kullanıcı üretimi
        Kullanici kullanici1 = new Kullanici("U101", "Ali Yilmaz", "ali@email.com");

        // 4. Ödünç Kaydı üretimi (Kullanıcı ve KitapKopyasi ile ilişkilendirme)
        OduncKaydi kayit1 = new OduncKaydi("KAYIT-1", "03.10.2026", kullanici1, kopya1);

        // 5. Konsola yazdırma
        kayit1.detayGoster();
    }
}

