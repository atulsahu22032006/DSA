class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        // Right Smaller
        for (int i = n - 1; i >= 0; i--) {

            while (!st.empty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            right[i] = st.empty() ? n : st.peek();

            st.push(i);
        }

        // Clear stack
        st.clear();

        // Left Smaller
        for (int i = 0; i < n; i++) {

            while (!st.empty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            left[i] = st.empty() ? -1 : st.peek();

            st.push(i);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {

            int width = right[i] - left[i] - 1;

            int currArea = heights[i] * width;

            ans = Math.max(ans, currArea);
        }

        return ans;
    }
}