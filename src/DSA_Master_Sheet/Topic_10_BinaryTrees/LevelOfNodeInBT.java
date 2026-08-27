package DSA_Master_Sheet.Topic_10_BinaryTrees;
/*
    * Problem Name: Level of Node in BinaryTree
    * Difficulty: Easy
    * Platform: GFG(https://www.geeksforgeeks.org/problems/level-of-a-node-in-binary-tree/1)
 */
public class LevelOfNodeInBT {
    int getLevel(Node root, int data) {
        return helper(root , data ,0);
    }
    int helper(Node root , int data , int level){
        if(root == null) return 0;
        if(root.val == data) return level+1;
        int left = helper(root.left , data , level+1);
        if(left!= 0) return left;
        int right = helper(root.right , data , level+1);
        if(right !=0) return right;
        return 0;
    }
}
