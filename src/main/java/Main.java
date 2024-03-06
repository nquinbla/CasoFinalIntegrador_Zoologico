import Animales.Animal // Importamos la clase Animal

import java.util.ArrayList; // Importamos la clase ArrayList
import java.util.List; // Importamos la clase List
import java.util.Scanner;


public class Main {         // Clase principal donde se ejecutará el programa
    public static void main(String[] args) {

        // Creamos un ArrayList de tipo Animal para almacenar todo ya que el zoológico preguntará al usuario que quiere hacer
        List<Animal> animales = new ArrayList<Animal>();
        Scanner scanner = new Scanner(System.in); // Creamos un objeto de tipo Scanner para leer la entrada del usuario

        // Creamos un bucle para que el usuario pueda realizar varias acciones
        while (true) {
            System.out.println("Bienvenido al zoológico de Arapiles, por favor, seleccione una opción:");
            System.out.println("1. Hábitats");
            System.out.println("2. Animales");
            System.out.println("3. Visitantes");
            System.out.println("4. Recursos");
            System.out.println("5. Mantenimiento y Seguridad");
            System.out.println("6. Salir");

        }
    }
}