package Array.medium;

import java.util.Hashtable;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int strLen = s.length();
        if(strLen <=1 ) return strLen;

        int i, startWindow = 0, longest =0, windowLength = 0;

        Hashtable<Character, Integer> lastSeenAt = new Hashtable<Character, Integer>();

        for(i=0; i<strLen; ++i){
            char currChar = s.charAt(i);
            if(!lastSeenAt.containsKey(currChar)){
                lastSeenAt.put(currChar, i);
            }else{
                if(lastSeenAt.get(currChar)  >= startWindow){
                    windowLength = i - startWindow;
                    longest = Math.max(longest, windowLength);
                    startWindow = lastSeenAt.get(currChar) + 1;
                }
                lastSeenAt.replace(currChar, i);
            }
        }
        if(longest < i-startWindow){
            longest = i-startWindow;
        }
        return longest;
    }

    public static void main(String[] arg) {
        String[] inputs = {
                " ",
                "au",
                "abcabcbb",
                "pwwkew",
                "bbbbb",
                "ababababa",
                "",
                "ABCDEFGHI",
                "ABCDEDCBA",
                "AAAABBBBCCCCDDDD"
        };
        for (int i = 0; i < inputs.length; i++) {
            int str = LongestSubstring.lengthOfLongestSubstring(inputs[i]);
            System.out.print(i + 1);
            System.out.println("\tInput string: " + inputs[i]);
            System.out.println("\n\tLength of longest substring: " + str);
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }
}
