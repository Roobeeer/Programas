import java.util.*;
public class EncontrarLetraRecurs {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto --> ");
        String cadena = tec.nextLine();
        System.out.print("Introduce una letra para encontrar en la cadena de texto --> ");
        char c = tec.nextLine().charAt(0);
        System.out.print("Introduce la posición de la cuál quieras iniciar la búsqueda -- > ");
        int posicion = tec.nextInt();
        tec.close();
        
        if(posicion!=-1){
            System.out.println("El carácter '"+c+"' se encuentra en la cadena '"+cadena+"' en la posición "+encontrarLetra(cadena,c,posicion));
        }else{
            System.out.println("El carácter '"+c+"' no se encuentra en la cadena '"+cadena);
        }

    }

    public static int encontrarLetra(String s, char c, int posicion){
        if(posicion>=s.length()){
            return -1;
        }else if(s.charAt(posicion)==c){
            return posicion;
        }else{
            return encontrarLetra(s,c,posicion+1);
        }
    }
}
