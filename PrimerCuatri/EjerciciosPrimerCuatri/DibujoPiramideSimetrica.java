import java.util.*;
//import javax.swing.*;
public class DibujoPiramideSimetrica {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Programa de dibujar una piramide \nIntroduce un número entero : ");
        int numero = tec.nextInt();
        tec.close();
        //String numero1=JOptionPane.showInputDialog("Introduce un número entero para dibujar una pirámide");

        //int numero=Integer.parseInt(numero1);

        for(int i=0;i<numero;i++){
            for(int c=1;c<=2*numero-1;c++){
                if(c>=numero-i && c<=numero+i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
        }
        System.out.println("");
    }
}
}

