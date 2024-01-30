package Calculadora;

public class Operaciones {
    public static double suma(double a, double b){
        double suma = a+b;
        return suma;
        }
        
    public static double resta(double a, double b){
        double resta = a-b;
        return resta;
    }
    public static double multiplicacion(double a, double b){
            double multiplicacion = a*b;
            return multiplicacion;
    }
    public static double division(double a, double b){
        double division = 0;
        if(b==0){
            System.out.println("No se permite la division entre ceros ");
            return Double.NaN;
        }else{
            division = a/b;
        }
        return division;
        
    }
    public static double elevarnumero( double a, double b){
        double resultado = 1;
        for (int i=1;i<=Math.abs(b);i++){
            resultado = resultado*a;
        }
        if(b<0){
            resultado = 1/resultado;
        }
        else{
            resultado = resultado;
        }
        return resultado;
     
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