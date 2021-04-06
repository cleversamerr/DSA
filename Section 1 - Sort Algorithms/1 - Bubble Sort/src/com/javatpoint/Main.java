package com.javatpoint;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        bubbleSort(intArray);
        printArray(intArray);
    }

    static void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++)
            for (int j = 0; j < length; j++)
                if (arr[j] > arr[i])
                    swap(arr, j, i);
    }

    static void swap(int[] arr, int index1, int index2) {
        if (arr[index1] == arr[index1 + 1])
            return;
        arr[index1] += arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] -= arr[index2];
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}
