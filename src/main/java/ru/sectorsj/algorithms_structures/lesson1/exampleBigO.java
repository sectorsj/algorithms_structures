package ru.sectorsj.algorithms_structures.lesson1;

public class exampleBigO {
    public static int fibonacci (int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
