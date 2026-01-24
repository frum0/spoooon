public class Stack {
    int ptrField;
    private int[] stack = new int[5];

     // поместить значение в стек
    public void put(int a) {
        if (isFull()) {
            System.out.println("can't put element: stack is full");
            return;
        }
        stack[ptrField] = a;
        ptrField = ptrField+1;
    }

    // вынуть верхнее значение из стека
    public int pull() {
        if (isEmpty()){
            System.out.println("can't pull element: stack is empty");
            return  0 ;
        }
        ptrField = ptrField-1;
        return stack[ptrField];
    }
    // посмотреть верхнее значение в стеке, но не вынимать
    public int get() {
        int a = ptrField;
        a = a-1;
        return stack[a];
    }

    // выдать true если стек полон
    public boolean isFull() {
        return ptrField == 5;

    }


    // выдать true если стек пуст
    public boolean isEmpty() {
          return   ptrField == 0;
    }

}
