package org.example.integers;

import java.util.ArrayList;
import java.util.List;

// Time Complexity O(n)

public class FizzBuzz412 {
    public static List<String> fizzBuzz(int n) {
        List<String> stringFizzBuzz = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                stringFizzBuzz.add("FizzBuzz");
            } else if (i % 3 == 0 ) {
                stringFizzBuzz.add("Fizz");
            } else if (i % 5 == 0) {
                stringFizzBuzz.add("Buzz");
            } else {
                stringFizzBuzz.add(String.valueOf(i));
            }
        }
        return stringFizzBuzz;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(15));
    }
}
