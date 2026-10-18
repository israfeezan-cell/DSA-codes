package datastructure;

import java.util.Random;

public class InsertionSort {
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
        final int N = 100_000;
        Random rand = new Random(42);
        int[] a = new int[N + 1];
        for (int i = 1; i <= N; i++) a[i] = rand.nextInt(1_000_000);

        long start = System.nanoTime();
        insertionSort(a, N);
        double ms = (System.nanoTime() - start) / 1_000_000.0;

        System.out.println("Insertion Sort, n = " + N);
        System.out.printf("Time: %.2f ms%n", ms);
        System.out.println("Time complexity: O(n^2) worst/average, O(n) best");
    }
}


