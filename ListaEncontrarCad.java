/*import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.JOptionPane;

class ListaEncontrarCad{

public static int exercise2(String[] cads, String cad) {
    int result = 0;
    return result;
}

public static void main(String[]args){
    Scanner tec = new Scanner(System.in);
    System.out.println("¿Cuántas cadenas deseas implementar?");
    int numcad = tec.nextInt();
    String[] cadenas = new String[numcad];

    for(int i  = 0; i<cadenas.length;i++){
        cadenas[i]=System.out.println("Introduce la cadena "+i+1);
    }
}   
}*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEncontrarCad {
    public static int contarApariciones(List<String> listaCadenas, String cadenaBuscada) {
        int contador = 0;

        for (String cadena : listaCadenas) {
            // Utiliza el método indexOf para buscar la cadena en cada elemento de la lista
            int indice = cadena.indexOf(cadenaBuscada);

            // Incrementa el contador si la cadenaBuscada se encuentra en la cadena actual
            while (indice != -1) {
                contador++;
                // Continúa buscando a partir de la posición siguiente al índice encontrado
                indice = cadena.indexOf(cadenaBuscada, indice + 1);
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        // Crear una lista de cadenas
        List<String> listaCadenas = new ArrayList<>();

        // Solicitar al usuario que ingrese las cadenas
        System.out.println("Ingresa varias cadenas (ingresa 'fin' para terminar):");
        String entrada;
        do {
            System.out.print("> ");
            entrada = tec.nextLine();
            if (!entrada.equalsIgnoreCase("fin")) {
                listaCadenas.add(entrada);
            }
        } while (!entrada.equalsIgnoreCase("fin"));

        // Solicitar al usuario que introduzca la cadena a buscar
        System.out.print("Introduce la cadena a buscar: ");
        String cadenaBuscada = tec.nextLine();

        // Contar las apariciones de la cadena en la lista
        int resultado = contarApariciones(listaCadenas, cadenaBuscada);

        // Mostrar el resultado
        System.out.println("La cadena '" + cadenaBuscada + "' aparece " + resultado + " veces en la lista.");
    }
}
