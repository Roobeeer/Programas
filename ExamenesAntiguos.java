import java.util.Scanner;
public class ExamenesAntiguos {
    public static void main(String[]args){

    
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce un número real con decimales --> ");
        int numreal = tec.nextInt();
        System.out.println("Introduce un número entero -- > ");
        int numentero = tec.nextInt();  

        double resultado = Math.round(numreal);
        System.out.println(resultado);

        }
}
