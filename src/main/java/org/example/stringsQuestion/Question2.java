package org.example.stringsQuestion;
//Pangrams
public class Question2 {

    public static void main(String[] args) {
        String test1 = "We promptly judged antique ivory buckles for the next prize";
        String test2 = "We promptly judged antique ivory buckles for the prize";

        System.out.println(pangrams(test1));
        System.out.println(pangrams(test2));

    }

    public static String pangrams(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        s = s.toLowerCase();
        for(int i = 0; i < alphabet.length(); i++){
            if(!s.contains(alphabet.charAt(i)+""))
                return "not pangram";
        }
        return "pangram";

    }

}
