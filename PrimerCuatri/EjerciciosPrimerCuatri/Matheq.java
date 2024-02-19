import java.util.Scanner;

public class Matheq {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        do {
            System.out.println("Introduce una cadena de operaciones con dos números Calculadora");
            System.out.print(">> ");
            String formula = tec.nextLine();
            formula = formulabuena(formula);
            System.out.println("Fórmula --> " + formula);

            if (formula.contains("salir")) {
                System.out.println("Saliendo del programa");
                break;
            }

            String op = "";
            int ind = 0;
            if (formula.contains("*")) {
                op = "*";
                ind = formula.indexOf("*", 1);
            } else if (formula.contains("/")) {
                op = "/";
                ind = formula.indexOf("/", 1);
            } else if (formula.contains("+")) {
                op = "+";
                ind = formula.indexOf("+", 1);
            } else if (formula.contains("-")) {
                op = "-";
                // Buscar el índice de '-' que no esté al inicio
                ind = formula.indexOf("-", 1);
            } else if (formula.contains("^")) {
                op = "^";
                ind = formula.indexOf("^", 1);
            } else {
                System.out.println("Operación no válida");
                continue;
            }

            double a = 0.0;
            double b = 0.0;

            try {
                if (ind > 0) {
                    String strA = formula.substring(0, ind);
                    String strB = formula.substring(ind + 1);

                    a = Double.parseDouble(strA);
                    b = Double.parseDouble(strB);
                } else {
                    System.out.println("Operación no válida");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.err.println("Error al convertir los números de la cadena a formato double");
                continue;
            }

            double resultado;
            if (op.equals("^")) {
                resultado = elevar(a, b);
            } else {
                resultado = operaciones(op, a, b);
            }

            imprimirResultado(resultado);

        } while (true);

        tec.close();  // Cierre del Scanner
    }

    static String formulabuena(String formula) {
        formula = formula.replaceAll(" ", "");
        formula = formula.replace("(", "").replace(")", "");
        formula = formula.replace("++", "+").replace("--", "+").replace("+-", "-").replace("-+", "-");
        // Eliminar signos duplicados
        formula = formula.replaceAll("(\\+{2,})", "+");
        formula = formula.replaceAll("-{2,}", "-");
        formula = formula.replace("/+", "/");
        formula = formula.replace("*+", "*");

        if (formula.startsWith("+")) {
            formula = formula.substring(1);
        }

        return formula;
    }

    static double operaciones(String operacion, double a, double b) {
        double resultado = 0;
        switch (operacion) {
            case "+":
                resultado = suma(a, b);
                break;
            case "-":
                resultado = resta(a, b);
                break;
            case "*":
                resultado = multiplicacion(a, b);
                break;
            case "/":
                resultado = division(a, b);
                break;
            default:
                System.out.println("Operación no válida");
                System.exit(0);
        }
        return resultado;
    }

    static double elevar(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    static void imprimirResultado(double resultado) {
        if (Math.floor(resultado) == resultado) {
            System.out.println("Resultado --> " + (int) resultado);
        } else {
            System.out.printf("Resultado --> %.3f\n", resultado);
            System.out.println("(resultado redondeado a las 3 primeras cifras decimales)");
        }
    }

    static double suma(double a, double b) {
        return a + b;
    }

    static double resta(double a, double b) {
        return a - b;
    }

    static double multiplicacion(double a, double b) {
        return a * b;
    }

    static double division(double a, double b) {
        double resultado = 0;
        if (b == 0) {
            System.out.println("No se permite la división entre ceros");
            System.exit(0);
        } else {
            resultado = a / b;
        }
        return resultado;
    }
}
