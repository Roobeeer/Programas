package Calculadora;

public class Limpiarformula {
    static String formulabuena(String cadena){
        cadena = cadena.replaceAll(" ","");
        cadena = cadena.replace("(","").replace(")","");
        cadena = cadena.replace("++","+").replace("--","+").replace("+-","-").replace("-+","-");
        return cadena;
    }
    
}