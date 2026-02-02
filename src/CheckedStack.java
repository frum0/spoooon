public class CheckedStack extends Stack {
    // поместить значение в стек
    public void put(int a) {
        if (this.isFull()) {
            System.out.println("can't put element: stack is full");
            return;
        }
        super.put(a);
    }

    // вынуть верхнее значение из стека
    public int pull() {
        if (this.isEmpty()){
            System.out.println("can't pull element: stack is empty");
            return  0 ;
        }
        return super.pull();
    }

    // посмотреть верхнее значение в стеке, но не вынимать
    public int get() {
        if (this.isEmpty()){
            System.out.println("can't pull element: stack is empty");
            return  0 ;
        }

        return super.get();
    }
}
