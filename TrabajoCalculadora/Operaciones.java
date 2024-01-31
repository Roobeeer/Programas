package TrabajoCalculadora;

public class Operaciones {
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

    static double elevar(double a, double b) {
        return Math.pow(a,b);
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
                System.out.println("Operación inválida");
                break;
        }
        return resultado;
}
}