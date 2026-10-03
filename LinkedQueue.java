package datastructure;
import java.util.Scanner;

public class LinkedQueue {

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node front, rear;

    void enqueue(int val) {
        Node newNode = new Node(val);
        if (rear == null) { front = rear = newNode;
        return; }
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {
        if (front == null) { System.out.println("Queue Empty"); return -1; }
        int val = front.data;
        front = front.next;
        if (front == null) rear = null;
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedQueue q = new LinkedQueue();

        System.out.print("How many elements to enqueue? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            q.enqueue(sc.nextInt());
        }

        System.out.print("How many elements to dequeue? ");
        int d = sc.nextInt();
        for (int i = 0; i < d; i++) {
            System.out.println("Dequeued: " + q.dequeue());
        }

        sc.close();
    }
}