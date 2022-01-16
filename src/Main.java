public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Kwadrat kwadrat1 = new Kwadrat(5);
        System.out.println(kwadrat1.obwod());
        System.out.println(kwadrat1.pole());

        Prostokat prostokat1 = new Prostokat(3,10);
        System.out.println(prostokat1.obwod());
        System.out.println(prostokat1.pole());
    }
}
