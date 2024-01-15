package EjercicioExamen;

import java.util.Scanner;

public class SumaMatrices {
    public static double[] sumaMatrices(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            System.out.println("Los vectores deben tener la misma longitud");
            // Devolver un array vacío en caso de error
            return new double[0];
        }

        double resultado[] = new double[v1.length];

        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i] + v2[i];
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        // Ingresar los valores del primer vector
        System.out.println("Introduce los valores del primer vector: ");
        String valores = tec.nextLine();
        String[] valores1 = valores.split(" ");
        double[] vector = new double[valores1.length];
        for (int i = 0; i < valores1.length; i++) {
            vector[i] = Double.parseDouble(valores1[i]);
        }

        // Ingresar los valores del segundo vector
        System.out.println("Introduce los valores del segundo vector: ");
        String valores2 = tec.nextLine();
        String[] valores2Array = valores2.split(" ");
        double[] vector2 = new double[valores2Array.length];
        for (int i = 0; i < valores2Array.length; i++) {
            vector2[i] = Double.parseDouble(valores2Array[i]);
        }

        // Calcular la suma de los vectores
        double[] resultado = sumaMatrices(vector, vector2);

        // Imprimir el resultado
        System.out.print("El resultado de la suma es: [");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        tec.close();
    }
}
