package SegundoCuatri.Rectangulo;

public class Rectangulo {
    // Atributos = base y altura
    public double base, altura;

    // Métodos = constructor, double area, double perimetro
    public Rectangulo(double base, double altura) { // Constructor
        this.base = base; // This hace referencia al propio objeto, al atributo de base y se declara el constructor
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * base + 2 * altura;
    }
}