import java.util.Scanner;

class EncontrarLetraHACER{
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce una cadena y un carácter");
        System.out.print("CADENA : ");
        String cadena = tec.nextLine();
        System.out.print("CARÁCTER : ");
        char caracterbusca = tec.next().charAt(0);

        boolean encontrado = false;

        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)==caracterbusca){
                encontrado = true;
                break;
            }
        }

            if(encontrado){
                System.out.println("La letra "+caracterbusca + " si que se encuentra en la cadena "+ cadena);
            }else{
                System.out.println("La letra "+caracterbusca + " no que se encuentra en la cadena "+ cadena);
            }
            tec.close();

        }
    
}