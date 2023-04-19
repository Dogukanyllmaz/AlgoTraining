package org.example.patika.java101.dataStructuresAndAlgo.sort;
/**
 *Patika java101 DataStructures
 *
 * @author H. Dogukan Yilmaz
 */
public class InsertionSortProject {

    public static void main(String[] args) {
        //{22,27,16,2,18,6};
        int[] arr = new int[6];
        arr[0] = 22;
        arr[1] = 27;
        arr[2] = 16;
        arr[3] = 2;
        arr[4] = 18;
        arr[5] = 6;

        //print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //pseudo code
        /*
            n = length(A)
            for i = 1 to n - 1 do
                j = i
                while j > 0 and A[j-1] > A[j] do
                    swap(A[j], A[j-1])
                    j = j - 1
                end while
            end for
         */

        //time complexity = O(n^2)
        //insertion sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] =key;
        }



        //print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }

}
