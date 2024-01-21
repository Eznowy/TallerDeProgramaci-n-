

// Meza Negreiros Orlando 
/*
 Escribir un programa que calcule el area 
 de una figura geometrica cualquiera
*/

package Semana1Sesion1TareaGrupal;
import java.util.Scanner;  // Importar la clase Scanner para leer la entrada del usuario

public class Semana1Sesion1TareaGrupalEjercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crear un objeto Scanner para leer la entrada del usuario

        // Solicitar al usuario que ingrese valores para las variables
        System.out.print("Ingrese el valor de la base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el valor de la altura: ");
        double altura = scanner.nextDouble();

        // Calcular el área de la figura geométrica
        double area = calcularArea(base, altura);

        // Mostrar el resultado
        System.out.println("El área de la figura geométrica es: " + area);

        scanner.close();  // Cerrar el objeto Scanner para evitar posibles fugas de recursos
    }

    // Método para calcular el área de la figura geométrica (por ejemplo, un rectángulo)
    private static double calcularArea(double base, double altura) {
        // El área de un rectángulo es base * altura
        return base * altura;
    }
} 

