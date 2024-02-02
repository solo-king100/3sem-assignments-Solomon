package Week1.opg2;

public class Main {

    interface MyTransformingType {
        int transformation(int a);
    }


    interface MyValidatingType {
        boolean validate(int b);
    }

    public static void main(String[] args) {

        System.out.println(doubleUp.transformation(9));
        System.out.println(valid.validate(19));
    }


    static MyTransformingType doubleUp = (a) -> a * 2;

    static MyValidatingType valid = (b) -> b % 3 == 0;
}
