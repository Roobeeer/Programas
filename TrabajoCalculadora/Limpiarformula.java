package TrabajoCalculadora;
class Limpiarformula{
    static String formulabuena(String cadena) {
            cadena = cadena.replaceAll(" ", "");
            cadena = cadena.replace("(", "").replace(")", "");
            cadena = cadena.replace("++", "+").replace("--", "+").replace("+-", "-").replace("-+", "-");
            // Eliminar signos duplicados
            cadena = cadena.replaceAll("(\\+{2,})", "+");
            cadena = cadena.replaceAll("-{2,}", "-");
            cadena = cadena.replace("/+", "/");
            cadena = cadena.replace("*+", "*");
            if (cadena.startsWith("+")) {
                cadena = cadena.substring(1);
            }
            return cadena;
}
}