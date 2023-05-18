package org.example.patika.java101.methods;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        primeNumber();

    }

    public static void primeNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int num = sc.nextInt();
        int result = 0;

        for (int i = 2; i < num; i++) {
           if (num%i == 0)
               result++;
        }
        if (result == 0)
            System.out.printf("%d sayisi asal sayidir.",num);
        else
            System.out.printf("%d sayisi asal sayi degildir.", num);
    }


}
