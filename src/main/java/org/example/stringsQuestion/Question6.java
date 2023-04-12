package org.example.stringsQuestion;

public class Question6 {
    public static void main(String[] args) {

        String test1 = "AAAAAAAAAAAAABBCCCCBB"; //->9A4A2B4C2B

        System.out.println(runLengthEncoding(test1));

    }

    public static String runLengthEncoding(String s){

        String retString = "";
        int counter = 0;
        char holder = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == holder){
                counter++;
                if (counter ==9) {
                    retString += counter + "" + holder;
                    counter = 0;
                }
            }
            else {
                if (counter!= 0)
                    retString += counter + "" + holder;
                counter = 1;
            }
            holder=s.charAt(i);
        }
        retString+= counter+""+holder;
        return retString;
    }

}
