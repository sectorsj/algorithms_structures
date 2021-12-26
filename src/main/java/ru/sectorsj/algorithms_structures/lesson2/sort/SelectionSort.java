package ru.sectorsj.algorithms_structures.lesson2.sort;

public class SelectionSort {
    public static void sort(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (i == min) {
                continue;
            }

            int temp = arr[min];
            arr[min] = temp;
        }
    }
}
