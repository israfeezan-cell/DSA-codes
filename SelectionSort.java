package datastructure;

import java.util.Random;

public class SelectionSort {

    static void selectionSort(int[] a) {
        int n = a.length;
        for (int u = 0; u < n - 1; u++) {
            int temp = a[u];
            int loc = u;
            for (int i = u + 1; i < n; i++) {
                if (temp > a[i]) {
                    temp = a[i];
                    loc = i;
                }
            }
            int t = a[loc];
            a[loc] = a[u];
            a[u] = t;
        }
    }

    public static void main(String[] args) {
        final int N = 100000;
        Random rand = new Random();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = rand.nextInt(1000);

        long start = System.nanoTime();
        selectionSort(a);
        long time = System.nanoTime() - start;

        StringBuilder sb = new StringBuilder();
        for (int x : a) sb.append(x).append(' ');
        System.out.println("******** Sorted Array *******");
        System.out.println(sb);

        System.out.println("********** Selection Sort Completed! ********");
        System.out.println("Total Elements:" + N);
        System.out.println("Execution time in NanoSeconds:" + time);
        System.out.println("Execution time in MilliSeconds:" + time / 1000000.0);
    }
}