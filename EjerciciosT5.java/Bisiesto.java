// Escribe un método en JAVA que reciba un entero que represente un año, y cheque si el
//año es bisiesto (366 días). El método retornará true cuando sea bisiesto, y false en otro
//caso. Un año es bisiesto si es divisible por 4 y no por 100, o si es divisible por 400

/*class Bisiesto{
    public static void main(String[]args){
        System.out.println("Introduce un año ");

    }
    public static boolean bisiesto(int año){
        boolean bisiesto = false;
        int resultado=0;
        for (int i = 0;i<año;i++){
            if(resultado(i)/400==0){
                return bisiesto = true;
            }
        }
}
}*/
import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un año: ");
        int año = scanner.nextInt();

        if (bisiesto(año)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
        scanner.close();
    }

    public static boolean bisiesto(int año) {
        // Un año es bisiesto si es divisible por 4 y no por 100, o si es divisible por 400
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}
