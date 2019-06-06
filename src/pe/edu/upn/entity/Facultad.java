package pe.edu.upn.entity;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private final Integer id;
    private String nombre;
    private List<Carrera> carreras;
    private static Integer autoIncrement = 1;

    public Facultad(String nombre) {
        this.id = autoIncrement;
        this.nombre = nombre;
        this.carreras = new ArrayList<>();
        autoIncrement++;
    }
    public Facultad(String nombre, List<Carrera> carreras) {
        this.id = autoIncrement;
        this.nombre = nombre;
        this.carreras = carreras;
        autoIncrement++;
    }

    public Integer getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Carrera> getCarreras() {
        return carreras;
    }
    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }
}
