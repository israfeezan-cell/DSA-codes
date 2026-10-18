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
        final int N = 100_000;
        Random rand = new Random(42);
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = rand.nextInt(1_000_000);

        long start = System.nanoTime();
        selectionSort(a);
        double ms = (System.nanoTime() - start) / 1_000_000.0;

        System.out.println("Selection Sort, n = " + N);
        System.out.printf("Time: %.2f ms%n", ms);
        System.out.println("Time complexity: O(n^2)");
    }
}


