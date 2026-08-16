package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name : Swap Nodes in Pairs
    * Difficulty: Medium , Level 3/5 (DSA_Master_Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/swap-nodes-in-pairs/)
 */
public class SwapNodesInPairs { // for leetcode use ListNode instead of Node
    public Node swapPairs(Node head) {
        if(head == null || head.next == null) return head;
        Node t1 = head;
        Node prev = null;
        Node newHead = head.next;
        Node t2 = newHead;
        while(t1 != null && t2 !=null){
            Node fwd = t2.next;
            t2.next = t1;
            prev = t1;
            if(fwd == null || fwd.next == null) {
                prev.next = fwd;
                break;
            }
            t2 = fwd.next;
            t1 = fwd;
            prev.next = t2;
        }
        return newHead;
    }
    public static void main(String[] args) {
        // for test cases
    }
}
