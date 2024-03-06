package Animales;

// [1] CLASE ANIMAL
public class Animal { // atributos
    String nombre;  // nombre
    String edad;  // edad
    String sexo; // sexo
    String especie; // especie
    String peso; // peso
    String estatura; // estatura
    String  color; // color
    boolean esterilizado; // esterilizado
    boolean vacunado; // vacunado
    int id; // id

    // [2] CONSTRUCTORES
    // Constructor con todos los atributos
    public Animal(String nombre, String edad, String sexo, String especie, String peso, String estatura, String color, boolean esterilizado, boolean vacunado, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.especie = especie;
        this.peso = peso;
        this.estatura = estatura;
        this.color = color;
        this.esterilizado = esterilizado;
        this.vacunado = vacunado;
        this.id = id;
    }

}
