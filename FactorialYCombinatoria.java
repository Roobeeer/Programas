import java.util.Scanner;

import javax.swing.JOptionPane;
class FactorialYCombinatoria {
      public static void main(String[] args) {
  try{
      String n =JOptionPane.showInputDialog("Introduce el numero n ");
      long n2 = Long.parseLong(n);
      System.out.println("El factorial de "+n + " es --> "+ factorialn(n2) );
      String m =JOptionPane.showInputDialog("Introduce el numero m");
      long m2 = Long.parseLong(m);
      System.out.println("El factorial de "+m + " es --> "+ factorialm(m2) );

      long resta = m2-n2;
      System.out.println("La combinatoria entre "+ n2 + " y "+m2 + " es --> "+(combinatoria(n2,m2)));


    }catch(java.util.InputMismatchException e){
      System.out.println("Ingrese un número entero válido");

    }
}
  static public long factorialn(long nfac) {
     //Escribe aquí tu código
    long resultadon = 1;
    for (int i= 1;i<=nfac;i++){
      resultadon = resultadon*i;
    }
    return resultadon;

  }
  
  static public long factorialm(long mfac) {
    // Escribe aquí tu código
    long resultadom = 1;
    for (int i= 1;i<=mfac;i++){
      resultadom = resultadom*i;
    }
    return resultadom;

  }
  static public long combinatoria(long nfac, long mfac) {
    long resultresta = nfac - mfac;
    long resultado = 1;
    for (int i = 1; i <= resultresta; i++) {
        resultado *=(nfac - i + 1);
        resultado /= i;
    }
    return resultado;
}

  }