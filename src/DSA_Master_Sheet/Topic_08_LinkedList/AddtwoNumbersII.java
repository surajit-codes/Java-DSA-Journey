package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Add Two Number II
    * Difficulty: Medium , Level 4/5 (DSA_Master_Sheet)
    * Platform: LeetCode(https://leetcode.com/problems/add-two-numbers-ii/)
 */
public class AddtwoNumbersII {
    // Use ListNode Instead of Node in LeetCode
    public Node addTwoNumbers(Node l1, Node l2) {
        // reverse 1st list
        Node prev = null;
        Node fwd = null;
        Node cur = l1;
        while(cur != null){
            fwd = cur.next;
            cur.next = prev;
            prev = cur;
            cur = fwd;
        }
        // reverse 2nd list
        Node prev2 = null;
        cur = l2;
        fwd = null;
        while(cur != null){
            fwd = cur.next;
            cur.next = prev2;
            prev2 = cur;
            cur = fwd;
        }
        //add both
        int carry = 0 ;
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node t1 = prev;
        Node t2 = prev2;
        while(t1 != null || t2 != null || carry > 0){
            int sum = carry;
            if(t1 != null){
                sum += t1.val;
                t1 = t1.next;
            }
            if(t2 != null){
                sum += t2.val;
                t2 = t2.next;
            }
            temp.next = new Node(sum%10);
            temp = temp.next;
            carry = sum/10;
        }
        //reverse the answer
        cur = dummy.next;
        fwd = null;
        Node prevr = null;
        while(cur != null){
            fwd = cur.next;
            cur.next = prevr;
            prevr = cur;
            cur = fwd;
        }
        return prevr;
    }
}
