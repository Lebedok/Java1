package ScannerPractice;


import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // shortcut option + enter

        System.out.println("What is your height?");

        double height = input.nextDouble();
        int weight = input.nextInt();



        System.out.println("The height is  " + height);





    }
}
