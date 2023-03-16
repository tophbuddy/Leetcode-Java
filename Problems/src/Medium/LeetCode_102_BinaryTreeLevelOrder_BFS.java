package Medium;

import java.util.*;

public class LeetCode_102_BinaryTreeLevelOrder_BFS {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();

        int size = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            size = queue.size();
            List<Integer> level = new ArrayList();
            while (size > 0) {
                TreeNode cur = queue.poll();
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
                level.add(cur.val);
                size--;
            }
            res.add(level);
        }

        return res;
    }
}
