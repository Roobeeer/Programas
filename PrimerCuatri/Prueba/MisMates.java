package Prueba;
public class MisMates {
    public static float maximo(float a, float b){
        if(a>=b){
            return a;
        }else{
            return b;
        }
        }


     public static float maximo(float a, float b, float c){
        float d = maximo(a,b);
        return maximo(d,c);
    }


    public static double modulo(double r, double i){
        double modulo = Math.sqrt(Math.pow(r,2)+Math.pow(i,2));
        return modulo;
    }


    public static double angulo(double r, double i){
        double ang1C = Math.atan(Math.abs(i)/Math.abs(r));

        if(r<0 && i>=0){
            return Math.PI-ang1C;
          }else if(r<=0 && i<0){
            return ang1C-Math.PI;
          }else if(r>0 && i<=0){
            return -ang1C;
          }else{
            return ang1C;

    }
}
}