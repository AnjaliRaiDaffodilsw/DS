public class client {
    public static void main(String[] args) throws Exception {
       
        stack dt = new stack(10);
        dt.push(10);
        dt.push(20);
        dt.push(30);
        dt.push(40);
        dt.push(50);
        dt.push(60);
        dt.push(70);
        dt.push(80);
        dt.push(90);
        dt.push(100);
        System.out.println(dt.size());
    }
}
