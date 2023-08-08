package Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static double a;
    static double b;

    public static void main(String[] args) {
        System.out.println(" Enter two variables: ");
        System.out.print("Enter a: ");
        a = readVariable();
        System.out.print("Enter b: ");
        b = readVariable();
        System.out.print("Chose operation:  + , - , * , / : ");
        choseOperation(a, b);

    }

    private static void choseOperation(double a, double b) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            switch (reader.readLine()) {
                case "+":
                    System.out.println(Calculator.add(a, b));
                    break;
                case "-":
                    System.out.println(Calculator.sub(a, b));
                    break;
                case "*":
                    System.out.println(Calculator.mul(a, b));
                    break;
                case "/":
                    System.out.println(Calculator.div(a, b));
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static double readVariable() {
        double variable;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            variable = Double.parseDouble(String.valueOf(reader.readLine()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return variable;
    }
}
