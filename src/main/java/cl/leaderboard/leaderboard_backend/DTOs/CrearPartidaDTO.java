package cl.leaderboard.leaderboard_backend.DTOs;


public class CrearPartidaDTO {

    
    private String nombrePartida;
    private String descripcion;
    
    public CrearPartidaDTO() {
    }

    public CrearPartidaDTO(String nombrePartida, String descripcion) {
        this.nombrePartida = nombrePartida;
        this.descripcion = descripcion;
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

    
}
