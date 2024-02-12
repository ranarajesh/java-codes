package Collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.List;

public class HashSetCollection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(45);
        set.add(23);
        System.out.println(set.contains(23));
        System.out.println(set);
        set.remove(23);
        System.out.println(set);
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
        

        // 
        set.add(23);
		set.add(34);
		set.add(56);
        System.out.println(set);
        for(int i : set){
            System.out.println(i);
        }

        // Traverse using iterator 
        System.out.println("Traverse using Iterator");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // using foreach 
        System.out.println("using Foreach method");
        set.forEach(System.out:: println);

        // If we want to sort the elements of a HashSet, then we should convert it into some other Collection such shSet.
        List<Integer> setList = new ArrayList<>(set);
        System.out.println(setList);
        Collections.sort(setList);
        System.out.println(setList);
        setList.forEach(System.out::println);
    }
}
