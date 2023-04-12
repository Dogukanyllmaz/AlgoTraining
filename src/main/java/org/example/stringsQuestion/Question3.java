package org.example.stringsQuestion;
//first non repeating character
public class Question3 {
    public static void main(String[] args) {

        String test = "abcdcaf";

        System.out.println(firstNonRepeatingCharacter(test));

    }

    public static int firstNonRepeatingCharacter(String string){
        boolean flag = false;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i)==string.charAt(j) && i!=j){
                    flag= true;
                    break;
                }
            }
            if (!flag)
                return i;
            flag =false;
        }
        return -1;
    }
}
