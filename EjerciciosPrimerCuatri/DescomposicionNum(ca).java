import java.util.Scanner;

class DescomposicionNum{
    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce un número entre el 1 y el 9999 : ");
        int num = tec.nextInt();
        tec.close();
        int millares, centenas, decenas, unidades;
        if(num>=0 && num<=9999){
            millares =num/1000;
            num%=1000;
            centenas = num/100;
            num%=100;
            decenas = num/10;
            unidades= num;
        }else{
            millares=centenas=decenas=unidades=0;
        }


        if(millares!=0){
            System.out.println(millares+ " millares");
        }
        if(centenas!=0){
            System.out.println(centenas+ " centenas");
        }
        if(decenas!=0){
            System.out.println(decenas+ " decenas");
        }
        if(unidades!=0){
            System.out.println(unidades + " unidades");
        }

        

    }
}


