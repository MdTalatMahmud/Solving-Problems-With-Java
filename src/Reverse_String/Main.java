package Reverse_String;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        String a;
        System.out.println("give me input: ");
        a=input.next();
        System.out.println("your input string is : "+a);

        char ch[]=a.toCharArray();
        int b = ch.length;

        for(int i=b-1; i>=0; i--){
            System.out.print(ch[i]);
        }
    }
}
