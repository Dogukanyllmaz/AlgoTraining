package org.example.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * youtube folksdev java bootcamp #19 final keyword
 *
 * @author H. Doğukan Yılmaz
 */
public class Question1 {

    //ilk soru ->   verilen değerin array'de hangi indexte olduğunu bul.

    /*
    input value
    search array
    value == array[i]
    return i
     */

    public static int findIndex(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i])
                return i;
        }
        throw new RuntimeException("Value not found");
    }



    //ikinci soru ->    verilen değerin sonucu array'de ki 2 elemanın toplamına eşit, bu elemanları döndüren program

    /*
       input array
       input value
       search array
       which 2 nums sum == value
       return index
        */
    public static int[] twoSumArray(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==value){
                   return new int[] {i,j};
                }
            }
        }
        throw new RuntimeException("Value not found");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //first quest
        int[] testArr = {1,54,35,654,64,54,22,21,34,5,6,845,2};
        int value;
        System.out.print("Enter a value: ");
        value = sc.nextInt();
        System.out.println(findIndex(testArr, value));
        //int[] testArr2 = new int[Integer.MAX_VALUE -1]; // teoride dogru fakat vm limit exception aliriz...

        //second quest

        int[] testArr2 = {3,4,5,6,7,3,21,2};
        int value2;
        System.out.println("Enter value2: ");
        value2 = sc.nextInt();

        System.out.println(Arrays.toString(twoSumArray(testArr2, value2)));

    }
}
