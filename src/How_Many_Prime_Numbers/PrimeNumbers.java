package How_Many_Prime_Numbers;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        boolean primeNumber=true;

        //taking input
        System.out.println("give me the range: ");
        int Range=input.nextInt();

        //execute the loop
        for (int i=2;i<Range;i++){
            if (Range % i == 0){
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
