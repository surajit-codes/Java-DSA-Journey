package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * problem Name : Reorder List
    * Difficulty: Medium , Level 4/5
    * Platform: LeetCode (https://leetcode.com/problems/reorder-list/description/)
 */
public class ReOrderList { // for leetcode instead of Node use ListNode
    public void reorderList(Node head) {
        if(head == null || head.next == null) return;
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node cur = slow.next;
        Node prev = null;
        Node fwd = null;
        while(cur != null){
            fwd = cur.next;
            cur.next = prev;
            prev = cur;
            cur = fwd;
        }
        slow.next = null;
        Node temp = head;
        while(prev != null){
            fwd = temp.next;
            Node backup = prev.next;
            temp.next = prev;
            prev.next = fwd;
            temp = fwd;
            prev = backup;
        }
    }
    public static void main(String[] args) {
        // for test cases
    }
}
