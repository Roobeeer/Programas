import java.util.Scanner;

public class SumarImparesYParespa{
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Programa sumar números pares e impares \n ¿Cuántos números desea introducir?");
        int numeros = tec.nextInt();
        double par=0;
        double impar=0;

        for ( int i=0;i<numeros;i++){
            System.out.print("Introduce el número "+(i+1)+" :");
            double numero = tec.nextDouble();

            if(numero % 2 ==0){
                par+=numero;
            }else{
                impar+=numero;
            }
        }
        tec.close();
        System.out.println("La suma de los numeros pares es : "+par);
        System.out.println("La suma de los números impares es : "+impar);
    }
}