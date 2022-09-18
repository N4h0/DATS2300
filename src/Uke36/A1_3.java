package Uke36;

import java.util.Arrays;

import static hjelpeklasser.Tabell.nestePermutasjon;

public class A1_3 {
    public static void main(String[] args) {

            int[] a = {2, 3, 6, 1, 4, 5}; // 1 er ikkje større enn 6. 2,3,6,1,5,4
        int[] b = {2, 3, 6, 1, 5, 4}; // 2,3,6,1,5,4 --> 2,3,6,4,5,1 -->2,3,6,4,1,5
        int[] c = {2, 3, 1, 6, 5, 4}; //2,3,1,6,5,4 --> 2,3,4,6,5,1 --> 2,3,4,1,5,6
        int[] d = {2, 3, 6, 5, 4, 1}; //2,3,6,5,4,1 --> 2,4,6,5,3,1 --> 2,4,1,3,5,6
        int[] e = {2, 6, 5, 4, 3, 1}; //2,6,5,4,3,1 --> 3,6,5,4,2,1 --> 3,1,2,4,5,6

        //1.  Start bakerst og gå mot venstre så lenge som det er sortert.
        //2. Bytt dette tallet med det minste av de til høyre som er større.
        //3. Snu så alle tallene til høyre for posisjon x
        nestePermutasjon(e);
        System.out.println(Arrays.toString(e));

    }
}