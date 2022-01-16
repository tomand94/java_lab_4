
public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów


        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */

        Student student1 = new Student("Tomek",20,false,4.51);
        Student student2 = new Student("Marek",33,true,3.66);
        student1.przedstawSie();
        student1.urodziny();
        student1.idzNaImpreze(student1.isWyspany());
        student1.idzNaWyklad(student1.isWyspany());
        student1.stypendium(student1.getSredniaOcen());
        System.out.println(student1);

        Pracownik pracownik1 = new Pracownik("Ryszard", 66, 2500, 15,40);
        Pracownik pracownik2 = new Pracownik("Maciej", 35, 1999, 5,10);
        pracownik2.przedstawSie();
        pracownik2.urodziny();
        System.out.println("wyplata = " + pracownik2.wyplata(pracownik2.getWynagrodzenie(),pracownik2.getNadgodziny()));
        System.out.println("premia = " + pracownik2.premia(pracownik2.getNadgodziny()));
        System.out.println("lata do emerytury = " + pracownik2.lataDoEmerytury(pracownik2.getStazPracy()));
        System.out.println(pracownik2);
    }
}
