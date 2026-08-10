package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Insert At Middle of LinkedList
    * Difficulty: Easy , Level 2/5 (DSA_Master_Sheet)
    * Platform: GFG(https://www.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1)
 */
public class InsertAtMiddleOfLinkedList {
    public Node insertInMiddle(Node head, int x) {
        Node slow = head;
        Node fast = head;
        Node temp = new Node(x);
        if(head == null) return temp;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = slow.next;
        slow.next = temp;
        return head;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
