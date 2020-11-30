package ScannerPractice;

import java.util.Scanner;

public class CityName {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("City name :");
       String cityName = input.nextLine();

       //chicago -- 6
        // new york -- 7
        //eveyTime -- last char index number = last - 1

        int length = cityName.length();
        System.out.println(cityName.charAt(length-1)); // last char
        System.out.println(cityName.charAt(0));        // first char
        System.out.println(cityName.length());
        System.out.println(cityName.charAt(length/2));   // middle  char
        System.out.println(cityName.indexOf("g"));        // 5
        System.out.println(cityName.indexOf("c",cityName.indexOf("c")+1));   // -1











    }


}
