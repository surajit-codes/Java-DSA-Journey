package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Odd Even LinkedList
    * Difficulty: Medium , Level 3/5
    * Platform: LeetCode (https://leetcode.com/problems/odd-even-linked-list/)
 */
public class OddEvenLinkedList { //for leetcode use ListNode instead of Node
    public Node oddEvenList(Node head) {
        if(head == null || head.next == null) return head;
        Node t1 = head;
        Node evenHead = head.next;
        Node t2 = evenHead;
        while(t2!= null && t2.next != null){
            t1.next = t1.next.next;
            t1 = t1.next;
            t2.next = t2.next.next;
            t2 = t2.next;
        }
        t1.next = evenHead;
        return head;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
