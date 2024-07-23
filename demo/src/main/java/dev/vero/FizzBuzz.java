package dev.vero;

public class FizzBuzz {

    // Stage 1
    public static String fizzBuzzStage1(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(num);
        }
    }

    // Stage 2
    public static String fizzBuzzStage2(int num) {
        String numStr = Integer.toString(num);
        boolean divisibleBy3 = num % 3 == 0;
        boolean contains3 = numStr.contains("3");
        boolean divisibleBy5 = num % 5 == 0;
        boolean contains5 = numStr.contains("5");

        if ((divisibleBy3 || contains3) && (divisibleBy5 || contains5)) {
            return "FizzBuzz";
        } else if (divisibleBy3 || contains3) {
            return "Fizz";
        } else if (divisibleBy5 || contains5) {
            return "Buzz";
        } else {
            return Integer.toString(num);
        }
    }
}
