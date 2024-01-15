package Prueba;
import java.util.Scanner;

public class MisMetodos{
    static Scanner tec = new Scanner(System.in);
public static int readInt(String ask){
    
    //Programe aquí el código del método
    ask = ask.trim();
    if(ask.charAt(ask.length()-1)!=':'){
      ask = ask+": ";
    }else{
      ask = ask+" ";
    }
    System.out.print(ask);
    int x = tec.nextInt();
    tec.nextLine();
    return x;
    
  } //Fin método readInt
  
   public static double readDouble(String ask){
     ask = ask.trim();
     if(ask.charAt(ask.length()-1)!=':'){
       ask = ask+": ";
     }else{
       ask = ask+" ";
     }
     System.out.print(ask);
     double x = tec.nextDouble();
     tec.nextLine();
     return x;
    
    //Programe aquí el código del método
  }
  
  public static String readString(String ask){
    //Programe aquí el código del método
    ask = ask.trim();
    if(ask.charAt(ask.length()-1)!=':'){
      ask = ask+": ";
    }else{
      ask = ask+" ";
    }
    System.out.print(ask);
    String x = tec.nextLine();
    return x;
  }
  
  
  //Programe a partir de aquí los métodos show aplicando sobrecarga

  public static void show(String ask, int x){
    ask = ask.trim();
    if(ask.charAt(ask.length()-1)!=':'){
      ask = ask+": ";
    }else{
      ask = ask+" ";
    }
    System.out.println(ask+x);
 
  }
  public static void show(String ask, double x){
    ask = ask.trim();
    if(ask.charAt(ask.length()-1)!=':'){
      ask = ask+": ";
    }else{
      ask = ask+" ";
    }
    System.out.println(ask+x);
  }

    
  public static void show(String ask, String x){
      ask = ask.trim();
      if(ask.charAt(ask.length()-1)!=':'){
        ask = ask+": ";
      }else{
        ask = ask+" ";
      }
      System.out.println(ask+x);
  }
  
}