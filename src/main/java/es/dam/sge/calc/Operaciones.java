package es.dam.sge.calc;

public class Operaciones {

    // Bloque 1
    public static double sumar(double a, double b) {
        return a + b;
    }

    public double raizCuadrada(double numero) { 
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular raíz de número negativo");
        } 
        return Math.sqrt(numero);
    }
}
