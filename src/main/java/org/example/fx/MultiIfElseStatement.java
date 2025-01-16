package org.example.fx;

import java.util.Scanner;

public class MultiIfElseStatement {

    public static void main(String[] args) {


        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter two positive numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 < 0 && number2 < 0) {
            System.out.println("You must enter positive numbers! ");
            System.exit(1);

        }
        else if (number1 < 0 || number2 < 0) {
            System.out.println("Next time please enter positive numbers!");
        }

        else if (number1 < 0 && number2 < 0){
            System.out.println("Yes you enter correct numbers!");
        }


        int answer = number1 + number2;

        System.out.println("The result of " + number1 + " + " + number2 + " is " + answer);

    }




}
