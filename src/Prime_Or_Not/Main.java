package Prime_Or_Not;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        boolean primeNumber=true;

        //taking input
        System.out.println("give me the number: ");
        int inputNumber=input.nextInt();

        //execute the loop
        for (int i=2;i<inputNumber;i++){
            if (inputNumber % i == 0){
                primeNumber=false;
                break;
            }else {

            }
        }

        //result making
        if (primeNumber==true){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }

    }

}
