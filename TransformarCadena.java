import java.util.Scanner;
public class TransformarCadena {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce una cadena para transformarla --> ");
        String cadena = tec.nextLine();
        String cadena2 = cadena.toLowerCase();
        String cadenainversa= "";

        for(int i = 0; i<cadena.length();i++){
            char caracter = cadena.charAt(i);
            if(Character.isUpperCase(caracter)){
                System.out.print(Character.toLowerCase(caracter));
            }else if(Character.isLowerCase(caracter)){
                System.out.print(Character.toUpperCase(caracter));
            }else{
                System.out.print(caracter);
            }

        }

    }
    
}
