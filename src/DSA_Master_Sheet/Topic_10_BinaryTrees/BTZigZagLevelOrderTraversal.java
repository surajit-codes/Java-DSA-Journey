package DSA_Master_Sheet.Topic_10_BinaryTrees;
import java.util.*;
/*
    * Problem Name: Binary Tree ZigZag level Order Traversal
    * Difficulty: Medium , Level 4/5 (DSA_Master_Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
 */
public class BTZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(Node root) {
        int round = 1;
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);
        while(q.size()>0){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0 ; i <size ; i++){
                Node front = q.remove();
                list.add(front.val);
                if(front.left != null) q.add(front.left);
                if(front.right != null) q.add(front.right);
            }
            if(round % 2 == 0){
                Collections.reverse(list);
            }
            ans.add(list);
            round++;
        }
        return ans;
    }
}
