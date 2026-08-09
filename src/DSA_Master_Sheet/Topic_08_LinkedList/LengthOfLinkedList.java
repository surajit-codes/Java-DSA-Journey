package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Length of a LinkedList
    * Difficulty: Easy , Level 1/5 (DSA_Master_Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1)
 */
public class LengthOfLinkedList {
    public int getCount(Node head) {
        int count =0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
