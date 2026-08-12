package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: LinkedList Cycle
    * Difficulty: Easy , Level 2/5 (DSA_Master_Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/linked-list-cycle/)
 */
public class LinkedListCycle {
    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
