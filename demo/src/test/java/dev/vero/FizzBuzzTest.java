package dev.vero;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    public void testFizzBuzzStage1() {

        assertEquals("Fizz", FizzBuzz.fizzBuzzStage1(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzzStage1(6));
        assertEquals("Fizz", FizzBuzz.fizzBuzzStage1(9));

        assertEquals("Buzz", FizzBuzz.fizzBuzzStage1(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzzStage1(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzzStage1(20));

        assertEquals("FizzBuzz", FizzBuzz.fizzBuzzStage1(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzzStage1(30));

        assertEquals("1", FizzBuzz.fizzBuzzStage1(1));
        assertEquals("2", FizzBuzz.fizzBuzzStage1(2));
        assertEquals("4", FizzBuzz.fizzBuzzStage1(4));
        assertEquals("7", FizzBuzz.fizzBuzzStage1(7));
    }

    // Stage 2
    @Test
    public void testFizzBuzzStage2() {

        assertEquals("Fizz", FizzBuzz.fizzBuzzStage2(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzzStage2(6));
        assertEquals("Fizz", FizzBuzz.fizzBuzzStage2(9));
        assertEquals("Fizz", FizzBuzz.fizzBuzzStage2(13));

        assertEquals("Buzz", FizzBuzz.fizzBuzzStage2(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzzStage2(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzzStage2(20));
        assertEquals("Buzz", FizzBuzz.fizzBuzzStage2(25));

        assertEquals("FizzBuzz", FizzBuzz.fizzBuzzStage2(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzzStage2(30));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzzStage2(45));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzzStage2(53));

        assertEquals("1", FizzBuzz.fizzBuzzStage2(1));
        assertEquals("2", FizzBuzz.fizzBuzzStage2(2));
        assertEquals("4", FizzBuzz.fizzBuzzStage2(4));
        assertEquals("7", FizzBuzz.fizzBuzzStage2(7));
    }
}