import java.util.Scanner;

class MaxNumeros{
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce cuatro números");
        double a = tec.nextDouble();
        double b = tec.nextDouble();
        double c = tec.nextDouble();
        double d = tec.nextDouble();
        tec.close();
        double max;


        if(a>=b && a>=c && a>=d){
            max=a;
        }else if(b>=c && b>=d){
            max=b;
        }else if(c>=d){
            max=c;
        }else{
            max=d;
        }
        System.out.println("El máximo numero de los 4 introducidos es : "+max);


  
    }
}