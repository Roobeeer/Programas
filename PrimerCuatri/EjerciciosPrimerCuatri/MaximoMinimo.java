import java.util.*;

public class MaximoMinimo{
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce una cantidad de numeros : ");
        int num = tec.nextInt();
        double maximo = Double.MAX_VALUE;
        double minimo = Double.MIN_VALUE;

        for(int i = 0;i<num;i++){
            System.out.print("Introduce el número "+(i+1) + " :");
            double numero = tec.nextDouble();
            
            if(numero>num){
                maximo=numero;
            }else{
                minimo=numero;
        }
    }
    System.out.println("El número más grande es :"+maximo);
    System.out.println("El número más pequeño es : "+minimo);
    tec.close();
}
}
