package InteracciónVisitante;

public class HabitatInfo {
    private String nombreHabitat;

    public HabitatInfo(String nombreHabitat) {
        this.nombreHabitat = nombreHabitat;
        // Aquí se buscaría y almacenaría la información del hábitat
    }

    // getters y setters

    public String getNombreHabitat() {
        return nombreHabitat;
    }

    public void setNombreHabitat(String nombreHabitat) {
        this.nombreHabitat = nombreHabitat;
    }
}