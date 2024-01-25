package Calculadora;

public class Limpiarformula {
    public static String limpiarformula(String s){
        s = s.replaceAll(" ","");
        s = s.replace("(","").replace(")","");
        s = s.replace("--","+").replace("-+","-").replace("+-","-").replace("++","+");
        return s;
}
}
