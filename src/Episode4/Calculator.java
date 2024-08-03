package Episode4;

public class Calculator {
    static int plu(int a, int b){
        return a + b;
    }
    static int minus(int a, int b){
        return a - b;
    }
    static int multiply(int a, int b){
        return a * b;
    }
    static double division(int a, int b){
        return a / Double.parseDouble(String.valueOf(b));
    }
    static double percent(int a, int b){
        return a * (b / 100.0);
    }

}
