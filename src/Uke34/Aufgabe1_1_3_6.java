package Uke34;

public class Aufgabe1_1_3_6 {
    public static void main(String[] args) {
    System.out.println(fakultet(10));
    }

    public static int fakultet(int n) {
        int N=1;
        for (int j = 1; j <= n; j++) {
        N = N*j;
        }
        return N;
    }
}