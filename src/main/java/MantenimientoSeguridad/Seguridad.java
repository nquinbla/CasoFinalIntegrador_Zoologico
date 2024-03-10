package MantenimientoSeguridad;

import java.util.List;

public class Seguridad {
    private List<Camara> camaras;
    private List<Sensor> sensores;

    public Seguridad(List<Camara> camaras, List<Sensor> sensores) {
        this.camaras = camaras;
        this.sensores = sensores;
    }

    // getters y setters

    public List<Camara> getCamaras() {
        return camaras;
    }

    public void setCamaras(List<Camara> camaras) {
        this.camaras = camaras;
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void agregarCamara(Cámara camara) {
        camaras.add(camara);
    }

    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public void eliminarCamara(Cámara camara) {
        camaras.remove(camara);
    }

    public void eliminarSensor(Sensor sensor) {
        sensores.remove(sensor);
    }


}