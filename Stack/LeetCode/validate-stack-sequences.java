class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        int m = popped.length;
        Stack <Integer>st = new Stack<>();
        int i = 0;
        for(int elem : pushed) {
            st.push(elem);
            while(st.size() != 0 && st.peek() == popped[i]) {
                st.pop();
                i++;
            }
        }
        return st.size() == 0;
    }
}