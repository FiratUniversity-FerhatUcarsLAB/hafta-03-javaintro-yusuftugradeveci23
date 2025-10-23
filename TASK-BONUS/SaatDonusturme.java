public class SaatDonusturmeTemel {
    public static void main(String[] args) {
        int toplamSaniye = 3665; // örnek değer
        int saat = toplamSaniye / 3600;
        int kalan = toplamSaniye - (saat * 3600);
        int dakika = kalan / 60;
        int saniye = kalan - (dakika * 60);

        System.out.println("Saat: " + saat + " Dakika: " + dakika + " Saniye: " + saniye);
    }
}
