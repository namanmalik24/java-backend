class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}


public class Practice {
    public static void main(String args[]) {

        Calculator calc = new Calculator();
        int sumTwo = calc.add(10, 20);
        int sumThree = calc.add(10, 20, 30);

        System.out.println("Sum of two numbers: " + sumTwo);
        System.out.println("Sum of three numbers: " + sumThree);    
        // this is method overloading,
        // where we have multiple methods with the same name but different parameters.


    }
    
}