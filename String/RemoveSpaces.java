package String;

import java.util.Arrays;

public class RemoveSpaces {
    // remove spaces and tab from string
    public static String remove(char[] charStr){
         if(charStr == null || charStr.length == 0 || charStr[0] == '\0'){
             return "";
         }
         // Solve this using two pointer approaches
         int writePtr = 0;
         int readPtr = 0;
         while(readPtr < charStr.length && charStr[readPtr] != '\0'){
             if(!isWhiteSpace(charStr[readPtr])){
                 charStr[writePtr] = charStr[readPtr];
                 writePtr++;
             }
             readPtr++;
         }
         return new String(String.valueOf(Arrays.copyOfRange(charStr, 0, writePtr)));
    }
    public static boolean isWhiteSpace(char c){
        if(c == ' ' || c=='\t'){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String str = "\" String without spaces or tabs: \";";
        char[] charStr = str.toCharArray();
        System.out.println(RemoveSpaces.remove(charStr));
    }
}

