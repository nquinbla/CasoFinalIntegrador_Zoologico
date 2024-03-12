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
