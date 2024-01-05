import java.util.*;
public class Invertircadena {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.print("Programa invertir cadena \nIntroduce una cadena de texto : ");
        String cadE=tec.nextLine();
        tec.close();
        

        String cadI="";
        for(int posLetra=0;posLetra<cadE.length();posLetra++){
            char cad = cadE.charAt(posLetra);
            cadI = cad+cadI;
        }
        System.out.println("Tu cadena de texto invertida es : "+ cadI);
    }
}
