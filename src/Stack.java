public class Stack {
    private int ptrField;
    private int[] stack = new int[5];

     // поместить значение в стек
    public void put(int a) {
        stack[this.ptrField] = a;
        this.ptrField = this.ptrField+1;
    }

    // вынуть верхнее значение из стека
    public int pull() {
        this.ptrField = this.ptrField-1;
        return this.stack[this.ptrField];
    }
    // посмотреть верхнее значение в стеке, но не вынимать
    public int get() {
        int a = this.ptrField;
        a = a-1;
        return this.stack[a];
    }

    // выдать true если стек полон
    public boolean isFull() {
        return this.ptrField == 5;

    }

    // выдать true если стек пуст
    public boolean isEmpty() {
          return this.ptrField == 0;
    }

}
