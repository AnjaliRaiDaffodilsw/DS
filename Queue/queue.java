public class queue {
    private int arr[];
    private int elementCount;
    private int rear;
    private int front;

    protected void initializeValue(int size) {
        arr = new int[size];
        elementCount = 0;
        rear = 0;
        front = 0;
    }

    public queue(int size){
        initializeValue(size);
    }

    public queue() {
        initializeValue(10);
    }

    public int size() {
        return this.elementCount;
    }

    public int Capacity() {
        return this.arr.length;
    }

    public boolean isEmpty() {
        return this.elementCount == 0;
    }
    public void enqueue(int elem) throws Exception {
        if (this.size() == this.Capacity()) {
            throw new Exception("Stack is Full");
        }

        this.arr[this.rear] = elem;
        this.rear = (this.rear + 1 ) % this.Capacity();
        this.elementCount++;
    }

    public int dequeue () throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is Empty");
        }

        int ros = this.arr[this.front];
        this.arr[this.front] = 0;
        this.front = (this.front + 1) % this.Capacity();
        this.elementCount--;
        return ros;
    }

}
