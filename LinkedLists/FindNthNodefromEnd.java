package LinkedLists;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class FindNthNodefromEnd {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int n = 2;

        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        System.out.println("Nth Node from End = " + second.data);
    }
}