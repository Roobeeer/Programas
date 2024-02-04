package EXAMENPRIMERPARCIAL;

import java.util.Scanner;


public class ProblemasTemasAnteriores {
    public static void main(String[]args){
    Scanner tec = new Scanner(System.in);
    System.out.print("Dime un número de segundos inferior a un millón --> ");
    int tiempo = tec.nextInt();
    int dias, horas, minutos, segundos;
    dias = tiempo/86400;
    tiempo = tiempo-(dias*86400);
    horas = tiempo/3600;
    tiempo = tiempo-(horas*3600);
    minutos = tiempo/60;
    tiempo = tiempo-(minutos*60);
    segundos = tiempo;
        System.out.println("En "+tiempo+" segundos hay "+dias+" días, "+horas+" horas, "+minutos+" minutos y quedan "+segundos+" segundos");

    }
}
