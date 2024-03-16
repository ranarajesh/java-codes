package Array;

import java.util.HashSet;

public class IsString1ByString2 {

    public static boolean canMakeString(String str1, String str2){

        HashSet<Character> seenSet = new HashSet<Character>();
        for (char item : str2.toCharArray()) {
            seenSet.add(item);
        }
        for (char item : str1.toCharArray()) {
            if(!seenSet.contains(item)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Check if string 1 is made of string 2 character or not");
        var isCheck = canMakeString("abc", "pabdac");
        System.out.println(isCheck);
    }
}
