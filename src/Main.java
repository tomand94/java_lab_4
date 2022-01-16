import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */

        String[] tab = {"poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota"};
        Scanner scan = new Scanner(System.in);

        int index;

        boolean error = true;

        do {
            try {
                System.out.println("wprowadz index: ");
                index = Integer.parseInt(scan.next());
                System.out.println(tab[index]);

                error = false;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("za duza liczba");
                scan.next();
            } catch (NumberFormatException ex) {
                System.out.println("zly format");
                scan.next();
            }
        } while (error);



        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

        try {
            String test = null;
            test.toString();
        } catch (NullPointerException ex) {
            throw ex;
        }

        int d = 0;
        int n = 20;
        try {
            int z = n / d;
        } catch (ArithmeticException e) {
            throw e;
        }



    }
}