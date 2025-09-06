import java.util.Scanner;

public class Calculator {

    // ----- Arithmetic with varargs -----
    public int sum(int... numbers) {
        int result = 0;
        for (int n : numbers) result += n;
        return result;
    }

    public double sum(double... numbers) {
        double result = 0;
        for (double n : numbers) result += n;
        return result;
    }

    public int subtract(int... numbers) {
        if (numbers.length == 0) return 0;
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) result -= numbers[i];
        return result;
    }

    public double subtract(double... numbers) {
        if (numbers.length == 0) return 0.0;
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) result -= numbers[i];
        return result;
    }

    public int mult(int... numbers) {
        int result = 1;
        for (int n : numbers) result *= n;
        return result;
    }

    public double mult(double... numbers) {
        double result = 1.0;
        for (double n : numbers) result *= n;
        return result;
    }

    public int div(int... numbers) {
        if (numbers.length == 0) return 0;
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) throw new ArithmeticException("Division by zero");
            result /= numbers[i];
        }
        return result;
    }

    public double div(double... numbers) {
        if (numbers.length == 0) return 0.0;
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0.0) throw new ArithmeticException("Division by zero");
            result /= numbers[i];
        }
        return result;
    }

    // ----- Expression Evaluator -----
    public void Answer() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Perform a calculation (or type 'exit'): ");
            String calc = scanner.nextLine().trim();

            if (calc.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            String[] parts = calc.split(" ");
            if (parts.length != 3) {
                System.out.println("❌ Invalid format. Use: number operator number (e.g. 5 * 3)");
                continue;
            }

            try {
                double n1 = Double.parseDouble(parts[0]);
                String operator = parts[1];
                double n2 = Double.parseDouble(parts[2]);

                double result = 0;
                switch (operator) {
                    case "+" -> result = sum(n1, n2);
                    case "-" -> result = subtract(n1, n2);
                    case "*" -> result = mult(n1, n2);
                    case "/" -> {
                        if (n2 == 0) {
                            System.out.println("❌ Error: Division by zero");
                            continue;
                        }
                        result = div(n1, n2);
                    }
                    default -> {
                        System.out.println("❌ Unknown operator: " + operator);
                        continue;
                    }
                }

                System.out.println("✅ Result: " + result);

            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid number format.");
            } catch (ArithmeticException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }
    }

    // ----- Main -----
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.Answer();
    }
}
