package es.dam.sge.calc;

public class Operaciones {

    // Bloque 1
    public static double sumar(double a, double b) {
        return a + b;
    }

public double dividir(double a, double b) {
    if (b == 0) { 
        System.out.println("No se puede dividir por cero.");
        return 0; 
    } else {
        return a / b;
    }
}
