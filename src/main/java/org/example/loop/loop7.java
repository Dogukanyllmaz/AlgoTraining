package org.example.loop;

import java.util.Scanner;

public class loop7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start Enter Number:");

        int num;
        while ((num = Integer.parseInt(sc.nextLine()))!=0){

            int reverseNum = getReverse(num);
            System.out.printf("%d reverse is %d%n",num,reverseNum);

        }


    }

    public static int getReverse(int num){
        int reverse = 0;
        while (num != 0){
            reverse = (reverse *10) + (num%10);
            num/=10;
        }
        return reverse;
    }

}
