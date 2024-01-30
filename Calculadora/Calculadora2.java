package Calculadora;
import java.util.*;

public class Calculadora2{
    static Scanner tec = new Scanner(System.in);
    public static void main(String[]args){
        String cadena = "";
        int posicion=0;
        do{
            System.out.println("Introduce una cadena de operaciones con dos números. Si desea salir de la calculadora introduzca 'salir'.");
            cadena = tec.nextLine();

            cadena = Limpiarformula.formulabuena(cadena);
            String op = "";
    int ind = 0;
    if(cadena.contains("+")){

        op = "+";
        ind = cadena.indexOf("+");
    }else if(cadena.contains("-")){
        if (ind > 0 && (cadena.charAt(ind-1) =='*' || cadena.charAt(ind-1) =='/' || cadena.charAt(ind -1) == '+'|| cadena.charAt(ind-1) =='-')){
            op = "-";
            ind = cadena.indexOf("-");
        }else{
                op = "";
                ind = 0;
            }
    }else if(cadena.contains("*")){
        op = "*";
        ind = cadena.indexOf("*");
    }else if(cadena.contains("/")){
        op = "/";
        ind = cadena.indexOf("/");
    }else if(cadena.contains("^")){
        op = "^";
        ind = cadena.indexOf("^");
    }else{
        System.out.println("Operación no válida, saliendo del programa");
        System.exit(0);
    }

            double a = 0.0;
            double b=0.0;

            try{
                if(posicion>0){
                    String strA = cadena.substring(
                        0,posicion);
                    String strB = cadena.substring(posicion+1);
        
                    a = Double.parseDouble(strA);
                    b = Double.parseDouble(strB);
                }else{
                }
            }catch(NumberFormatException e){
                System.err.println("Error al convertir los números de la cadena a formato double");
                a = 0.0;
                b = 0.0;
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