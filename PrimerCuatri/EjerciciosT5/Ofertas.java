package EjerciciosT5;
import java.util.*;
//Un almacén de electrodomésticos va a cerrar y va a vender su stock con diferentes
//descuentos dependiendo del dinero de la compra.
//• Si la compra es inferior a 500 euros, no hay descuento.
//• Si la compra es mayor o igual a 500 euros y menor o igual a 2000 euros se aplicará
//un descuento del 30%.
//• Si la compra es superior a 2000 euros, se aplicará un descuento del 50%. 

public class Ofertas {
    static Scanner tec = new Scanner(System.in);
    public static double descuento(double a){
        double preciofinal;
        if(a>=500 && a<=2000){
            preciofinal = a*0.70;
            System.out.println("Al precio original de su compra se le ha aplicado el 30% y su precio final es " +preciofinal);
            return preciofinal;
        }else if(a>2000){
            preciofinal = a*0.50;
            System.out.println("Al precio original de su compra se le ha aplicado el 50% y su precio final es " +preciofinal);
            return preciofinal;
        }else if(a>=0 && a<500){
            System.out.println("Su precio final es  "+a+ " por no superar los 500 euros de compra ");
            return a;
        }else{
            System.out.println("Precio de compra inválido, introduce un número positivo");
            return -1;
        }
    }
    public static void main(String[]args){
        System.out.print("Introduce el precio de tu compra --> ");
        double compra = tec.nextDouble();
        descuento(compra);
    }
}
