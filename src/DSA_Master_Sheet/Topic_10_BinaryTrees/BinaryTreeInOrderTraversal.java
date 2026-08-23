package DSA_Master_Sheet.Topic_10_BinaryTrees;
import java.util.ArrayList;
import java.util.List;
/*
    * Problem Name: Binary Tree Inorder Traversal
    * Difficulty: Easy , Level 3/5 (DSA_Master_Sheet)
    * Platform: LeetCode + GFG
    * LeetCode (https://leetcode.com/problems/binary-tree-inorder-traversal/)
    * GFG (https://www.geeksforgeeks.org/problems/inorder-traversal/1)
 */

public class BinaryTreeInOrderTraversal {
    public List<Integer> inorderTraversal(Node root) {
        // FOR GFG USE data INSTEAD OF val
        // FOR LeetCode USE TreeNode INSTEAD OF Node
        List<Integer> list = new ArrayList<>();
        helper(root , list);
        return list;
    }
    private void helper(Node root ,List<Integer> list){
        if(root == null) return;
        helper(root.left , list);
        list.add(root.val);
        helper(root.right , list);
    }
}
