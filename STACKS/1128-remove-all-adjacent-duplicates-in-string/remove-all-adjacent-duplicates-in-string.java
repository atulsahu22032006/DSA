class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        String result = "";
        for (int i = 0; i < n; i++) {
            if (st.empty() || st.peek() != s.charAt(i)) {
                st.push(s.charAt(i));
            } else {
                st.pop();
            }
        }
        while (!st.empty()) {
            result = result + st.peek();
            st.pop();
        }
        String rev = "";
        for (int i = result.length() - 1; i >= 0; i--) {
            rev = rev + result.charAt(i);
        }
        result = rev;
        return result;

    }
}