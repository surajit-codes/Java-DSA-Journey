package DSA_Master_Sheet.Topic_10_BinaryTrees;
/*
    * Problem Name: Sum Of Binary Tree
    * Difficulty: Easy
    * platform: GFG(https://www.geeksforgeeks.org/problems/sum-of-binary-tree/1)
 */
public class SumOfBinaryTree {
    static int sumBT(Node root) {
        if (root == null) return 0;
        return root.val + sumBT(root.left) + sumBT(root.right);
    }

   public static void main(String[] args) {
        //for test cases
    }
}
