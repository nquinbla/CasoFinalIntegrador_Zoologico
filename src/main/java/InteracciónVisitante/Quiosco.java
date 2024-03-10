package InteracciónVisitante;

import java.util.List;
import Animales.Animal;
import Hábitats.Hábitat;

public class Quiosco {
    private List<Animal> animales;
    private List<Hábitat> hábitats;

    public Quiosco(List<Animal> animales, List<Hábitat> hábitats) {
        this.animales = animales;
        this.hábitats = hábitats;
    }

    public AnimalInfo obtenerInfoAnimal(String nombreAnimal) {
        for (Animal animal : animales) {
            if (animal.getNombre().equals(nombreAnimal)) {
                return new AnimalInfo(animal.getNombre());
            }
        }
        return null; // Devuelve null si no se encuentra el animal
    }

    public HabitatInfo obtenerInfoHabitat(String nombreHabitat) {
        for (Hábitat hábitat : hábitats) {
            if (hábitat.getNombre().equals(nombreHabitat)) {
                return new HabitatInfo(hábitat.getNombre());
            }
        }
        return null; // Devuelve null si no se encuentra el hábitat
    }
}