import java.util.Scanner;

public class Calculadora2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(">> Introduce una cadena de operaciones: ");
            String formula = scanner.nextLine();

            if (formula.equalsIgnoreCase("salir")) {
                System.out.println("Has salido del programa");
                break;
            }

            formula = limpiarFormula(formula);

            String operacion = obtenerOperacion(formula);

            if (operacion.equals("")) {
                System.out.println("Operación no válida");
                continue;
            }

            double resultado = realizarOperacion(formula, operacion);

            if (Math.floor(resultado) == resultado) {
                System.out.println("El resultado es --> " + (int) resultado);
            } else {
                System.out.println("El resultado es --> " + resultado);
            }

        } while (true);

        scanner.close();
    }

    private static String limpiarFormula(String formula) {
        // Eliminar espacios en blanco y ajustar signos
        formula = formula.replaceAll("\\s+", "")
                         .replace("+-", "-")
                         .replace("-+", "-")
                         .replace("--", "+")
                         .replace("++", "+");

        // Agregar paréntesis para manejar números negativos
        formula = formula.replaceAll("-(\\d+(\\.\\d+)?)", "(-$1)");

        return formula;
    }

    private static String obtenerOperacion(String formula) {
        int index = formula.length() - 1;

        while (index >= 0) {
            char currentChar = formula.charAt(index);
            if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
                return String.valueOf(currentChar);
            } else if (currentChar == ')') {
                int closingParenthesisCount = 1;
                int openingParenthesisCount = 0;
                while (--index >= 0 && closingParenthesisCount != openingParenthesisCount) {
                    currentChar = formula.charAt(index);
                    if (currentChar == ')') {
                        closingParenthesisCount++;
                    } else if (currentChar == '(') {
                        openingParenthesisCount++;
                    }
                }
            }
            index--;
        }

        return "";
    }

    private static double realizarOperacion(String formula, String signo) {
        int ind = formula.lastIndexOf(signo);
        double a = 0.0;
        double b = 0.0;

        try {
            a = Double.parseDouble(formula.substring(0, ind).trim());
            b = Double.parseDouble(formula.substring(ind + 1).trim());
        } catch (NumberFormatException e) {
            System.out.println("Fórmula inválida, el programa no puede continuar");
            return 0.0;
        }

        double resultado = 0;
        switch (signo) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("No se permite la división entre ceros");
                }
                break;
        }
        return resultado;
    }
}
