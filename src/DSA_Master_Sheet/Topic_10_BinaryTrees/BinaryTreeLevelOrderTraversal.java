package DSA_Master_Sheet.Topic_10_BinaryTrees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
    * Problem Name: Binary Tree Level Order Traversal
    * Difficulty: Medium , Level 4/5 (DSA_Master_Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/binary-tree-level-order-traversal/description/)
 */
public class BinaryTreeLevelOrderTraversal {
        public List<List<Integer>> levelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            List<List<Integer>> ans = new ArrayList<>();
            if(root == null) return ans;
            q.add(root);
            while(q.size()>0){
                int size = q.size();
                List<Integer> list = new ArrayList<>();
                for(int i = 0 ; i< size; i++){ // until all nodes of the same level added to the list.
                    Node front = q.remove();
                    list.add(front.val);
                    if(front.left != null) q.add(front.left);
                    if(front.right != null) q.add(front.right);
                }
                ans.add(list);
            }
            return ans;
        }

}
