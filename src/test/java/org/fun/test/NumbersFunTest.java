package org.fun.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.fun.NumbersFun;
import org.junit.jupiter.api.Test;

public class NumbersFunTest {

    NumbersFun numbersFun = new NumbersFun();

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

}
