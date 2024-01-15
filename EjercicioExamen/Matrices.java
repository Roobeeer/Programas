package EjercicioExamen;

public class Matrices {
    public static double sumafilas(double[][]matriz){
        int n = matriz.length;
        double suma = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    suma +=matriz[i][j];
                }
            }
        }
        return suma;
    }

    public static int cuantasveces(int[][] vector, int x){
        int contador = 0;

        for(int[]fila:vector){
            for(int elemento:fila){
                if(elemento==x){
                    contador++;
                }
            }
          }
          return (contador>0)?contador:-1;
    }   


    public static int[][] sumaFilasRestaFilasImpares(int[][]M,int[][] Q){
        int m = M.length;
        int q = M[0].length; 

        int[][] resultado = new int[m][q];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<q;j++){
                if(i%2==0){
                    resultado[i][j] = M[i][j] + Q[i][j];

                }else{
                    resultado[i][j] = M[i][j]-Q[i][j];
                }
            }

        }
        return resultado;
    }

    public static void main(String[]args){
        double[][] matrizEjemplo = {
            {1.0,2.0,3.0},
            {4.0,5.0,6.0},
            {7.0,8.0,9.0}
        };

        int[][] estructuraEjemplo={
            {1,2,3},
            {4,2,6},
            {7,8,2}
        };

        int[][] M = {
            {1,2},
            {3,4},
            {5,6}
        };

        int[][] Q = {
            {7,8},
            {9,10},
            {11,12}
        };



        double sumafilas = sumafilas(matrizEjemplo);

        double cuantasveces  = cuantasveces(estructuraEjemplo,2);
        int[][] ResultadoSumaResta = sumaFilasRestaFilasImpares(M, Q);
        System.out.print("Resultado de la suma de filas pares e impares : ");
        for(int[]fila:ResultadoSumaResta){
            for(int elemento:fila){
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
    
}
