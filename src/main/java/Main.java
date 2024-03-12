import Animales.Animal;
import Animales.Animal_Acuático;
import Animales.Animal_Terrestre;
import Animales.Animal_Aviario;
import Hábitats.Hábitat;
import MantenimientoSeguridad.*;
import Recursos.*;
import InteracciónVisitante.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al zoológico de Arapiles, por favor, seleccione como quiere entrar:");
        System.out.println("1. Visitante");
        System.out.println("2. Trabajador");
        System.out.println("3. Salir");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) { // Visitante
            System.out.println("Bienvenido al zoológico virtual de Arapiles, visitante, por favor, seleccione una opción:");
            System.out.println("1. Registrar un animal");
            System.out.println("2. Ver un animal");
            System.out.println("3. Quiosco");
            System.out.println("4. Tours virtuales");
            System.out.println("5. Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Por favor, ingrese la información del nuevo animal:");
                    System.out.println("Ingrese el tipo de animal (1. Acuático, 2. Terrestre, 3. Aviario):");
                    int tipoAnimal = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese el nombre del animal:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese la edad del animal:");
                    String edad = scanner.nextLine();
                    System.out.println("Ingrese el sexo del animal:");
                    String sexo = scanner.nextLine();
                    System.out.println("Ingrese el peso del animal:");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ingrese la estatura del animal:");
                    double estatura = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ingrese el color del animal:");
                    String color = scanner.nextLine();
                    System.out.println("¿El animal está esterilizado? (true/false):");
                    boolean esterilizado = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.println("¿El animal está vacunado? (true/false):");
                    boolean vacunado = scanner.nextBoolean();
                    scanner.nextLine();


                    if (tipoAnimal == 1) {
                        System.out.println("Ingrese el tipo de agua del animal (1. Salada, 2. Dulce):");
                        int tipoAgua = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Ingrese el tipo de aleta del animal (1. Pectoral, 2. Dorsal, 3. Caudal):");
                        int tipoAleta = scanner.nextInt();
                        scanner.nextLine();

                        Animal_Acuático animal = new Animal_Acuático(nombre, edad, sexo, tipoAnimal, peso, estatura, color, esterilizado, vacunado, tipoAgua, tipoAleta);
                        animales.add(animal);

                    } else if (tipoAnimal == 2) {
                        System.out.println("Ingrese el tipo de alimentación del animal (1. Carnívoro, 2. Herbívoro, 3. Omnívoro):");
                        int tipoAlimentacion = scanner.nextInt();
                        scanner.nextLine();





        } if (choice == 2) { // Trabajador
            System.out.println("Bienvenido al zoológico virtual de Arapiles, trabajador, por favor, seleccione una opción:");
            System.out.println("1. Administración de recursos");
            System.out.println("2. Cuidado de los animales");
            System.out.println("3. Gestión de hábitats");
            System.out.println("4. Mantenimiento y seguridad");
            System.out.println("5. Salir");
        }

    }
}
