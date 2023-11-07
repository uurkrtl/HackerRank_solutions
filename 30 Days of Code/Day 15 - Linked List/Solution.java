import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node newNode = new Node(data);

    if (head == null) {
        // If the linked list is empty, set the new node as the head
        head = newNode;
    } else {
        Node current = head;
        while (current.next != null) {
            // Traverse the list to find the last node
            current = current.next;
        }
        // Set the new node as the next node of the last node
        current.next = newNode;
    }

    return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}