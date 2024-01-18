import java.util.*;
class Calculadora{
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        double numero;
        do{
            System.out.println("Introduce un número");
            numero = tec.nextInt();
        }while(numero<=50);
    }
}