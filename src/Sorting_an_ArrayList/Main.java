package Sorting_an_ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 3999: ");
        int number= scan.nextInt();
        String numberString = "";

        switch ((number%100)/10)
        {
            case 1:  numberString += "X";
                break;
            case 2:  numberString += "XX";
                break;
            case 3:  numberString += "XXX";
                break;
            case 4:  numberString += "XL";
                break;
            case 5:  numberString += "L";
                break;
            case 6:  numberString += "LX";
                break;
            case 7:  numberString += "LXX";
                break;
            case 8:  numberString += "LXXX";
                break;
            case 9:  numberString += "XC";
                break;
            default: numberString = "Invalid nummber";
                break;
        }

        switch (number%10)
        {
            case 1:  numberString += "I";
                break;
            case 2:  numberString += "II";
                break;
            case 3:  numberString += "III";
                break;
            case 4:  numberString += "IV";
                break;
            case 5:  numberString += "V";
                break;
            case 6:  numberString += "VI";
                break;
            case 7:  numberString += "VII";
                break;
            case 8:  numberString += "VIII";
                break;
            case 9:  numberString += "IX";
                break;
            default: numberString = "Invalid nummber";
                break;
        }
        System.out.println(numberString);
    }
}

