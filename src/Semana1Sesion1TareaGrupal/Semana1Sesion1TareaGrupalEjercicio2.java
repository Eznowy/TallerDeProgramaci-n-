


// Meza Negreiros Orlando
/*
Escribir un programa que resuelva una formula matematica 
que utilice que utilice al menos 3 variables
 */

package Semana1Sesion1TareaGrupal;
import java.util.Scanner;  // Importar la clase Scanner para leer la entrada del usuario
public class Semana1Sesion1TareaGrupalEjercicio2 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crear un objeto Scanner para leer la entrada del usuario

        // Solicitar al usuario que ingrese valores para las variables
        System.out.print("Ingrese el valor de la variable 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de la variable 'b': ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de la variable 'c': ");
        double c = scanner.nextDouble();

        // Calcular el resultado de la fórmula matemática
        double resultado = calcularFormulaMatematica(a, b, c);

        // Mostrar el resultado
        System.out.println("El resultado de la fórmula matemática es: " + resultado);

        scanner.close();  // Cerrar el objeto Scanner para evitar posibles fugas de recursos
    }

    // Método para calcular la fórmula matemática
    private static double calcularFormulaMatematica(double a, double b, double c) {
        // La fórmula es a * b + c
        return a * b + c;
    }
}

