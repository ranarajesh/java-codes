package Array;

public class isPalindrom {
    public static boolean palindrome(String s) {
        String s1 = s.replaceAll("//s", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = s1.length() -1;
        while(left < right){
            if(s1.charAt(left)!= s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] arg){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrom.palindrome(s));
    }
}

