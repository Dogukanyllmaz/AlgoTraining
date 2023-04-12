package org.example.loop;

import java.util.Scanner;

public class loop6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*int num;
        int positiveSum = 0;
        int negativeSum = 0;

        System.out.println("Start Entering Numbers:");
        while ((num = Integer.parseInt(scanner.nextLine())) != 0){
            if (num>0)
                positiveSum += num;
            else
                negativeSum += num;
            displayResult(positiveSum,negativeSum);
        }*/


        /*int num;
        System.out.println("Start Entering Numbers: ");
        while ((num= Integer.parseInt(scanner.nextLine())) != 0){

            int countOfDigits = getDigitsCount(num);

            System.out.printf("The number of digits %d is: %d%n", num,countOfDigits);
            System.out.println("Enter Number:");
        }

        System.out.println("The number of digits 0 is 1");*/


        /*System.out.println("Start Entering Numbers:");
        int num;
        int sum = 0;
        while ((num = Integer.parseInt(scanner.nextLine())) != 0){
            sum += num;
            System.out.printf("Sum of numbers is %d%n",sum);
        }*/

        int num;
        System.out.println("Start Enter Number:");
        while ((num = Integer.parseInt(scanner.nextLine())) != 0){

            int sumOfNumbersDigits = getDigitsSum(num);
            System.out.printf("The sum of the digits %d is %d%n", num,sumOfNumbersDigits);
            System.out.println("Enter Number: ");

        }



    }

    /*public static void displayResult(int positiveSum,int negativeSum){

        if (positiveSum > 0)
            System.out.printf("PositiveSum: %d%n",positiveSum);
        else
            System.out.println("You did not enter any positive numbers");
        if (negativeSum < 0)
            System.out.printf("NegativeSum: %d%n", negativeSum);
        else
            System.out.println("You did not enter any negative numbers");

    }*/


   /* public static int getDigitsCount(int num){
        if(num == 0)
            return 1;

        int count = 0;
        while (num!=0){
            num /= 10;
            count++;
        }
        return count;
    }*/

    public static int getDigitsSum(int num){
        int sum = 0;
        while (num!=0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }

}
