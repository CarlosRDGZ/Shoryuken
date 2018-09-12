package shoryuken.models;

import java.util.List;

public class Recurso {
    
    private int id;
    private int categoriaId;
    private int repositorioId;
    private short edicion;
    private short ranking;
    private String url;
    private String tags;
    private String titulo;
    private String[] autores;
    private String descripcion;
    private String anioLanzamiento;
    private List<Comentario> comentarios;

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public short getEdicion() {
        return edicion;
    }

    public short getRanking() {
        return ranking;
    }

    public String[] getAutores() {
        return autores;
    }

    public String getTags() {
        return tags;
    }

    public String getUrl() {
        return url;
    }

    public int getRepositorioId() {
        return repositorioId;
    }

    public int getCategoriaId() {
        return categoriaId;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnioLanzamieIo(String anioLanzamiento) {
        this.setAnioLanzamiento(anioLanzamiento);
    }

    public void setEdicion(short edicion) {
        this.edicion = edicion;
    }

    public void setRanking(short ranking) {
        this.ranking = ranking;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setRepositorioId(int repositorioId) {
        this.repositorioId = repositorioId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setAnioLanzamiento(String anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
}
