🔹 Calculadora.java
package es.dam.sge.calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero(sc, "Elige una opción: ");

            try {
                switch (opcion) {
                    case 1 -> {
                        double a = leerDouble(sc, "a = ");
                        double b = leerDouble(sc, "b = ");
                        System.out.println("Resultado: " + Operaciones.sumar(a, b));
                    }
                    case 2 -> {
                        double a = leerDouble(sc, "a = ");
                        double b = leerDouble(sc, "b = ");
                        System.out.println("Resultado: " + Operaciones.restar(a, b));
                    }
                    case 3 -> {
                        double a = leerDouble(sc, "a = ");
                        double b = leerDouble(sc, "b = ");
                        System.out.println("Resultado: " + Operaciones.multiplicar(a, b));
                    }
                    case 4 -> {
                        double a = leerDouble(sc, "a = ");
                        double b = leerDouble(sc, "b = ");
                        System.out.println("Resultado: " + Operaciones.dividir(a, b));
                    }
                    case 5 -> {
                        double base = leerDouble(sc, "base = ");
                        double exp  = leerDouble(sc, "exponente = ");
                        System.out.println("Resultado: " + Operaciones.potencia(base, exp));
                    }
                    case 6 -> {
                        double x = leerDouble(sc, "x = ");
                        System.out.println("Resultado: " + Operaciones.raizCuadrada(x));
                    }
                    case 0 -> {
                        salir = true;
                        System.out.println("¡Hasta luego!");
                    }
                    default -> System.out.println("Opción no válida.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();
        }

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("===== CALCULADORA SGE 2º DAM =====");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        System.out.println("5) Potencia");
        System.out.println("6) Raíz cuadrada");
        System.out.println("0) Salir");
    }

    private static int leerEntero(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número entero.");
                sc.nextLine(); // limpiar buffer
            }
        }
    }

    private static double leerDouble(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número (puede tener decimales).");
                sc.nextLine(); // limpiar buffer
            }
        }
    }
}
