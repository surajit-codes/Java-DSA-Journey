package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Rotate List
    * Difficulty: Medium , Level 4/5
    * Platform: LeetCode (https://leetcode.com/problems/rotate-list/)
 */
public class RotateList {
    public Node rotateRight(Node head, int k) {
        if(head == null || head.next == null) return head;
        int length = 1;
        Node tail = head;
        Node temp = head;
        while(tail.next != null){
            length++;
            tail = tail.next;
        }
        int rotation = k%length;
        if(rotation == 0) return head;
        for(int i = 1 ; i < length - rotation ; i++){
            temp = temp.next;
        }
        tail.next = head;
        head = temp.next;
        temp.next = null;
        return head;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
