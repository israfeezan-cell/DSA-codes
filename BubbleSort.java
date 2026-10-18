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
        final int N = 100_000;
        Random rand = new Random(42);
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = rand.nextInt(1_000_000);

        long start = System.nanoTime();
        bubbleSort(a);
        double ms = (System.nanoTime() - start) / 1_000_000.0;

        System.out.println("Bubble Sort, n = " + N);
        System.out.printf("Time: %.2f ms%n", ms);
        System.out.println("Time complexity: O(n^2)");
    }
}


