package datastructure;
import java.util.Scanner;

public class CircularQueue {
    int[] arr;
    int front, rear, size, capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int val) {
        if (size == capacity) { System.out.println("Queue Full"); return; }
        rear = (rear + 1) % capacity;
        arr[rear] = val;
        size++;
    }

    int dequeue() {
        if (size == 0) { System.out.println("Queue Empty"); return -1; }
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue capacity: ");
        int capacity = sc.nextInt();
        CircularQueue cq = new CircularQueue(capacity);

        System.out.print("How many elements to enqueue? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            cq.enqueue(sc.nextInt());
        }

        System.out.print("How many elements to dequeue? ");
        int d = sc.nextInt();
        for (int i = 0; i < d; i++) {
            System.out.println("Dequeued: " + cq.dequeue());
        }

        sc.close();
    }
}