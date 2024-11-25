// Component yapısı implemente eden üzerine özelliklik eklenebilir olan concrete component yapısı
public class TemelEv implements Ev{
    @Override
    public String aciklama() {
        return "1 Odalı Temel Ev";
    }

    @Override
    public double fiyat() {
        return 25000;
    }
}
