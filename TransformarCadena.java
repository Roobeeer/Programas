import java.util.*;

class TransformarCadena{
    public static void main(String[]args){
    Scanner tec = new Scanner(System.in);
    System.out.println("Introduce una cadena para transformarla --> ");
    String cadena = tec.nextLine();
    System.out.println("Tu cadena transformada es --> "+transformarCadena(cadena));
    tec.close();
    }

    public static String transformarCadena(String s){
        String resultado = "";
        for(int i = 0; i<s.length();i++){
            char caracter= s.charAt(i);
            if(Character.isUpperCase(caracter)){
                resultado+= Character.toLowerCase(caracter);
            }else if(Character.isLowerCase(caracter)){
                resultado+= Character.toUpperCase(caracter);
            }else{
                resultado+=caracter;
            }
        }
        return resultado;

    }
}