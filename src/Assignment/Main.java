package Assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int YesNo = 0;
        double SizingFactor;
        double PI = 3.1416;
        double R2;

        //AreaClass areaClass = new AreaClass();

        System.out.println("do you have any SizingFactor?Yes(1)/No(0)");
        YesNo = in.nextInt();

        if (YesNo == 0){

            System.out.println("put R2 value :");
            R2 = in.nextDouble();
            AreaClass areaClass = new AreaClass(R2, PI);

        }else {
            System.out.println("put the value of R2 & SizingFactor :");
            SizingFactor = in.nextDouble();
            R2 = in.nextDouble();
            AreaClass areaClass2 = new AreaClass(R2, PI, SizingFactor);

        }




    }

}
