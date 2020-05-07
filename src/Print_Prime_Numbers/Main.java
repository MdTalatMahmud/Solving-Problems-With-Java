package Print_Prime_Numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        boolean flag=true;
        System.out.println("give me the range: ");
        int range=input.nextInt();

        for(int i=1; i<=range; i++){
//            for (int j=2; j<i ;j++){
//                if (i%j==0){
//                    System.out.print(i+" ");
//                }
//            }
            for (int divider=2;divider<i;divider++){
                if (i % divider == 0){
                    flag=false;
                }
            }
            if (flag == false){
                System.out.print(i+" ");
            }
        }
    }
}
