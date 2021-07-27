package com.app.qa;

public class LargestValue {

    public static void main(String[] args) {

        int[] arr = {28, 3, 15, 9, 99, 17, 4, 23, 2, 45};
        int largestValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestValue) {
                largestValue = arr[i];
            }
        }
        System.out.println("largest value is " + largestValue);
    }
    }



