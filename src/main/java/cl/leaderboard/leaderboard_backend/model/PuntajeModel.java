package cl.leaderboard.leaderboard_backend.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "puntaje")
public class PuntajeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "puntos")
    private int puntos;
    @ManyToOne
    @JoinColumn(name = "idusuario")
    private UsuarioModel[] usuarioId;
    @OneToOne
    @JoinColumn(name = "idpartida")
    private PartidaModel partidaId;
    @Column(name = "fechacreacion")
    private Date fechaCreacion;
    
    public PuntajeModel() {
    }

    public PuntajeModel(int id, int puntos, UsuarioModel[] usuarioId, PartidaModel partidaId, Date fechaCreacion) {
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

    public UsuarioModel[] getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(UsuarioModel[] usuarioId) {
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
