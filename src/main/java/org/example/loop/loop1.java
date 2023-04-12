package org.example.loop;

import java.util.Scanner;

public class loop1 {

    /*
    while dongusu kullanilarak icerisine girilen tum sayilari toplayan num 0'a esit olunca duran sistem
     */

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sayi giriniz: ");

        int sum = 0;
        int num;

        while ((num = Integer.parseInt(scanner.nextLine()))!=0){

            sum += num;
            System.out.printf("Sum : %d%n" , sum);

        }




    }

}
