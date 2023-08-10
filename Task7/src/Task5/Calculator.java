package Task5;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {

        if (a == 0) {
            try {
                throw new MyException("\u001b[38;5;23m" + "  Seriously!!!  ");
            } catch (MyException e) {
                throw new RuntimeException(e);
            }
        }
        if (b == 0)
            throw new ArithmeticException();
        return a / b;
    }
}

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}
