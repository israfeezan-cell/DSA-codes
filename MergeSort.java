package datastructure;

import java.util.Random;

public class MergeSort {

    static void mergeSort(int[] a, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(a, p, q);
            mergeSort(a, q + 1, r);
            merge(a, p, q, r);
        }
    }

    static void merge(int[] a, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        for (int i = 0; i < n1; i++) left[i] = a[p + i];
        for (int j = 0; j < n2; j++) right[j] = a[q + 1 + j];
        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = p; k <= r; k++) {
            if (left[i] <= right[j]) {
                a[k] = left[i++];
            } else {
                a[k] = right[j++];
            }
        }
    }

    public static void main(String[] args) {
        final int N = 100000;
        Random rand = new Random();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = rand.nextInt(1000);

        long start = System.nanoTime();
        mergeSort(a, 0, N - 1);
        long time = System.nanoTime() - start;

        StringBuilder sb = new StringBuilder();
        for (int x : a) sb.append(x).append(' ');
        System.out.println("******** Sorted Array *******");
        System.out.println(sb);

        System.out.println("********** Merge Sort Completed! ********");
        System.out.println("Total Elements:" + N);
        System.out.println("Execution time in NanoSeconds:" + time);
        System.out.println("Execution time in MilliSeconds:" + time / 1000000.0);
    }
}