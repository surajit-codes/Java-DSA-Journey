package DSA_Master_Sheet.Topic_10_BinaryTrees;
/*
    * Problem Name: Diameter of Binary Tree
    * Difficulty: Medium
    * Platform: GFG (https://www.geeksforgeeks.org/problems/diameter-of-binary-tree/1)
 */
public class DiameterOfBT {
    public int diameter(Node root) {
        if(root == null) return 0;
        int a = level(root.right)+level(root.left);
        int b = diameter(root.left);
        int c = diameter(root.right);
        return Math.max(a , Math.max(b,c));
    }
    private int level(Node root){
        if(root == null) return 0;
        return 1 + Math.max(level(root.left) , level(root.right));
    }
}
