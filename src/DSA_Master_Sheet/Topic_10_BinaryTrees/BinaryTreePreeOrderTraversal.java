package DSA_Master_Sheet.Topic_10_BinaryTrees;
import java.util.ArrayList;
import java.util.List;
/*
    * Problem Name: Binary Tree PreOrder Traversal
    * Difficulty: Easy , Level 3/5 (DSA_Master_Sheet)
    * Platform: GFG + Leetcode
    * LeetCode(https://leetcode.com/problems/binary-tree-preorder-traversal/description/)
    * GFG (https://www.geeksforgeeks.org/problems/preorder-traversal/1)
 */

public class BinaryTreePreeOrderTraversal {
    public List<Integer> preorderTraversal(Node root) {
        // FOR GFG USE data INSTEAD OF val
        // FOR LeetCode USE TreeNode INSTEAD OF Node
        List<Integer> list = new ArrayList<>();
        return helper(root , list);
    }
    private List<Integer> helper(Node root , List<Integer> list){
        if(root == null) return list;
        list.add(root.val);
        helper(root.left , list);
        helper(root.right , list);
        return list;
    }
}
