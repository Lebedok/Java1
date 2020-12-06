package ScannerPractice;

import java.util.Scanner;
public class CapitalizeFirstLetter {

        public static void main (String [] args){

            Scanner keyboard = new Scanner (System.in);
            System.out.print("Please Type a word: ");
            String word = keyboard.nextLine();

            int stringLength = word.length();
            String letter1 = word.substring (0,1);
            String lastletter = word.substring ((stringLength-1),(stringLength));
            String newWord =letter1.toUpperCase() + lastletter.toUpperCase();


            System.out.println("The word with first letter capitalized is: " + newWord );

        }
    }

