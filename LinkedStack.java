package datastructure;
import java.util.Scanner;

public class LinkedStack {

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node top;

    void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) { System.out.println("Stack Empty"); return -1; }
        int val = top.data;
        top = top.next;
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedStack s = new LinkedStack();

        System.out.print("How many elements to push? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            s.push(sc.nextInt());
        }

        System.out.print("How many elements to pop? ");
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            System.out.println("Popped: " + s.pop());
        }

        sc.close();
    }
}