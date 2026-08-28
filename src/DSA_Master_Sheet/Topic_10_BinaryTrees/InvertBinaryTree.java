package DSA_Master_Sheet.Topic_10_BinaryTrees;
/*
    * Problem Name: Invert Binary Tree
    * Difficulty: Easy
    * Platform: LeetCode(https://leetcode.com/problems/invert-binary-tree/)
 */
public class InvertBinaryTree {
    public Node invertTree(Node root) {
        if(root == null) return root;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
