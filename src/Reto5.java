import java.util.Scanner;

public class Reto5 {
  /**
 * @param args
 */
public static void main(String[] args) {
    try (Scanner scanner = new Scanner (System.in)) {
        String nombre;
        String apellido;
        String iniciales;
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        apellido = scanner.nextLine();
        iniciales = nombre.substring(0,2)+apellido;
        String nombrecompleto = nombre+apellido;
        int length = nombrecompleto.length();
        System.out.println("La cantidad de caracteres del nombre es: " + length);
        System.out.println("El Nombre en MAYUSCULA es: " + nombre.toUpperCase());
        System.out.println("El Apellido en minuscula es: " + apellido.toLowerCase());
        System.out.println("el Nombre Completo es: " + nombrecompleto );
        System.out.println("Las 2 Iniciales del nombre junto con el apellido es: " + iniciales);
    }
  }
}