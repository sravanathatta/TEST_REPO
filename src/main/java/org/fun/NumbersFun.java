package org.fun;

public class NumbersFun {

    public String getNumber(int number){
        if(number <0 ){
            return "Invalid Input. Number to should 0 or greater";
        }

        if(number%3==0 && number%5==0){
            return "FizzBuzz";
        }

        if(number%5==0){
            return "Buzz";
        }

        if(number%3==0){
            return "Fizz";
        }

        if(number%10==3){
            return "Fizz";
        }
        return Integer.toString(number);
    }
}
