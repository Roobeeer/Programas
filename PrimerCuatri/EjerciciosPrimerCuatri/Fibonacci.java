class Main {

  // Fibonacci recursive version
  public static long fibR(long f) {
    if (f< 2){ 
      return 1;
    }else{
      return fibR(f-1) + fibR(f-2);
    }
  }
  
  // Fibonacci versión iteractiva
   public static long fibI(long f) {
    // Escribe tu versión iteractiva aqui
     if (f <2){
      return 1;
      }
      long numa= 1;
      long numb= 1;
      long resultado= 0;
      for (int i=2;i<= f;i++){
        resultado= numa + numb;
          numa = numb;
          numb = resultado;
         }
     return resultado;
      }
  public static double fibRd(long f) {
    if (f <2){ 
      return 1;
    }else{
      return fibR(f-1) + fibR(f-2);
    }
  }

  // Fibonacci versión iteractiva
   public static double fibId(long f) {
    // Escribe tu versión iteractiva aqui
     if (f < 2) return 1;
     double numa = 1;
     double numb = 1;
     double resultado = 0;
       for (int i =2;i<=f;i++) {
           resultado= numa + numb;
           numa= numb;
           numb =resultado;
        }
     return resultado;
   }



  public static void main(String[] args) {
    System.out.println("Fibonacci of 10 is " + fibR(10));
    System.out.println("Fibonacci of 10 is " + fibI(10));
    System.out.println("Fibonacci of 50 is " + fibI(50));
    System.out.println("Fibonacci of 50 is " + fibR(50));
   // System.out.println("Fibonacci of 10000 is " + fibI(10000));
    //System.out.println("Fibonacci of 10000 is " + fibR(10000));
    System.out.println("Fibonacci of 10 is " + fibRd(10));
    System.out.println("Fibonacci of 10 is " + fibId(10));
    System.out.println("Fibonacci of 50 is " + fibId(50));
    System.out.println("Fibonacci of 50 is " + fibRd(50));
    System.out.println("Fibonacci of 10000 is " + fibId(10000));
    System.out.println("Fibonacci of 10000 is " + fibRd(10000));
  }
}

// 1. ¿Cuál es el resultado de fibR(10)? ¿Cuánto tarda aproximadamente? 
//Responde aquí: El resultado es 89 y no tarda practicamente nada pues el metodo fibR esta hecho para números pequeños, si son mas grandes tendra que llamar mas veces el metodo recursivamente y tardará mucho más
// 
// 2. ¿Cuál es el resultado de fibR(50)? ¿Cuánto tarda aproximadamente? 
// Responde aquí: El resultado es 20365011074 y tarda mucho más por lo dicho anteriormente, que el numero es muy grande y se tiene que llamar mas veces el método a si mísmo y parece incluso que el programa se quede colgado
//
// 3. ¿Qué sucede cundo calcula fibR(10000)? (Mira el primer mensaje en tu consola en repl.it)
// ¿Cuál piensas es el problema?
// Responde aquí : No me da resultado pues al ser un numero tan grande puede que el programa se quede colgado porque puede haber un "desbordamiento" que impida el funcionamiento del método recursivo
//
//
//
// 4. Escribe la versión iterativa de Fibonacci (fibI) -> en el texto del problema tienes alguna ayuda ...
// 5. Prueba fibI(50).... ¿alguna diferencia? (el resultado tiene que ser el mismo)
//La diferencia es que se ejecuta mas rapido pues no tiene que llamar varias veces al metodo de manera recursiva y almacena menos memoria

// 6. Está ejecutándose fibI(10000)? ¿Por qué? ¿Cuál es el problema ahora?
//Se ejecuta pero tarda bastante por ser un numero muy grande y da un número negativo debido al desbordamiento que ocurre al ser una variable de tipo long
// 7. (Para estudiantes avanzados) Si has detectado la solución a la cuestión 6, ¿por qué no pruebas a usar un tipo de datos
// double en vez de long para cada dato? ¿Qué sucede entonces? Si tenemos el mismo problema ... entonces ¿nos derrotamos?
//Dan los resultados pero de nuevo, la sucesion de Fibonacci para 10000 tarda bastante por ser un numero tan grande y da infinito porque el metodo double tiene unos limites de representación