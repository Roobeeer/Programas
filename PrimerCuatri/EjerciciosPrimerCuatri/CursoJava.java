/*import javax.swing.JOptionPane;
public class CursoJava {
    public static void main(String[]args){
        String nombre = "Rober";

        System.out.println("Mi nombre es "+nombre);
        System.out.println("Mi nombre tiene  : " + nombre.length() + " letras");
        System.out.println("Mi nombre tiene " + nombre.length() + " letras y la primera letra de " + nombre + " es " + nombre.charAt(0));
        int ultimaletra=nombre.length();
        System.out.println("La ultima letra del nombre es: " + nombre.charAt(ultimaletra-1));
   
        //.equals compara dos cadenas y devuelve true si son iguales y false si no,
        //tiene en cuenta minusuclas y mayusculas
        //.equalsIgnoreCase igual pero sin tener en cuenta

        String frase = "Hoy es un estupendo día para aprender a programar en Java";
        String frase_resumen = frase.substring(0,29) + " irnos a la playa y olvidarnos de todo ..." + frase.substring(29,57);
        System.out.println(frase_resumen);




        String alumno1,alumno2;
        alumno1 = "David";
        alumno2 = "DaViD";
        System.out.println(alumno1.equalsIgnoreCase(alumno2));

        String numero=JOptionPane.showInputDialog("Introduce un número entero");

        double numero2 = Double.parseDouble(numero);

        System.out.println("Has introducido el número  : "+numero);
        System.out.print("Su raiz cuadrada es  : ");
        System.out.printf("%1.2f",Math.sqrt(numero2));


        System.out.println("Elige una opción : \n1 : Cuadrado \n2 : Rectángulo \n3: Triángulo");
        



    }
}
*/
import javax.swing.*;
public class CursoJava {
    public static void main(String[]args){
        //BUCLE WHILE
        String clave = "Hola";
        String pass = "";

        while(clave.equals(pass)==false){
            pass = JOptionPane.showInputDialog("Introduce la contraseña por favor");

            if(clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta, inténtelo de nuevo");
            }
        }
        System.out.println("Contraseña correcta. Acceso permitido");
    }
}