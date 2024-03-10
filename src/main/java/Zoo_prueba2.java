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
                    // Aquí se implementarían las opciones para ver un animal
                } else if (choiceVisitante == 2) {
                    // Aquí se implementarían las opciones para registrar un nuevo animal
                } else if (choiceVisitante == 3) {
                    // Aquí se implementarían las opciones para ver los cuidados y hábitats de los animales
                } else if (choiceVisitante == 4) {
                    // Aquí se implementarían las opciones para entrar al quiosco
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