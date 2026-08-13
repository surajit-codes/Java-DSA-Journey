package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Remove Nth Node From a LinkedList
    * Difficulty: Medium , Level 3/5
    * Platform: LeetCode (https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)
 */
public class RemoveNthNodeFromEndOfALL {
    // ONE PASS
    public Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;
        for(int i=0 ; i<n ; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    // TWO PASS
   /* public Node removeNthFromEnd(Node head, int n) {
        Node temp = head;
        int count = 0;
        if(head == null || head.next == null) return null;
        while(temp!= null){
            temp = temp.next;
            count++;
        }
        int diff = count - n;
        if(diff == 0) return head.next;
        temp = head;
        while(diff>1){
            temp = temp.next;
            diff--;
        }
        temp.next = temp.next.next;
        return head;
    }*/
    public static void main(String[] args) {
        //for test cases
    }
}
