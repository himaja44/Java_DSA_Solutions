package LinkedLists;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteAtPosition {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int position = 3;

        Node temp = head;

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}