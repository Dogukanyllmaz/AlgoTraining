package org.example.stringsQuestion;
// Encryptor
public class Question1 {

    public static void main(String[] args) {

        System.out.println(ceasarCypherEncryptor("dogukanyilmaz", 147));


        /*char chr = 'a' + 1;
        System.out.println(chr);*/

    }

    public static char make_Fit(char ch, int key){
        int firstMove = (int)ch+key;
        if (firstMove>122)
            firstMove -=26;
        return (char)firstMove;
    }

    public static String ceasarCypherEncryptor(String str, int key){
        String dummyStr = "";
        for (int i = 0; i < str.length(); i++) {
            dummyStr += make_Fit(str.charAt(i), key%26);
        }

        return dummyStr;
    }

}
