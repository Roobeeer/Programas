package TrabajoCalculadora;
import java.util.Scanner;

class Calculadora{
    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        String cadena = "";
        System.out.println("PROGRAMA CALCULADORA");
        System.out.println("--------------------");

        do {
            //Se solicita la entrada del usuario para introducir la cadena de operaciones
            System.out.println("Introduce una cadena de operaciones con dos números");
            System.out.print(">> ");
            cadena = tec.nextLine();
            //la instruccion Limpiarformula.formulabuena limpia la formula utilizando la clase y le método correspondiente para eliminar espacios, paréntesis, etc.
            cadena = Limpiarformula.formulabuena(cadena);
            System.out.println("Fórmula --> " + cadena);

            //Si el usuario introduce salir, el programa se cierra
            if (cadena.contains("salir")) {
                System.out.println("Saliendo del programa");
                break;
            }

            String op = "";
            int ind = 0;
            //Estas condiciones determinan el tipo de instrucción que hay en base a la cadena
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
                // Buscar que el índice de '-' no esté al inicio para evitar errores
                ind = cadena.indexOf("-",1);
            } else if(cadena.contains("^")) {
                op = "^";
                ind =cadena.indexOf("^",1);
            } else{
                //Se muestra un mensaje de operación no válida y se establece la instrucción continue; para poder seguir introduciendo una cadena hasta que la operación sea correcta
                System.out.println("Operación no válida");
                continue;
            }

            double a=0.0;
            double b=0.0;

            try {
                //Se extraen los operandos a ambos lados de la cadena que se separan mediante el signo /,+,-,* o ^ y se convierten en double
                if (ind>0) {
                    String strA = cadena.substring(0, ind);
                    String strB = cadena.substring(ind + 1);

                    a = Double.parseDouble(strA);
                    b = Double.parseDouble(strB);
                } else {
                    //Se muestra el mensaje y se da la posibilidad de continuar introduciendo cadenas
                    System.out.println("Operación no válida");
                    continue;
                }
            } catch (NumberFormatException e) {
                //Se maneja la excepción en caso de que haya un error al convertir los números
                System.err.println("Error al convertir los números de la cadena a formato double");
                continue;
            }

            double resultado;
            //Instrucciones para realizar las operaciones correspondientes
            if(op.equals("^")){
                resultado = Operaciones.elevar(a,b);
            }else{
                resultado = Operaciones.operaciones(op,a,b);
            }
            //Imprimir el resultado llamando al método adecuado
            imprimirResultado(resultado);

        } while (!cadena.equalsIgnoreCase("salir"));
        //Cerrar la entrada del usuario
        tec.close();
    }

    static void imprimirResultado(double resultado){
        //Condición en la cuál se utiliza Math.floor para redondear al número más significativo y si este es igual al resultado se imprime solamente el numero entero, del caso contrario, se imprime el número redondeado 
        //a las 3 primeras cifras decimales mediante la instruccion printf
        if(Math.floor(resultado)==resultado){
            System.out.println("Resultado --> "+(int)resultado);
        }else{
            System.out.printf("Resultado --> %.3f\n",resultado);
            System.out.println("(resultado redondeado a las 3 primeras cifras decimales)");
        }
    }


}