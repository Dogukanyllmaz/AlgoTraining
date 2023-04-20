package org.example.patika.java101.methods;

import java.util.Scanner;

/**
 *Patika java101 methods
 *
 * @author H. Dogukan Yilmaz
 */
public class PalindromNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter a integer: ");
        while ((num = Integer.parseInt(sc.nextLine()))!=0){

            if (isPalindrome(num) == true)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
            System.out.println("Enter a integer: ");
        }

    }

    public static boolean isPalindrome(int num){

        int dummyNum = num;
        int reverseNum = 0;
        int lastNum = 0;
        while (dummyNum != 0){
            lastNum = dummyNum%10;
            reverseNum = (reverseNum * 10) + lastNum;
            dummyNum /= 10;
        }
        if (reverseNum == num)
            return true;
        else
            return false;
    }

}
