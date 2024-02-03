package Array;

import java.util.Arrays;
import java.util.HashMap;

public class FirstNotReaptingCharacter {
    static char firstRepeatingCharByArr(String s){
        int[] alpha = new int[26];
        for (char c:s.toCharArray()) {
            alpha[c - 'a']++;
        }
        for(char c : s.toCharArray()){
            if(alpha[c -'a'] == 1) {
                return c;
            }
        }
        return '-';
    }

    static char firstRepeatingCharByHashMap(String s){
        HashMap<Character, Integer> countChar = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()){
            if(countChar.containsKey(c)){
                countChar.put(c, countChar.get(c) +1 );
            }else{
                countChar.put(c, 1);
            }
        }
        for(char c : s.toCharArray()){
            if(countChar.get(c) == 1){
                return c;
            }
        }
        return '_';
    }
    public static void main(String[] args) {
        String s = "aaabccdeef";
        System.out.println("firstRepeatingCharByArr(s) : "+firstRepeatingCharByArr(s));
        System.out.println("firstRepeatingCharByHashMap(s) : "+firstRepeatingCharByHashMap(s));

    }
}
