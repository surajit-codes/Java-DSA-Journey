package DSA_Master_Sheet.Topic_10_BinaryTrees;
/*
    * Problem Name: Minimum in BT
    * Difficulty: Easy
    * Platform: GFG (https://www.geeksforgeeks.org/problems/minimum-element-in-bst/1)
 */
public class MinValueInBT {
    public int minValue(Node root) {
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val , Math.min(minValue(root.left) , minValue(root.right)));
    }
}
