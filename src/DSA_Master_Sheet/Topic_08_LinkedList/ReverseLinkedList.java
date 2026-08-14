package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Reverse LinkedList
    * Difficulty: Easy , Level 2/5 (DSA_Master_Sheet)
    * Platform: LeetCode(https://leetcode.com/problems/reverse-linked-list/description/)
 */
public class ReverseLinkedList {
    public Node reverseList(Node head) {
        Node cur = head;
        Node prev = null;
        Node fwd = null;
        while(cur != null){
            fwd = cur.next;
            cur.next = prev;
            prev = cur;
            cur = fwd;
        }
        return prev;
    }
    public static void main(String[] args) {
        //for test cases.
    }
}
