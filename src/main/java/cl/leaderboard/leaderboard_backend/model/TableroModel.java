package cl.leaderboard.leaderboard_backend.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tablero")
public class TableroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "usuarioid")
    private UsuarioModel usuarioId;
    @OneToOne
    @JoinColumn(name = "partidaid")
    private PartidaModel partidaId;
    @OneToOne
    @JoinColumn(name = "puntajeid")
    private PuntajeModel puntajeId;
    @Column(name = "fechacreacion")
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
