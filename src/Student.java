public class Student implements StudentI{
    private String imie;
    private int wiek;
    private boolean wyspany;
    private double sredniaOcen;

    public Student(String imie, int wiek, boolean wyspany, double sredniaOcen) {
        this.imie = imie;
        this.wiek = wiek;
        this.wyspany = wyspany;
        this.sredniaOcen = sredniaOcen;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public boolean isWyspany() {
        return wyspany;
    }

    public void setWyspany(boolean wyspany) {
        this.wyspany = wyspany;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", wyspany=" + wyspany +
                ", sredniaOcen=" + sredniaOcen +
                '}';
    }

    @Override
    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie);
    }

    @Override
    public void urodziny() {
        setWiek(getWiek()+1);
    }

    @Override
    public void idzNaImpreze(boolean wyspany) {
        if (!wyspany) {
            System.out.println("ide na impreze");
        }
    }

    @Override
    public void idzNaWyklad(boolean wyspany) {
        if (wyspany) {
            System.out.println("tez ide na impreze");
        }
    }

    @Override
    public void stypendium(double sredniaOcen) {
        if (sredniaOcen > 4.50) {
            System.out.println("ma stypendium");
        } else {
            System.out.println("nie ma stypendium");
        }
    }
}
