public class SomeImmutableClass {
     final int intField;
    // поля
     final long longField;
     final boolean booleanField;
     final String stringField;



    // конструктор, инициализирующий все поля
    public SomeImmutableClass(int intField, long longField, boolean booleanField, String stringField) {
        this.intField = intField;
        this.longField = longField;
        this.booleanField = booleanField;
        this.stringField = stringField;
    }


    // методы

    public int getIntField() {
        return this.intField;
    }


    public long getlongField() {
        return this.longField;
    }


    public boolean getbooleanField() {
        return this.booleanField;
    }




    public String getStringField() {
        return this.stringField;
    }



}
