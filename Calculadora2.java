import java.util.*;

public class Calculadora2{
    static Scanner tec = new Scanner(System.in);
    public static void main(String[]args){
        String cadena = "";
        do{
            System.out.println("Introduce una cadena de operaciones con dos números");
            cadena = tec.nextLine();


            cadena = limpiarformula(cadena);
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
            System.out.println("El resultado es --> "+operaciones(cadena,a,b));
        }while(!cadena.equalsIgnoreCase("salir"));

        
    }
    
        
    
    public static String limpiarformula(String s){
        s = s.replaceAll(" ","");
        s = s.replace("(","").replace(")","");
        s = s.replace("--","+").replace("-+","-").replace("+-","-").replace("++","+");
        return s;
    }

    public static double suma(double a, double b){
        double suma = a+b;
        return suma;
        }
        
    public static double resta(double a, double b){
        double resta = a-b;
        return resta;
    }
    public static double multiplicacion(double a, double b){
        if(b==0){
            return 1;
        }else{
            double multiplicacion = a*b;
            return multiplicacion;
        }
    }
    public static double division(double a, double b){
        double division = 0;
        if(b==0){
            System.out.println("No se permite la division entre ceros ");
        }else{
            division = a/b;
        }
        return division;
        
    }
    public static double elevarnumero( double a, double b){
        if(b==0){
            return 1;
        }else{
            return Math.pow(a,b);
        }
    }
    public static double operaciones(String cadena, double a, double b){
        double resultado = 0;
        if(cadena.contains("+")){
            resultado = suma(a,b);
        }else if(cadena.contains("-")){
            resultado = resta(a,b);
        }else if(cadena.contains("*")){
            resultado = multiplicacion(a, b);
        }else if(cadena.contains("/")){
            resultado = division(a,b);
        }else if(cadena.contains("^")){
            resultado = elevarnumero(a, b);
        }else{
            System.out.println("Operación inválida");
        }
        return resultado;
    }
    }