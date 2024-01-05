import java.util.*;
//import javax.swing.*;
public class DibujarPiramide {
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Programa de dibujar una piramide \nIntroduce un número entero : ");
        int numero = tec.nextInt();
        tec.close();
        //String numero1=JOptionPane.showInputDialog("Introduce un número entero para dibujar una pirámide");

        //int numero=Integer.parseInt(numero1);

        int i;
        String cad="";
        for(i=1;i<=numero;i++){
            cad+="*";
            System.out.println(cad);
        }
    }
}
