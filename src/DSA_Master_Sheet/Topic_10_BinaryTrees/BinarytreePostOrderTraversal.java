package DSA_Master_Sheet.Topic_10_BinaryTrees;
import java.util.ArrayList;
import java.util.List;
/*
    * Problem Name: Binary Tree PreOrder Traversal
    * Difficulty: Easy , Level 3/5 (DSA_Master_Sheet)
    * Platform: Leetcode(https://leetcode.com/problems/binary-tree-postorder-traversal/)
 */
public class BinarytreePostOrderTraversal {
    public List<Integer> postorderTraversal(Node root) {
        // FOR LeetCode USE TreeNode INSTEAD OF Node
        List<Integer> list = new ArrayList<>();
        helper(root,list);
        return list;
    }
    private void helper(Node root , List<Integer> list){
        if(root == null) return;
        helper(root.left , list);
        helper(root.right , list);
        list.add(root.val);
    }
}
