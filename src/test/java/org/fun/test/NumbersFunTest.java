package org.fun.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.fun.NumbersFun;
import org.junit.jupiter.api.Test;

public class NumbersFunTest {

    private NumbersFun numbersFun = new NumbersFun();

    @Test
    public void when_the_number_is_3_then_the_application_should_print_fizz(){
        assertEquals("Fizz", numbersFun.getNumber(3));
    }

    @Test
    public void when_the_number_is_divisible_by_3_then_the_application_should_print_fizz(){
        assertEquals("Fizz", numbersFun.getNumber(6));
    }

    @Test
    public void when_the_number_is_negative_number_then_error_should_be_returned(){
        assertEquals("Invalid Input. Number to should 0 or greater", numbersFun.getNumber(-1));
    }

    @Test
    public void when_the_number_is_zero_then_error_should_be_returned(){
        assertEquals("Invalid Input. Number to should 0 or greater", numbersFun.getNumber(-1));
    }

    @Test
    public void when_the_number_is_5_it_should_return_buzz(){
        assertEquals("Buzz", numbersFun.getNumber(5));
    }

    @Test
    public void when_the_number_is_divisble_by_5_it_should_return_buzz(){
        assertEquals("Buzz", numbersFun.getNumber(10));
    }

    @Test
    public void when_the_number_is_divisble_by_3_and_5_it_should_return_fizz_buzz(){
        assertEquals("FizzBuzz", numbersFun.getNumber(15));
    }

    @Test
    public void when_a_number_contains_3_in_it_should_return_fizz(){
        assertEquals("Fizz", numbersFun.getNumber(13));
    }

    @Test
    public void when_a_number_starts_with_31_in_it_should_return_fizz(){
        assertEquals("Fizz", numbersFun.getNumber(31));
    }

    @Test
    public void when_a_number_starts_with_39_in_it_should_return_fizz(){
        assertEquals("Fizz", numbersFun.getNumber(39));
    }

    @Test
    public void when_a_number_contains_5_in_it_should_return_fizz(){
        assertEquals("Buzz", numbersFun.getNumber(52));
    }

    @Test
    public void when_a_non_divisible_number_by_3_or_5_or_number_without_3_or_5_then_the_number_should_returned(){
        assertEquals("1", numbersFun.getNumber(1));
    }

    @Test
    public void when_input_19_I_should_get_19(){
        assertEquals("19", numbersFun.getNumber(19));
    }
}
