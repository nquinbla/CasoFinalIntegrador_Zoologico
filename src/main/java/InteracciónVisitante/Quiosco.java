package InteracciónVisitante;

public class Quiosco {
    public AnimalInfo obtenerInfoAnimal(String nombreAnimal) {
        // Aquí se buscaría la información del animal por su nombre y se devolvería un objeto AnimalInfo
        return new AnimalInfo(nombreAnimal);
    }

    public HabitatInfo obtenerInfoHabitat(String nombreHabitat) {
        // Aquí se buscaría la información del hábitat por su nombre y se devolvería un objeto HabitatInfo
        return new HabitatInfo(nombreHabitat);
    }
}
}
