/* klasa implementuje interfejs Pojazd */
public class SamochodOsobowy implements Pojazd {
    private int czas;
    private int zuzylPaliwa;
    private String pojazd;

    /* @Override - informuje nas, że nadpisujemy metodę z interfejsu (dodane opcjonalnie) */
    @Override
    public void setPojazd(String pojazd) {
        this.pojazd = pojazd;
    }

    @Override
    public String getPojazd() {
        return pojazd;
    }

    @Override
    public void start() {
        System.out.println("Strat");
    }

    @Override
    public void stop() {
        System.out.println("Stop.");
    }

    @Override
    public void czasPracy(int czas) {
        this.czas = czas;
    }

    @Override
    public int zuzycie(int zuzylPaliwa) {
        this.zuzylPaliwa = zuzylPaliwa;
        return zuzylPaliwa;
    }

    @Override
    public void podsumowanie(int ilePaliwa) {
        start();
        System.out.println(getPojazd() + " jechał " + czas + " godzin,");
        System.out.println("spalił " + zuzycie(ilePaliwa) + " litrów paliwa.");
        stop();
    }
}
