package EXAMENPRIMERPARCIAL;
import java.util.*;

public class EcuacionSegundoGrado {
    public static void main(String[]args){
    Scanner tec =  new Scanner(System.in);
    System.out.println("*** PROGRAMA ECUACIÓN SEGUNDO GRADO ***");
    System.out.println("Introduce los coeficientes de la ecuación --> ax^2+bx+c");
    System.out.print("Introduce el valor de a: ");
    double a = tec.nextDouble();
    System.out.print("Introduce el valor de b: ");
    double b = tec.nextDouble();
    System.out.print("Introduce el valor de c: ");
    double c = tec.nextDouble();
    double x1;
    double x2;
    if(a==0){
        if(b==0 && c==0){
            System.out.println("La ecuación tiene infinitos soluciones o es imposible de hallar un resultado");
        }else{
            x1 = (-1*c)/b;
            System.out.println("La ecuación es de primer grado y su solución es x = ");
        }
    }else{
        double discriminante = (b*b)-(4*a*c);
        double resultado = ((-1*b)+Math.sqrt(discriminante)/(2*a));
        if(discriminante == 0){
            x1 = resultado;
            System.out.println("Una única solución --> "+x1);
        }else if(discriminante>0){
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Hay dos soluciones --> x1 = "+x1+ " y x2 = "+x2);
        }else{
            
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(Math.abs(discriminante)) / (2 * a);
            System.out.println("Tiene dos soluciones complejas --> x1 = " + parteReal + " + " + parteImaginaria + "i y x2 = " + parteReal + " - " + parteImaginaria + "i");
        }
    }

}
}
