class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class Computer{
    void display(){
        System.out.println("This is a computer.");
    }

    String getBrand(){
        return "Generic Computer";
    }
}


public class Demo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        System.out.println("The sum is: " + result);

        Computer computer = new Computer();
        computer.display();
        System.out.println("Brand: " + computer.getBrand());


       
    }
}