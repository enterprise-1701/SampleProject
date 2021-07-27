package com.app.qa;

public class PrimeNumber {

    /*
    We need to divide an input number, say 17 from values 2 to 17 and check the remainder. If remainder is 0 number is not prime.
    No number is divisible by more than half of itself. So we need to loop through just numberToCheck/2 . If input is 17,
    half is 8.5 and the loop will iterate through values 2 to 8
    If a numberToCheck is completely divisible by other number, flag isPrime is set to true and the loop is exited.
     */

    public static void main(String[] args) {
        int remainder;
        boolean isPrime=true;
        int numberToCheck=19; // Enter the you want to check for prime

        //Loop to check whether the numberToCheckber is divisible any numberToCheckber other than 1 and iteself
        for(int i=2;i<=numberToCheck/2;i++)
        {
            //numberToCheckber is dived by itself
            remainder=numberToCheck%i;
            System.out.println(numberToCheck+" Divided by "+ i + " gives a remainder "+remainder);

            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
            if(remainder==0)
            {
                isPrime=false;
                break;
            }
        }
        // Check value true or false,if isprime is true then numberToCheckber is prime otherwise not prime
        if(isPrime)
            System.out.println(numberToCheck + " is a Prime number");
        else
            System.out.println(numberToCheck + " is not a Prime number");
    }
}
