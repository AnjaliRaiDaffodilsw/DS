public class stack {

    private int[] arr;
    private int elementCount;
    private int tos;

    protected void initializeValue(int size) {
        arr = new int[size];
        elementCount = 0;
        tos = -1;
    }

    public stack(int size) {
        initializeValue(size);
    }

    public stack() {
        initializeValue(10);
    }

    public void push(int elem) throws Exception {
        if (this.size() == this.Capacity()) {
            throw new Exception("Stack is Full");
        }
        this.arr[++this.tos] = elem;
        this.elementCount++;
    }

    public int pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        int roe = this.arr[this.tos];
        this.arr[this.tos--] = 0;
        this.elementCount--;
        return roe;
    }

    public int peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return this.arr[this.tos];
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
}
