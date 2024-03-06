package Animales;

// [1] CLASE ANIMAL ACUÁTICO
public class Animal_Acuático extends Animal{
    // [2] ATRIBUTOS
    String nadar; // nadar
    String aletas; // aletas
    String branquias; // branquias

    // [3] CONSTRUCTORES
    // Constructor con todos los atributos
    public Animal_Acuático(String nombre, String edad, String sexo, String especie, String peso, String estatura, String color, boolean esterilizado, boolean vacunado, String nadar, String aletas, String branquias) {
        super(nombre, edad, sexo, especie, peso, estatura, color, esterilizado, vacunado);
        this.nadar = nadar;
        this.aletas = aletas;
        this.branquias = branquias;
    }

    // [4] MÉTODOS (getters y setters) de los atributos
    // [4.1] Nadar
    // Método para obtener si el animal acuático sabe nadar
    public String getNadar() {
        return nadar;
    }
    // Método para establecer si el animal acuático sabe nadar
    public void setNadar(String nadar) {
        this.nadar = nadar;
    }

    // [4.2] Aletas
    // Método para obtener si el animal acuático tiene aletas
    public String getAletas() {
        return aletas;
    }
    // Método para establecer si el animal acuático tiene aletas
    public void setAletas(String aletas) {
        this.aletas = aletas;
    }

    // [4.3] Branquias
    // Método para obtener si el animal acuático tiene branquias
    public String getBranquias() {
        return branquias;
    }
    // Método para establecer si el animal acuático tiene branquias
    public void setBranquias(String branquias) {
        this.branquias = branquias;
    }

    // [5] toString
    // Método para mostrar la información del animal acuático
    @Override
    public String toString() {
        return "Animal_Acuático{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", especie=" + especie + ", peso=" + peso + ", estatura=" + estatura + ", color=" + color + ", esterilizado=" + esterilizado + ", vacunado=" + vacunado + ", nadar=" + nadar + ", aletas=" + aletas + ", branquias=" + branquias + '}';
    }
}
