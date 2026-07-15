package Daily_Learning.Day_14_LinkedList_Core;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node ll = new Node(5);
        Node ll2 = new Node(10);
        Node ll3 = new Node(15);
        Node ll4 = new Node(20);
        Node ll5 = new Node (25);
        ll.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;
        ll4.next = ll5;
        Node a = MidList(ll);
        System.out.print("Value Middle of the List is : "+ a.val);
    }
    static Node MidList(Node head){
        // For odd the 2nd middle will be the middle
        Node slow = head ;
        Node fast = head ;
        while(fast!= null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
