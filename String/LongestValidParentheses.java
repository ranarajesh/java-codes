package String;

public class LongestValidParentheses {
    //Given a string that contains the characters '(' and ')', find the length of the longest valid parentheses substring.

    public static int longestValidParentheses(String str){
        int maxLen = 0;
        int leftBracket = 0;
        int rightBracket = 0;
        // left pass
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (checkLeftParanthesis(ch)) {
                leftBracket++;
            } else {
                rightBracket++;
            }
            // check if left is equal to right means valid paranthesis than add in maxLength entry
            // otherwise check if right is grather or equla than left
            if (leftBracket == rightBracket) {
                maxLen = Math.max(maxLen, 2 * rightBracket);
            } else if (rightBracket >= leftBracket) {
                // reset the both
                leftBracket = rightBracket = 0;
            }
        }

        // run the right pass
        leftBracket = rightBracket = 0;
        for (int j = str.length() -1; j >=0; j--) {
            if(checkLeftParanthesis(str.charAt(j))){
                leftBracket++;
            }else {
                rightBracket++;
            }
            if(rightBracket == leftBracket){
                maxLen = Math.max(maxLen, 2 * leftBracket);
            }else if(leftBracket >= rightBracket){
                // reset
                leftBracket = rightBracket = 0;
            }
        }
        return maxLen;
    }
    public static boolean checkLeftParanthesis(char c){
        if(c == '(') return true;
        return false;
    }
    public static void main(String[] args){
        String[] inputs = {"(()", ")()())", "", "(", ")()()(", ")())((())())("};
        //String[] inputs = {")()())"};
        for (String input : inputs){
            System.out.println("["+input +"]\t\t ==>" +longestValidParentheses(input));
        }

    }
}
