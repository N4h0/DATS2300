package Uke34;

public class Aufgabe1_2 {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 6, 765, 123, 39210, 11, -99,  -99};

        int min_verdi = min(a);
        System.out.println(min_verdi);
    }



    static int min(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");
        int m = 0;  // indeks til foreløpig største verdi (m for maks)

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] <= a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til største verdi

    } // maks
}
