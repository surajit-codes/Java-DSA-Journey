package DSA_Master_Sheet.Topic_10_BinaryTrees;
/*
    * Problem Name: Max depth of a Binary Tree
    * Difficulty: Easy
    * Platform: LeetCode(https://leetcode.com/problems/maximum-depth-of-binary-tree/description/)
 */
public class MaxDepthOfBT {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
