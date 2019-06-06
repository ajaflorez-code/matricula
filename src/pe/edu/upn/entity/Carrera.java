
package pe.edu.upn.entity;

public class Carrera {
    private final Integer id;
    private String nombre;
    private Facultad facultad;
    private static Integer autoIncrement = 1;

    public Carrera(String nombre, Facultad facultad) {
        this.id = autoIncrement;
        this.nombre = nombre;
        this.facultad = facultad;
        autoIncrement++;
    }

    public Integer getId() {
        return id;
    }
    public Facultad getFacultad() {
        return facultad;
    }
    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
