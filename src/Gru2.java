public class Gru2 {
    int intField;
    public static void main(String[] args){
        Stack st = new Stack();
        st.put(243324);
        st.put(24332);
        st.put(2433);
        st.put(254);
        st.put(2589);
        st.put(4354);
        if (!st.isFull()) {
            st.put(343434);
        }
        System.out.println(st.pull());
        System.out.println(st.pull());
        System.out.println(st.pull());
        System.out.println(st.pull());
        System.out.println(st.pull());
        System.out.println(st.pull());
    }

}



