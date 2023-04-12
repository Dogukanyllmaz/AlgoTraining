package org.example.loop;

import java.util.Scanner;

public class loop8 {
    /*
    pow num
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;){
            System.out.println("Enter the base number: ");
            int baseNumber = Integer.parseInt(sc.nextLine());

            System.out.println("Enter the power of the number: ");
            int powerOfNumber = Integer.parseInt(sc.nextLine());

            System.out.printf("Pow(%d,%d) = %d%n",baseNumber,powerOfNumber,pow(baseNumber,powerOfNumber));
        }
    }

    public static int pow(int baseNumber, int powerOfNumber){

        if (baseNumber <= 0)
            return 1;

        int result = 1;
        for(int i = 0; i < powerOfNumber; i++){
            result *= baseNumber;
        }
        return result;
    }
}
