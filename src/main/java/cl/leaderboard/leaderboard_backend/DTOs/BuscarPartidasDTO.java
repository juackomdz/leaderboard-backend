package cl.leaderboard.leaderboard_backend.DTOs;

public class BuscarPartidasDTO {

    private String nombrePartida;
    private String username;
    private Integer puntos;
    
    public BuscarPartidasDTO() {
    }

    
    public BuscarPartidasDTO(String nombrePartida, String username, Integer puntos) {
        this.nombrePartida = nombrePartida;
        this.username = username;
        this.puntos = puntos;
    }


    public String getNombrePartida() {
        return nombrePartida;
    }

    public void setNombrePartida(String nombrePartida) {
        this.nombrePartida = nombrePartida;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    
}
