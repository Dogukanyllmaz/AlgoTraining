package org.example.patika.java101;

public class MergeSortProject {

    //print array
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /*
    Merges two subarrays of arr[...]
    First subarray is arr[0...m]
    Second subarray is arr[m+1...r]
     */
    public void merge(int arr[],int left,int middle,int right){

        //Find sizes of two subarrays to be merged
        int n1 = middle-left+1;
        int n2 = right-middle;

        //Create temp arrays
        int Left[] = new int[n1];
        int Right[] = new int[n2];

        //Copy data
        for (int i = 0; i < n1; ++i) {
            Left[i] = arr[left+i];
        }
        for (int j = 0; j < n2; ++j) {
            Right[j] = arr[middle+1+j];
        }

        //initialize indexes of subarrays
        int i = 0;
        int j = 0;

        //initialize index of merged subarray array
        int k = left;
        while (i < n1 && j < n2){
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            }else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        //Copy remaining elements of Left[] if any
        while (i<n1){
            arr[k] = Left[i];
            i++;
            k++;
        }
        //Copy remaining elements of Right[] if any
        while (j<n2){
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    //Main method that sorts arr[left...right] using
    //merge()
    public void sort(int arr[],int left,int right){
        if (left<right){
            int middle = left+(right-left)/2; //Find the middle point

            //sort first and second halves
            sort(arr,left,middle);
            sort(arr,middle+1,right);

            //merge the sorted halves
            merge(arr,left,middle,right);

        }
    }

    public static void main(String[] args) {

        //pseudo code
        /*
            start
            declare array and left,right, middle variable
            perform merge method
            if left>right
                return
            mid = (right+left)/2
            mergesort(array,left,mid)
            mergesort(array,left+1,mid)
            merge(array,left,mid,right)
            stop
         */
        int arr[] = {16,21,11,8,12,22};

        System.out.println("Given Array");
        printArray(arr);

        //Time Complexity = O(Nlog(N))
        MergeSortProject mergeSortProject = new MergeSortProject();
        mergeSortProject.sort(arr,0,arr.length-1);

        System.out.println("\nSorted Array");
        printArray(arr);


    }

}
