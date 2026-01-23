public class Gru {
    int intField;
    public static void main(String[] args){
        SomeClass sc2 = new SomeClass();
        sc2.intField = 12345;
        sc2.setIntField(235571);
        System.out.println(sc2.getIntField());
        SomeClassWithPrivateFields sc3 = new SomeClassWithPrivateFields();
        sc3.getbooleanField();
        SomeImmutableClass sc4 = new SomeImmutableClass(5261,   2456,true,"eree");
        System.out.println(sc4.getIntField());
        System.out.println(sc4.getlongField());
        System.out.println(sc4.getbooleanField());
        System.out.println(sc4.getStringField());
    }

}



