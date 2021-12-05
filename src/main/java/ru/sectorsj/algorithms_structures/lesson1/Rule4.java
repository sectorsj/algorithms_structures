package ru.sectorsj.algorithms_structures.lesson1;

public class Rule4 {
    public static boolean findDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i] == array[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
