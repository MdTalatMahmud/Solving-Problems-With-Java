package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);

        int range;
        System.out.println("Give me range: ");
        range = input.nextInt();

        //System.out.println(range);

            int a=0,b=1,ans;
            for (int i=0;i<range;i++){

                ans=a+b;

                System.out.print(a+" ");
                a=b;
                b=ans;

            }




    }
}
