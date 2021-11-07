public interface Pojazd {

    void setPojazd(String pojazd);
    String getPojazd();

    void start();
    void stop();
    void czasPracy(int czas);
    int zuzycie(int zuzylPaliwa);

    void podsumowanie(int ilePaliwa);
}
