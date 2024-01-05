import java.util.Scanner;

public class TernaPitagorica {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce tres números para comprobar si forman una terna pitagórica.");
        System.out.print("A = ");
        double a = tec.nextDouble();
        System.out.print("B = ");
        double b = tec.nextDouble();
        System.out.print("C = ");
        double c = tec.nextDouble();
        tec.close();

        if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a){
            System.out.println("Los números --> "+ a +", "+b +", "+c+", forman una terna pitagórica");

        }else{
            System.out.println("Los números --> "+ a +", "+b +", "+c+", no forman una terna pitagórica");
        }

    }

}
