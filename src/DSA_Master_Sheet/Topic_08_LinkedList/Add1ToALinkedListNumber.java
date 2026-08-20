package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Add 1 to a LinkedList Number
    * Difficulty: Medium , Level 3/5 (DSA_Master_Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1)
 */
public class Add1ToALinkedListNumber {
    public Node addOne(Node head) {
        Node temp = head;
        Node back = head;
        Node prev = null;
        Node cur = head;
        Node fwd = null;
        // reverse the list
        while(cur != null){
            fwd = cur.next;
            cur.next = prev;
            prev = cur;
            cur = fwd;
        }
        back = prev;
        // last dig increment by one
        back.val++;
        // breaking 2 digs num
        while(back.next != null){
            if(back.val == 10){
                back.val = 0;
                back.next.val++;
            }
            back = back.next;
        }
        cur = prev;
        fwd = null;
        back = null;
        //again reverse to make as original structure
        while(cur!=null){
            fwd = cur.next;
            cur.next = back;
            back = cur;
            cur = fwd;
        }
        return back;
    }
}
