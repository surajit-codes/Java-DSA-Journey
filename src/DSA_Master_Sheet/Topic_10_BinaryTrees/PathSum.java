package DSA_Master_Sheet.Topic_10_BinaryTrees;
/*
    * Problem Name: Path Sum
    * Difficulty: Easy
    * Platform: LeetCode(https://leetcode.com/problems/path-sum/)
 */
public class PathSum {
    public boolean hasPathSum(Node root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null){
            if(targetSum == root.val) return true;
            return false;
        }
        return  hasPathSum(root.left , targetSum-root.val) || hasPathSum(root.right , targetSum-root.val);
    }
}
