package HomeWork;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // class

        System.out.println("Please enter a number of fahrenheit: ");

        double fahrenheit = s.nextDouble();
        double celsius = fahrenheit * 0.472;

        System.out.println(celsius + " "+ "Celsius");

    }
}
