import java.util.*;
public class Logde2VOLVERAHACER {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo : ");
        int numero = tec.nextInt();
        double resultado=ResultadoLogaritmo2(numero);
        System.out.println("El logaritmo de 2 es aproximadamente : "+resultado);
        tec.close();
    }



    private static double ResultadoLogaritmo2(int numero){
        double suma = 0.0;

        for(int  i = 1;i<=numero;i++){
            if(i%2==0){
                suma-= 1.0/i;
            }else{
                suma+= 1.0/i;
            }
        }
        return suma;
    }

}


