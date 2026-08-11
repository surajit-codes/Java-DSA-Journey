package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * problem Name : Delete Middle of a Linkedlist
    * Difficulty: Medium , Level 3/5 (DSA_Master_Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)
 */
public class DeleteMiddleOfALinkedList {
    //For LeetCode you have to use ListNode instead of Node
    public Node deleteMiddle(Node head) {
        if(head == null || head.next == null) return null;
        Node slow = head;
        Node fast = head.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    /*public Node deleteMiddle(Node head) {
        //For LeetCode you have to use ListNode instead of Node
        if(head == null || head.next == null) return null;
        Node temp = head;
        Node slow = head;
        Node fast = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(count % 2 != 0){
            slow.val = slow.next.val;
            slow.next = slow.next.next;
        } else slow.next = slow.next.next;
        return head;
    }*/
    public static void main(String[] args) {
        //for test cases
    }
}
