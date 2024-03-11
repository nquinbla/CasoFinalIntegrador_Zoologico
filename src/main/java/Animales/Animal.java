package Animales;

// [1] CLASE ANIMAL
public class Animal { // atributos
    protected String nombre;  // nombre
    protected String edad;  // edad
    protected String sexo; // sexo
    protected String especie; // especie
    protected String peso; // peso
    protected String estatura; // estatura
    protected String  color; // color
    protected boolean esterilizado; // esterilizado
    protected boolean vacunado; // vacunado

    // [2] CONSTRUCTORES
    // Constructor con todos los atributos
    public Animal(String nombre, String edad, String sexo, String especie, String peso, String estatura, String color, boolean esterilizado, boolean vacunado) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.especie = especie;
        this.peso = peso;
        this.estatura = estatura;
        this.color = color;
        this.esterilizado = esterilizado;
        this.vacunado = vacunado;
    }

    // [3] MÉTODOS (getters y setters) de los atributos
    // [3.1] Nombre
    // Método para obtener el nombre del animal
    public String getNombre() {
        return nombre;
    }
    // Método para establecer el nombre del animal
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // [3.2] Edad
    // Método para obtener la edad del animal
    public String getEdad() {
        return edad;
    }
    // Método para establecer la edad del animal
    public void setEdad(String edad) {
        this.edad = edad;
    }

    // [3.3] Sexo
    // Método para obtener el sexo del animal
    public String getSexo() {
        return sexo;
    }
    // Método para establecer el sexo del animal
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // [3.4] Especie
    // Método para obtener la especie del animal
    public String getEspecie() {
        return especie;
    }
    // Método para establecer la especie del animal
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    // [3.5] Peso
    // Método para obtener el peso del animal
    public String getPeso() {
        return peso;
    }
    // Método para establecer el peso del animal
    public void setPeso(String peso) {
        this.peso = peso;
    }

    // [3.6] Estatura
    // Método para obtener la estatura del animal
    public String getEstatura() {
        return estatura;
    }
    // Método para establecer la estatura del animal
    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    // [3.7] Color
    // Método para obtener el color del animal
    public String getColor() {
        return color;
    }
    // Método para establecer el color del animal
    public void setColor(String color) {
        this.color = color;
    }

// [3.8] Esterilizado
    // Método para obtener si el animal está esterilizado
    public boolean isEsterilizado() {
        return esterilizado;
    }
    // Método para establecer si el animal está esterilizado
    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    // [3.9] Vacunado
    // Método para obtener si el animal está vacunado
    public boolean isVacunado() {
        return vacunado;
    }
    // Método para establecer si el animal está vacunado
    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    // [4] MÉTODO toString
    // Método para mostrar la información del animal
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", sexo='" + sexo + '\'' +
                ", especie='" + especie + '\'' +
                ", peso='" + peso + '\'' +
                ", estatura='" + estatura + '\'' +
                ", color='" + color + '\'' +
                ", esterilizado=" + esterilizado +
                ", vacunado=" + vacunado +
                '}';
    }

    @Override
public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Animal animal = (Animal) obj;
        return esterilizado == animal.esterilizado && vacunado == animal.vacunado && nombre.equals(animal.nombre) && edad.equals(animal.edad) && sexo.equals(animal.sexo) && especie.equals(animal.especie) && peso.equals(animal.peso) && estatura.equals(animal.estatura) && color.equals(animal.color);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }






}
