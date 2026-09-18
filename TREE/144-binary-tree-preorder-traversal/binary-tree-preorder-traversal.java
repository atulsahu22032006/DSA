class Solution {

    public void dfs(TreeNode root, List<Integer> ans) {

        if (root == null)
            return;

        // Root
        ans.add(root.val);

        // Left
        dfs(root.left, ans);

        // Right
        dfs(root.right, ans);
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        dfs(root, ans);

        return ans;
    }
}