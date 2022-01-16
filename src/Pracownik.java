public class Pracownik implements PracownikI{

    private String imie;
    private int wiek;
    private double wynagrodzenie;
    private int nadgodziny;
    private int stazPracy;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    public int getNadgodziny() {
        return nadgodziny;
    }

    public void setNadgodziny(int nadgodziny) {
        this.nadgodziny = nadgodziny;
    }

    public int getStazPracy() {
        return stazPracy;
    }

    public void setStazPracy(int stazPracy) {
        this.stazPracy = stazPracy;
    }

    public Pracownik(String imie, int wiek, double wynagrodzenie, int nadgodziny, int stazPracy) {
        this.imie = imie;
        this.wiek = wiek;
        this.wynagrodzenie = wynagrodzenie;
        this.nadgodziny = nadgodziny;
        this.stazPracy = stazPracy;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", wynagrodzenie=" + wynagrodzenie +
                ", nadgodziny=" + nadgodziny +
                ", stazPracy=" + stazPracy +
                '}';
    }

    @Override
    public void przedstawSie() {
        System.out.println("Mam na imie " + imie);
    }

    @Override
    public void urodziny() {
        setWiek(getWiek()+1);
    }

    @Override
    public double wyplata(double wynagrodzenie, int nadgodziny) {
        return wynagrodzenie+(nadgodziny*100);
    }

    @Override
    public double premia(int nadgodziny) {
        if (nadgodziny > 50) {
            return 300;
        } else {
            return 0;
        }
    }

    @Override
    public int lataDoEmerytury(int stazPracy) {
        return 65-stazPracy;
    }
}
