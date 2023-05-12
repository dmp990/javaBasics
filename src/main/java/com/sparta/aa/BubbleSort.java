package com.sparta.aa;

public class BubbleSort {
    /*
    Create a program that will perform a bubble sort on a primitive array of integers
     */
    public static void main(String[] args) {

        int[] arr = {10, 14, 28, 11, 7, 16, 30, 50, 25, 18};

        System.out.print("Before Sorting: ");
        printArr(arr);

        bubbleSort(arr);

        System.out.print("After Sorting: ");
        printArr(arr);
    }


    public static void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
