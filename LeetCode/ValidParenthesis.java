class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if(st.size() == 0) {
                    return false;
                } else if(ch == ')' && st.peek() != '(') {
                    return false;
                } else if(ch == ']' && st.peek() != '[') {
                    return false;
                } else if(ch == '}' && st.peek() != '{') {
                    return false;
                } else{
                    st.pop();
                }
            }
        }
        return st.size() == 0;
    }
}