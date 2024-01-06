import java.util.*;
import javax.swing.*;

class AdivinaNumero{
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        int aleatorio = (int)(Math.random()*100);
        int numero=0;
        int intentos = 0;

        while(numero!=aleatorio){
            intentos++;
            System.out.println("Introduce un número");
            numero = tec.nextInt();
        
            
            if(aleatorio<numero){
            System.out.println("Más bajo");
        }else if(aleatorio>numero){
            System.out.println("Más alto");
        }
        }
        System.out.println("¡CORRECTO! \nHas adivinado el número "+aleatorio +" en "+ intentos + " intentos");
        


      
    }
}