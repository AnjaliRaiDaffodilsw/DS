public class dynamicstack extends stack{
    dynamicstack() {
        super();
    }

    dynamicstack(int size) {
        super(size);
    }

    @Override

    public void push(int elem) {
        if(super.size() == super.capacity()) {
            int cap = super.Capacity();
            int idx= cap - 1;
            int temp[] = new int[cap];

            while(super.size() != 0) {
                temp[idx] = super.pop();
            }

            idx = 0;
            super.initializeValue(2 * cap);

            while(idx < cap) {
                super.push(temp[idx]);
            }
        }
        super.push(elem);
    }
}
