import java.util.*;
class FactorialYCombinatoria{
  public static void main(String[]args){
    Scanner tec = new Scanner(System.in);
    try{
      System.out.print("Introduce el valor de n : ");
      int n = tec.nextInt();
      System.out.print("Introduce el valor de m : ");
      int m = tec.nextInt();
      tec.close();
      System.out.println("El resultado combinatorio de "+n+ " y "+m + " es --> " +(combinatoria(n,m)));
    }catch(java.util.InputMismatchException e){
      System.out.println("Introduce un número entero válido");
    }
    }

    public static long factorialn(long nfac){
      long resultadon = 1;
      for(int i =1;i<=nfac;i++){

        resultadon = resultadon*i;
      }
      return resultadon;
    }

    public static long factorialm(long mfac){
      long resultadom = 1;
      for(int i =1;i<=mfac;i++){
        resultadom = resultadom*i;
      }
      return resultadom;
    }

    public static long combinatoria(long nfac, long mfac){
      long resultado = 1;
      long resta = nfac-mfac;
      for (int i=1;i<=resta;i++){
        resultado = resultado*(nfac-i+1);
        resultado = resultado/i;
      }
      return resultado;
    }
  }
