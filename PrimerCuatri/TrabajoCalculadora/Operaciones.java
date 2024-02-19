package TrabajoCalculadora;

public class Operaciones {
    //Método para realizar la suma
    static double suma(double a, double b) {
        return a + b;
    }
    //Método para realizar la resta
    static double resta(double a, double b) {
        return a - b;
    }
    //Método para realizar la multiplicación
    static double multiplicacion(double a, double b) {
        return a * b;
    }
    //Método para realizar la división, en caso de ser 0, se sale del programa
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
    //Método para realizar la operacion de elevar con números POSITIVOS
    static double elevar(double a, double b) {
        return Math.pow(a,b);
    }
    //Método que realiza las operaciones anteriores en los distintos casos en los que la cadena tenga un signo diferente
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
                System.out.println("Operación inválida");
                break;
        }
        return resultado;
}
}