package Array_Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        int numberOfElements;

        System.out.println("Number of elements: ");
        numberOfElements=input.nextInt();

        int elements_array[] = new int[numberOfElements];

        System.out.println("give me the inputs now: ");
        for (int i=0; i<numberOfElements; i++){
            elements_array[i]=input.nextInt();
        }

        Arrays.sort(elements_array);

        for (int i=0;i<elements_array.length;i++){
            System.out.print(elements_array[i]+" ");
        }



    }
}
