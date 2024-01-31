package TrabajoCalculadora;
import java.util.Scanner;

class Calculadora2{
    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        String cadena = "";

        do {
            System.out.println("Introduce una cadena de operaciones con dos números TrabajoCalculadora");
            System.out.print(">> ");
            cadena = tec.nextLine();
            cadena = Limpiarformula.formulabuena(cadena);
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

            double resultado = Operaciones.operaciones(op, a, b);
            cadena = Limpiarformula.formulabuena(resultado + "");
            if(Math.floor(resultado)==resultado){
            System.out.println("Resultado --> " + (int)resultado);
            }else{
                System.out.printf("Resultado --> "+resultado);
               System.out.println("\n(resultado redondeado a las 3 primeras cifras decimales)");
               System.out.printf("Resultado --> %.3f\n", resultado);
            }

        } while (!cadena.equalsIgnoreCase("salir"));
    }
}