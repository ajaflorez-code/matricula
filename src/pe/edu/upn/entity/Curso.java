package pe.edu.upn.entity;

public class Curso {
    private final Integer id;
    private String nombre;
    private Integer ciclo;
    private Integer credito;
    private Integer horasTeoria;
    private Integer horasPractica;
    private Integer horasLaboratorio;
    private Integer horasTraCampo;
    private PlanEstudios planEstudios;
    
    private static Integer autoIncrement = 1;

    public Curso(String nombre, Integer ciclo, Integer credito, Integer horasTeoria, Integer horasPractica, Integer horasLaboratorio, Integer horasTraCampo, PlanEstudios planEstudios) {
        this.id = autoIncrement;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.credito = credito;
        this.horasTeoria = horasTeoria;
        this.horasPractica = horasPractica;
        this.horasLaboratorio = horasLaboratorio;
        this.horasTraCampo = horasTraCampo;
        this.planEstudios = planEstudios;
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

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCredito() {
        return credito;
    }

    public void setCredito(Integer credito) {
        this.credito = credito;
    }

    public Integer getHorasTeoria() {
        return horasTeoria;
    }

    public void setHorasTeoria(Integer horasTeoria) {
        this.horasTeoria = horasTeoria;
    }

    public Integer getHorasPractica() {
        return horasPractica;
    }

    public void setHorasPractica(Integer horasPractica) {
        this.horasPractica = horasPractica;
    }

    public Integer getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(Integer horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    public Integer getHorasTraCampo() {
        return horasTraCampo;
    }

    public void setHorasTraCampo(Integer horasTraCampo) {
        this.horasTraCampo = horasTraCampo;
    }

    public PlanEstudios getPlanEstudios() {
        return planEstudios;
    }

    public void setPlanEstudios(PlanEstudios planEstudios) {
        this.planEstudios = planEstudios;
    }
    
    
}
