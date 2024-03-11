package InteracciónVisitante;


public class AnimalInfo {
    private String nombreAnimal;
    private String especie;
    private String dieta;
    private String habitat;
    private String descripcion;
    private String sexo;
    private int edad;
    private double peso;
    private double estatura;
    private String color;
    private boolean esterilizado;
    private boolean vacunado;

    public AnimalInfo(String nombreAnimal, String especie, String dieta, String habitat, String descripcion, String sexo, int edad, double peso, double estatura, String color, boolean esterilizado, boolean vacunado) {
        this.nombreAnimal = nombreAnimal;
        this.especie = especie;
        this.dieta = dieta;
        this.habitat = habitat;
        this.descripcion = descripcion;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.color = color;
        this.esterilizado = esterilizado;
        this.vacunado = vacunado;
    }

    public AnimalInfo(String nombre, String especie, String sexo, String edad, String peso, String estatura, String color, boolean esterilizado, boolean vacunado) {
    }

    // existing getters and setters...

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public String getEspecie() {
        return especie;
    }
    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public String getColor() {
        return color;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public boolean isVacunado() {
        return vacunado;
    }
}