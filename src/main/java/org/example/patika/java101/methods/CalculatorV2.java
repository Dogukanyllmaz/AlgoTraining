package org.example.patika.java101.methods;

import java.util.Scanner;

/**
 * Calculator
 * 0.0.2V
 * @author Hç Doğukan Yılmaz
 */
public class CalculatorV2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int select;
        String menu = "1- Sum\n"
                + "2- Minus\n"
                + "3- Multiplication\n"
                + "4- Divide\n"
                + "5- Exponential\n"
                + "6- Factorial\n"
                + "7- Mode\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Quit";

        while (true){
            System.out.println();
            System.out.println(menu);
            System.out.print("Select process: ");
            select = sc.nextInt();
            if (select == 0){
                System.out.println("Quit");
                break;
            }
            switch (select){
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    divide();
                    break;

            }

        }

    }

    public static void sum(){
        Scanner sc = new Scanner(System.in);
        int number;
        int result = 0;
        int i = 1;
        System.out.println("0 for quit...");
        while (true){
            System.out.print(i++ + ". number: ");
            number = sc.nextInt();
            if (number == 0){
                break;
            }
            result += number;
        }
        System.out.printf("Result: %d", result);
    }

    public static void minus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number count: ");
        int counter = sc.nextInt();
        int number;
        int result = 0;

        for (int i = 1; i <= counter; i++) {

            System.out.print(i + ". number: ");
            number=sc.nextInt();
            if (i == 1){
                result+=number;
                continue;
            }

            result-=number;
        }
        System.out.printf("Result: %d",result);
    }

    public static void multiplication(){
        Scanner sc = new Scanner(System.in);
        int number;
        int result = 0;
        int i = 1;

        while (true){
            System.out.print(i++ + ". number: ");
            number = sc.nextInt();

            if(number==1){
                break;
            }
            if(number==0){
                result = 0;
                break;
            }
            result*=number;
        }
        System.out.printf("Result: %d",result);
    }

    public static void divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number count: ");
        int counter = sc.nextInt();
        double number;
        double result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = sc.nextDouble();

            if (i != 1 && number == 0){
                System.out.println("Undefined");
                continue;
            }
            if (i == 1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.printf("Result: %d", result);
    }


}
