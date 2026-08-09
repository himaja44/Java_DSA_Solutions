package LinkedLists;    
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        Node list1 = new Node(10);
        list1.next = new Node(30);
        list1.next.next = new Node(50);

        Node list2 = new Node(20);
        list2.next = new Node(40);
        list2.next.next = new Node(60);

        Node dummy = new Node(0);
        Node tail = dummy;

        while (list1 != null && list2 != null) {

            if (list1.data < list2.data) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        if (list1 != null)
            tail.next = list1;
        else
            tail.next = list2;

        Node temp = dummy.next;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}