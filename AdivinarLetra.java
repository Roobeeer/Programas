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
        tec.close();

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

