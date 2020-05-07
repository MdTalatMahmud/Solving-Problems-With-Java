package Palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        String string;
        boolean flag=true;

        System.out.println("Give me input:");
        string=input.next();
        char[] array=string.toCharArray();
        System.out.println("length: "+array.length);

        for (int i=0;i<array.length;i++){
            if (array[i] != array[array.length - i - 1]){
                flag=false;
            }

        }
        if (flag==false){
            System.out.println("not palindrome");
        }else if (flag==true){
            System.out.println("palindrome");
        }

    }
}
