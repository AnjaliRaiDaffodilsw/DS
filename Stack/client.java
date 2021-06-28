public class client {
    public static void main(String[] args) throws Exception {
        stack st = new stack(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.size());
    }
}
