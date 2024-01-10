//import javax.swing.*;
public class Arrays {
        public static void main(String[]args){
            //Matriz de numeros aleatorios
            int[] matriz_aleatorios = new int[150];
            for (int i = 0;i<matriz_aleatorios.length;i++){
                matriz_aleatorios[i] = (int)Math.round(Math.random()*100);

            }
            for(int numeros:matriz_aleatorios){
                System.out.print(numeros+ ", ");
            }

            /*int array[]={5, 38, -15, 92, 71, 34, 21, 51, 52, 654, 61, 646, 76, 98};
            

            for(int i = 0;i<array.length;i++){
                System.out.println("Valor del índice "+i + " es = "+array[i]);


            }*/

           // String paises[] = new String [8];

            
            /*Programa para introducir los datos de la matriz con un JOptionPane
            for(int i = 0;i<8;i++){
                paises[i]=JOptionPane.showInputDialog("Introduce el pais "+(i+1));
                        }

             for(String elemento:paises){
                System.out.println("Pais : " +elemento);
            }
            */


           /*paises[0]="España";
            paises[1]="Mexico";
            paises[2]="Colombia";
            paises[3]="Peru";
            paises[4]="Chile";
            paises[5]="Argentina";
            paises[6]="Ecuador";
            paises[7]="Venezuela";*/

            //String []paises = {"España,Mexico,Colombia,Peru,Chile,Argentina,Ecuador,Venezuela"};
           

        
           /*  for(int i = 0; i<paises.length;i++){
                System.out.println("Pais numero "+(i+1) +" es "+paises[i]);
                */

            //Otra manera de for
            
            }

        }

