package org.example.patika.java101.methods;

import java.util.Scanner;

public class DesingMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("N sayisi giriniz: ");
        int num = sc.nextInt();

        PatternCreator(num,num,-1);

    }

   static void PatternCreator(int constant, int variable, int sign){

        if (variable > constant)
            return;

        if (variable < 1)
            sign *= -1;

       System.out.print(" " + variable + " ");

        PatternCreator(constant, variable + sign*5, sign);
   }

}
