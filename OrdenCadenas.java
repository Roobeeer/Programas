import java.util.Scanner;

class OrdenCadenas {
  
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto : ");
        String cad1 = tec.nextLine();
        System.out.println("Introduce otra cadena de texto : ");
        String cad2 = tec.nextLine();
        tec.close();
        String frase1,frase2;
        if(cad1.compareToIgnoreCase(cad2)>=0){
        frase1=cad2;
        frase2=cad1;
    }else{
        frase1=cad1;
        frase2=cad2;
    }
    System.out.println("El orden de las cadenas es:");
    System.out.println(frase1);
    System.out.println(frase2);

   
    }
}
