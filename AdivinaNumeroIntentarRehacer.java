import java.util.*;
public class AdivinaNumeroIntentarRehacer {
    public static void main(String[]args){
        int aleatorio = (int)(Math.random()*100);
        Scanner tec = new Scanner(System.in);
        int numero = 0;
        int intentos = 0;

        while(numero!=aleatorio){
            intentos++;
            System.out.println("Introduce un número por favor");

            numero = tec.nextInt();

            if(aleatorio<numero){
                System.out.println("Más bajo");
            }else if(aleatorio>numero){
                System.out.println("Más alto");
            }
            }
            System.out.println("Correcto. Lo has conseguido en "+ intentos + " intentos");
            tec.close();
        }
    }
