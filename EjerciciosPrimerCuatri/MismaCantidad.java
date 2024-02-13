import java.util.*;
public class MismaCantidad {
    public static boolean verifica(String cadena){
        boolean mismo = false;
        int numletras=0;
        int numnumeros=0;;
        for(int i = 0;i<cadena.length();i++){
            char caracter = cadena.charAt(i);

            if(Character.isAlphabetic(caracter)){
                numletras++;
            }else if(Character.isDigit(caracter)){
                numnumeros++;
            }

        }
        if(numletras==numnumeros){
            mismo = true;
            System.out.println("Tu cadena es par, hay la misma cantidad de números que de letras ");
        }else{
            mismo = false;
            System.out.println("Tu cadena es impar, la cantidad de números y letras es diferente");
        }
        return mismo;

        
    }

    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce una cadena --> ");
        String cadena = tec.nextLine();
        verifica(cadena); 
        tec.close();
    }

}
