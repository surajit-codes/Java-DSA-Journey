package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Delete Node of a LinkedList
    * Difficulty: Medium , Level 3/5 (DSA_Master_Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/delete-node-in-a-linked-list/)
 */
public class DeleteNodeOfaLinkedList {
    public void deleteNode(Node node) {
        //For LeetCode you have to use ListNode instead of Node
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
