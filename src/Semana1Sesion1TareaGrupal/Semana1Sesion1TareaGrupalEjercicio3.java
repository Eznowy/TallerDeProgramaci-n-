
// Meza Negreiros Orlando
// Tarea Grupal Ejercicio 3
/*Escribir un programa que, dado un monto total, 
lo descomponga en monto a pagar e IGV (18%)*/
package Semana1Sesion1TareaGrupal;
import java.util.Scanner;
public class Semana1Sesion1TareaGrupalEjercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Descomposición de Monto en Monto a Pagar e IGV (18%)");
        System.out.print("Ingresa el monto total: ");
        double montoTotal = scanner.nextDouble();

        // Calcular el IGV (18%)
        double igv = montoTotal * 0.18;

        // Calcular el monto a pagar (sin incluir el IGV)
        double montoAPagar = montoTotal - igv;

        System.out.println("Monto a Pagar: $" + montoAPagar);
        System.out.println("IGV (18%): $" + igv);
    }
} 
