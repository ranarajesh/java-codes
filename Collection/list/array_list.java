package Collection.list;

import java.util.List;
import java.util.ArrayList;
public class array_list {
    public static void main(String[] args) {
        System.out.println("Array List example from Collection in java");
        //List<Integer> list = new ArrayList<>();
        List list = new ArrayList();
        list.add(12);
        list.add(44);
        System.out.println(list);
        list.add(1, 20);
        System.out.println(list);
        List newList = new ArrayList();
		newList.add(150);
		newList.add(160);
        list.addAll(newList);
        System.out.println(list);

        // Fetching item from list using get method 
        System.out.println("The value is"+list.get(0));
        System.out.println("The size of list is "+list.size());

        // Remove operation on list
        list.remove(1);
        System.out.println(list);
        list.remove(new Integer(150));
        System.out.println(list);
        list.removeAll(newList);
        System.out.println(list);

        List<String> strList =new ArrayList<>();
        strList.add("apple");
        strList.add("banana");
        System.out.println(strList);
        strList.replaceAll((item) ->  item.toUpperCase());
        System.out.println(strList);
        System.out.println(strList.contains("APPLE"));
        System.out.println(strList.contains("apple"));

        strList.set(1, "orange");
        strList.add("banana");
        strList.add("orange");
        System.out.println(strList);
        System.out.println("First index is "+strList.indexOf("orange"));
        System.out.println("Last index is "+strList.lastIndexOf("orange"));


    }

}
