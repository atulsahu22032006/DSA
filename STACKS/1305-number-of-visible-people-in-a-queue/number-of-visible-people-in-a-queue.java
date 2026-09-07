class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            ans[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            while (!st.empty() && heights[st.peek()] <= heights[i]) {
                ans[st.peek()]++;
                st.pop();

            }
            if (!st.empty()) {
                ans[st.peek()]++;
            }
            st.push(i);
        }
        return ans;

    }
}