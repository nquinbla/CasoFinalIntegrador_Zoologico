import Animales.Animal;
import Hábitats.Hábitat;
import MantenimientoSeguridad.*;
import Recursos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo_prueba1 {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        List<Hábitat> hábitats = new ArrayList<>();
        List<Recursos> recursos = new ArrayList<>();
        List<Cámara> camaras = new ArrayList<>();
        List<Sensor> sensores = new ArrayList<>();
        Seguridad seguridad = new Seguridad(camaras, sensores);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al zoológico de Arapiles, por favor, elija una opción:");
            System.out.println("1. Visitante");
            System.out.println("2. Trabajador");
            System.out.println("3. Salir");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) { // Visitante
                // Aquí se implementarían las opciones para el visitante
                // como ver un animal, registrar uno nuevo, ver sus cuidados y hábitats, etc.
            } else if (choice == 2) { // Trabajador
                System.out.println("Bienvenido al zoológico de Arapiles trabajador, por favor, seleccione una opción:");
                System.out.println("1. Recursos");
                System.out.println("2. Mantenimiento y Seguridad");
                System.out.println("3. Volver al menú principal");

                int choiceTrabajador = scanner.nextInt();
                scanner.nextLine();

                if (choiceTrabajador == 1) {
                    // Aquí se implementarían las opciones para gestionar los recursos
                } else if (choiceTrabajador == 2) {
                    // Aquí se implementarían las opciones para gestionar el mantenimiento y la seguridad
                } else if (choiceTrabajador == 3) {
                    continue;
                }
            } else if (choice == 3) { // Salir
                break;
            }
        }
    }
}