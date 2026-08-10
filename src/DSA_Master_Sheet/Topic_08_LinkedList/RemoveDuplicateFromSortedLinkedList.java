package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Remove Duplicate from Sorted List
    * Difficulty: Easy , Level 2/5 (DSA_Master_Sheet)
    * Platform: GFG (https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
 */
public class RemoveDuplicateFromSortedLinkedList {
    public Node deleteDuplicates(Node head) {
        if(head == null) return null;
        Node temp = head;
        while(temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            } else temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
