package Uke34;

public class Aufgabe1_1_1_5 {
}

/*
package Uke1;

public static void main(String[] args) {
        int[] a = {1, 4, 2, 6, 765, 123, 39210, 11, -99,  -99};

        int min_verdi = min(a);
        System.out.println(min_verdi);
}

public static int maks(int[] a)  // versjon 3 av maks-metoden
        {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
        if (a[i] >= maksverdi)       // denne blir sann til slutt
        {
        if (i == sist)             // sjekker om vi er ferdige
        {
        a[sist] = temp;          // legger siste verdi tilbake
        return temp >= maksverdi ? sist : m;   // er siste størst?
        }
        else
        {
        maksverdi = a[i];        // maksverdi oppdateres
        m = i;                   // m oppdateres
        }
        }
        } // maks
 */