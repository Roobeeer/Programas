import javax.swing.*;
public class Factorial {
  
  public static long factorial(int numero) {
    // Escribe tu codigo aquí
    long resultado = 1;
    for(int i = 1; i<=numero;i++){
        resultado = resultado*i;
    }
    return resultado;

  }
  
  
  public static void main(String[] args) {
    try{
      String numero =JOptionPane.showInputDialog("Introduce un número entero");
      int numero2 = Integer.parseInt(numero);
      System.out.println("El factorial de "+numero + " es --> "+ factorial(numero2) );
    }catch(java.util.InputMismatchException e){
      System.out.println("Ingrese un número entero válido");

    }
    

  }
}