package org.example;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static int factorial(int n){
        int p=1;
        for(int i=1;i<=n;i++)
            p*=i;
        return p;
    }
    public static void main(String[] args) {
        Double number1,power;
        int number2;

        // create an object of Scanner class
        System.out.println("Enter your choice");
        System.out.println("1. Square root function");
        System.out.println("2. Factorial function");
        System.out.println("3. Natural logarithm (base)е");
        System.out.println("4. Power function ");
        Scanner input = new Scanner(System.in);
        int operator=input.nextInt();

        switch (operator) {

            case 1:
                System.out.println("Enter the number");
                number1=input.nextDouble();
                System.out.println("Square root of " + number1 +" is " + Math.sqrt(number1) );
                break;

            case 2:
                System.out.println("Enter the number");
                number2=input.nextInt();
                System.out.println("Factorial of " + number2 +" is " + factorial(number2) );
                break;

            case 3:
                System.out.println("Enter the number");
                number1=input.nextDouble();
                System.out.println("Log ( ln(x) ) of " + number1 +" is " + Math.log(number1) );
                break;

            case 4:
                System.out.println("Enter the number");
                number1=input.nextDouble();
                System.out.println("Enter the power");
                power=input.nextDouble();
                System.out.println(number1 +" power " + power + " is " + Math.pow(number1,power) );
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}