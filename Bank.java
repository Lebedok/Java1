package ScannerPractice;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double deposit = 100;

        System.out.println("What is your deposit amount? :");
        deposit +=input.nextDouble();

        System.out.println("What is your deposit amount? :");
        deposit +=input.nextDouble();

        System.out.println("What is your deposit amount? :");
        deposit +=input.nextDouble();


        System.out.println("How much do you spend for computer? : ");
        deposit -=input.nextDouble();

        System.out.println("How much do you spend for phone? : ");
        deposit -=input.nextDouble();


        System.out.println("Your Balance is " + deposit);




    }
}


