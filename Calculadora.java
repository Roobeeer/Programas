import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(">> ");
            String formula = scanner.nextLine();

            if (formula.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                formula = sanitizeFormula(formula);
                String op = getOperator(formula);
                int ind = formula.indexOf(op);

                if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                    double a = extractOperand(formula, 0, ind);
                    double b = extractOperand(formula, ind + 1, formula.length());

                    double result = performOperation(op, a, b);

                    if (result % 1 == 0) {
                        System.out.println((int) result);
                    } else {
                        System.out.println(result);
                    }
                } else {
                    System.out.println("Operación no válida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Fórmula errónea");
            }

        } while (true);

        scanner.close();
    }

    private static String sanitizeFormula(String formula) {
        // Remove spaces and handle +- and -+
        formula = formula.replaceAll("\\s", "");
        formula = formula.replace("+-", "-");
        formula = formula.replace("-+", "-");
        return formula;
    }

    private static String getOperator(String formula) {
        if (formula.contains("*")) {
            return "*";
        } else if (formula.contains("/")) {
            return "/";
        } else if (formula.contains("+")) {
            return "+";
        } else if (formula.contains("-")) {
            return "-";
        } else {
            throw new IllegalArgumentException("Operación no válida");
        }
    }

    private static double extractOperand(String formula, int start, int end) {
        return Double.parseDouble(formula.substring(start, end));
    }

    private static double performOperation(String op, double a, double b) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("División por cero no permitida");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }
}
