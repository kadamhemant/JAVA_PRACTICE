import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class testMain {

    public static void main(String[] args)
    {
        System.out.println("-----------------List collection iteration example------------------");

        ArrayList list = new ArrayList();
        list.add("Foo");
        list.add("Bar");
        System.out.println("Elements: " + list.size());
        for(Object o:list)
            System.out.println(o.toString());

        System.out.println("--------------------List add all example-----------------------------");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Foo");
        list1.add("Bar");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Baz");
        list2.add("Boo");
        list1.addAll(list2);
        for(String s:list1)
            System.out.println(s);


        System.out.println("----------------Foreach example-----------------------");

        ArrayList<MyClass> list3 = new ArrayList<>();
        MyClass v1 = new MyClass("v1", "abc");
        MyClass v2 = new MyClass("v2", "xyz");
        MyClass v3 = new MyClass("v3", "abc");
        list3.add(v1);
        list3.add(v2);
        list3.add(v3);
        list3.forEach(m -> System.out.println(m.getLabel()));
        System.out.println("--------removeif example--------------------------------");
        list3.removeIf(m -> m.getValue().equals("abc"));
        list3.forEach(m -> System.out.println(m.getLabel()));

        System.out.println("--------------Sorting using Comparable interface-------------------------");

        TreeSet<MyClass> tree=new TreeSet<>();
        tree.add(new MyClass("2222","ghi"));
        tree.add(new MyClass("3333","abc"));
        tree.add(new MyClass("1111","def"));

        tree.forEach(m-> System.out.println(m));

        System.out.println("--------------Sorting using Comparator interface-------------------------");

        TreeSet<MyClass> tree2 = new TreeSet<>(new MyComparatorClass());
        tree2.add(new MyClass("2222", "ghi"));
        tree2.add(new MyClass("3333", "abc"));
        tree2.add(new MyClass("1111", "def"));

        tree2.forEach(m -> System.out.println(m));
    }
}
