public class Calculator {
    private double a;
    private double b;
    public int [] thisIsAnArray = {1,2,3,4,5,6};


    public Calculator(){

    }

    public Calculator(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int[] getThisIsAnArray() {
        return thisIsAnArray;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double addition (double a, double b){
        return a + b;
    }

    public double subtraction (double a, double b){
        return a - b;
    }

    public double multiplication (double a, double b){
        return a*b;
    }

    public double division(double a, double b) {
        if (b == 0)
            throw new IllegalArgumentException("Cannot divide by zero");
         else
            return a / b;

    }

    private int thisIsaPrivateMethod(int a, int b){
        return a*b*10;
    }

    public int callingThePrivateMethod(int a, int b){
        return this.thisIsaPrivateMethod(a , b);
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }



    }






