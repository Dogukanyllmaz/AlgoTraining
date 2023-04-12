package org.example.palindrome;

import java.util.Locale;

//isPalindrome
public class Palindrome {

    public static void main(String[] args) {

        String test1 = "naber";
        String test2 = "Ana";

        System.out.println(isPalindrome(test2));
        System.out.println(isPolindrome2(test2));
        System.out.println(isPolindrome3(test2));

    }

    public static boolean isPalindrome (String s){
        String dummyStr = "";
        for (int i = s.length()-1; i >= 0; i--)
            dummyStr += s.charAt(i);


        if(dummyStr.toLowerCase().equals(s.toLowerCase()))
            return true;
        return false;
    }

    public static boolean isPolindrome2(String s){
        for (int i = 0; i < s.length(); i ++){
            if (s.toLowerCase().charAt(i) != s.toLowerCase().charAt(s.length()-1-i))
                return false;
        }
        return true;
    }

    //Unnecessary method...
    public static boolean isPolindrome3(String s){

        String first = s.toLowerCase().substring(0,s.length()/2);
        String last = "";
        if (s.length()%2 == 0)
            last = s.toLowerCase().substring(s.length()/2);
        else
            last = s.toLowerCase().substring(s.length()/2+1);



        if (first.equals(last))
            return true;
        return false;

    }

}
