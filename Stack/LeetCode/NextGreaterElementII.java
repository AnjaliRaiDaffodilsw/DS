class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ngel[] = new int[n];
        Stack<Integer>st = new Stack<>();
        for(int i = 0; i < n; i++) {
            ngel[i] = -1;
        }
        
        for(int i = 0; i < 2 * n; i++) {
            while(st.size() != 0 && nums[st.peek()] < nums[i % n] ) {
                ngel[st.peek()] = nums[i % n];
                st.pop();
            }
            if(i < n ) {
                st.push(i);
            }
        }
        return ngel;
    }
}