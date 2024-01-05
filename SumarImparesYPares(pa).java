import java.util.*;

public class SumarImparesYPares {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce una cantidad de numeros : ");
        int num = tec.nextInt();
        int par = 0;
        int impar = 0;
        for(int i = 0;i<num;i++){
            System.out.print("Introduce el número "+(i+1) + " :");
            int numero = tec.nextInt();
            

            if(numero % 2 ==0){
                par+=numero;
            }else{
                impar+=numero;
            }
        }
        System.out.println("La suma de los números pares es : "+par);
        System.out.println("La suma de los números impares es : "+impar);
        tec.close();
                


    }
    
    }