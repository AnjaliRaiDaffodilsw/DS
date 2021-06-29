class Solution {

    public int[] smallestFromLeft(int [] heights) {
    int n = heights.length;
    Stack<Integer> st = new Stack<>();
    int sol[] = new int[n];
    for(int i =0 ; i < n; i++) {
    sol[i] = -1;
    }
    
    for (int i = n - 1; i >= 0; i--)
    {
    while (st.size() != 0 && heights[st.peek()] > heights[i])
    {
    sol[st.peek()] = i;
    st.pop();
    }
    
    st.push(i);
    }
    
    return sol;
    }
    public int[] smallestFromRight(int [] heights) {
    int n = heights.length;
    Stack<Integer> st = new Stack<>();
    int sol[] = new int[n];
    for(int i = 0 ; i < n; i++) {
    sol[i] = n;
    }
    
    for (int i = 0; i < n; i++)
    {
    while (st.size() != 0 && heights[st.peek()] > heights[i])
    {
    sol[st.peek()] = i;
    st.pop();
    }
    
    st.push(i);
    }
    
    return sol;
    }
    public int largestRectangleArea(int[] heights) {
    
    int n = heights.length;
    int[] left = smallestFromLeft(heights);
    int[] right = smallestFromRight(heights);
    
    int area = 0;
    for (int i = 0; i < n; i++)
    {
    int h = heights[i];
    int w = right[i] - left[i] - 1;
    area = Math.max(area, h * w);
    }
    
    return area;
    }
    }