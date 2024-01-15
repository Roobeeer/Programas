import java.util.Scanner;
public class NormaVectorUni {
    public static double calculaNorma(double[]vector){
        double sumacuadrado = 0;

        for(double componente:vector){
            sumacuadrado+=componente*componente;
        }
        return Math.sqrt(sumacuadrado);
    }

    public static void main(String[]args){
        Scanner tec =  new Scanner(System.in);

        System.out.print("Ingrese la longitud del vector --> ");
        int longitud = tec.nextInt();

        double[]vector = new double[longitud];

        System.out.println("Introduce las componentes del vector");
        for(int i = 0; i<longitud;i++){
            System.out.print("Introduzca la componente "+(i+1)+ " : ");
            vector[i] = tec.nextInt();
            tec.close();

        }
        double norma = calculaNorma(vector);

        System.out.print("La norma del vector  es --> "+norma);

    }
}
