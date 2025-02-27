package cl.leaderboard.leaderboard_backend.DTOs;

import java.util.Date;

public class AgregarPartidaDTO {

    private Integer idUsuario;
    private Integer idPartida;
    private Integer puntos;
    private Date fechaCreacion;
    
    public AgregarPartidaDTO() {
    }

    public AgregarPartidaDTO(Integer idUsuario, Integer idPartida, Integer puntos, Date fechaCreacion) {
        this.idUsuario = idUsuario;
        this.idPartida = idPartida;
        this.puntos = puntos;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(Integer idPartida) {
        this.idPartida = idPartida;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    
}
