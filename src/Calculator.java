public class Calculator {

    public void add(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public void subtract(int num1, int num2){
        System.out.println(num1 - num2);
    }
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.add(10,13);
        calculator.subtract(4,5);
    }
}

