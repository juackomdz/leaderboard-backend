package cl.leaderboard.leaderboard_backend.model;

import java.util.Date;

public class PuntajeModel {

    private int id;
    private int puntos;
    private UsuarioModel usuarioId;
    private PartidaModel partidaId;
    private Date fechaCreacion;
    
    public PuntajeModel() {
    }

    public PuntajeModel(int id, int puntos, UsuarioModel usuarioId, PartidaModel partidaId, Date fechaCreacion) {
        this.id = id;
        this.puntos = puntos;
        this.usuarioId = usuarioId;
        this.partidaId = partidaId;
        this.fechaCreacion = fechaCreacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public UsuarioModel getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(UsuarioModel usuarioId) {
        this.usuarioId = usuarioId;
    }

    public PartidaModel getPartidaId() {
        return partidaId;
    }

    public void setPartidaId(PartidaModel partidaId) {
        this.partidaId = partidaId;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    
}
