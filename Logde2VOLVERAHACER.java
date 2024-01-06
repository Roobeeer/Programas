import java.util.*;
class Logde2VOLVERAHACER{
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo : ");
        int numero = tec.nextInt();
        tec.close();

        double resultado = ResultadoLogaritmo(numero);
        System.out.println("El logaritmo de 2 tiene un valor aproximado de : "+resultado);
    }
        public static double ResultadoLogaritmo(int numero){
            double suma = 0.0;
            for(int i=1;i<=numero;i++){
            if(i%2==0){
                suma -= 1.0/i;
            }else{
                suma+=1.0/i;
            }
        }
            return suma;
        }
    }