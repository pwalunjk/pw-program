package com.program;

public class SelectionSort {
    public static void main(String[] args) {
        new SelectionSort().selectionSort();

    }

    private void selectionSort() {
        int array[] = { 4, 3, 2, 0, 1 };
        System.out.println("Before Sort");
        print(array);

        int minPos;
        for (int i = 0; i < array.length; i++) {
            minPos = i;
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }
            // swap
            int tmp = array[minPos];
            array[minPos] = array[i];
            array[i] = tmp;
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
