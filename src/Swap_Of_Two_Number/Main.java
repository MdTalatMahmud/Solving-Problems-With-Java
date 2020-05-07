package Swap_Of_Two_Number;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        int a,b, temporary;
        System.out.println("give me a's value: ");
        a=input.nextInt();
        System.out.println("give me b's value: ");
        b=input.nextInt();

        temporary=a;
        a=b;
        b=temporary;

        System.out.println("a : "+a);
        System.out.println("b : "+b);


    }
}
