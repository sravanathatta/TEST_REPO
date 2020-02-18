package org.fun;

public class NumbersFun {

    public String getNumber(int number){
        if(number%3==0){
            return "Fizz";
        }
        return Integer.toString(number);
    }
}
