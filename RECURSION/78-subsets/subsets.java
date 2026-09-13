class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(int[] nums, int index,
            List<Integer> current,
            List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Don't take
        solve(nums, index + 1, current, ans);

        // Take
        List<Integer> next = new ArrayList<>(current);
        next.add(nums[index]);

        solve(nums, index + 1, next, ans);
    }
}