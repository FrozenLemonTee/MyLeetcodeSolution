package Topics.Other.getTargetCopy;

import Utils.Structs.TreeNode;

import java.util.ArrayDeque;

public class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        ArrayDeque<TreeNode> stack_cloned = new ArrayDeque<>();
        stack_cloned.push(cloned);
        while (!stack_cloned.isEmpty()) {
            TreeNode curr = stack_cloned.pop();
            if (curr.val == target.val) {
                return curr;
            }
            if (curr.right != null){
                stack_cloned.push(curr.right);
            }
            if (curr.left != null){
                stack_cloned.push(curr.left);
            }
        }
        return null;
    }
}
