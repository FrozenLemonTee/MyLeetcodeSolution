package Topics.Other.rangeSumBST;

import Utils.Structs.TreeNode;

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return root.val >= low && root.val <= high ?
               rangeSumRecur(root.left, low, high) + rangeSumRecur(root.right, low, high) + root.val :
               rangeSumRecur(root.left, low, high) + rangeSumRecur(root.right, low, high);
    }

    public int rangeSumRecur(TreeNode cur, int low, int high) {
        int sum = 0;
        if (cur.val >= low && cur.val <= high)
            sum += cur.val;
        if (cur.left != null)
            sum += rangeSumRecur(cur.left, low, high);
        if (cur.right != null)
            sum += rangeSumRecur(cur.right, low, high);
        return sum;
    }
}
