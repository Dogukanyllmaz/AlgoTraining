package org.example.array;

public class ArrayDemo {
    public static void main(String[] args) {

        //declares an array of integers
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


    }
}
