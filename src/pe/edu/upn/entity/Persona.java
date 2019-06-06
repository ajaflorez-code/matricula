package pe.edu.upn.entity;

import java.util.Date;

public abstract class Persona {
    private final Integer id;
    private String dni;
    private String apellidos;
    private String nombres;
    private Genero genero;
    private Date fechaNac;
    
    private static Integer autoIncrement = 1;

    public Persona(String dni, String apellidos, String nombres, Genero genero, Date fechaNac) {
        this.id = autoIncrement;
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.genero = genero;
        this.fechaNac = fechaNac;
        autoIncrement++;
    }

    @Override
    public String toString() {
        return "Persona id:" + this.getId() + ", dni: " + this.getDni() + 
                ", apellido: " + this.getApellidos() + 
                ", nombres: " + this.getNombres() + 
                ", genero: " + this.getGenero() + 
                ", nacimiento: " + this.getFechaNac();
    }

    public Integer getId() {
        return id;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }
    // Proteje el metodo de las clases hijas
    protected void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }
    // Proteje el metodo de las clases hijas
    protected void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
    
}
