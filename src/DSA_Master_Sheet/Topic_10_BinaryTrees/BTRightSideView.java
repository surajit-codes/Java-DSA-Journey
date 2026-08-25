package DSA_Master_Sheet.Topic_10_BinaryTrees;
import java.util.ArrayList;
import java.util.List;
/*
    * Problem Name: Binary Tree Right Side View
    * Difficulty: Medium , Level 4/5(DSA_Master_Sheet)
    * Platform: LeetCode(https://leetcode.com/problems/binary-tree-right-side-view/)
 */
public class BTRightSideView {
    public List<Integer> rightSideView(Node root) {
        List<Integer> list = new ArrayList<>();
        int level = 0;
        helper(root , list , level);
        return list;
    }
    private void helper(Node root , List<Integer> list , int level){
        if(root == null) return;
        if(list.size() == level){
            list.add(root.val);
        }
        helper(root.right , list , level+1);
        helper(root.left , list , level+1);
    }

    public static void main(String[] args) {
        //for test cases
    }
}
