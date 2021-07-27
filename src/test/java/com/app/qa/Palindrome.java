package com.app.qa;

public class Palindrome {

    public static void main (String args[]){
        String myString = "anna";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if(myString.equals(data)){
        System.out.println(myString + " is a Palindrome");
        }
        else{
            System.out.println(myString + " is not a Palindrome");
        }
    }

}
