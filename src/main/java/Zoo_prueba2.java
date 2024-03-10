import Animales.Animal;
import Hábitats.Hábitat;
import MantenimientoSeguridad.*;
import Recursos.*;
import InteracciónVisitante.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo_prueba2 {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        List<Hábitat> hábitats = new ArrayList<>();
        List<Recursos> recursos = new ArrayList<>();
        List<Cámara> camaras = new ArrayList<>();
        List<Sensor> sensores = new ArrayList<>();
        Seguridad seguridad = new Seguridad(camaras, sensores);
        Quiosco quiosco = new Quiosco(animales, hábitats);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al zoológico de Arapiles, por favor, seleccione como quiere entrar:");
            System.out.println("1. Visitante");
            System.out.println("2. Trabajador");
            System.out.println("3. Salir");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) { // Visitante
                System.out.println("Bienvenido al zoológico virtual de Arapiles, visitante, por favor, seleccione una opción:");
                System.out.println("1. Ver un animal");
                System.out.println("2. Registrar un nuevo animal");
                System.out.println("3. Ver cuidados y hábitats de los animales");
                System.out.println("4. Entrar al quiosco");
                System.out.println("5. Volver al menú principal");

                int choiceVisitante = scanner.nextInt();
                scanner.nextLine();

                if (choiceVisitante == 1) {
                    System.out.println("Por favor, ingrese el nombre del animal que desea ver:");
                    String nombreAnimal = scanner.nextLine();
                    AnimalInfo infoAnimal = quiosco.obtenerInfoAnimal(nombreAnimal);
                    if (infoAnimal != null) {
                        System.out.println("Información del animal: " + infoAnimal.getNombreAnimal());
                        // Aquí se mostraría más información del animal
                    } else {
                        System.out.println("Lo siento, no se encontró el animal.");
                    }
                } else if (choiceVisitante == 2) {
                    System.out.println("Por favor, ingrese la información del nuevo animal:");
                    // Aquí se implementarían las opciones para registrar un nuevo animal
                    // Necesitarás recoger la información del animal y usarla para crear un nuevo objeto Animal
                    // Luego, puedes agregar el nuevo animal a la lista de animales
                } else if (choiceVisitante == 3) {
                    System.out.println("Por favor, ingrese el nombre del hábitat que desea ver:");
                    String nombreHabitat = scanner.nextLine();
                    HabitatInfo infoHabitat = quiosco.obtenerInfoHabitat(nombreHabitat);
                    if (infoHabitat != null) {
                        System.out.println("Información del hábitat: " + infoHabitat.getNombreHabitat());
                        // Aquí se mostraría más información del hábitat
                    } else {
                        System.out.println("Lo siento, no se encontró el hábitat.");
                    }
                } else if (choiceVisitante == 4) {
                    System.out.println("Bienvenido al quiosco, por favor, seleccione una opción:");
                    // Aquí se implementarían las opciones para entrar al quiosco
                    // Podrías tener opciones para ver rutas basadas en las preferencias del visitante
                } else if (choiceVisitante == 5) {
                    continue;
                }
            } else if (choice == 2) { // Trabajador
                System.out.println("Bienvenido al zoológico de Arapiles, trabajador, por favor, seleccione una opción:");
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