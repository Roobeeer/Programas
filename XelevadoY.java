public class XelevadoY {
    public static void main(String[]args){
            System.out.println(Elevar(3, 2));

            System.out.println(Elevar(-3, 2));
            System.out.println(Elevar(3, -2));
            System.out.println(Elevar(3, 0));


    }

    public static float Elevar(float x, float y){
        float resultado = 1;
        for (int i= 1; i<=Math.abs(y);i++){
            resultado = resultado*x;    
        }

        if(y<0){
            resultado = 1/resultado;
        }
        return resultado;
 


    }
    
}
