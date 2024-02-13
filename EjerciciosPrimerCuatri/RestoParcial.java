import java.util.*;
    public class RestoParcial {
        public static int restoparcial(int dividendo, int divisor){
            Scanner tec = new Scanner(System.in);
            while(divisor<=0){
                System.out.println("No se permite la división entre ceros. Introduzca otra número ");
                divisor = tec.nextInt();
                tec.close();
            }

            String dividendolong = String.valueOf(dividendo);

            int restosuma = 0;

            for(int i=0;i<dividendolong.length();i++){
                int digito = Character.getNumericValue(dividendolong.charAt(i));

                int restoParcial = (divisor+digito)%divisor;
                restosuma += restoParcial;
            }
            return restosuma;

        }
        public static void main(String[]args){
            Scanner tec = new Scanner(System.in);
            System.out.print("Introduce un número entero -- > ");
            int num1 = tec.nextInt();
            System.out.print("Introduce otro número entero --> ");
            int num2 = tec.nextInt();
            tec.close();
            int resultado = restoparcial(num1,num2);

            System.out.println("El resultado es --> "+resultado);
        }
    }
