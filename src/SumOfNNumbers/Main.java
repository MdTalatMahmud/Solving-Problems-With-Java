package SumOfNNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int range;
        int sum=0;
        System.out.println("give me input: ");
        range=input.nextInt();

        for(int i=0;i<=range;i++){

            sum=i+sum;
        }
        System.out.println("the sum is: "+sum);

    }
}
