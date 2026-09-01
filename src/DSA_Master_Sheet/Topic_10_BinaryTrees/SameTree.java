package DSA_Master_Sheet.Topic_10_BinaryTrees;
/*
    * Problem Name: Same Tree
    * Difficulty: Easy
    * Platform: LeetCode (https://leetcode.com/problems/same-tree/)
 */
public class SameTree {
    // For LeetCode use TreeNode instead of Node
    public boolean isSameTree(Node p, Node q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left , q.left) && isSameTree(p.right , q.right);
    }
}
