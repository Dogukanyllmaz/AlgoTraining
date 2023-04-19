package org.example.patika.java101.dataStructuresAndAlgo.search;

import java.util.Scanner;

/**
 *Patika java101 DataStructures
 *
 * @author H. Dogukan Yilmaz
 */
public class BinarySearch {

    public int binarySearch(int arr[],int left,int right,int num){
        if (right>=left){
            int middle = left +(right-1)/2;

            if (arr[middle] == num)
                return middle;

            if (arr[middle]>num)
                return binarySearch(arr,left,middle-1,num);

            return binarySearch(arr,middle+1,right,num);
        }
        return -1;
    }


   //sort the array
    public static void insertSorting(int[] arr){
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] =key;
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BinarySearch binarySearch = new BinarySearch();
        int arr[] = {7, 5, 1, 8, 3, 6, 0, 9, 4, 2};

        insertSorting(arr); // sorting array
        printArray(arr); //print array

        System.out.print("Enter a integer: ");
        int num = sc.nextInt(); // take input

        int result = binarySearch.binarySearch(arr,0, arr.length-1, num);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.printf("Element found of index %d",result);

    }

}
