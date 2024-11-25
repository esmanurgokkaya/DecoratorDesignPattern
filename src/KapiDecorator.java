// Decorator yani ev deorator yapısını extend eden ve temel ev sınıfına türetme yapmış olan concrete decorator yapısı
public class KapiDecorator extends EvDecorator{
    public KapiDecorator(Ev ev) {
        super(ev);
    }
    @Override
    public String aciklama() {
        return super.aciklama() + ", Kapı";
    }

    @Override
    public double fiyat() {
        return super.fiyat() + 3000;
    }

}
