package pe.edu.upn.entity;

import java.util.Date;

public class Docente extends Persona{
    private String departAcad;
    private String profesion;

    public Docente(String departAcad, String profesion, String dni, String apellidos, String nombres, Genero genero, Date fechaNac) {
        super(dni, apellidos, nombres, genero, fechaNac);
        this.departAcad = departAcad;
        this.profesion = profesion;
    }

    public String getDepartAcad() {
        return departAcad;
    }

    public void setDepartAcad(String departAcad) {
        this.departAcad = departAcad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
}
