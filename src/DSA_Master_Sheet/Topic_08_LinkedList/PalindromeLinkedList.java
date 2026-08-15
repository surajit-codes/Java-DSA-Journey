package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name : Palindrome LinkedList
    * Difficulty: Easy , Level 2/5 (DSA_Master_Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/palindrome-linked-list/)
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        if(head == null || head.next == null) return true;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        Node prev = null;
        Node current = head2;
        Node forward = head2;
        while(forward != null){
            forward = current.next;
            current.next = prev;
            prev = current;
            current = forward;
        }
        Node i = head;
        Node j = prev;
        while(j!=null){
            if(i.val != j.val) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
    public static void main(String[] args) {
        // for test cases
    }
}
