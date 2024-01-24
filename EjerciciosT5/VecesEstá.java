package EjerciciosT5;

import java.util.Scanner;

public class VecesEstá {
    public static int iterativo(String s, char c){
        int resultado = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==c){
                resultado++;
            }
        }
        return resultado;
    }

    public static int recursiva(String s, char c, int posicion){
        if(posicion==s.length()){
            return 0;
        }else{
            int contador = (s.charAt(posicion) == c) ? 1 : 0;
            return contador+recursiva(s,c,posicion+1);
        }

        
    }
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce una cadena -- > ");
        String cadena = tec.nextLine();
        System.out.print("introduce el carácter que quieras buscar en la cadena --> ");
        char c = tec.nextLine().charAt(0);
        tec.close();

        int vecesiterativo = iterativo(cadena,c);
        System.out.println("El carácter "+c+ " se repite "+vecesiterativo);

        int vecesrecursivo = recursiva(cadena,c,0);
        System.out.println("El carácter "+c+" se repite "+vecesrecursivo);
    }
    
}
