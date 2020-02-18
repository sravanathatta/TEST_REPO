package org.numbersfun.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumbersFunTest {

    @Test
    public void when_the_number_is_divisible_by_3_then_the_application_should_print_fizz(){
        NumbersFun numbersFun = NumbersFunTest();
        assertEquals("Fizz", numbersFun.getNumber(3));
    }

}
