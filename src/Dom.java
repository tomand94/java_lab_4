public class Dom implements Budynek{

    private double pow;
    private String adres;
    private int value;
    private int liczbaMieszkancow;
    private KolorEnum kolor;

    public Dom(double pow, String adres, int value, int liczbaMieszkancow, KolorEnum kolor) {
        this.pow = pow;
        this.adres = adres;
        this.value = value;
        this.liczbaMieszkancow = liczbaMieszkancow;
        this.kolor = kolor;
    }

    public double wywozSmieci(int liczbaMieszkancow) {
        return liczbaMieszkancow*50;
    }

    @Override
    public double powierzchnia(double pow) {
        return pow;
    }

    @Override
    public String adresBudynku(String adres) {
        return adres;
    }

    @Override
    public int liczbaOkien(int value) {
        return value;
    }

    @Override
    public void liczbaMieszkancow(int liczbaMieszkancow) {
        System.out.println("Liczba mieszkancow = " + liczbaMieszkancow);
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        System.out.println("twoj ulubiony kolor: " + kolor);
    }

    @Override
    public void czynsz(double powierzchnia, int liczbaMieszkancow) {
        System.out.println("Czynsz = " + (powierzchnia*liczbaMieszkancow*2));
    }

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getLiczbaMieszkancow() {
        return liczbaMieszkancow;
    }

    public void setLiczbaMieszkancow(int liczbaMieszkancow) {
        this.liczbaMieszkancow = liczbaMieszkancow;
    }

    public KolorEnum getKolor() {
        return kolor;
    }

    public void setKolor(KolorEnum kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "pow=" + pow +
                ", adres='" + adres + '\'' +
                ", value=" + value +
                ", liczbaMieszkancow=" + liczbaMieszkancow +
                ", kolor=" + kolor +
                '}';
    }
}
