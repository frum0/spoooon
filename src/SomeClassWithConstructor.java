public class SomeClassWithConstructor {
    int intField;
    // поля
    long longField;
    boolean booleanField;
    String stringField;

    public SomeClassWithConstructor() {

    }

    // конструктор, инициализирующий все поля
    public SomeClassWithConstructor(int intField, long longField, boolean booleanField, String stringField) {
        this.intField = intField;
        this.longField = longField;
        this.booleanField = booleanField;
        this.stringField = stringField;
    }


    // методы
    public void setIntField(int intField) {
        this.intField = intField;
    }

    public int getIntField() {
        return this.intField;
    }

    public void setlongField(long longField) {
        this.longField = longField;
    }

    public long getlongField() {
        return this.longField;
    }

    public void setBooleanFieldField(boolean booleanField) {
        this.booleanField = booleanField;
    }

    public boolean getbooleanField() {
        return this.booleanField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public String getStringField() {
        return this.stringField;
    }

}
