package DSA_Master_Sheet.Topic_08_LinkedList;

/*
    * Problem Name: Array to LinkedList
    * Difficulty: Easy , Level 1/5 (DSA_Master_Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1)
 */

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class ArrayToLinkedList {
    public Node arrayToList(int arr[]) {
        Node head = null;
        Node tail = null;
        for(int i = 0 ; i < arr.length ; i++){
            Node temp = new Node(arr[i]);
            if(head == null) head = tail = temp;
            else{
                tail.next = temp;
                tail = temp;
            }
        }
        return head;
    }

    /*public Node arrayToList(int arr[]) {
        // code here
        MyLinkedList ll = new MyLinkedList();
        for(int i =0 ; i< arr.length;i++){
            ll.addAtTail(arr[i]);
        }
        return ll.head;
    }
}
class MyLinkedList{
        Node head;
        Node tail;
        void addAtTail(int val){
            Node temp = new Node(val);
            if(tail == null) head = tail = temp;
            else{
                tail.next = temp;
                tail = temp;
            }
        }*/
}
