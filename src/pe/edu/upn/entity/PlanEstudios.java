
package pe.edu.upn.entity;

import java.util.ArrayList;
import java.util.List;

public class PlanEstudios {
    private final Integer id;
    private Carrera Carrera;
    private Integer totalCredito;
    private Integer totalCurso;
    private List<Curso> cursos;
    // Atributo Static para la asignacion automatica del id
    private static Integer autoIncrement = 1;

    public PlanEstudios(Carrera Carrera, Integer totalCredito, Integer totalCurso, List<Curso> cursos) {
        this.id = autoIncrement;
        this.Carrera = Carrera;
        this.totalCredito = totalCredito;
        this.totalCurso = totalCurso;
        this.cursos = cursos;
        autoIncrement++;
    }
    public PlanEstudios(Carrera Carrera, Integer totalCredito, Integer totalCurso) {
        this.id = autoIncrement;
        this.Carrera = Carrera;
        this.totalCredito = totalCredito;
        this.totalCurso = totalCurso;
        this.cursos = new ArrayList<>();
        autoIncrement++;
    }

    public Integer getId() {
        return id;
    }
    public Carrera getCarrera() {
        return Carrera;
    }

    public void setCarrera(Carrera Carrera) {
        this.Carrera = Carrera;
    }

    public Integer getTotalCredito() {
        return totalCredito;
    }

    public void setTotalCredito(Integer totalCredito) {
        this.totalCredito = totalCredito;
    }

    public Integer getTotalCurso() {
        return totalCurso;
    }

    public void setTotalCurso(Integer totalCurso) {
        this.totalCurso = totalCurso;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
  
}
