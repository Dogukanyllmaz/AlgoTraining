package org.example.patika.java101.methods;

import java.util.Scanner;

public class RecursiveExponentiation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Taban degerini giriniz: ");
        int base = sc.nextInt();
        System.out.println("Us degerini giriniz: ");
        int top = sc.nextInt();

        exponentiation(base,top);




    }

    public static void exponentiation(int base, int top){

        int result = 0;
        int dummyBase= 0;
        if (top == 0)
            result = 1;
        else {
            dummyBase = base;
            for (int i = 0; i < top; i++) {
                base = dummyBase*dummyBase;
            }
            result = base;
        }
        System.out.println(result);
    }

}
