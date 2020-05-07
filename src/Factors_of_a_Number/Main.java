package Factors_of_a_Number;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.println("give me the number: ");
        int myInput=input.nextInt();

        for (int i=1; i<=myInput; i++){
            if (myInput%i == 0){
                System.out.print(i+" ");
            }else {

            }
        }
    }
}
