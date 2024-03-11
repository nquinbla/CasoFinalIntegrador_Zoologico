package Animales;

// [1] CLASE ANIMAL ACUÁTICO
public class Animal_Acuático extends Animal {
    // [2] ATRIBUTOS
    protected boolean nadar; // nadar
    protected boolean aletas; // aletas
    protected boolean branquias; // branquias

    // [3] CONSTRUCTORES
    // Constructor con todos los atributos
    public Animal_Acuático(String nombre, String edad, String sexo, int especie, double peso, double estatura, String color, boolean esterilizado, boolean vacunado, boolean nadar, boolean aletas, boolean branquias) {
        super(nombre, edad, sexo, especie, peso, estatura, color, esterilizado, vacunado);
        this.nadar = nadar;
        this.aletas = aletas;
        this.branquias = branquias;
    }

    // [4] MÉTODOS (getters y setters) de los atributos
    // [4.1] Nadar
    // Método para obtener si el animal acuático sabe nadar
    public boolean getNadar() {
        return nadar;
    }

    // Método para establecer si el animal acuático sabe nadar
    public void setNadar(String nadar) {
        this.nadar = Boolean.parseBoolean(nadar);
    }

    // [4.2] Aletas
    // Método para obtener si el animal acuático tiene aletas
    public boolean getAletas() {
        return aletas;
    }

    // Método para establecer si el animal acuático tiene aletas
    public void setAletas(String aletas) {
        this.aletas = Boolean.parseBoolean(aletas);
    }

    // [4.3] Branquias
    // Método para obtener si el animal acuático tiene branquias
    public boolean getBranquias() {
        return branquias;
    }

    // Método para establecer si el animal acuático tiene branquias
    public void setBranquias(String branquias) {
        this.branquias = Boolean.parseBoolean(branquias);
    }

    // [5] toString
    // Método para mostrar la información del animal acuático
    @Override
    public String toString() {
        return "Animal_Acuático{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", especie=" + especie + ", peso=" + peso + ", estatura=" + estatura + ", color=" + color + ", esterilizado=" + esterilizado + ", vacunado=" + vacunado + ", nadar=" + nadar + ", aletas=" + aletas + ", branquias=" + branquias + '}';
    }

}
