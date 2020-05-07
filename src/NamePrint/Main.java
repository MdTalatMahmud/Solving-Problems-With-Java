package NamePrint;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        

        int numberOfChildren;
        String string="";
        
        System.out.println("Enter the Number of children");
        numberOfChildren = scanner.nextInt();


        Queue <String> queue = new LinkedList<>();

        int o=0;
        int p=0;


        while (o <= numberOfChildren){
            string=scanner.nextLine();
            queue.add(string);
            o++;
        }

         while (p <= numberOfChildren){
            System.out.println(queue.remove());
            p++;
        }

        
    }
    
}
