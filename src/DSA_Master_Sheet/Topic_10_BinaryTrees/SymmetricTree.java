package DSA_Master_Sheet.Topic_10_BinaryTrees;
/*
    * Problem Name: Symmetric Tree
    * Difficulty: Easy
    * Platform: LeetCode(https://leetcode.com/problems/symmetric-tree/description/)
 */
public class SymmetricTree {
    // For LeetCode use TreeNode instead of Node
    public boolean isSymmetric(Node root) {
        return symm(root.left , root.right);
    }
    private boolean symm(Node p , Node q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return symm(p.left , q.right) && symm(p.right , q.left);
    }
}
