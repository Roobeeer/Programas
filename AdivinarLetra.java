import java.util.*;
class AdivinarLetra{
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto y una letra");
        System.out.print("Introduce la cadena = ");
        String cadena = tec.nextLine();
        System.out.print("Introduce la letra que deseas buscar en la cadena = ");
        char letra = tec.next().charAt(0);
        String cadena1 = cadena.toLowerCase();
        String cadena2 = cadena.toUpperCase();
        boolean LetraEncontrada = false;

        for(int i =0;i<cadena1.length();i++){
            if(cadena1.charAt(i)==letra || cadena2.charAt(i)==letra){
                LetraEncontrada = true;
            }
        }

        if(LetraEncontrada==false){
            System.out.println("La letra '"+ letra + "' no se encuentra en la cadena de texto --> '"+cadena+"'");
        }else{
            System.out.println("La letra '"+ letra + "' se encuentra en la cadena de texto --> '"+cadena+"'");
        }
    }
}

/*import java.util.*;
class AdivinarLetra{
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
      //Instrucciones que piden al usuario introducir una cadena de texto y un caracter
        System.out.println("Introduce una cadena de texto y una letra");
        System.out.print("Introduce la cadena = ");
        String cadena = tec.nextLine();
        System.out.print("Introduce la letra que deseas buscar en la cadena = ");
        char letra = tec.next().charAt(0);
      //Se crean 2 cadenas para almacenar la cadena en mayusculas y minusculas por si el usuario introduce la letra en mayusculas o minusculas y que no salga el error de "No se ha encontrado la letra"
        String cadena1 = cadena.toLowerCase();
        String cadena2 = cadena.toUpperCase();
        boolean LetraEncontrada = false;
    //Bucle for en el cual la variable i se va desplazando en las posiciones de la cadena y las compara con la letra. Si se cumple transforma el boolean en true y se sale del bucle
        for(int i =0;i<cadena1.length();i++){
            if(cadena1.charAt(i)==letra || cadena2.charAt(i)==letra){
                LetraEncontrada = true;
                break;
            }
        }
      //Si el boolean es true se imprime que la letra se encuentra en la cadena, si no, se imprimirá que no
        if(LetraEncontrada==false){
            System.out.println("La letra '"+ letra + "' no se encuentra en la cadena de texto --> '"+cadena+"'");
        }else{
            System.out.println("La letra '"+ letra + "' se encuentra en la cadena de texto --> '"+cadena+"'");
        }
    }
}
*/