import java.util.Scanner;

public class EncontrarLetraRecurs {
    public static  int encontrarChar(String s, char c, int posicion){
        if(posicion >=s.length()){
            return -1;
        }else if(s.charAt(posicion)==c){
            return posicion;
        }else{
            return encontrarChar(s,c,posicion+1);
        }
    }
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto --> ");
        String cadena = tec.nextLine();
        System.out.print("Introduce una letra para encontrar dentro de la cadena --> ");
        char c = tec.nextLine().charAt(0);
        System.out.print("Introduce la posición de la cual quieres iniciar la búsqueda de la letra --> ");
        int posicion = tec.nextInt();
        tec.close();

        int resultado = encontrarChar(cadena,c,posicion);

        if(resultado!=-1){
            System.out.println("El carácter '"+c+"' se encuentra en la cadena '"+cadena+"' en la posición "+resultado);
        }else{
            System.out.println("El carácter '"+c+"' no se encuentra en la cadena '"+cadena+"'");
        }
    }
}
