package cl.leaderboard.leaderboard_backend.model;

import java.util.Date;

public class TableroModel {

    private int id;
    private UsuarioModel usuarioId;
    private PartidaModel partidaId;
    private PuntajeModel puntajeId;
    private Date fechaCreacion;
    
    public TableroModel() {
    }

    public TableroModel(int id, UsuarioModel usuarioId, PartidaModel partidaId, PuntajeModel puntajeId,
            Date fechaCreacion) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.partidaId = partidaId;
        this.puntajeId = puntajeId;
        this.fechaCreacion = fechaCreacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public PuntajeModel getPuntajeId() {
        return puntajeId;
    }

    public void setPuntajeId(PuntajeModel puntajeId) {
        this.puntajeId = puntajeId;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    
}
