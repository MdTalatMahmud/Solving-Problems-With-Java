package Factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int a,ans=1;
        System.out.println("give me input: ");
        a=in.nextInt();

        if (a==0){
            System.out.println("factorial = 0");
        }else {
            for (int i=1;i<=a;i++){
                ans=i*ans;
            }
            System.out.println("factorial = "+ans);
        }

    }
}
