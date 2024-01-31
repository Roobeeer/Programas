package TrabajoCalculadora;
class EvaluarTerminos{
    static double resultado;  // Declarar la variable resultado

    static double evaluarExpresion(String expresion) {
    if (expresion.startsWith("-")) {
        expresion = "0" + expresion;
    }
    return evaluarTermino(expresion);
}

static double evaluarTermino(String termino) {
    int index = 1;

    while (index < termino.length()) {
        int siguienteOperador = termino.indexOf("+", index);
        if (siguienteOperador == -1) {
            siguienteOperador = termino.indexOf("-", index);
        }

        if (siguienteOperador == -1) {
            siguienteOperador = termino.length();
        }

        String factor = termino.substring(index, siguienteOperador);
        double valor = evaluarFactor(factor);

        if (index == 1) {
            resultado += valor;
        } else {
            char operador = termino.charAt(index - 1);
            if (operador == '+') {
                resultado += valor;
            } else if (operador == '-') {
                resultado -= valor;
            }
        }

        index = siguienteOperador + 1;
    }

    return resultado;
}

static double evaluarFactor(String factor) {
    int index = 1;

    while (index < factor.length()) {
        int siguienteOperador = factor.indexOf("*", index);
        if (siguienteOperador == -1) {
            siguienteOperador = factor.indexOf("/", index);
        }

        if (siguienteOperador == -1) {
            siguienteOperador = factor.length();
        }

        String elemento = factor.substring(index, siguienteOperador);
        double valor = Double.parseDouble(elemento);

        if (index == 1) {
            resultado = valor;
        } else {
            char operador = factor.charAt(index - 1);
            if (operador == '*') {
                resultado *= valor;
            } else if (operador == '/') {
                resultado /= valor;
            }
        }

        index = siguienteOperador + 1;
    }

    return resultado;
}
}