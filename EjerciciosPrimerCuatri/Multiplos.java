import java.util.Scanner;

public class Multiplos {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce dos números para ver si son mútiplos entre ellos");
        System.out.print("Introduce el primer número : ");
        double n1 = tec.nextDouble();
        System.out.print("Introduce el segundo número : ");
        double n2 = tec.nextDouble();

        double resultado = n1/n2; 
        double resto = n1%n2;
        System.out.println("El resultado de la división es : "+resultado);

        if(resto==0){
            System.out.println(n1 + " es múltiplo de "+n2);
        }else if(n2==0){
            System.out.println("La división entre ceros no está permitida, introduzca otro número : ");
            double n3 = tec.nextDouble();
            tec.close();
            double resultado2 = n1/n3;
            double resto2 = n1%n3;
            System.out.println("El resultado de la division es: " + resultado2);
            if(resto2==0){
                System.out.println(n1 + " es multiplo de "+n3);
            }else{
                System.out.println(n1 + " no es múltiplo de "+n3);
            }


        }else{
            System.out.println(n1 + " no es múltiplo de "+n2);
        }
    }
}
