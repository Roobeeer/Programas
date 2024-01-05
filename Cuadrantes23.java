import java.util.Scanner;
public class Cuadrantes23 {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce un punto para obtener el cuadrante correcto(x,y) : ");
        String punto =tec.nextLine();
        tec.close();

        int dondeComa = punto.indexOf(',');

        int primerPar = punto.indexOf('(');

        String x= punto.substring(primerPar+1,dondeComa);

        String y = punto.substring(dondeComa+1,punto.lastIndexOf(')'));


        double x1=Double.parseDouble(x);
        double y1 = Double.parseDouble(y);
       if(x1>0 & y1>0){
        System.out.println("El punto --> " + punto + " está en el primer cuadrante");

       }else if(x1<0 & y1>0){
        System.out.println("El punto --> " + punto + " está en el segundo cuadrante");

       }else if(x1<0 & y1<0){
        System.out.println("El punto --> " + punto + " está en el tercer cuadrante");

       }else if(x1>0 & y1<0){
        System.out.println("El punto --> " + punto + " está en el cuarto cuadrante");
       }

    }
}
