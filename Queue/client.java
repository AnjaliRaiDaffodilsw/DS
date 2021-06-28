public class client {
    public static void main(String[] args) throws Exception {
        queue qu = new queue(10);
        qu.enqueue(10);
        qu.enqueue(20);
        qu.enqueue(30);
        qu.enqueue(40);
        qu.enqueue(50);
        qu.enqueue(60);
        qu.dequeue();
        System.out.println(qu.size());

    }

}
