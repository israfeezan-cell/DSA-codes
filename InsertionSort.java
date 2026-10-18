package datastructure;

import java.util.Random;

public class InsertionSort {

    // a[0] is the -infinity sentinel, data is stored in a[1..n]
    static void insertionSort(int[] a, int n) {
        a[0] = Integer.MIN_VALUE;
        for (int k = 2; k <= n; k++) {
            int temp = a[k];
            int ptr = k - 1;
            while (temp < a[ptr]) {
                a[ptr + 1] = a[ptr];
                ptr--;
            }
            a[ptr + 1] = temp;
        }
    }

    public static void main(String[] args) {
        final int N = 100000;
        Random rand = new Random();
        int[] a = new int[N + 1];
        for (int i = 1; i <= N; i++) a[i] = rand.nextInt(1000);

        long start = System.nanoTime();
        insertionSort(a, N);
        long time = System.nanoTime() - start;

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) sb.append(a[i]).append(' ');
        System.out.println("******** Sorted Array *******");
        System.out.println(sb);

        System.out.println("********** Insertion Sort Completed! ********");
        System.out.println("Total Elements:" + N);
        System.out.println("Execution time in NanoSeconds:" + time);
        System.out.println("Execution time in MilliSeconds:" + time / 1000000.0);
    }
}