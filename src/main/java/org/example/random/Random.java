package org.example.random;

import java.util.Scanner;

/**
 * Youtube folksdev java bootcamp #13 Random sınıfı
 *
 * @author H. Doğukan Yılmaz
 */
public class Random {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int randomNum = randomGenerate(0,10);
        int counter = 1;
        while (true){
            System.out.print("Guess the number: ");
            int guess = sc.nextInt();
            sc.nextLine();
            if (randomNum == guess){
                System.out.println("Correct! " + counter + ".guess ");
                break;
            } else if (randomNum < guess) {
                System.out.println("your number is greater than random num");
            }else {
                System.out.println("your number is smaller than random num");
            }
            counter++;
        }

        System.out.println(randomGenerate(10, 15));
        System.out.println(randomGenerate(200, 3500));

        System.out.println(randomGenerate2(200, 300));

        
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomGenerate(70,100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }


    public static int randomGenerate(int min, int max){
        return (int)(Math.random()*(max- min)+min);
    }

    public static int randomGenerate2(int min, int max){
        return new java.util.Random().nextInt(max-min)+min;
    }

}
