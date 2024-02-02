package Week1.opg1;

public class Main {

    interface ArithmeticOperation {
        int perform(int a, int b);
    }

    interface MyTransformingType {
        int[] grades = {55, 89, 22, 99};
    }

    public static void main(String[] args) {
        new Main().addi();
        new Main().mult();

    }

    public static void addi() {
        ArithmeticOperation addition = (a, b) -> a + b;
        System.out.println(addition.perform(3, 32));


    }

    public void sub() {
        ArithmeticOperation subtraction = (int a, int b) -> a - b;
    }

    public void div() {
        ArithmeticOperation division = (int a, int b) -> a / b;
    }

    public void mult() {
        ArithmeticOperation multiplication = (int a, int b) -> a * b;
        System.out.println(multiplication.perform(3, 32));
    }

    public void mod() {
        ArithmeticOperation modulus = (int a, int b) -> a % b;
    }

    public void pow() {
        ArithmeticOperation power = (int a, int b) -> a ^ b;
    }
}