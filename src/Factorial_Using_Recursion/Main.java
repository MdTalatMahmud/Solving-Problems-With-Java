package Factorial_Using_Recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("give me input: ");
        int inputNumber;
        inputNumber=input.nextInt();

        RecursionFunction recursionFunction1=new RecursionFunction();

        recursionFunction1.recFunction(inputNumber);

        int ans;

        System.out.println("ans: ");

    }
}
