import java.util.Scanner;

public class XelevadoY{
  public static void main(String[]args){
    Scanner tec = new Scanner(System.in);
    System.out.print("Introduce el valor de x --> ");
    float x = tec.nextFloat();
    System.out.print("Introduce el valor de y --> ");
    float y = tec.nextFloat();
    tec.close();

    System.out.println("El resultado de " + x + " elevado a "+y+" es --> "+potencia(x,y));
  }
  //METODO PARA REALIZAR LA POTENCIA
    public static float potencia(float x, float y){
      float resultado = 1;
      for(int i = 0; i<Math.abs(y);i++){
        resultado = resultado*x;
      }

      if(y<0){
        resultado = 1/resultado;
      }
      return resultado;
    }
}