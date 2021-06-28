public static int[] solve(int[] arr){
    int n = arr.length;
    int nger[] = new int[n];
    Stack<Integer> st = new Stack<>();
    for(int i = 0; i < n ;i++){
        nger[i] =-1;
    }
    for(int i = 0; i < n; i++){
        while(st.size() != 0 && arr[st.peek()] < arr[i] ) {
            nger[st.peek()] = arr[i];
            st.pop();
        }
        st.push(i);
    }
    return nger;
  }
 
}