package org.example.patika.java101.methods;

import java.util.Scanner;

/**
 * Calculator
 *
 * @author H. Doğukan Yılmaz
 */
public class Calculator {
    public static void main(String[] args) {
        /*
        1- Toplama İşlemi
        2- Çıkarma İşlemi
        3- Çarpma İşlemi
        4- Bölme işlemi
        5- Üslü Sayı Hesaplama
        6- Faktoriyel Hesaplama
        7- Mod Alma
        8- Dikdörtgen Alan ve Çevre Hesabı
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı");
        System.out.println("Enter process: ");
        int process;
        int num1=0;
        int num2=0;
        while ((process = Integer.parseInt(sc.nextLine())) != 0){

            if (process == 6){
                System.out.println("Enter a Integer: ");
                num1 = sc.nextInt();
            }
            else {
                System.out.println("Enter integer: ");
                num1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter integer: ");
                num2 = sc.nextInt();
                sc.nextLine();
            }
            switch (process){
                case 1:
                    System.out.println(sum(num1, num2));
                    break;
                case 2:
                    System.out.println(extraction(num1, num2));
                    break;
                case 3:
                    System.out.println(multiplication(num1,num2));
                    break;
                case 4:
                    System.out.println(divide(num1, num2));
                    break;
                case 5:
                    System.out.println(exponential(num1, num2));
                    break;
                case 6:
                    factorial(num1);
                    break;
                case 7:
                    System.out.println(mode(num1, num2));
                    break;
                case 8:
                    System.out.println(rectangleArea(num1, num2));
                    break;
                default:
                    System.out.println("Not Found Process...");
            }

            System.out.println("Enter process: ");
        }

    }
    public static int sum(int num1, int num2){
        int result = num1+num2;
        return result;
    }
    public static int extraction(int num1,int num2){
        int result = num1-num2;
        return result;
    }
    public static int multiplication(int num1,int num2){
        int result = num1*num2;
        return result;
    }
    public static int divide(int num1,int num2){
        int result = num1/num2;
        return result;
    }
    public static int exponential(int num1, int num2){
        int dummyNum = num1;
        while (num2!=1){
            num1*=dummyNum;
            num2--;
        }
        return num1;
    }
    public static long factorial(long num1){
        long dummyNum = num1;
        while (dummyNum!=1){
            dummyNum--;
            num1*=dummyNum;
        }
        return num1;
    }
    public static int mode(int num1,int num2){
        int result = num1%num2;
        return result;
    }
    public static String rectangleArea(int num1,int num2){
        int area = num1*num2;
        int environment = num1*2+num2*2;
        String result = "Area: " + area + "Environment: " + environment;
        return result;
    }


}
