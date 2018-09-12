package shoryuken.models;

import java.util.Date;

public class Comentario {
    private int id;
    private String contenido;
    private Date fechaEdicion;
    private int recursoId;
    private int usuarioId;

    public int getId() {
        return id;
    }

    public String getContenido() {
        return contenido;
    }

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public int getRecursoId() {
        return recursoId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public void setRecursoId(int recursoId) {
        this.recursoId = recursoId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
}
