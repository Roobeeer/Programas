import java.util.Scanner;

class Matheq {
    static Scanner tec = new Scanner(System.in);
    static double resultado;  // Declarar la variable resultado

    public static void main(String[] args) {
        String cadena = "";

        do {
            System.out.println("Introduce una cadena de operaciones con dos números Matheq");
            System.out.print(">> ");
            cadena = tec.nextLine();
            cadena = formulabuena(cadena);
            System.out.println("Fórmula --> " + cadena);

            if (cadena.contains("salir")) {
                System.out.println("Saliendo del programa");
                break;
            }

            try {
                resultado = evaluarExpresion(cadena);
                imprimirResultado(resultado);
            } catch (Exception e) {
                System.err.println("Error al evaluar la expresión: " + e.getMessage());
            }

        } while (!cadena.equalsIgnoreCase("salir"));

        tec.close();  // Cierre del Scanner
    }

    static String formulabuena(String cadena) {
        cadena = cadena.replaceAll(" ", "");
        cadena = cadena.replace("--", "+").replace("+-", "-").replace("-+", "-");
        cadena = cadena.replaceAll("(\\+{2,})", "+");
        cadena = cadena.replaceAll("-{2,}", "-");
        cadena = cadena.replace("/+", "/");
        cadena = cadena.replace("*+", "*");

        if (cadena.startsWith("+")) {
            cadena = cadena.substring(1);
        }

        return cadena;
    }

    static double evaluarExpresion(String expresion) {
        if (expresion.startsWith("-")) {
            expresion = "0" + expresion;
        }
        return evaluarTermino(expresion);
    }

    static double evaluarTermino(String termino) {
        int index = 1;

        while (index < termino.length()) {
            int siguienteOperador = termino.indexOf("+", index);
            if (siguienteOperador == -1) {
                siguienteOperador = termino.indexOf("-", index);
            }

            if (siguienteOperador == -1) {
                siguienteOperador = termino.length();
            }

            String factor = termino.substring(index, siguienteOperador);
            double valor = evaluarFactor(factor);

            if (index == 1) {
                resultado += valor;
            } else {
                char operador = termino.charAt(index - 1);
                if (operador == '+') {
                    resultado += valor;
                } else if (operador == '-') {
                    resultado -= valor;
                }
            }

            index = siguienteOperador + 1;
        }

        return resultado;
    }

    static double evaluarFactor(String factor) {
        int index = 1;

        while (index < factor.length()) {
            int siguienteOperador = factor.indexOf("*", index);
            if (siguienteOperador == -1) {
                siguienteOperador = factor.indexOf("/", index);
            }

            if (siguienteOperador == -1) {
                siguienteOperador = factor.length();
            }

            String elemento = factor.substring(index, siguienteOperador);
            double valor = Double.parseDouble(elemento);

            if (index == 1) {
                resultado = valor;
            } else {
                char operador = factor.charAt(index - 1);
                if (operador == '*') {
                    resultado *= valor;
                } else if (operador == '/') {
                    resultado /= valor;
                }
            }

            index = siguienteOperador + 1;
        }

        return resultado;
    }

    static void imprimirResultado(double resultado) {
        if (Math.floor(resultado) == resultado) {
            System.out.println("Resultado --> " + (int) resultado);
        } else {
            System.out.printf("Resultado --> %.3f\n", resultado);
            System.out.println("(resultado redondeado a las 3 primeras cifras decimales)");
        }
    }
}
