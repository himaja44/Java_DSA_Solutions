package LinkedLists;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class InsertAtPosition {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(30);

        int position = 2;

        Node newNode = new Node(20);

        Node temp = head;

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}