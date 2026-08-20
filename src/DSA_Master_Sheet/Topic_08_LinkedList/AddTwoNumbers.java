package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Add Two Numbers
    * Difficulty: Medium , Level 3/5 (DSA_Master_Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/add-two-numbers/description/)
 */
public class AddTwoNumbers {
    // for LeetCode use ListNode not Node.

    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        int carry =0;
        while(l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            temp.next = new Node(sum % 10);
            temp = temp.next;
            carry = sum / 10;
        }
        return dummy.next;
    }

    /*public Node addTwoNumbers(Node l1, Node l2) {
        Node t1 = l1;
        Node t2 = l2;
        Node dummy = new Node(-1);
        Node temp = dummy;
        int carry = 0 , sum = 0;
        while(t1 != null || t2 != null || carry != 0){
            if(t1 != null && t2 != null) sum = t1.val + t2.val + carry;
            else if(t1 != null) sum = t1.val + carry;
            else if(t2 != null) sum = t2.val + carry;
            else sum = carry;
            Node node = new Node(sum%10);
            temp.next = node;
            temp = node;
            carry = sum/10;
            if(t1 !=null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
        }
        return dummy.next;
    }*/

    public static void main(String[] args) {
        // for test cases
    }
}
