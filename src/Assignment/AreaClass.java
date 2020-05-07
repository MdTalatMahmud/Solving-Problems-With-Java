package Assignment;

public class AreaClass {

    double R2, PI,SizingFactor;

    AreaClass(){

    }

    AreaClass(double r2, double pi){
        R2 = r2;
        PI = pi;

        System.out.println("Area : "+((R2*PI) * 0.5) );
    }

    AreaClass(double r2, double pi, double sizing_factor){
        R2 = r2;
        PI = pi;
        SizingFactor = sizing_factor;

        System.out.println("Area : "+(((R2*PI) * 0.5) * SizingFactor) );

    }

}
