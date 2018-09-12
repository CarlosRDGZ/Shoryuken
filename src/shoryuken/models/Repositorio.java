package shoryuken.models;

import java.util.List;

public class Repositorio {
    private int id;
    private String nombre;
    private String descripcion;
    private short ranking;
    private int creadorId;
    private boolean aprobado;
    private String url;
    private List<Recurso> recursos;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public short getRanking() {
        return ranking;
    }

    public int getCreadorId() {
        return creadorId;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public String getUrl() {
        return url;
    }
    
    public List<Recurso> getRecursos() {
        return recursos;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setRanking(short ranking) {
        this.ranking = ranking;
    }
    
    public void setCreadorId(int creadorId) {
        this.creadorId = creadorId;
    }
    
    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }
}
