import java.util.*;
class MultiplicacionRecursiva{
    public static double multiplicaRecurs(int a, int b){
        if(a ==0 || b==0){
            return 0;
        }else{
            return a+multiplicaRecurs(a, b-1);
        }
    }

    public static void main(String[]args){
        Scanner tec =  new Scanner(System.in);
        System.out.print("Introduce el primer número(mayor que 0) -->  ");
        int a = tec.nextInt();
        System.out.print("Introduce el segundo número(mayor que 0) --> ");
        int b = tec.nextInt();
        tec.close();
        System.out.println("El resultado de la multiplicación es --> "+multiplicaRecurs(a,b));
    }
}