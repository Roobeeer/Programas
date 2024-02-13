package SegundoCuatri;


public class Rectangulo {
    //Atributos  = base y altura
    public double base,altura;

    //Metodos = constructor, double area, double perimetro
    public Rectangulo(double base, double altura){ //constructor
        this.base  = base; // This hace referencia al propio objeto, al atributo de base y se declara el constructor
        this.altura = altura;

    }
    public double area(){
        return base*altura;
    }
    public double perimetro(){
        return 2*base + 2*altura;
    }

    
    
}
public class Main{
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(2,3);
        System.out.println("Área = "+r1.area());
        System.out.println("Perímetro = "+r1.perimetro());
    }
}
