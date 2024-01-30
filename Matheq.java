import java.util.Scanner;

class Matheq {
    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        String cadena;

        do {
            System.out.println("Introduce una cadena de operaciones con dos números");
            System.out.print(">> ");
            cadena = tec.nextLine();
            cadena = formulabuena(cadena);

            if (cadena.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa");
                break;
            }

            String op = obtenerOperador(cadena);
            if (op.isEmpty()) {
                System.out.println("Operación no válida");
                continue;
            }

            double[] operandos = obtenerOperandos(cadena, op);
            if (operandos == null) {
                System.out.println("Operación no válida");
                continue;
            }

            double resultado = operaciones(op, operandos[0], operandos[1]);
            cadena = formulabuena(resultado + "");
            System.out.println("Resultado --> " + resultado);

        } while (!cadena.equalsIgnoreCase("salir"));
    }

    static String formulabuena(String cadena) {
        cadena = cadena.replaceAll(" ", "");
        cadena = cadena.replace("(", "").replace(")", "");
        cadena = cadena.replace("++", "+").replace("--", "+").replace("+-", "-").replace("-+", "-");
        // Eliminar signos duplicados
        cadena = cadena.replaceAll("(\\+{2,})", "+");
        cadena = cadena.replaceAll("-{2,}", "-");
        cadena = cadena.replace("/+", "/");
        if (cadena.startsWith("+")) {
            cadena = cadena.substring(1);
        }
        return cadena;
    }

    static String obtenerOperador(String cadena) {
        String[] operadores = {"+", "-", "*", "/", "^"};
        for (String operador : operadores) {
            if (cadena.contains(operador)) {
                return operador;
            }
        }
        return "";
    }

    static double[] obtenerOperandos(String cadena, String operador) {
        int ind = cadena.indexOf(operador, 1);
        if (ind > 0) {
            String strA = cadena.substring(0, ind);
            String strB = cadena.substring(ind + 1);
            double a = Double.parseDouble(strA);
            double b = Double.parseDouble(strB);

            // Ajustar el signo del segundo operando si es necesario
            if (cadena.startsWith("-") && operador.equals("/") || operador.equals("*")) {
                b *= -1;
            }

            return new double[]{a, b};
        }
        return null;
    }

    static double operaciones(String operacion, double a, double b) {
        switch (operacion) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    System.out.println("No se permite la división entre ceros");
                    return 0;
                }
                return a / b;
            case "^":
                return Math.pow(a, b);
            default:
                System.out.println("Operación no válida");
                return 0;
        }
    }
}
