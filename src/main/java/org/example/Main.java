package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*if (checkVaccinePCR()==true){
            System.out.println("ucaa binebilirsiniz");
        }
        else {
            System.out.println("ucaga binemezsiniz");
        }*/

        /*int i = 1;
        while (i<6){

            int j = 1;
            while (j<6){
                System.out.println(i + "x" + j + "=" + (i*j));
                j++;
            }
            i++;
        }*/


        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int randomNum = r.nextInt(11);

        /*while (true){

            System.out.println("1 ile 10 arasinda bir sayi giriniz: ");
            int chosen = scanner.nextInt();

            if (chosen <= 10 && 0 < chosen){
                if (randomNum == chosen){
                    System.out.println("Dogru tahmin");
                    break;
                }
                else {
                    System.out.println("Yanlis tahmin tekrar deneyiniz");
                }
            }
            else {
                System.out.println("1 ile 10 arasinda bir sayi gir");
            }



        }*/



        /*String hi = "Hello World!";

        for (int i = 0; i<hi.length(); i++){
            System.out.print("[" + hi.charAt(i) + "]");
        }*/

        int counter = 1;
        for (int i = 0; i<3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }



    }

    static boolean checkVaccinePCR(){
        Scanner sc = new Scanner(System.in);
        String answer;

        System.out.println("Son 72 saatte PCR testi yaptirdiniz mi? [Y][N]:");
        answer=sc.next();

        if (answer.equals("Y")){
            return true;
        }
        else{
            System.out.println("Asi oldunuz mu?[Y][N]:");
            answer = sc.next();

            if (answer.equals("Y")){
                return true;
            }
            else {
                return false;
            }

        }

    }

}