package TrabajoCalculadora;
class Limpiarformula{
        //Método que limpia la cadena de entrada eliminando espacios y signos innecesarios
        //También maneja la entrada "salir" para salir del programa
    static String formulabuena(String cadena) {
            do {
                    cadena = cadena.replaceAll(" ", "");//Elimia espacios en blanco
                    cadena = cadena.replace("(", "").replace(")", "");//Elimina paréntesis
                    cadena = cadena.replace("++", "+").replace("--", "+").replace("+-", "-").replace("-+", "-");
                    // Eliminar signos duplicados
                    cadena = cadena.replaceAll("(\\+{2,})", "+");
                    cadena = cadena.replaceAll("-{2,}", "-");
                    cadena = cadena.replace("/+", "/");
                    cadena = cadena.replace("*+", "*");
                    if (cadena.startsWith("+")) {
                            cadena = cadena.substring(1);//Elimina el signo "+"al inicio de la cadena, si existe
                    }
                    return cadena;
            }while(!cadena.equalsIgnoreCase("salir"));//verifica la salida del programa al introducir "salir"
}
}