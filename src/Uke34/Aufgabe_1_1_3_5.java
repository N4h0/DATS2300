package Uke34;

import java.util.Arrays;

public class Aufgabe_1_1_3_5 {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 6, 765, 123, 39210, 11, -99, -99};
        System.out.println(Arrays.toString(minmaks(a)));
    }

    public static int[] minmaks(int[] a)
    {
        int[] b = {0, 0};
        for (int i=1; i<a.length; i++)
        {
            if (a[i] < a[b[0]]) b[0] = i;
            if (a[i] > a[b[1]]) b[1] = i;
        }
        return b;
    }
}

