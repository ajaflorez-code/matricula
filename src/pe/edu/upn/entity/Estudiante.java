package pe.edu.upn.entity;

import java.util.Date;

public class Estudiante extends Persona {
    private String codigo;
    private Carrera carrera;

    public Estudiante(String codigo, Carrera carrera, String dni, 
            String apellidos, String nombres, Genero genero, Date fechaNac) {
        super(dni, apellidos, nombres, genero, fechaNac);
        this.codigo = codigo;
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante " + this.getCodigo() + ", Apellidos y nombres: " +
                this.getApellidos() + " " + this.getNombres() + ", carrera: " +
                this.getCarrera().getNombre();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

  
    
}
