package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Middle of LinkedList
    * Difficulty: Easy , Level 2/5 (DSA_Master_Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/middle-of-the-linked-list/)
 */
public class MiddleOfLinkedList {
    public Node middleNode(Node head) {
        if(head == null) return null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
