package EXAMENPRIMERPARCIAL;
import java.util.*;
class NombreEjercicios{
     public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce tu nombre y apellidos. Formato --> Nombre Apellido1 Apellido2");
        String nombreya = tec.nextLine();
        int primerEspacioBlanco = nombreya.indexOf(" ");
        String nombre= nombreya.substring(0,primerEspacioBlanco);
        int segundoEspacioBlanco = nombreya.indexOf(" ",primerEspacioBlanco+1);
        String primerApellido = nombreya.substring(primerEspacioBlanco+1,segundoEspacioBlanco);
        String segundoApellido = nombreya.substring(segundoEspacioBlanco+1);
        int cantidadEspacios = 0;
        tec.close();
        for(int i = 0;i<nombreya.length();i++){
            if(nombreya.charAt(i)==' '){
                cantidadEspacios++;
            }
        }
            if(cantidadEspacios==3){
                int tercerEspacioBlanco = nombreya.indexOf(" ",segundoEspacioBlanco+1);
                segundoApellido = nombreya.substring(segundoEspacioBlanco+1,tercerEspacioBlanco);
                String tercerApellido = nombreya.substring(tercerEspacioBlanco+1);
                System.out.println("Apellidos --> "+segundoApellido+", "+tercerApellido);
            }else{
                System.out.println("Apellidos --> "+primerApellido + ", "+segundoApellido);
        }
    }
}