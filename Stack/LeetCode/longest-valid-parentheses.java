class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>st = new Stack<>();
        st.push(-1);
        int n = s.length();
        int len = 0;
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(st.peek() != -1 && ch == ')' && s.charAt(st.peek()) == '(') {
                st.pop();
                len = Math.max(len,i - st.peek());
            } else {
                st.push(i);
            }
        }
        return len ;
    }
}