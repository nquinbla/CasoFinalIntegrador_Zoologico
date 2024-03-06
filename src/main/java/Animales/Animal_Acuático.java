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



}
