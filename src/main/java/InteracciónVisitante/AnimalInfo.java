package InteracciónVisitante;

public class AnimalInfo {
    private String nombreAnimal;

    public AnimalInfo(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
        // Aquí se buscaría y almacenaría la información del animal
    }

    // getters y setters

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }
}
