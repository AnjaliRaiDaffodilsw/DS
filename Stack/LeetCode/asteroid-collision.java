class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack <Integer> st = new Stack<>();
        
        for(int ele : asteroids) {
            if(ele > 0) {
                st.push(ele);
            } else {
                while(st.size () != 0 && st.peek() > 0 && st.peek() < -ele) {
                    st.pop();
                }
                if(st.size() != 0 && st.peek() == -ele) st.pop();
                else if(st.size() == 0 || st.peek() < 0) st.push(ele);
                else {
                    
                }
            }
        }
        
        int res[] = new int[st.size()];
        int idx = st.size() - 1;
        
        while(idx >= 0) {
            res[idx] = st.peek();
            st.pop();
            idx--;
        }
        return res;
    }
}