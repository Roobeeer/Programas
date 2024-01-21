import java.util.*;
class Calculadora{
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        String cadena;
        do{
            System.out.println("Introduce una cadena de operaciones ");
            cadena = tec.nextLine();
            if(cadena.contains("salir")){
                System.out.println("Has salido del programa ");
                }
        
        cadena  = cadenabuena(cadena);
        String operacion = "";
        int ind = 0;
        if(cadena.contains("+")){
            operacion = "+";
            ind = cadena.indexOf("+");
        }else if(cadena.contains("-")){
            operacion = "-";
            ind = cadena.indexOf("-");
        }else if(cadena.contains("*")){
            operacion = "*";
            ind = cadena.indexOf("*");
        }else if(cadena.contains("/")){
            operacion = "/";
            ind = cadena.indexOf("/");
        }else{
            System.out.println("Operación no válida ");
            continue;
        }
    

    double a = 0.0;
    double b = 0.0;
    try {
        a = Double.parseDouble(cadena.substring(0, ind));
        b = Double.parseDouble(cadena.substring(ind + 1));
    } catch (Exception e) {
        System.out.println("Fórmula inválida, el programa no puede continuar");
        break;
    }
    double resultado = operaciones(operacion,a,b);

    if(Math.floor(resultado)==resultado){
        System.out.println("El resultado es --> "+(int)resultado);
    }else{
        System.out.println("El resultado es --> "+resultado);
    }
}while(!cadena.equalsIgnoreCase("salir"));
tec.close();
    }
   

    public static double operaciones(String signo, double a, double b){
        double resultado= 0;
        switch(signo){
            case "+":
            resultado = a+b;
            break;
            case "-":
            resultado  = a-b;
            break;
            case "*":
            resultado = a*b;
            break;
            case "/":
                if(b!=0){
                    resultado = a/b;
                }else{
                    System.out.println("No se permite la división entre ceros");
                    break;
                }
            break;
            default: 
                System.out.println("Operación no válida");
        }
        return resultado;

    }
    public static String cadenabuena(String cadena){
        cadena = cadena.replaceAll("\\s+", "");

        cadena = cadena.replace("(","").replace(")","");

        cadena = cadena.replace("+-","-").replace("-+","-").replace("--","+").replace("++","+");
        return cadena;
    }
}