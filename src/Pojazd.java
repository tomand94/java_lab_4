/* Tworzymy interfejs Pojazd */
public interface Pojazd {

    /* deklarujemy metody bez ciała które trzeba uzupelnić w klasie
     * która będzie implementować dany interfejs (musi zaimplementować wszystkie metody)
     * wszystkie metody bez selektora widoczności są metodami publicznymi */
    void setPojazd(String pojazd);

    /* metody nie mają ciała tylko deklarację */
    String getPojazd();

    void start();

    void stop();

    void czasPracy(int czas);

    int zuzycie(int zuzylPaliwa);

    void podsumowanie(int ilePaliwa);
}
