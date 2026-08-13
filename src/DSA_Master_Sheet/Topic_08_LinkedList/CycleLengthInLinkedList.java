package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Cycle Length in LinkedList
    * Difficulty: Medium , Level 3/5 (DSA_Master_Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/find-length-of-loop/1)
 */
public class CycleLengthInLinkedList {
    public int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        int count = 1;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycle = true;
                Node temp = slow.next;
                while(temp != slow){
                    count++;
                    temp = temp.next;
                }
                break;
            }
        }
        if(!cycle) return 0;
        return count;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
