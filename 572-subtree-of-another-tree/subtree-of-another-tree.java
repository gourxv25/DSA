class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String rootString = serialize(root);
        String subString = serialize(subRoot);

        return rootString.contains(subString);
    }

    public String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }

        return "," + root.val +
               serialize(root.left) +
               serialize(root.right);
    }
}