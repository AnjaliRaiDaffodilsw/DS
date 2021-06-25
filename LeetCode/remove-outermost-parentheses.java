class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int count = 0;
        String str = "";
        for(int i =0; i< n; i++) {
            char ch = s.charAt(i);
            if(ch == '(' && count++ > 0 ) {
                str += ch;
            } else if(ch == ')' && count-- > 1 ) {
                str += ch;
            } else {
                
            } 
        }
        return str;
    }
}