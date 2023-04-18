package org.example.dataStructures;

import java.util.Scanner;

/**
 *Data-Structures-and-Algorithms-in-Java-6th-Edition 1.10 Exercises
 * @author H. Dogukan Yilmaz
 */
public class Exercises1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter a float: ");
        float myFloat = sc.nextFloat();
        System.out.println("Enter a double: ");
        double myDouble = sc.nextDouble();
        System.out.println("Enter a int: ");
        int myInt = sc.nextInt();
        System.out.println("Enter a string: ");
        String myString = sc.next();
        sc.nextLine();

        inputAllBaseTypes(myFloat,myDouble,myInt,myString);*/

        /*System.out.println("Enter a long number: ");
        long n = sc.nextLong();
        System.out.println("Enter a long number: ");
        long m = sc.nextLong();

        System.out.println(isMultiple(n, m));*/

        /*System.out.println("Enter a integer: ");
        int i = sc.nextInt();
        System.out.println(isEven(i));*/

        /*System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();*/
        //System.out.println(sumOfAllPositiveInteger(n));

        //System.out.println(sumOfAllPositiveOddNum(n));
        //System.out.println(sumOfSquaresAllPositiveNum(n));

        /*System.out.println("Give me a string: ");
        String s = sc.nextLine();
        sc.close();

        System.out.println(countVowels(s));*/

        System.out.println("Enter a string");
        String s= sc.nextLine();
        sc.close();
        System.out.println(removeAllPunctuation(s));


    }

    /* R-1.1
        Write a short Java method, inputAllBaseTypes, that inputs a different value of
        each base type from the standard input device and prints it back to the standard
        output device
     */

    public static void inputAllBaseTypes(float myFloat, double myDouble, int myInt  ,String myString){

        System.out.println("My Float: "+myFloat);
        System.out.println("My Double: "+myDouble);
        System.out.println("My Int: "+myInt);
        System.out.println("My String: "+myString);

    }

    /*R-1.3
        Write a short Java method, isMultiple, that takes two long values, n and m, and
        returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
     */

    public static boolean isMultiple(long n, long m){
        if (n%m==0)
            return true;
        return false;
    }
    /*R-1.4
        Write a short Java method, isEven, that takes an int i and returns true if and only
        if i is even. Your method cannot use the multiplication, modulus, or division
        operators, however.
     */

    public static boolean isEven(int i){
        if ((i & 1) == 0)
            return true;
        return false;
    }

    /*R-1.5
        Write a short Java method that takes an integer n and returns the sum of all
        positive integers less than or equal to n.
     */

    public static int sumOfAllPositiveInteger(int n){
        int total;
        total = 0;
        if (n>0){
            for (int i = 0; i <= n; i++) {
                total += i;
            }
        }
        else
            System.out.println("Enter a positive integer: ");
        return total;
    }

    /*R-1.6
        Write a short Java method that takes an integer n and returns the sum of all the
        odd positive integers less than or equal to n.
     */

    public static int sumOfAllPositiveOddNum(int n ){
        int total;
        total = 0;

        if (n>0){
            for (int i = 0; i <= n; i++) {
                if (i%2==0){
                    total+=i;
                }
            }
        }
        else {
            System.out.println("Enter a just positive integer");
        }
        return total;

    }

    /*R-1.7
        Write a short Java method that takes an integer n and returns the sum of the
        squares of all positive integers less than or equal to n.
     */

    public static int sumOfSquaresAllPositiveNum(int n){

        int total;
        total= 0;
        if (n > 0){
            for (int i = 0; i <= n; i++) {
                total += i*i;
            }
        }
        else
            System.out.println("Enter positive number.");
        return total;
    }

    /*R-1.8
        Write a short Java method that counts the number of vowels in a given character string.
     */

    public static int countVowels(String s){
        int count;
        count=0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u')
                count++;
        }

        return count;
    }

    /*R-1.9
        Write a short Java method that uses a StringBuilder instance to remove all the
        punctuation from a string s storing a sentence, for example, transforming the
        string "Let’s try, Mike!" to "Lets try Mike".
     */

    public static String removeAllPunctuation(String s){
        StringBuilder result = new StringBuilder();
        for (char c:s.toCharArray()) {
            if (Character.isLetterOrDigit(c)||Character.isWhitespace(c))
                result.append(c);
        }
        return result.toString();
    }


}
