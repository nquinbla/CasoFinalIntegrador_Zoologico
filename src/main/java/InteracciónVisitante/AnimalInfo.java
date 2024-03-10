package InteracciónVisitante;

public class AnimalInfo {
    private String nombreAnimal;
    private String especie;
    private String dieta;
    private String habitat;
    private String descripcion;

    public AnimalInfo(String nombreAnimal, String especie, String dieta, String habitat, String descripcion) {
        this.nombreAnimal = nombreAnimal;
        this.especie = especie;
        this.dieta = dieta;
        this.habitat = habitat;
        this.descripcion = descripcion;
    }

    // getters y setters

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
