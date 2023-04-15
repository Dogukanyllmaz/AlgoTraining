package org.example.array;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        while (!sc.hasNextInt( )) {
            sc.nextLine( );
            System.out.print("Invalid integer; please enter an integer: ");
        }
        int i = sc.nextInt( );

        int[] data = {1,2,3,4,5,6,-2,7,34,25,5};

        System.out.println(findMax(data));

        System.out.println(totalSum(data));



        /*String[] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};

        System.out.println("sayi olarak gun gir(1-7): ");
        int dayNum = sc.nextInt();


        if (dayNum-1<7){
            switch (days[dayNum-1]){
                case "MON":
                    System.out.println("This is tough.");
                    break;
                case "TUE":
                    System.out.println("This is getting better.");
                    break;
                case "WED":
                    System.out.println("Half way there.");
                    break;
                case "THU":
                    System.out.println("I can see the light.");
                    break;
                case "FRI":
                    System.out.println("Now we are talking.");
                    break;
                default:
                    System.out.println("Day off!");
            }
        }
        else
            System.out.println("Sadece 7 gun var");

        int[] data = {1,2,3,4,5,6};
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        System.out.println(total);*/


       /* //declares an array of integers
        int[] anArray;
        //allocates memory for 10 integers
        anArray = new int[10];
        //initialize first element
        anArray[0] = 1;
        //initialize the other elements
        anArray[1] = 10;
        anArray[2] = 100;
        anArray[3] = 1000;
        anArray[4] = 10;
        anArray[5] = 100;
        anArray[6] = 1000;
        anArray[7] = 10;
        anArray[8] = 100;
        anArray[9] = 1000;
        //print elements
        System.out.println(anArray[0]);
        System.out.println(anArray[1]);
        System.out.println(anArray[2]);
        System.out.println(anArray[3]);
        System.out.println(anArray[4]);
        System.out.println(anArray[5]);
        System.out.println(anArray[6]);
        System.out.println(anArray[7]);
        System.out.println(anArray[8]);
        System.out.println(anArray[9]);
        System.out.println("-------------------");
        //print elements with for loop
        for (int i = 0; i < anArray.length; i++) {
            System.out.print(anArray[i] + " ");
        }

        //region shortcut
        int[] anArray2 = {100,200,300,400,500,600,700,800,900,1000};
        //region for print
        System.out.println("\nFor anArray2");
        for (int i = 0; i < anArray2.length; i++) {
            System.out.print(anArray2[i]+ " ");
        }
        //print anArray2 with for each loop
        System.out.println("\nFor each anArray2");
        for (int value: anArray2) {
            System.out.println("Element: " + value);
        }
*/



    }

    //use for and find max value in array
    public static int findMax(int data[]){

        int currentMax = data[0];
        for (int i = 1; i < data.length; i++) {
            if (currentMax<data[i])
                currentMax = data[i];
        }
        return currentMax;
    }

    //use for*each and find total value in array
    public static int totalSum(int data[]){

        int total = 0;
        for (int value:data) {
            total+=value;
        }
        return total;
    }

}
