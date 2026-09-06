class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        // Fill answer with -1
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        Stack<Integer> s = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            while (!s.empty() && nums[s.peek()] <= nums[i % n]) {
                s.pop();
            }

            ans[i % n] = s.empty() ? -1 : nums[s.peek()];

            s.push(i % n);
        }

        return ans;
    }
}