package org.example.stringsQuestion;

import java.util.ArrayList;
import java.util.List;

//hackerrank game of thrones-1
public class Question4 {

    public static void main(String[] args) {

        String test1 = "aaabbbb";
        String test2 = "cdefghmnopqrstuvw";

        System.out.println(gameOfThrones(test1));
        System.out.println(gameOfThrones(test2));

    }

    public static String gameOfThrones(String s) {
        List<Integer> alphabet = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            alphabet.add(i,0);
        }
        int currentIndex,currentValue;
        for(int i = 0; i < s.length(); i++){
            currentIndex = (int)s.charAt(i)-97;
            currentValue = alphabet.get(currentIndex);
            alphabet.set(currentIndex,currentValue+1);
        }

        int counter = 0;
        for(int i = 0; i<alphabet.size();i++){
            if(alphabet.get(i)%2==1){
                counter++;
                if(counter>1)
                    return "NO";
            }
        }
        return "YES";
    }
}
