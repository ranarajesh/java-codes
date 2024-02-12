package Collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {
   
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();    
        set.add(35);
        set.add(83);
        set.add(23);
        set.add(23);

        System.out.println(set);
        
        TreeSet<Integer> reverseSet = new TreeSet<>(Comparator.reverseOrder());
        reverseSet.add(35);
        reverseSet.add(83);
        reverseSet.add(23);
        reverseSet.add(21);
		reverseSet.add(32);
		reverseSet.add(44);
		reverseSet.add(11);
		reverseSet.add(54);
		reverseSet.add(3);
		reverseSet.add(9);
		reverseSet.add(41);
        System.out.println(reverseSet);
        System.out.println(reverseSet.first());
        System.out.println(reverseSet.last());
        System.out.println(reverseSet.subSet(23, 9));
        System.out.println(reverseSet.headSet(9));
        System.out.println(reverseSet.tailSet(9));

        reverseSet.remove(44);
        System.out.println(reverseSet);

        System.out.println(reverseSet.isEmpty());
        System.out.println(reverseSet.contains(44));
        System.out.println(reverseSet.size());

    }

}
