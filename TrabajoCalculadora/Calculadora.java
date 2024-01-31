package TrabajoCalculadora;
import java.util.Scanner;

class Calculadora{
    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        String cadena = "";
        System.out.println("PROGRAMA CALCULADORA");
        System.out.println("--------------------");

        do {
            System.out.println("Introduce una cadena de operaciones con dos números");
            System.out.print(">> ");
            cadena = tec.nextLine();
            cadena = Limpiarformula.formulabuena(cadena);
            System.out.println("Fórmula --> " + cadena);

            if (cadena.contains("salir")) {
                System.out.println("Saliendo del programa");
                break;
            }

            String op = "";
            int ind = 0;
            if(cadena.contains("*")){
                op = "*";
                ind = cadena.indexOf("*",1);
            } else if(cadena.contains("/")){
                op = "/";
                ind = cadena.indexOf("/",1);
            } else if(cadena.contains("+")){
                op ="+";
                ind =cadena.indexOf("+",1);
            } else if(cadena.contains("-")){
                op = "-";
                // Buscar el índice de '-' que no esté al inicio
                ind = cadena.indexOf("-",1);
            } else if(cadena.contains("^")) {
                op = "^";
                ind =cadena.indexOf("^",1);
            } else{
                System.out.println("Operación no válida");
                continue;
            }

            double a=0.0;
            double b=0.0;

            try {
                if (ind>0) {
                    String strA = cadena.substring(0, ind);
                    String strB = cadena.substring(ind + 1);

                    a = Double.parseDouble(strA);
                    b = Double.parseDouble(strB);
                } else {
                    System.out.println("Operación no válida");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.err.println("Error al convertir los números de la cadena a formato double");
                continue;
            }

            double resultado;
            if(op.equals("^")){
                resultado = Operaciones.elevar(a,b);
            }else{
                resultado = Operaciones.operaciones(op,a,b);
            }
            imprimirResultado(resultado);

        } while (!cadena.equalsIgnoreCase("salir"));
        tec.close();
    }

    static void imprimirResultado(double resultado){

        if(Math.floor(resultado)==resultado){
            System.out.println("Resultado --> "+(int)resultado);
        }else{
            System.out.printf("Resultado --> %.3f\n",resultado);
            System.out.println("(resultado redondeado a las 3 primeras cifras decimales)");
        }
    }


}