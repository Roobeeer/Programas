package EXAMENPRIMERPARCIAL;
import java.util.*;
public class PiedraPapelTijera {
    
    public static void main(String[]args){
        Scanner tec =  new Scanner(System.in);
        System.out.println("*** Piedra, papel o tijeras ***");
        System.out.print("Jugador 1\nIntroduce Piedra, papel o tijeras --> ");
        String jugador1 = tec.nextLine();
        if(!(jugador1.equalsIgnoreCase("piedra") || jugador1.equalsIgnoreCase("tijeras") || jugador1.equalsIgnoreCase("papel"))){
            System.out.println("Solo se permite introducir Piedra, papel o tijeras. Reincie el programa para jugar de nuevo");
            System.exit(0);
        }
        System.out.print("Jugador 2\nIntroduce Piedra, papel o tijeras --> ");
        String jugador2 = tec.nextLine();
        tec.close();
        if(!(jugador2.equalsIgnoreCase("piedra") || jugador2.equalsIgnoreCase("tijeras") || jugador2.equalsIgnoreCase("papel"))){
            System.out.println("Solo se permite introducir Piedra, papel o tijeras. Reincie el programa para jugar de nuevo");
            System.exit(0);
        }

        if(jugador1.equalsIgnoreCase("piedra") && jugador2.equalsIgnoreCase("tijeras") || jugador1.equalsIgnoreCase("papel") && jugador2.equalsIgnoreCase("piedra") || jugador1.equalsIgnoreCase("tijeras")&& jugador2.equalsIgnoreCase("papel")){
            System.out.println("¡JUGADOR 1 GANA!");
        }else{
            System.out.println("¡JUGADOR 2 GANA!");
        }



        
}
}