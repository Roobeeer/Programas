package EjercicioExamen;

public class SumaM2 {
    static public double []Suma(double []a, double[]b){
        double []c = new double[a.length];
        for(int i = 0;i<a.length;i++){
            c[i] = a[i]+b[i];
        }
        return c;
    }
    public static void printArray(double[]a){
        for(int i = 0;i<a.length;i++){
            System.err.println(a[i]);
        }
    }

    public static void main(String[]args){
        
    }
    }

