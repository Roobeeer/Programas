package Calculadora;
import java.util.*;

public class Calculadora2{
    static Scanner tec = new Scanner(System.in);
    public static void main(String[]args){
        String cadena = "";
        do{
            System.out.println("Introduce una cadena de operaciones con dos números. Si desea salir de la calculadora introduzca 'salir'.");
            cadena = tec.nextLine();

            cadena = Limpiarformula.limpiarformula(cadena);
            String operacion = "";
            int posicion = 0;
            if(cadena.contains("+")){
                operacion = "+";
                posicion = cadena.indexOf("+");
            }else if(cadena.contains("-")){
                operacion = "-";
                posicion = cadena.indexOf("-");
            }else if(cadena.contains("*")){
                operacion = "*";
                posicion = cadena.indexOf("*");
            }else if(cadena.contains("/")){
                operacion = "/";
                posicion = cadena.indexOf("/");
            }else if(cadena.contains("^")){
                operacion = "^";
                posicion = cadena.indexOf("^");
            }else if(cadena.contains("+-")){
                operacion = "-";
                posicion = cadena.indexOf("+-");
            }else{
                System.out.println("Operación inválida");
                System.exit(0);
            }

            double a = 0.0;
            double b=0.0;

            try{
                a = Double.parseDouble(cadena.substring(0,posicion));
                b = Double.parseDouble(cadena.substring(posicion+1));
            }catch(Exception e){
                System.out.println("Formula inválida el programa no puede continuar");
                break;
            }
            double resultado = Operaciones.operaciones(cadena,a,b);
            if(Math.floor(resultado)==resultado){
                System.out.println("El resultado es --> "+(int)resultado);
            }else{
                System.out.println("El resultado es --> "+resultado);
            }

        }while(!cadena.equalsIgnoreCase("salir"));
            

        
    }
    }