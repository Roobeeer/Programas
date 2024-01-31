import java.util.Scanner;

class Calculadora{
    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        String cadena = "";

        do {
            System.out.println("Introduce una cadena de operaciones con dos números Calculadora");
            System.out.print(">> ");
            cadena = tec.nextLine();
            cadena = formulabuena(cadena);
            System.out.println("Fórmula --> " + cadena);

            if (cadena.contains("salir")) {
                System.out.println("Saliendo del programa");
                break;
            }

            String op = "";
            int ind = 0;
            if (cadena.contains("+")) {
                op = "+";
                ind = cadena.indexOf("+", 1);

            } else if (cadena.contains("-")) {
                op = "-";
                // Buscar el índice de '-' que no esté al inicio
                ind = cadena.indexOf("-", 1);
            } else if (cadena.contains("*")) {
                op = "*";
                ind = cadena.indexOf("*");
            } else if (cadena.contains("/")) {
                op = "/";
                ind = cadena.indexOf("/");
            } else if (cadena.contains("^")) {
                op = "^";
                ind = cadena.indexOf("^");
            } else {
                System.out.println("Operación no válida");
                continue;
            }

            double a = 0.0;
            double b = 0.0;

            try {
                if (ind > 0) {
                    String strA = cadena.substring(0, ind);
                    String strB = cadena.substring(ind + 1);

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

            double resultado = operaciones(op, a, b);
            cadena = formulabuena(resultado + "");
            if(Math.floor(resultado)==resultado){
            System.out.println("Resultado --> " + (int)resultado);
            }else{
                System.out.printf("Resultado --> "+resultado);
               System.out.println("\n(resultado redondeado a las 3 primeras cifras decimales)");
               System.out.printf("Resultado --> %.3f\n", resultado);
            }

        } while (!cadena.equalsIgnoreCase("salir"));
    }

    static String formulabuena(String cadena) {
        do {
            cadena = cadena.replaceAll(" ", "");
            cadena = cadena.replace("(", "").replace(")", "");
            cadena = cadena.replace("++", "+").replace("--", "+").replace("+-", "-").replace("-+", "-");
            // Eliminar signos duplicados
            cadena = cadena.replaceAll("(\\+{2,})", "+");
            cadena = cadena.replaceAll("-{2,}", "-");
            cadena = cadena.replace("/+", "/");
            cadena = cadena.replace("*+", "*");
            if (cadena.startsWith("+")) {
                cadena = cadena.substring(1);
            }
            return cadena;
        } while (!cadena.equalsIgnoreCase("salir"));
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
            return 0;
        } else {
            resultado = a / b;
        }
        return resultado;
    }

    static double elevar(double a, double b) {
        if (b == 0) {
            return 1;
        } else {
            return Math.pow(a, b);
        }

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
            case "^":
                resultado = elevar(a, b);
                break;
            default:
                System.out.println("Inválido");
                break;
        }
        return resultado;
}
}