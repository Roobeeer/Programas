package EXAMENPRIMERPARCIAL;

public class EjercicioExamen {
    public static void main(String[]args){
    String str1 = "La_noche_si_luna_es_oscura";
    String str2 = str1.substring(2,9);

    boolean test1 = true;
    boolean test2 = (false || test1);
    boolean test3 = true;

    if(test1 || test2){
        System.out.println("La");
    }else{
        System.out.println("Si");
    }
    test1 = !test3;
    if(!test1 && test2 || test3){
        if(test1 && test3){
            System.out.println("Do");
        }
        else{
            System.out.println("Mi");
        }
        if(test3){
            System.out.println("Mi");
        }else{
            System.out.println("Fa");
        }
    }

    int a = 4, b = 10, c= 6,d = 2;
    if(a+b==c+d){
        if(b+c==d){
            System.out.println(1);
        if(a+c==d){
            System.out.println(2);
        }
    }else{
        System.out.println("3");
    }
    }else{
        if(a+d==c){
            System.out.println(4);
        }
    else{
        System.out.println("5");
    }
}

    int num = 2;
    switch(++num){
        case 1 : System.out.println("Pera");break;
        case 2 : System.out.println("Manzana");break;
        case 3 : System.out.println("Uva");
        case 4 : System.out.println("Albaricoque");break;
        default: System.out.println("fruta no seleccionada");
    }

int nume = 6, den= 10;
double coc;
coc = (double)nume/den;
System.out.println(coc);
coc = nume/den;
System.out.println(coc);
coc = nume/(double)den;
System.out.println(coc);
coc = num/den*10;
System.out.println(coc);

}
}