package org.fun;

import java.util.stream.IntStream;

public class NumbersFun {

    public String getNumber(int number) {
        if (number < 1) {
            return "Invalid Input. Number to should 0 or greater";
        }

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        if (number % 5 == 0 || contains(number, 5)) {
            return "Buzz";
        }

        if (number % 3 == 0 || number % 10 == 3 || contains(number, 3)) {
            return "Fizz";
        }

        return Integer.toString(number);
    }

    private boolean contains(int numberToCheck, int whatNumber) {
        int reminder;
        while (numberToCheck > 0) {
            reminder = numberToCheck % 10;
            if (reminder == whatNumber) {
                return true;
            }
            numberToCheck /= 10;
        }
        return false;
    }

/*    public static void main(String ar[]) {
        NumbersFun numbersFun = new NumbersFun();
        IntStream.range(1, 101).forEach(
                nbr -> System.out.println(numbersFun.getNumber(nbr))
        );
    }*/
}
