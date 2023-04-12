package org.example.loop;

import java.util.Scanner;

public class loop2 {

    /*
    while dongusu ile pozitif ve negatif sayilarin ayri ayri toplamini yapan uygulama
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Start entering numbers: ");

        int positiveSum = 0;
        int negativeSum = 0;
        int num;

        while ((num = Integer.parseInt(scanner.nextLine() )) != 0){

            if (num > 0){
                positiveSum += num;
            }
            else {
                negativeSum += num;
            }
            displayResult(positiveSum,negativeSum);

        }

    }


    public static void displayResult(int positiveSum, int negativeSum){

        if (positiveSum>0){
            System.out.printf("Sum of positive numbers : %d%n", positiveSum);
        }
        else {
            System.out.println("You did not enter any positive number");
        }
        if (negativeSum<0){
            System.out.printf("Sum of negative numbers: %d%n", negativeSum);
        }
        else {
            System.out.println("You did not enter any negative number");
        }

    }

}
