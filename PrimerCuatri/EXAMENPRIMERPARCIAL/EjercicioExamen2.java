package EXAMENPRIMERPARCIAL;
import java.util.*;
public class EjercicioExamen2 {
    public static void main(String[]args){
        Scanner tec =  new Scanner(System.in);
        System.out.println("** DADOS ** ");
        System.out.println("Introduce 'tirar' para tirar los dados y obtener un resultado");
            String tirar = tec.nextLine();
        if(tirar.equalsIgnoreCase("tirar")){
            do{
            int dado1 = (int)(Math.random()*6)+1;
            int dado2 =(int)(Math.random()*6)+1;
            int dado3 = (int)(Math.random()*6)+1;
            System.out.println("Los resultados son --> "+dado1+", "+dado2+", "+dado3);

            if(dado1 == 6 && dado2 == 6 && dado3 ==6){
                System.out.println("Excelente");
            }else if(dado1 == 6 && dado2 == 6 || dado2 == 6 && dado3 == 6 || dado1 == 6 && dado3 == 6){
                System.out.println("Muy bien");
            }else if(dado1 == 6 || dado2 == 6 || dado3 == 6){
                System.out.println("Regular");
            }else{
                System.out.println("Pésimo");
            }
        }while(tirar.equalsIgnoreCase("salir"));

    }else{
        System.out.println("Debes introducir 'tirar' para tirar los dados y obtener un resultado.");
    }
tec.close();
}
}
