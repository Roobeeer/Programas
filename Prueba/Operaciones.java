package Prueba;
import java.util.*;
class Operaciones{
    public static void main(String[]args){
    Scanner tec = new Scanner(System.in);
    float a = (float)MisMetodos.readDouble("Escribe un número real ");
    float b = (float)MisMetodos.readDouble("Escribe otro número real ");

    float m = MisMates.maximo(a,b);
    MisMetodos.show("El máximo es ",m);

        double parteReal = MisMetodos.readDouble("Escribe la parte real de un número imaginario ");
        double parteImag = MisMetodos.readDouble("Escribe la parte imaginaria de un número imaginario ");
        double modulo = MisMates.modulo(parteReal,parteImag);
        double angulo = MisMates.angulo(parteReal,parteImag);

        MisMetodos.show("El valor del módulo es ", modulo);
        MisMetodos.show("El valor del ángulo es ", angulo);
        tec.close();
    }
}
