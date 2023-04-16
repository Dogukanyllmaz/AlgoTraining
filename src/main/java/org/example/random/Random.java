package org.example.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Youtube folksdev java bootcamp #13 Random sınıfı
 *
 * @author H. Doğukan Yılmaz
 */
public class Random {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        //Choose two different person in the persons list and print...
        List<String> persons = new ArrayList<>(Arrays.asList("Ahmet", "Mehmet", "Necmi", "Mahmut", "Furkan"));
        int counter2;
        counter2 = 0;

        String[] dummyArr = new String[2];
        while (counter2 < 2) {
            String selected = persons.get(randomGenerate(0, persons.size()));
            persons.remove(selected);
            dummyArr[counter2] = selected;
            counter2++;

        }
        for (int i = 0; i < dummyArr.length; i++) {
            System.out.println(dummyArr[i]);
        }


        //create 2D array and add random num between 0-49
        System.out.println("Enter a row number: ");
        int rowNum = sc.nextInt();
        int columnNum = 6;
        int[][] test = new int[rowNum][columnNum];

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < columnNum; j++) {
                int num = randomGenerate(0,49);
                if (num != test[i][j])
                    test[i][j] = num;
            }
        }

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < columnNum; j++) {
                System.out.format("%5d",test[i][j]); // format the matrix 5 pixel space....
            }
            System.out.println();
        }


        //Guess the number game...

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


        //Generate random ınteger value
        System.out.println(randomGenerate(10, 15));
        System.out.println(randomGenerate(200, 3500));

        System.out.println(randomGenerate2(200, 300));



        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomGenerate(70,100);
        }
        //list array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

    /**
     * generate random integer value between max-min
     * @param min min value
     * @param max max value
     * @return random num
     */
    public static int randomGenerate(int min, int max){
        return (int)(Math.random()*(max- min)+min);
    }

    /**
     * generate random integer value between max-min
     * @param min min value
     * @param max max value
     * @return random num
     */
    public static int randomGenerate2(int min, int max){
        return new java.util.Random().nextInt(max-min)+min;
    }

}
