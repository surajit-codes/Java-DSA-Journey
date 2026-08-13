package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: LinkedList Cycle II
    * Difficulty: Medium , Level 3/5(DSA_Master_Sheet)
    * Platform: LeetCode(https://leetcode.com/problems/linked-list-cycle-ii/description/)
 */
public class LinkedListCycleII {
    public Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null  && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
