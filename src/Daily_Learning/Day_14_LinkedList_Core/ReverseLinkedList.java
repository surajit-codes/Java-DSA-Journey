package Daily_Learning.Day_14_LinkedList_Core;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node ll = new Node(5);
        Node ll2 = new Node(10);
        Node ll3 = new Node(15);
        Node ll4 = new Node(20);
        ll.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;
        Node a = RevList(ll);
        display(a);
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    static Node RevList(Node head){
        Node current = head;
        Node prev = null;
        while(current != null){
           Node forward = current.next;
            current.next = prev;
            prev = current;
            current = forward;
        }
        return prev;
    }
}
