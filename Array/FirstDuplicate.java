package Array;

import java.util.Arrays;
import java.util.HashSet;

public class FirstDuplicate {
    public static int firstDuplicateByHashSet(int[] a){
        HashSet<Integer> seen = new HashSet();
        for (int i = 0; i < a.length; i++) {
            if(seen.contains(a[i])){
                return a[i];
            }else{
                seen.add(a[i]);
            }
        }
        return -1;
    }
    public static int firstDuplicate(int[] a){
        for (int i = 0; i < a.length; i++) {
            int absItem = Math.abs(a[i]);
            System.out.println(absItem);
            if(a[absItem - 1] < 0){
                return absItem;
            }else {
                a[absItem - 1] = -a[absItem - 1];
            }
            System.out.println(Arrays.toString(a));
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {2,1,3,5,3,2};
        System.out.println("By firstDuplicateByHashSet(a) "+firstDuplicateByHashSet(a));
        System.out.println("By firstDuplicate(a) "+firstDuplicate(a));

    }
}
