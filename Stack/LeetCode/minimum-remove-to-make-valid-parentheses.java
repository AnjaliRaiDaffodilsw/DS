class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < n; i++) {
            char ch = arr[i];
            if(ch == '(') {
                st.push(i);
            } else if(ch == ')') {
                if(st.size() != 0) st.pop();
                else {
                    arr[i] = '#';
                }
            }
        }
        while(st.size() != 0) {
            arr[st.pop()] = '#';
        }
        
     StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(arr[i] != '#') {
                sb.append(arr[i]);
            }
              
        }
        return sb.toString();
    }
}