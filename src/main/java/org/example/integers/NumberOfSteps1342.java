package org.example.integers;

public class NumberOfSteps1342 {
    public static int numberOfSteps(int num) {
        int counter = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                counter++;
            } else {
                num = num - 1;
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(123));
    }
}
