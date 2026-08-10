package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Remove LinkedList Element
    * Difficulty: Easy , Level 2/5
    * Platform: LeetCode(https://leetcode.com/problems/remove-linked-list-elements/)
 */
public class RemoveLinkedListElement {
        public Node removeElements(Node head, int val) {
            Node dummy = new Node(0); // for LeetCode use ListNode instead of Node
            dummy.next = head;
            Node temp = dummy;
            while(temp.next !=null){
                if(temp.next.val == val){
                    temp.next = temp.next.next;
                } else temp = temp.next;
            }
            return dummy.next;
        }
        public static void main(String[] args) {
            //for test cases
        }
}
