package Array;

import java.util.Arrays;

public class FirstNotReaptingCharacter {
    public static void main(String[] args) {
        String s = "aaabccdeef";
        int[] alpha = new int[26];
        for (char c:s.toCharArray()) {
            alpha[c - 'a']++;
        }
        System.out.println(Arrays.toString(alpha));
        for(char c : s.toCharArray()){
            if(alpha[c -'a'] == 1) {
                System.out.println(c);
                return;
            }
        }
        System.out.println('-');
    }
}
