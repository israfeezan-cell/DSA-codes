package datastructure;

import java.util.Random;

public class BubbleSort {

    static void bubbleSort(int[] data) {
        int n = data.length;
        for (int k = 1; k <= n - 1; k++) {
            int ptr = 0;
            while (ptr < n - k) {
                if (data[ptr] > data[ptr + 1]) {
                    int t = data[ptr];
                    data[ptr] = data[ptr + 1];
                    data[ptr + 1] = t;
                }
                ptr++;
            }
        }
    }

    public static void main(String[] args) {
        final int N = 100000;
        Random rand = new Random();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = rand.nextInt(1000);

        long start = System.nanoTime();
        bubbleSort(a);
        long time = System.nanoTime() - start;

        StringBuilder sb = new StringBuilder();
        for (int x : a) sb.append(x).append(' ');
        System.out.println("******** Sorted Array *******");
        System.out.println(sb);

        System.out.println("********** Bubble Sort Completed! ********");
        System.out.println("Total Elements:" + N);
        System.out.println("Execution time in NanoSeconds:" + time);
        System.out.println("Execution time in MilliSeconds:" + time / 1000000.0);
    }
}