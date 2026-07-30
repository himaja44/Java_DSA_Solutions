package LinkedLists;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchElement {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int key = 20;
        boolean found = false;

        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                found = true;
                break;
            }

            temp = temp.next;
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}