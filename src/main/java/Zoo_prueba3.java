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

public class Zoo_prueba3 {
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
                        System.out.println("Información del animal: " + infoAnimal.getNombreAnimal() + ", " + infoAnimal.getSexo() + ", " + infoAnimal.getEdad() + ", " + infoAnimal.getEspecie() + ", " + infoAnimal.getPeso() + ", " + infoAnimal.getEstatura() + ", " + infoAnimal.getColor() + ", " + infoAnimal.isEsterilizado() + ", " + infoAnimal.isVacunado());
                    } else {
                        System.out.println("Lo siento, no se encontró el animal.");
                    }
                } else if (choiceVisitante == 2) {
                    System.out.println("Por favor, ingrese la información del nuevo animal:");
                    System.out.println("Ingrese el tipo de animal (1. Acuático, 2. Terrestre, 3. Aviario):");
                    int tipoAnimal = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese el nombre del animal:");
                    String setNombre = scanner.nextLine();
                    System.out.println("Ingrese la edad del animal:");
                    int setEdad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el sexo del animal:");
                    String setSexo = scanner.nextLine();
                    System.out.println("Ingrese la especie del animal:");
                    String setEspecie = scanner.nextLine();
                    System.out.println("Ingrese el peso del animal:");
                    double setPeso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ingrese la estatura del animal:");
                    double setEstatura = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ingrese el color del animal:");
                    String setColor = scanner.nextLine();
                    System.out.println("Ingrese si el animal está esterilizado (true/false):");
                    boolean setEsterilizado = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.println("Ingrese si el animal está vacunado (true/false):");
                    boolean setVacunado = scanner.nextBoolean();
                    scanner.nextLine();

                    Animal nuevoAnimal = null;

                    switch (tipoAnimal) {
                        case 1: // Animal Acuático
                            System.out.println("Ingrese si el animal nada");
                            boolean getNadar = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.println("Ingrese si el animal tiene aletas");
                            boolean getAletas = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.println("Ingrese si el animal tiene branquias");
                            boolean getBranquias = scanner.nextBoolean();
                            scanner.nextLine();
                            nuevoAnimal = new Animal_Acuático(setNombre, setSexo, setEspecie, setEdad, setPeso, setEstatura, setColor, setEsterilizado, setVacunado, getNadar, getAletas, getBranquias);
                            break;
                        case 2: // Animal Terrestre
                            System.out.println("Ingrese el pelaje del animal");
                            String getPelaje = scanner.nextLine();
                            System.out.println("Ingrese el número de patas del animal");
                            int getPatas = scanner.nextInt();
                            scanner.nextLine();
                            nuevoAnimal = new Animal_Terrestre(setNombre, setSexo, setEspecie, setEdad, setPeso, setEstatura, setColor, setEsterilizado, setVacunado, getPelaje, getPatas);
                            break;

                        case 3: // Animal Aviario
                            System.out.println("Ingrese si el animal vuela");
                            boolean getVolar = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.println("Ingrese el tipo de plumaje del animal");
                            String getPlumaje = scanner.nextLine();
                            System.out.println("Ingrese el tipo de pico del animal");
                            String getPico = scanner.nextLine();
                            nuevoAnimal = new Animal_Aviario(setNombre, setSexo, setEspecie, setEdad, setPeso, setEstatura, setColor, setEsterilizado, setVacunado, getVolar, getPlumaje, getPico);
                            break;

                        default:
                            System.out.println("Tipo de animal no válido.");
                            break;
                    }
                    if (nuevoAnimal != null) {
                        animales.add(nuevoAnimal);
                        quiosco = new Quiosco(animales, hábitats);
                        System.out.println("El nuevo animal ha sido registrado exitosamente.");
                    }
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
                    System.out.println("Por favor, seleccione una opción:");
                    System.out.println("1. Agregar recurso");
                    System.out.println("2. Eliminar recurso");
                    System.out.println("3. Listar recursos");
                    System.out.println("4. Volver al menú principal");

                    int choiceRecurso = scanner.nextInt();
                    scanner.nextLine();

                    switch (choiceRecurso) {
                        case 1: // Agregar recurso
                            System.out.println("Ingrese el nombre del recurso:");
                            String getNombre = scanner.nextLine();
                            Recursos nuevoRecurso = new Recursos(getNombre);
                            recursos.add(nuevoRecurso);
                            System.out.println("Recurso agregado exitosamente.");
                            break;
                        case 2: // Eliminar recurso
                            System.out.println("Ingrese el nombre del recurso a eliminar:");
                            String nombreRecursoEliminar = scanner.nextLine();
                            recursos.removeIf(recurso -> recurso.getNombre().equals(nombreRecursoEliminar));
                            System.out.println("Recurso eliminado exitosamente.");
                            break;
                        case 3: // Listar recursos
                            System.out.println("Recursos:");
                            for (Recursos recurso : recursos) {
                                System.out.println(recurso.getNombre());
                            }
                            break;
                        case 4: // Volver al menú principal
                            continue;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                } else if (choiceTrabajador == 2) { // Mantenimiento y Seguridad
                    System.out.println("Por favor, seleccione una opción:");
                    System.out.println("1. Agregar cámara");
                    System.out.println("2. Eliminar cámara");
                    System.out.println("3. Agregar sensor");
                    System.out.println("4. Eliminar sensor");
                    System.out.println("5. Verificar estado de seguridad");
                    System.out.println("6. Volver al menú principal");

                    int choiceSeguridad = scanner.nextInt();
                    scanner.nextLine();

                    switch (choiceSeguridad) {
                        case 1: // Agregar cámara
                            Cámara nuevaCámara = new Cámara();
                            camaras.add(nuevaCámara);
                            System.out.println("Cámara agregada exitosamente.");
                            break;
                        case 2: // Eliminar cámara
                            System.out.println("Ingrese el número de serie de la cámara a eliminar:");
                            String numSerie = scanner.nextLine();
                            Cámara cámaraAEliminar = null;
                            for (Cámara cámara : camaras) {
                                if (cámara.getNumSerie().equals(numSerie)) {
                                    cámaraAEliminar = cámara;
                                    break;
                                }
                            } if (cámaraAEliminar != null) {
                                camaras.remove(cámaraAEliminar);
                                System.out.println("Cámara eliminada exitosamente.");
                            } else {
                                System.out.println("No se encontró una cámara con el número de serie proporcionado.");
                            } break;
                        case 3: // Agregar sensor
                            Sensor nuevoSensor = new Sensor();
                            sensores.add(nuevoSensor);
                            System.out.println("Sensor agregado exitosamente.");
                            break;
                        case 4: // Eliminar sensor
                            System.out.println("Ingrese el número de serie del sensor a eliminar:");
                            String numSerieSensor = scanner.nextLine();
                            Sensor sensorAEliminar = null;
                            for (Sensor sensor : sensores) {
                                if (sensor.getNumSerie().equals(numSerieSensor)) {
                                    sensorAEliminar = sensor;
                                    break;
                                }
                            }
                            if (sensorAEliminar != null) {
                                sensores.remove(sensorAEliminar);
                                System.out.println("Sensor eliminado exitosamente.");
                            } else {
                                System.out.println("No se encontró un sensor con el número de serie proporcionado.");
                            }
                            break;
                        case 5: // Verificar estado de seguridad
                            boolean estadoSeguridad = seguridad.verificarEstado();
                            System.out.println("Estado de seguridad: " + (estadoSeguridad ? "Seguro" : "No seguro"));
                            break;
                        case 6: // Volver al menú principal
                            continue;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                } else if (choiceTrabajador == 3) {
                    continue;
                }
            } else if (choice == 3) { // Salir
                break;
            }
        }
    }
}