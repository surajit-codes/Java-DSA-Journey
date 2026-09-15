package DSA_Master_Sheet.Topic_10_BinaryTrees;
/*
    * Problem Name: Balanced Tree Check
    * Difficulty: Easy
    * Platform: GFG (https://www.geeksforgeeks.org/problems/check-for-balanced-tree/1)
 */
public class BalancecBT {
    public boolean isBalanced(Node root) {
        if(root == null) return true;
        int lLevel = getLevel(root.left);
        int rLevel = getLevel(root.right);
        if(Math.abs(lLevel - rLevel) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int getLevel(Node root){
        if(root == null) return 0;
        return 1+Math.max(getLevel(root.left),getLevel(root.right));
    }
}
