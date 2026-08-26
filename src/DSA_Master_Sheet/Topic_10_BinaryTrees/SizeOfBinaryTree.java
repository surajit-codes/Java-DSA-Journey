package DSA_Master_Sheet.Topic_10_BinaryTrees;
/*
    * Problem Name: Size Of a BinaryTree
    * Difficulty: Easy
    * Platform: GFG (https://www.geeksforgeeks.org/problems/size-of-binary-tree/1)
 */
public class SizeOfBinaryTree {
    public int getSize(Node root) {
        if(root == null) return 0;
        return 1+ getSize(root.left)+getSize(root.right);

    }
}
