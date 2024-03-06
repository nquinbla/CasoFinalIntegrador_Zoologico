import Animales.Animal; // Importamos la clase Animal
import Hábitats.Hábitat; // Importamos la clase Hábitat

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
            System.out.println("2. Cuidado de los Animales");
            System.out.println("3. Visitantes");
            System.out.println("4. Recursos");
            System.out.println("5. Mantenimiento y Seguridad");
            System.out.println("6. Salir");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Dependiendo de la opción seleccionada por el usuario, se ejecutará un bloque de código
            if (choice ==1) { // Hábitats
                System.out.println("------------------ HÁBITATS ------------------");
                System.out.println("1. Crear un hábitat");
                System.out.println("2. Ver hábitats");
                System.out.println("3. Volver al menú principal");

                int choiceHabitats = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (choiceHabitats ==1) {
                    if (choice ==1) { // Tipos de hábitats
                        System.out.println("------------------ Tipos ------------------");
                        System.out.println("1. Crear un hábitat acuático");
                        System.out.println("2. Crear un hábitat terrestre");
                        System.out.println("3. Crear un hábitat aéreo");
                        System.out.println("4. Volver al menú principal");

                        if (choice == 1) { // Crear un hábitat acuático
                            System.out.println("Ingrese la temperatura del hábitat:");
                            float temperatura = scanner.nextFloat();
                            System.out.println("Ingrese la humedad del hábitat:");
                            float humedad = scanner.nextFloat();
                            System.out.println("Ingrese el tamaño del hábitat:");
                            String tamaño = scanner.nextLine();
                            System.out.println("¿El hábitat está limpio? (true/false):");
                            boolean limpieza = scanner.nextBoolean();

                            System.out.println("Ingrese el tipo de agua:");
                            String tipodeagua = scanner.nextLine();
                            System.out.println("Ingrese el tipo de coral:");
                            String tipodecoral = scanner.nextLine();
                            System.out.println("Ingrese el tipo de plantas:");
                            String tipodeplantas = scanner.nextLine();

                            Hábitat hábitat = new Hábitat(temperatura, humedad, limpieza, tamaño);
                            System.out.println("Hábitat creado: " + hábitat.toString());

                        }
                        if (choice == 2) { // Crear un hábitat terrestre
                            System.out.println("Ingrese la temperatura del hábitat:");
                            float temperatura = scanner.nextFloat();
                            System.out.println("Ingrese la humedad del hábitat:");
                            float humedad = scanner.nextFloat();
                            System.out.println("Ingrese el tamaño del hábitat:");
                            String tamaño = scanner.nextLine();
                            System.out.println("¿El hábitat está limpio? (true/false):");
                            boolean limpieza = scanner.nextBoolean();

                            System.out.println("Ingrese el tipo de alimentación:");
                            String tipodealimentacion = scanner.nextLine();
                            System.out.println("Ingrese el tipo de clima:");
                            String tipodeclima = scanner.nextLine();
                            System.out.println("Ingrese el tipo de vegetación:");
                            String tipodevegetacion = scanner.nextLine();

                            Hábitat hábitat = new Hábitat(temperatura, humedad, limpieza, tamaño);
                            System.out.println("Hábitat creado: " + hábitat.toString());

                        }
                        if (choice == 3) { // Crear un hábitat aéreo
                            System.out.println("Ingrese la temperatura del hábitat:");
                            float temperatura = scanner.nextFloat();
                            System.out.println("Ingrese la humedad del hábitat:");
                            float humedad = scanner.nextFloat();
                            System.out.println("Ingrese el tamaño del hábitat:");
                            String tamaño = scanner.nextLine();
                            System.out.println("¿El hábitat está limpio? (true/false):");
                            boolean limpieza = scanner.nextBoolean();

                            System.out.println("Ingrese el tipo de alimentación:");
                            String tipodealimentacion = scanner.nextLine();
                            System.out.println("Ingrese el tipo de clima:");
                            String tipodeclima = scanner.nextLine();
                            System.out.println("Ingrese el tipo de vegetación:");
                            String tipodevegetacion = scanner.nextLine();

                            Hábitat hábitat = new Hábitat(temperatura, humedad, limpieza, tamaño);
                            System.out.println("Hábitat creado: " + hábitat.toString());

                        }
                        if (choice == 4) { // Volver al menú principal
                            continue;
                        }
                    }
                    // Si el usuario selecciona la opción 2, se mostrarán los hábitats
                } else if (choiceHabitats ==2) {
                    System.out.println("Hábitats registrados:");
                    for (Hábitat hábitat : hábitat) {
                        System.out.println(hábitat.toString());
                    }
                    // Si el usuario selecciona la opción 3, volverá al menú principal
                } else if (choiceHabitats ==3) {
                    continue;
                }
                // Si el usuario selecciona la opción 2, se mostrarán los hábitats
            } if (choice == 2) { //  Cuidado de los animales
                System.out.println("------------------ CUIDADO DE LOS ANIMALES ------------------");
                System.out.println("1. Registrar un animal");
                System.out.println("2. Ver animales");
                System.out.println("3. Volver al menú principal");

                int choiceAnimales = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (choice ==1) { // Tipos de animales
                    System.out.println("------------------ Tipos ------------------");
                    System.out.println("1. Crear un animal acuático");
                    System.out.println("2. Crear un animal terrestre");
                    System.out.println("3. Crear un animal aéreo");
                    System.out.println("4. Volver al menú principal");

                    if (choice == 1) { // Crear un animal acuatico
                        System.out.println("Ingrese el nombre del animal:");
                        String nombre = scanner.nextLine();
                        System.out.println("Ingrese la edad del animal:");
                        String edad = scanner.nextLine();
                        System.out.println("Ingrese el sexo del animal:");
                        String sexo = scanner.nextLine();
                        System.out.println("Ingrese la especie del animal:");
                        String especie = scanner.nextLine();
                        System.out.println("Ingrese el peso del animal:");
                        String peso = scanner.nextLine();
                        System.out.println("Ingrese la estatura del animal:");
                        String estatura = scanner.nextLine();
                        System.out.println("Ingrese el color del animal:");
                        String color = scanner.nextLine();
                        System.out.println("¿El animal está esterilizado? (true/false):");
                        boolean esterilizado = scanner.nextBoolean();
                        System.out.println("¿El animal está vacunado? (true/false):");
                        boolean vacunado = scanner.nextBoolean();

                        System.out.println("Tipo de nado:");
                        String tipodenado = scanner.nextLine();
                        System.out.println("Tipo de aletas:");
                        String tipodealetas = scanner.nextLine();
                        System.out.println("Tipo de branquias:");
                        String tipodebranquias = scanner.nextLine();

                        Animal animal = new Animal(nombre, edad, sexo, especie, peso, estatura, color, esterilizado, vacunado);
                        System.out.println("Animal creado: " + animal.toString());
                        animales.add(animal);

                    } if (choice ==2) { // Crear un animal terrestre
                        System.out.println("Ingrese el nombre del animal:");
                        String nombre = scanner.nextLine();
                        System.out.println("Ingrese la edad del animal:");
                        String edad = scanner.nextLine();
                        System.out.println("Ingrese el sexo del animal:");
                        String sexo = scanner.nextLine();
                        System.out.println("Ingrese la especie del animal:");
                        String especie = scanner.nextLine();
                        System.out.println("Ingrese el peso del animal:");
                        String peso = scanner.nextLine();
                        System.out.println("Ingrese la estatura del animal:");
                        String estatura = scanner.nextLine();
                        System.out.println("Ingrese el color del animal:");
                        String color = scanner.nextLine();
                        System.out.println("¿El animal está esterilizado? (true/false):");
                        boolean esterilizado = scanner.nextBoolean();
                        System.out.println("¿El animal está vacunado? (true/false):");
                        boolean vacunado = scanner.nextBoolean();

                        System.out.println("Tipo de pelaje:");
                        String tipodepelaje = scanner.nextLine();
                        System.out.println("Tipo de patas:");
                        String tipodepatas = scanner.nextLine();

                        Animal animal = new Animal(nombre, edad, sexo, especie, peso, estatura, color, esterilizado, vacunado);
                        System.out.println("Animal creado: " + animal.toString());
                        animales.add(animal);

                    } if (choice ==3) { // Crear un animal aéreo
                        System.out.println("Ingrese el nombre del animal:");
                        String nombre = scanner.nextLine();
                        System.out.println("Ingrese la edad del animal:");
                        String edad = scanner.nextLine();
                        System.out.println("Ingrese el sexo del animal:");
                        String sexo = scanner.nextLine();
                        System.out.println("Ingrese la especie del animal:");
                        String especie = scanner.nextLine();
                        System.out.println("Ingrese el peso del animal:");
                        String peso = scanner.nextLine();
                        System.out.println("Ingrese la estatura del animal:");
                        String estatura = scanner.nextLine();
                        System.out.println("Ingrese el color del animal:");
                        String color = scanner.nextLine();
                        System.out.println("¿El animal está esterilizado? (true/false):");
                        boolean esterilizado = scanner.nextBoolean();
                        System.out.println("¿El animal está vacunado? (true/false):");
                        boolean vacunado = scanner.nextBoolean();

                        System.out.println("Tipo de vuelo:");
                        String tipodevuelo = scanner.nextLine();
                        System.out.println("Tipo de plumaje:");
                        String tipodeplumaje = scanner.nextLine();
                        System.out.println("Tipo de pico:");
                        String tipodepico = scanner.nextLine();

                        Animal animal = new Animal(nombre, edad, sexo, especie, peso, estatura, color, esterilizado, vacunado);
                        System.out.println("Animal creado: " + animal.toString());
                        animales.add(animal);
                    } if (choice ==4) {
                        continue;
                    }

                }


        } else if (choice == 6) { // Salir
            break;
        }
    }
}