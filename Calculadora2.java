import java.util.Scanner;

public class Calculadora2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la cadena de operaciones:");
        String operaciones = scanner.nextLine();

        // Dividir la cadena en elementos individuales
        String[] elementos = operaciones.split("\\s+"); // Dividir por espacios

        // Inicializar el resultado con el primer número
        double resultado = Double.parseDouble(elementos[0]);

        // Iterar sobre los elementos de la cadena en pasos de 2
        for (int i = 1; i < elementos.length; i += 2) {
            // Obtener el operador y el siguiente número
            String operador = elementos[i];
            double siguienteNumero = Double.parseDouble(elementos[i + 1]);

            // Realizar la operación correspondiente
            switch (operador) {
                case "+":
                    resultado += siguienteNumero;
                    break;
                case "-":
                    resultado -= siguienteNumero;
                    break;
                case "*":
                    resultado *= siguienteNumero;
                    break;
                case "/":
                    resultado /= siguienteNumero;
                    break;
                // Puedes agregar más casos según tus necesidades

                default:
                    System.out.println("Operador no reconocido: " + operador);
                    return; // Salir del programa en caso de operador no reconocido
            }
        }

        // Imprimir el resultado final
        System.out.println("Resultado: " + resultado);

        // Cerrar el scanner al finalizar
        scanner.close();
    }
}
