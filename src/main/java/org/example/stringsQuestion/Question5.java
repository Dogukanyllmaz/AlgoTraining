package org.example.stringsQuestion;
// hackerrank theLoveLetterMystery
public class Question5 {
    public static void main(String[] args) {

        String test1 = "abc";
        String test2 = "abcd";

        System.out.println(theLoveLetterMystery(test1));
        System.out.println(theLoveLetterMystery(test2));

    }

    public static int theLoveLetterMystery(String s){
        int resultOp = 0;
        int lastElement = s.length()-1;
        for (int i = 0; i < lastElement; i++) {
            resultOp += Math.abs(s.charAt(i)-s.charAt(lastElement));
            lastElement--;
        }

        return resultOp;
    }

}
