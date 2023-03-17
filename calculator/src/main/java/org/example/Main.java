package org.example;

import java.util.Scanner;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public Main(){

    }
    public static Double squareroot(Double n){
        logger.info("Square root of" + n + "is");
        Double res=Math.sqrt(n);
        logger.info(res);
        return res;
    }
    public static int factorial(int n){
        logger.info("Factorial of "+n+" is ");
        int p=1;
        for(int i=1;i<=n;i++)
            p*=i;
        logger.info(p);
        return p;
    }

    public static Double naturallog(Double n){
        logger.info("Log of " + n + "is");
        Double res=Math.log(n);
        logger.info(res);
        return res;
    }

    public static Double power(Double n, Double p){
        logger.info(n + " power "+p+" is ");
        Double res=Math.pow(n,p);
        logger.info(res);
        return res;
    }
    public static void main(String[] args) {
        Double number1,power;
        int number2;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        do {
            //System.out.println("Welcome...");
            System.out.println("Enter your choice");
            System.out.println("1. Square root function");
            System.out.println("2. Factorial function");
            System.out.println("3. Natural logarithm (base)е");
            System.out.println("4. Power function ");
            System.out.println("5. Exit ");
            int operator = input.nextInt();

            switch (operator) {

                case 1:
                    System.out.println("Enter the number");
                    number1 = input.nextDouble();
                    System.out.println("Square root of " + number1 + " is " + squareroot(number1));
                    break;

                case 2:
                    System.out.println("Enter the number");
                    number2 = input.nextInt();
                    System.out.println("Factorial of " + number2 + " is " + factorial(number2));
                    break;

                case 3:
                    System.out.println("Enter the number");
                    number1 = input.nextDouble();
                    System.out.println("Log ( ln(x) ) of " + number1 + " is " + naturallog(number1));
                    break;

                case 4:
                    System.out.println("Enter the number");
                    number1 = input.nextDouble();
                    System.out.println("Enter the power");
                    power = input.nextDouble();
                    System.out.println(number1 + " power " + power + " is " + power(number1, power));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }
        }while(true);
    }
}