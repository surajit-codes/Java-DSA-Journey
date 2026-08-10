package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Search in LinkedList
    * Difficulty: Easy , Level 1/5 (DSA_Master_Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1)
 */
public class SearchInLinkedList {
    public boolean searchKey(Node head, int key) {
        Node temp = head;
        while(temp!=null){
            if(temp.val == key) return true; // for GFG Use data instead of val
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
