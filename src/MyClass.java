public class MyClass implements Comparable<MyClass> {

    public MyClass(String label,String value) {
        this.label = label;
        this.value=value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    String label;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    String value;
    public String toString(){
        return label+" | "+ value;
    }

    /*@Override
    public boolean equals(Object obj) {
        MyClass other=(MyClass) obj;
        return value.equals(other);
    }*/

    @Override
    public int compareTo(MyClass other) {


        return value.compareToIgnoreCase(other.value);
    }
}
