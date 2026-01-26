public class SomeClassWithPrivateFields {
   private int intField;
    // поля
    private long longField;
    private boolean booleanField;
    private String stringField;

    public SomeClassWithPrivateFields() {

    }

    // конструктор, инициализирующий все поля
    public SomeClassWithPrivateFields(int intField, long longField, boolean booleanField, String stringField) {
        this.intField = intField;
        this.longField = longField;
        this.booleanField = booleanField;
        this.stringField = stringField;
    }


    // методы
    private void setIntField(int intField) {
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
