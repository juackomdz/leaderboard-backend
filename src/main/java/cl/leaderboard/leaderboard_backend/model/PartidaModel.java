package cl.leaderboard.leaderboard_backend.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "partida")
public class PartidaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idPartida;
    @Column(name = "nombre_partida")
    private String nombrePartida;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fechaCreacion")
    private Date fechaCreacion;
    
    public PartidaModel() {
    }

    public PartidaModel(int idPartida, String nombrePartida, String descripcion, Date fechaCreacion) {
        this.idPartida = idPartida;
        this.nombrePartida = nombrePartida;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public String getNombrePartida() {
        return nombrePartida;
    }

    public void setNombrePartida(String nombrePartida) {
        this.nombrePartida = nombrePartida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
