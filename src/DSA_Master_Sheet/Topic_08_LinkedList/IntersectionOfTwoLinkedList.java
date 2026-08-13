package DSA_Master_Sheet.Topic_08_LinkedList;
/*
    * Problem Name: Intersection of Two LinkedList
    * Difficulty: Easy , Level 2/5 (DSA_Master_Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/intersection-of-two-linked-lists/)
 */
public class IntersectionOfTwoLinkedList {
    public Node getIntersectionNode(Node headA, Node headB) {
        Node temp1 = headA;
        Node temp2 = headB;
        Node slowA = headA;
        Node slowB = headB;
        int count1 = 0 , count2 = 0 , diff = 0;
        while(temp1 != null){
            count1++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            count2++;
            temp2 = temp2.next;
        }
        if(count2>count1) diff = count2 - count1;
        else diff = count1 - count2;
        while(diff != 0){
            if(count2>count1){
                slowB = slowB.next;
            } else{
                slowA = slowA.next;
            }
            diff--;
        }
        while(slowA != null && slowB != null){
            if(slowA == slowB) return slowA;
            slowA = slowA.next;
            slowB = slowB.next;
        }
        return null;
    }
}
