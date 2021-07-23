package com.company;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner =new  Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        System.out.println(input);
        int reversed = 0;

        while (input >0){
            int lastDigit = input%10;
            reversed = reversed*10+lastDigit;

            input /=10;
        }
        System.out.println("Reversed String is " + reversed);
    }


}
