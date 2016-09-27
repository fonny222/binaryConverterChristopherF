package com.example;

import java.util.Scanner;
import java.util.Arrays;

public class binaryCon {

    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);

        // I have 2 arrays set to max of 7
        int[] binaryArr = new int[7];
        int[] bArray2 = new int [7];
        int modNum;
        int userNum;
        int counter = 0;


        System.out.println();
        System.out.println();


        // I'm using a max of 1-100 because the binary conversion will only have a max of
        // seven digits
        System.out.println("The Following will convert a Decimal number into Binary");
        System.out.println();
        System.out.print("Please input a number between 1 and 100: ");
        userNum = inputDevice.nextInt();
        System.out.println();

        // check to make sure number is between 1 and 100
        while(userNum < 1 || userNum > 100)
        {
            System.out.println("Please only use numbers between 1 and 100");
            userNum = inputDevice.nextInt();
        }


        // this loops through the math and  stores the value in an array
        while(userNum >= 1)
        {
            modNum = userNum % 2;

            binaryArr[counter] = modNum;

            userNum = userNum/2;

            counter++;
        }


        // because the way the math is calculated the array is in reverse order
        // this for loop swaps the numbers from one array into a second array in reverse order
        // so that in the final loop they will display properly
        for(int g = 0, i = (counter-1); i >= 0; i--, g++)
        {
            //System.out.println(binaryArr[g]);

            bArray2[g] = binaryArr[i];

            //System.out.println("Counter "+i);

        }

        // this just adds spacing
        System.out.println();
        System.out.println();

        System.out.print("The Binary number is: ");
        // because of the swap the binary number is in the correct order
        for(int i = 0; i < counter; i++)
        {
            System.out.print(bArray2[i]);
        }



        // this just adds spacing
        System.out.println();
        System.out.println();


    }
}
