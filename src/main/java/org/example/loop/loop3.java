package org.example.loop;


import java.util.Scanner;

public class loop3 {
/*
dongu icindeki sayinin basamak sayisini bulan uygulama
 */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter number: ");

        while ((num = Integer.parseInt(sc.nextLine())) != 0){

            int countOfDigits = countDigits(num);
            System.out.printf("The number of digits %d is %d%n",num,countOfDigits);
            System.out.printf("Enter number: ");
        }

        System.out.println("The 0 digit is 1");

    }

    public static int countDigits(int num){
        if (num == 0){
            return 1;
        }

        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

}
