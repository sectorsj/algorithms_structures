package ru.sectorsj.algorithms_structures.lesson1;

public class ExampleLogn {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int n = arr.length;

        for (int i = 1; i < n; i*=2) {
            System.out.println(arr[i]);
//            n /= 2;

        }
    }
}
