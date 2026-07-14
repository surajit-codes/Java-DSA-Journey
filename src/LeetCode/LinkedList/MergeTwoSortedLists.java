package LeetCode.LinkedList;
/*
    * TOPIC - LinkedList
    * Merge Two Sorted ListS
    * LeetCode 21 (TAG - EASY)
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class MergeTwoSortedLists {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode temp = new ListNode(-1);
            ListNode d = temp;
            ListNode t1 = list1;
            ListNode t2 = list2;
            while (t1 != null && t2 != null) {
                if (t1.val < t2.val) {
                    d.next = t1;
                    d = t1;
                    t1 = t1.next;
                } else {
                    d.next = t2;
                    d = t2;
                    t2 = t2.next;
                }
            }
            if (t1 != null) d.next = t1;
            else d.next = t2;
            return temp.next;
        }
        public static void main(String[] args){

        }
}
