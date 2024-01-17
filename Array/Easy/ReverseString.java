package Array.Easy;

public class ReverseString {
    public char[] reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return s;
    }
}
