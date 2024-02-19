package SegundoCuatri.POOCurso.Coche;

public class Coche {
   private int ruedas;

    private int largo;

    private int ancho;

    private int motor;//Cm3

    private int peso;

    //Metodo constructor
    public Coche(){
        ruedas = 4;

        largo = 2000;

        ancho = 300;

        motor = 1600;

        peso = 500;
        
    }
    /* Se puede establecer el metodo main en el propio fichero
   public static void main(String[] args) {
        Coche renault = new Coche(); //Instanciar una clase. Ejemplar de clase
        System.out.println("Este coche tiene "+ renault.ruedas + " ruedas");
    }*/
    
}
/*Se pueden crear varias clases
class Camion{

}
class Moto{

}
*/