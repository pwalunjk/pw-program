package com.program;

// http://java2novice.com/java-interview-programs/bubble-sort/

public class BubbleSort {
    public static void main(String[] args) {
        new BubbleSort().bubbleSort();

    }

    private void bubbleSort() {
        int array[] = { 4, 2, 0, 1 };
        System.out.println("Before Sort");
        print(array);

        // O(N2) = O(N*N)
        // Outer loop Start from last element backward
        //for (int i = array.length; i >= 0; i--) {
            for (int i = array.length - 1; i > 0; i--) {

                // Inner loop compare adjacent element and then swap. // forward
                //for (int j = 0; j < array.length - 1; j++) {
                for (int j = 0; j < i; j++) {
                int k = j + 1;
                    if (array[j] > array[k]) {
                        // swap
                        int tmp = array[j];
                        array[j] = array[k];
                        array[k] = tmp;
                    }
                }
            }

        System.out.println("\n");
        System.out.println("After Sort");
        print(array);

    }

    void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }
}
