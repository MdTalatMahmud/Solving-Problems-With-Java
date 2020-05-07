package Factorial_Using_Recursion;

public class RecursionFunction {

    int recFunction(int inputNumber){
        if (inputNumber==1){
            return 1;
        }else {
            return inputNumber*recFunction(inputNumber-1);
        }

    }

}
