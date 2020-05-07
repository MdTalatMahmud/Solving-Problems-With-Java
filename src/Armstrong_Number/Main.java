package Armstrong_Number;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int inputNumber, temporary, summation=0, numberMod;
        System.out.println("enter a number: ");
        inputNumber=input.nextInt();

        temporary=inputNumber;
        while(temporary != 0){
            numberMod = temporary%10;
            summation = summation + (numberMod*numberMod*numberMod);
            temporary=temporary/10;
        }
        if (inputNumber==summation){
            System.out.println("armstrong number");
        }else {
            System.out.println("not armstrong number");
        }




    }
}
