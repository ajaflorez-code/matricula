package pe.edu.upn.entity;

import java.util.ArrayList;
import java.util.List;

public class Matricula {
    private Estudiante estudiante;
    private List<Curso> cursos;
    private String grupo;

    public Matricula(Estudiante estudiante, String grupo) {
        this.estudiante = estudiante;
        this.cursos = new ArrayList<>();
        this.grupo = grupo;
    }
    
    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
    
    
    
    
    
}
